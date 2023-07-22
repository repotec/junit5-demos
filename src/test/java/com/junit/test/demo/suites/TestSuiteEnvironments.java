package com.junit.test.demo.suites;

import org.junit.platform.suite.api.*;

@Suite
@SelectPackages({
                    "com.junit.test.demo.suites.production",
                    "com.junit.test.demo.suites.uat"
                })
@IncludeTags("production")
@ExcludeTags("dev")
@SuiteDisplayName("A demo Test Suite for production")
public class TestSuiteEnvironments {

}

