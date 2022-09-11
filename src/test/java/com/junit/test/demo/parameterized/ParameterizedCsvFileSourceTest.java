package com.junit.test.demo.parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ParameterizedCsvFileSourceTest {
	@DisplayName("Should calculate the correct sum")
    @ParameterizedTest(name = "{index} => number1={0}, number2={1}, result={2}")
	@CsvFileSource(resources = "/numbers.csv", numLinesToSkip = 1)
    void sum1(int number1, int number2, int result) {
        assertEquals(result, number1 + number2);
    }
}
