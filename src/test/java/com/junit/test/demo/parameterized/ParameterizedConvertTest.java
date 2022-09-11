package com.junit.test.demo.parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;

import com.junit.test.demo.parameterized.convert.EmployeeConverter;
import com.junit.test.demo.parameterized.wapper.Employee;

public class ParameterizedConvertTest {

	
    @DisplayName("Should calculate the correct sum")
    @ParameterizedTest(name = "{index} => a={0}, b={1}, sum={2}")
    @ArgumentsSource(CustomArgumentProvider.class)
    void sum3(int a, int b, int sum) {
        assertEquals(sum, a + b);
    }
 
    static class CustomArgumentProvider implements ArgumentsProvider {
 
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
            return Stream.of(
                    Arguments.of(1, 1, 2),
                    Arguments.of(2, 3, 5)
            );
        }
    }
    
    
    @DisplayName("Should pass same messages as method parameters")
    @ParameterizedTest(name = "{index} => actual={0}, expected={1}")
    @CsvSource({
            "Ahmed, Ahmed",
            "Mohammed, Mohammed",
    })
    void shouldPassMessages(@ConvertWith(EmployeeConverter.class) Employee actual,
                            @ConvertWith(EmployeeConverter.class) Employee expected) {
        assertEquals(expected.getName(), actual.getName());
    }
    
    
    @ParameterizedTest 
    @NullSource 
    void isBlank_ShouldReturnTrueForNullInputs(String input) { 
    	assertTrue(input == null || input.trim().isEmpty()); 
    }

}
