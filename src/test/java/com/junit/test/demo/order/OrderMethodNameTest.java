package com.junit.test.demo.order;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(3)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrderMethodNameTest {
	@Test
	void A_test() {
		assertEquals("A", "A", "they are equals");
	}
	
	@Test
	void C_test() {
		assertEquals("A", "A", "they are equals");
	}
	
	@Test
	void D_test() {
		assertEquals("A", "A", "they are equals");
	}
	
	@Test
	void B_test() {
		assertEquals("A", "A", "they are equals");
	}
}
