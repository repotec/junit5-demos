package com.junit.test.demo.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@DisplayName("Junit5 Jupiter Exception test")
@TestMethodOrder(OrderAnnotation.class)
public class ExceptionTest {
	public static String dummy;
	
	@BeforeAll
	public static void beforeAll() {
		dummy = null;
	}
	
	@Test()
	@DisplayName("Test assert throw NullPointerException")
	@Order(1)
	public void caseLogicalExceptionSuccess_assertThrows_NullPointerException_test() {
		assertThrows(NullPointerException.class,()-> dummy.charAt(1));
	}
	
	@Test()
	@DisplayName("Test assert throw exactly NullPointerException")
	@Order(2)
	public void caseLogicalExceptionSuccess_assertThrowsExactly_NullPointerException_test() {
		assertThrowsExactly(NullPointerException.class,()-> dummy.charAt(1));
	}
	
	@Test()
	@DisplayName("Test assert true NullPointerException by message")
	@Order(3)
	@Disabled
	public void caseLogicalExceptionSuccess_assertTrue_NullPointerExceptionMessage_test() {
		final Exception thrown = assertThrows(NullPointerException.class, ()->{
			dummy.charAt(1);
		});
		assertTrue(thrown.getMessage().contains("String.charAt(int)"));
	}
	
	/**
	 * If we are on JUnit 5.8.0+ version, we can use assertThrowsExactly() instead of assertThrows() to match the exact exception type.
	 */
	@Test
	@DisplayName("Test assert equal NullPointerException by exception classes")
	@Order(4)
	public void caseCustomLogicalExceptionSuccess_assertEquals_NullPointerExceptionMessage_test() {
		Throwable throwable = assertThrows(NullPointerException.class, ()->{
			dummy.charAt(1);
		});
		
		assertEquals(NullPointerException.class, throwable.getClass());
	}
	
}
