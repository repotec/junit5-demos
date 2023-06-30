package com.junit.test.demo.arrays.assertj;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@DisplayName("Junit5 assertj Array test")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ArrayTest {

	@Test
	@Order(1)
	public void sortArrayCaseSucess_test() {
		int[] actual = {100, 400, 300, 900, 800};
		int[] expected = {100, 300, 400, 800, 900};
		Arrays.sort(actual);
		
		//assertArrayEquals(expected, actual);
		Assertions.assertThat(actual).containsExactly(expected);
	}
	
	@Test
	@Order(2)
	public void sortArrayCaseFail_test() {
		int[] actual = {100, 400, 300, 900, 800};
		int[] expected = {100, 200, 300, 400, 800, 900};
		Arrays.sort(actual);
		
		Assertions.assertThat(actual).containsExactly(expected);
		
	}
	
	@Test
	@Order(3)
	public void listWithoutDuplications_success_test() {
		List<String> actual = new ArrayList<>() {{add("white"); add("black"); add("red");}};	
		
		Assertions.assertThat(actual).doesNotHaveDuplicates();
	}
	
	@Test
	@Order(4)
	public void listWithDuplications_fail_test() {
		List<String> actual = new ArrayList<>() {{add("white"); add("black"); add("red"); add("white");}};	
		
		Assertions.assertThat(actual).doesNotHaveDuplicates();
	}
	
	@Test
	@Order(5)
	public void listSize_success_test() {
		List<String> actual = new ArrayList<>() {{add("white"); add("black"); add("red");}};	
		
		Assertions.assertThat(actual).hasSize(3);
	}
	
	@Test
	@Order(6)
	public void listSize_fail_test() {
		List<String> actual = new ArrayList<>() {{add("white"); add("black"); add("red"); add("yallow");}};	
		
		Assertions.assertThat(actual).hasSize(3);
	}
	
	
	@Test
	@Order(7)
	public void listEndWith_success_test() {
		List<String> actual = new ArrayList<>() {{add("white"); add("black"); add("red");}};	
		
		Assertions.assertThat(actual).endsWith("red");
	}
	
	@Test
	@Order(8)
	public void listEndWith_fail_test() {
		List<String> actual = new ArrayList<>() {{add("white"); add("black"); add("red"); add("yallow");}};	
		
		Assertions.assertThat(actual).endsWith("white");
	}
	
	@Test
	@Order(9)
	public void listDoesNotContain_success_test() {
		List<String> actual = new ArrayList<>() {{add("white"); add("black"); add("red");}};	
		
		Assertions.assertThat(actual).doesNotContain("yallow");
	}
	
	@Test
	@Order(10)
	public void listDoesNotContain_fail_test() {
		List<String> actual = new ArrayList<>() {{add("white"); add("black"); add("red");}};	
		
		Assertions.assertThat(actual).doesNotContain("white");
	}
	
	@Test
	@Order(11)
	public void listContainExactly_success_test() {
		List<String> actual = new ArrayList<>() {{add("white"); add("black"); add("red");}};	
		
		Assertions.assertThat(actual).containsExactly("white", "black", "red");
	}
	
	@Test
	@Order(12)
	public void listContainExactly_fail_test() {
		List<String> actual = new ArrayList<>() {{add("white"); add("black"); add("red");}};	
		
		Assertions.assertThat(actual).containsExactly("white", "black", "red", "yallow");
	}
}
