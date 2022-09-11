package com.junit.test.demo.performace;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;

@TestMethodOrder(OrderAnnotation.class)
@Disabled
public class TimeoutTest {
	@Test
	@Timeout(1)
	@DisplayName("performance case to sucess if does not exceeds 1 second")
	@Order(1)
	public void performanceCaseSucess_test() throws InterruptedException {
		Thread.sleep(900);
	}
	
	@Test
	@Timeout(1)
	@DisplayName("performance case to fail if exceeds 1 second")
	@Order(2)
	public void performanceCaseFail_test() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
	}
	
	@Test
	@DisplayName("performance case to sucess if does not exceeds 1 seconds using assertTimeout")
	@Order(3)
	public void performanceCaseSucess_assertTimeout_test() throws InterruptedException {
		assertTimeout(Duration.ofSeconds(1), () -> Thread.sleep(500)); 
	}
	
	@Test
	@DisplayName("performance case to fail if does not exceeds 1 second using assertTimeout")
	@Order(4)
	public void performanceCaseFail_assertTimeout_test() throws InterruptedException {
		assertTimeout(Duration.ofSeconds(1), () -> {
														// TODO logic
														TimeUnit.SECONDS.sleep(2);
													}); 
	}
	
	@Test
	@Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
	@DisplayName("performance case to fail if exceeds 500 miliSeconds")
	@Order(5)
	public void performanceMiliSecondsCaseSuccess_test() throws InterruptedException {
		Thread.sleep(200);
	}
	
	@Test
	@Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
	@DisplayName("performance case to fail if exceeds 500 miliSeconds")
	@Order(6)
	public void performanceMiliSecondsCaseFail_test() throws InterruptedException {
		Thread.sleep(700);
	}
}
