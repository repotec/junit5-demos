package com.junit.test.demo.conditions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class EnvironmentVariablesTest {
	@Test
	@EnabledIfEnvironmentVariable(named = "ENV", matches = ".*development.*")
	public void toBeExecutedOnlyInDevlopment() {
		assertTrue(true);
	}

	@Test
	@DisabledIfEnvironmentVariable(named = "ENV", matches = ".*production.*")
	public void toBeExecutedOnlyInProduction() {
		assertTrue(true);
	}
	
	@Test
	@DisabledIfEnvironmentVariable(named = "LC_TIME", matches = ".*UTF-8.")
	void disabledIdEnvironmentVariabletimeUTF8_test() {
		assertTrue(true);
	}
}
