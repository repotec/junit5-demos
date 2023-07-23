package com.junit.test.demo.parallel;

import org.junit.platform.suite.api.*;

@Suite
@SelectPackages({
                    "com.junit.test.demo.parallel.group1",
                    "com.junit.test.demo.parallel.group2",
                    "com.junit.test.demo.parallel.group3"
                })
@IncludeTags("group")
@SuiteDisplayName("A demo parallel Test using Suite")
public class TestParallel {

}

