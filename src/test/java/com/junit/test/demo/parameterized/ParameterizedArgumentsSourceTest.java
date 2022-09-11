package com.junit.test.demo.parameterized;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

public class ParameterizedArgumentsSourceTest {
	@ParameterizedTest
	@ArgumentsSource(MyArgumentsProvider.class)
	void testWithArgumentsSource(String argument) {
	    assertNotNull(argument);
	}
	
	/**
	 *  should be static class
	 */
	public static class MyArgumentsProvider implements ArgumentsProvider { 
	    @Override
	    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
	        return Stream.of("Ahmed", "mohammed").map(Arguments::of);
	    }
	}
}
