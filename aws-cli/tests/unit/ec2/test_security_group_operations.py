#!/usr/bin/env python
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
from tests.unit import BaseAWSCommandParamsTest

from six.moves import cStringIO
import mock

class TestAuthorizeSecurityGroupIngress(BaseAWSCommandParamsTest):

    prefix = 'ec2 authorize-security-group-ingress'

    def test_simple_cidr(self):
        args = ' --group-name foobar --protocol tcp --port 22-25 --cidr 0.0.0.0/0'
        args_list = (self.prefix + args).split()
        result =  {'GroupName': 'foobar',
                   'IpPermissions.1.FromPort': '22',
                   'IpPermissions.1.ToPort': '25',
                   'IpPermissions.1.IpProtocol': 'tcp',
                   'IpPermissions.1.IpRanges.1.CidrIp': '0.0.0.0/0'}
        self.assert_params_for_cmd(args_list, result)

    def test_all_port(self):
        args = ' --group-name foobar --protocol tcp --port all --cidr 0.0.0.0/0'
        args_list = (self.prefix + args).split()
        result =  {'GroupName': 'foobar',
                   'IpPermissions.1.FromPort': '-1',
                   'IpPermissions.1.ToPort': '-1',
                   'IpPermissions.1.IpProtocol': 'tcp',
                   'IpPermissions.1.IpRanges.1.CidrIp': '0.0.0.0/0'}
        self.assert_params_for_cmd(args_list, result)

    def test_classic_group(self):
        args = ' --group-name foobar --protocol udp --source-group fiebaz --group-owner 11111111'
        args_list = (self.prefix + args).split()
        result = {'GroupName': 'foobar',
                  'IpPermissions.1.Groups.1.GroupName': 'fiebaz',
                  'IpPermissions.1.IpProtocol': 'udp',
                  'IpPermissions.1.Groups.1.UserId': '11111111'}
        self.assert_params_for_cmd(args_list, result)

    def test_vpc_group(self):
        args = ' --group-name foobar --protocol icmp --source-group sg-12345678'
        args_list = (self.prefix + args).split()
        result = {'GroupName': 'foobar',
                  'IpPermissions.1.Groups.1.GroupId': 'sg-12345678',
                  'IpPermissions.1.IpProtocol': 'icmp'}
        self.assert_params_for_cmd(args_list, result)

    def test_ip_permissions(self):
        json = """[{"FromPort":8000,"ToPort":9000,"IpProtocol":"tcp","IpRanges":[{"CidrIp":"192.168.100.0/24"}]}]"""
        args = ' --group-name foobar --ip-permissions %s' % json
        args_list = (self.prefix + args).split()
        result = {'GroupName': 'foobar',
                  'IpPermissions.1.FromPort': '8000',
                  'IpPermissions.1.ToPort': '9000',
                  'IpPermissions.1.IpProtocol': 'tcp',
                  'IpPermissions.1.IpRanges.1.CidrIp': '192.168.100.0/24'}
        self.assert_params_for_cmd(args_list, result)

    def test_both(self):
        captured = cStringIO()
        json = """[{"FromPort":8000,"ToPort":9000,"IpProtocol":"tcp","IpRanges":[{"CidrIp":"192.168.100.0/24"}]}]"""
        args = ' --group-name foobar --port 100 --ip-permissions %s' % json
        args_list = (self.prefix + args).split()
        with mock.patch('sys.stderr', captured):
            self.assert_params_for_cmd(args_list, {}, expected_rc=255)


class TestAuthorizeSecurityGroupEgress(BaseAWSCommandParamsTest):

    prefix = 'ec2 authorize-security-group-egress'

        
class TestRevokeSecurityGroupIngress(BaseAWSCommandParamsTest):

    prefix = 'ec2 revoke-security-group-ingress'

        
class TestRevokeSecurityGroupEgress(BaseAWSCommandParamsTest):

    prefix = 'ec2 revoke-security-group-egress'

        
if __name__ == "__main__":
    unittest.main()
