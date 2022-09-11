package com.junit.test.demo.parameterized;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedValueSourceTest {
	
	@ParameterizedTest
	@ValueSource(strings = {"", "  "})
	void isBlank_ShouldReturnTrueForAllTypesOfBlankStrings(String input) {
	    assertTrue(input == null || input.trim().isEmpty());
	}
	
	/**
	 * will run two times and will fail in the second time, because we did not consider mohammed value in assertTrue
	 * @param input
	 */
	@ParameterizedTest
	@ValueSource(strings = {"ahmed", "mohammed"})
	@Disabled
	void isBlank_ShouldReturnTrueForAllTypesOfBlankStrings2(String input) {
	    assertTrue((input != null || !(input.trim().isEmpty())) && (input.equals("ahmed") ));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE}) // six numbers means six times
	void isOdd_ShouldReturnTrueForOddNumbers(int number) {
	    assertTrue(number % 2 != 0); //is odd?
	}
}
