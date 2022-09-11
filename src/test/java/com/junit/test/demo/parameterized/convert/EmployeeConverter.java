package com.junit.test.demo.parameterized.convert;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

import com.junit.test.demo.parameterized.wapper.Employee;

public class EmployeeConverter implements ArgumentConverter {

	@Override
	public Object convert(Object source, ParameterContext context) throws ArgumentConversionException {
		checkSource(source);
		
		String sourceString = (String) source;
        return new Employee(sourceString);
	}
	
	
	private void checkSource(Object source) {
        if (source == null) {
            throw new ArgumentConversionException("Cannot convert null source object");
        }
 
        if (!source.getClass().equals(String.class)) {
            throw new ArgumentConversionException("Cannot convert source object because it's not a string");
        }
 
        String sourceString = (String) source;
        if (sourceString.trim().isEmpty()) {
            throw new ArgumentConversionException("Cannot convert an empty source string");
        }
    }
}
