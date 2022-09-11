package com.junit.test.demo.suites;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("com.junit.test.demo.suites.production")
//@IncludeTags("production")
public class TestSuiteEnvironments {

}