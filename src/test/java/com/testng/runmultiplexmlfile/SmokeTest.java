package com.testng.runmultiplexmlfile;

import org.testng.annotations.Test;

public class SmokeTest {
	@Test(priority = 0)
	public void testOne() {
		System.out.println("smoketest- testOne");
	}

	@Test(priority = 1)
	public void testTwo() {
		System.out.println("smoketest- testTwo");
	}

}
