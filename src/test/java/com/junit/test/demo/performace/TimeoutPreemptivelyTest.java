package com.junit.test.demo.performace;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Disabled
class TimeoutPreemptivelyTest {

	@Test
	@DisplayName("Timeout - Excution will not Terminated test")
	void performanceCaseFail_ExcutionWillNotTerminated_test() {
		assertTimeout(Duration.ofSeconds(2), () -> {
			TimeUnit.SECONDS.sleep(1);
		});
		
		System.out.println("assertTimeout is done");
	}

	@Test
	@DisplayName("Timeout Preemptively - Excution will Terminated test")
	void performanceCaseFail_ExcutionTerminated_test() {
		assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {
			TimeUnit.SECONDS.sleep(2);
		});
		
		System.out.println("assertTimeoutPreemptively is done");
	}
}
