package com.junit.test.demo.order;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(4)
@TestMethodOrder(MethodOrderer.Random.class)
public class OrderRandomTest {

	@Test
	void test1() {
		assertEquals("A", "A", "they are equals");
	}
	
	@Test
	void test2() {
		assertEquals("A", "A", "they are equals");
	}
	
	@Test
	void test3() {
		assertEquals("A", "A", "they are equals");
	}
}
