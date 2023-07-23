package com.junit.test.demo.parallel.group1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.ResourceLock;

import java.util.ArrayList;
import java.util.List;

public class TestGroup1 {

	private List<String> resources;

	@BeforeEach
	void before() {
		resources = new ArrayList<>();
		resources.add("startup");
	}
	@AfterEach
	void after() {
		resources.clear();
	}

	@Test
	@Tag("group")
	//@ResourceLock(value = "resources")
	public void testA() throws InterruptedException {
		resources.add("testA");
		System.out.println(resources);
		Thread.sleep(500);
		System.out.println("TestGroup1|TestA ==> " + Thread.currentThread().getName());
	}


	@Test
	@Tag("group")
	//@ResourceLock(value = "resources")
	public void testB() throws InterruptedException {

		resources.add("testB");
		System.out.println(resources);
		Thread.sleep(500);
		System.out.println("TestGroup1|TestB ==> " + Thread.currentThread().getName());
	}
}
