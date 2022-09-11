package com.junit.test.demo.conditions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

public class JreConditionalTest {
	@BeforeAll
	public static void beforeAll() {
		System.out.println("java version " + System.getProperty("java.version"));
	}
	
	@Test
	@EnabledOnJre(value = { JRE.JAVA_8, JRE.JAVA_15 })
	public void enabledIf_JRE8_and_JRE15_test() {
		assertTrue(true);
	}
	
	@Test
	@DisabledOnJre(value = { JRE.JAVA_15 })
	public void disabledIf_JRE15_test(TestInfo testInfo) {
		assertTrue(true);
	}
	
	@Test
	@DisabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_11)
	public void disabledIfBetween_JRE8_and_JRE11_test() {
		assertTrue(true);
	}
	
	@Test
	@EnabledForJreRange(min = JRE.JAVA_12, max = JRE.JAVA_15)
	public void enabledIfBetween_JRE12_and_JRE15_test() {
		assertTrue(true);
	}
}
