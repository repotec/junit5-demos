package com.junit.test.demo.conditions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

public class SystemPropertiesTest {
	@Test
	@EnabledIfSystemProperty(named = "java.vm.vendor", matches = "Oracle.*")
	void EnabledIdVendoeIsOracle_test() {
		assertTrue(true);
	}
	
	@Test
	@DisabledIfSystemProperty(named = "file.separator", matches = "[/]")
	void DisableIdFileSeparatorIsSlash_test() {
		assertTrue(true);
	}
}
