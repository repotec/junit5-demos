package com.junit.test.demo.lifecycle;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StaticTest {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All");
	}
	
	@AfterAll
	public static void afterEach() {
		System.out.println("After All");
	}
	
	@Test
	public void caseOne_test() {
		System.out.println("case One test");
	}
	
	@Test
	public void caseTwo_test() {
		System.out.println("case Two test");
	}
}
