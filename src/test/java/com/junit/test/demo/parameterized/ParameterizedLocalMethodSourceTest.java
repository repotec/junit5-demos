package com.junit.test.demo.parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ParameterizedLocalMethodSourceTest {
	@DisplayName("Nullability For Stream Of String With Explicit Local MethodSource test")
	@ParameterizedTest
	@MethodSource("stringProvider")
	void NullabilityForStreamOfStringWithExplicitLocalMethodSource_test(String argument) {
		Assertions.assertNotNull(argument);
	}

	@DisplayName("summation For Two Parameters with Expression Order and With Explicit Local MethodSource test")
	@ParameterizedTest(name = "{index} => number1={0}, number2={1}, sum={2}")
	@MethodSource("sumProvider")
	void summationForTwoParametersExpressionOrderWithExplicitLocalMethodSource_test(int number1, int number2, int sum) {
		assertEquals(sum, number1 + number2);
	}

	private static Stream<String> stringProvider() {
		return Stream.of("ahmed", "mohammed");
	}

	private static Stream<Arguments> sumProvider() {
		return Stream.of(Arguments.of(11, 9, 20), Arguments.of(4, 26, 30));
	}

}
