package com.junit.test.demo.suites.development;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestForDevelopment {
	
	@Test
	@Tag(value = "dev")
	public void dummyTestA() {
		System.out.println(Thread.currentThread().getName());
	}
	
	@Test
	@Tag(value = "dev")
	public void dummyTestB() {
		System.out.println(Thread.currentThread().getName());
	}
}
