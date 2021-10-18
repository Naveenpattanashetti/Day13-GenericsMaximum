package com.bridgelabz.GenericsPrograms;

import org.junit.Test;

import junit.framework.Assert;

public class MaximumTest {
	@Test
	public void given3StringValues_WhenGetMaximum_ShouldReturnCorrectValue1() {
		String finalResult = Maximum.getmaximum("apple", "peach", "banana");
		Assert.assertEquals("peach", finalResult);
	}

	@Test
	public void given3StringValues_WhenGetMaximum_ShouldReturnCorrectValue2() {
		String finalResult = Maximum.getmaximum("apple", "peach", "banana");
		Assert.assertEquals("peach", finalResult);
	}

	@Test
	public void given3StringValues_WhenGetMaximum_ShouldReturnCorrectValue3() {
		String finalResult = Maximum.getmaximum("apple", "peach", "banana");
		Assert.assertEquals("peach", finalResult);
	}
}
