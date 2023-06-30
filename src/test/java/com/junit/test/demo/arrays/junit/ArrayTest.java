package com.junit.test.demo.arrays.junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Junit5 Jupiter Array test")
public class ArrayTest {

	@Test
	public void sortArrayCaseSucess_test() {
		int[] actual = {100, 400, 300, 900, 800};
		int[] expected = {100, 300, 400, 800, 900};
		Arrays.sort(actual);
		
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * error: org.opentest4j.AssertionFailedError: array lengths differ, expected: <6> but was: <5>
	 */
	@Test
	@Disabled
	public void sortArrayCaseFail_test() {
		int[] actual = {100, 400, 300, 900, 800};
		int[] expected = {100, 200, 300, 400, 800, 900};
		Arrays.sort(actual);
		
		assertArrayEquals(expected, actual);
		
	}
}
