package com.junit.test.demo.suites.uat;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestForUAT {
	@Test
	@Tag(value = "production")
	public void testA() {
		System.out.println("TestA ==>" + Thread.currentThread().getName());
	}

	@Test
	@Tag(value = "production")
	public void testB() {
		System.out.println("TestB ==>" +Thread.currentThread().getName());
	}
}
