package com.bridgelabz.GenericsPrograms;

import org.junit.Test;

import junit.framework.Assert;

public class MaximumTest {
	@Test
	public void checkmaximum1() {
		int max = Maximum.getmaximum(9, 4, 1);
		Assert.assertEquals(9, max);
	}

	@Test
	public void checkmaximum2() {
		int max = Maximum.getmaximum(1, 9, 4);
		Assert.assertEquals(9, max);
	}

	@Test
	public void checkmaximum3() {
		int max = Maximum.getmaximum(1, 4, 9);
		Assert.assertEquals(9, max);
	}
}

