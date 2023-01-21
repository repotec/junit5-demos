package com.junit.test.demo.repeat;

import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class RepeatTest {
	
	private static final Logger logger = Logger.getLogger(RepeatTest.class.getName());

	@BeforeEach
    void beforeEach(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        int curRepetition = repetitionInfo.getCurrentRepetition();
        int totalRepetitions = repetitionInfo.getTotalRepetitions();
        String methodName = testInfo.getTestMethod().get().getName();
        logger.info(String.format("Now about to execute repetition %d of %d for %s", curRepetition, totalRepetitions, methodName));
    }
 
    @RepeatedTest(value=5, name = "{displayName}. Repeatition {currentRepeatition} of {totalRepeatition}")
    void repeat_test() {
    }
 
    @RepeatedTest(value=5, name = "{displayName}. Repeatition {currentRepeatition} of {totalRepeatition}")
    void repeat_repetitionInfo_test(RepetitionInfo repetitionInfo) {
        
    }
 
    @RepeatedTest(value = 5, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    @DisplayName("Repeat Test for 10")
    void displayName_test(TestInfo testInfo) {
        
    }
 
    @RepeatedTest(value = 5, name = RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName("RepeatedTestWithLongDisplayName")
    void longDisplayName_test(TestInfo testInfo) {
       
    }

}
