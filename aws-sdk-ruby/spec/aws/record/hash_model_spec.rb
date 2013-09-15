# Copyright 2011-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

require 'spec_helper'

module AWS
  module Record
    describe Model do

      it_should_behave_like("an aws record base class", AWS::Record::HashModel)

      it "should contain an assignable hash key" do
        model = Class.new(AWS::Record::HashModel)
        model.string_attr :hashname, :hash_key => true
        model.string_attr :foo
        model.hash_key.should == "hashname"
      end

    end
  end
end
