package com.junit.test.demo.parallel.group3;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestGroup3 {
	@Test
	@Tag(value = "group")
	public void testA() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("TestGroup3|TestA ==> " + Thread.currentThread().getName());
	}

	@Test
	@Tag(value = "group")
	public void testB() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("TestGroup3|TestB ==> " +Thread.currentThread().getName());
	}
}
