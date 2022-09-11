package com.junit.test.demo.order;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class OrderAnnotationTest {
	@Test
	@DisplayName("A_test-case")
	void test1() {
		assertEquals("hello", "hello", "they are equals");
	}
	
	@Test
	@DisplayName("D_test-case")
	void test2() {
		assertEquals("hello", "hello", "they are equals");
	}
	
	@Test
	@DisplayName("C_test-case")
	void test3() {
		assertEquals("hello", "hello", "they are equals");
	}
	
	@Test
	@DisplayName("B_test-case")
	void test4() {
		assertEquals("hello", "hello", "they are equals");
	}
}
