# Copyright 2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License"). You
# may not use this file except in compliance with the License. A copy of
# the License is located at
#
#     http://aws.amazon.com/apache2.0/
#
# or in the "license" file accompanying this file. This file is
# distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF
# ANY KIND, either express or implied. See the License for the specific
# language governing permissions and limitations under the License.
"""
This customization adds two new parameters to the ``ec2 run-instance``
command.  The first, ``--secondary-private-ip-addresses`` allows a list
of IP addresses within the specified subnet to be associated with the
new instance.  The second, ``--secondary-ip-address-count`` allows you
to specify how many additional IP addresses you want but the actual
address will be assigned for you.

This functionality (and much more) is also available using the
``--network-interfaces`` complex argument.  This just makes two of
the most commonly used features available more easily.
"""
from awscli.arguments import CustomArgument


# --secondary-private-ip-address
SECONDARY_PRIVATE_IP_ADDRESSES_DOCS = (
    '[EC2-VPC] A secondary private IP address for the network interface '
    'or instance. You can specify this multiple times to assign multiple '
    'secondary IP addresses.  If you want additional private IP addresses '
    'but do not need a specific address, use the '
    '--secondary-private-ip-address-count option.')

# --secondary-private-ip-address-count
SECONDARY_PRIVATE_IP_ADDRESS_COUNT_DOCS = (
    '[EC2-VPC] The number of secondary IP addresses to assign to '
    'the network interface or instance.')


def _add_params(argument_table, operation, **kwargs):
    arg = SecondaryPrivateIpAddressesArgument(
        name='secondary-private-ip-addresses',
        help_text=SECONDARY_PRIVATE_IP_ADDRESSES_DOCS)
    argument_table['secondary-private-ip-addresses'] = arg
    arg = SecondaryPrivateIpAddressCountArgument(
        name='secondary-private-ip-address-count',
        help_text=SECONDARY_PRIVATE_IP_ADDRESS_COUNT_DOCS)
    argument_table['secondary-private-ip-address-count'] = arg


def _check_args(parsed_args, **kwargs):
    # This function checks the parsed args.  If the user specified
    # the --network-interfaces option with any of the scalar options we
    # raise an error.
    arg_dict = vars(parsed_args)
    if arg_dict['network_interfaces']:
        for key in ('secondary_private_ip_addresses',
                    'secondary_private_ip_address_count'):
            if arg_dict[key]:
                msg = ('Mixing the --network-interfaces option '
                       'with the simple, scalar options is '
                       'not supported.')
                raise ValueError(msg)

EVENTS = [
    ('building-argument-table.ec2.run-instances', _add_params),
    ('operation-args-parsed.ec2.run-instances', _check_args),
    ]


def register_runinstances(event_handler):
    # Register all of the events for customizing BundleInstance
    for event, handler in EVENTS:
        event_handler.register(event, handler)


def _build_network_interfaces(params, key, value):
    # Build up the NetworkInterfaces data structure
    if 'network_interfaces' not in params:
        params['network_interfaces'] = [{'DeviceIndex': 0}]

    if key == 'PrivateIpAddresses':
        if 'PrivateIpAddresses' not in params['network_interfaces'][0]:
            params['network_interfaces'][0]['PrivateIpAddresses'] = value
    else:
        params['network_interfaces'][0][key] = value


class SecondaryPrivateIpAddressesArgument(CustomArgument):

    def add_to_parser(self, parser, cli_name=None):
        parser.add_argument(self.cli_name, dest=self.py_name,
                            default=self._default, nargs='*')

    def add_to_params(self, parameters, value):
        if value:
            value = [{'PrivateIpAddress': v, 'Primary': False} for
                     v in value]
            _build_network_interfaces(parameters,
                                      'PrivateIpAddresses',
                                      value)


class SecondaryPrivateIpAddressCountArgument(CustomArgument):

    def add_to_parser(self, parser, cli_name=None):
        parser.add_argument(self.cli_name, dest=self.py_name,
                            default=self._default, type=int)

    def add_to_params(self, parameters, value):
        if value:
            _build_network_interfaces(parameters,
                                      'SecondaryPrivateIpAddressCount',
                                      value)
