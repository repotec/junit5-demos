package com.junit.test.demo.conditions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.ZoneId;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;

public class EnabledDisabledIfTest {
	@Test
	@EnabledIf("#{T(java.time.Instant).now().atZone(T(java.time.ZoneId).of(\"Asia/Kolkata\")).getDayOfWeek() == T(java.time.DayOfWeek).MONDAY}")
	@Disabled
	void onMandayOnly_expression_test() {
	    assertTrue(true);
	}
	
	@Test
	@DisabledIf("onMonday")
	void onMandayOnly_mehtod_test() {
	    assertTrue(true);
	}
	
	static boolean onMonday() {
        return Instant.now().atZone(ZoneId.of("Asia/Kolkata")).getDayOfWeek() == DayOfWeek.MONDAY;
    }
}
