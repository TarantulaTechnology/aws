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
from tests import unittest

from awscli.utils import split_on_commas


class TestCSVSplit(unittest.TestCase):

    def test_normal_csv_split(self):
        self.assertEqual(split_on_commas('foo,bar,baz'),
                         ['foo', 'bar', 'baz'])

    def test_quote_split(self):
        self.assertEqual(split_on_commas('foo,"bar",baz'),
                         ['foo', 'bar', 'baz'])

    def test_inner_quote_split(self):
        self.assertEqual(split_on_commas('foo,bar="1,2,3",baz'),
                         ['foo', 'bar=1,2,3', 'baz'])

    def test_single_quote(self):
        self.assertEqual(split_on_commas("foo,bar='1,2,3',baz"),
                         ['foo', 'bar=1,2,3', 'baz'])

    def test_mixing_double_single_quotes(self):
        self.assertEqual(split_on_commas("""foo,bar="1,'2',3",baz"""),
                         ['foo', "bar=1,'2',3", 'baz'])

    def test_mixing_double_single_quotes_before_first_comma(self):
        self.assertEqual(split_on_commas("""foo,bar="1','2',3",baz"""),
                         ['foo', "bar=1','2',3", 'baz'])

    def test_inner_quote_split_with_equals(self):
        self.assertEqual(split_on_commas('foo,bar="Foo:80/bar?a=b",baz'),
                         ['foo', 'bar=Foo:80/bar?a=b', 'baz'])

    def test_single_quoted_inner_value_with_no_commas(self):
        self.assertEqual(split_on_commas("foo,bar='BAR',baz"),
                         ['foo', 'bar=BAR', 'baz'])

    def test_escape_quotes(self):
        self.assertEqual(split_on_commas('foo,bar=1\,2\,3,baz'),
                         ['foo', 'bar=1,2,3', 'baz'])

    def test_no_commas(self):
        self.assertEqual(split_on_commas('foo'), ['foo'])

    def test_trailing_commas(self):
        self.assertEqual(split_on_commas('foo,'), ['foo', ''])

    def test_escape_backslash(self):
        self.assertEqual(split_on_commas('foo,bar\\\\,baz\\\\,qux'),
                         ['foo', 'bar\\', 'baz\\', 'qux'])
