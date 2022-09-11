package com.junit.test.demo.lifecycle;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class AnnotationPreTest {
	
	@BeforeAll
	public void beforeAll() {
		System.out.println("Before All");
	}
	
	@AfterAll
	public void afterEach() {
		System.out.println("After All");
	}
	
	@Test
	public void caseOne_test() {
		System.out.println("case One test");
	}
	
	@Test
	@Disabled
	public void caseTwo_test() {
		System.out.println("case Two test");
	}
}
