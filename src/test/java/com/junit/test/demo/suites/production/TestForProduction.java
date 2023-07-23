package com.junit.test.demo.suites.production;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestForProduction {
	@Test
	@Tag("production")
	public void dummyTestA() {
		System.out.println("TestA ==>" + Thread.currentThread().getName());
	}
	
	@Test
	@Tag("production")
	public void dummyProductionTest2() {
		System.out.println("TestB ==>" +Thread.currentThread().getName());
	}
}
