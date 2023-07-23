package com.junit.test.demo.parallel.group2;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestGroup2 {
	@Test
	@Tag(value = "group")
	public void testA() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("TestGroup2|TestA ==> " + Thread.currentThread().getName());
	}

	@Test
	@Tag(value = "group")
	public void testB() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("TestGroup2|TestB ==> " +Thread.currentThread().getName());
	}
}
