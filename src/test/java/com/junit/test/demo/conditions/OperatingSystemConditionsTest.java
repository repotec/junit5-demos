package com.junit.test.demo.conditions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class OperatingSystemConditionsTest {
	@Test
	@EnabledOnOs(value = { OS.LINUX, OS.WINDOWS})
	public void enableOnLinuxAndWindow_test() {
		assertTrue(true);
	}
	
	@Test
	@EnabledOnOs(value = { OS.WINDOWS})
	void enableOnWindow_test() {
		assertTrue(true);
	}
	
	@Test
	@DisabledOnOs(value = { OS.WINDOWS})
	void disabledOnWindow_test() {
		assertTrue(true);
	}
}
