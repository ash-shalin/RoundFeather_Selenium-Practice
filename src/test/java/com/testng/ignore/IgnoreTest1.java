package com.testng.ignore;

import org.testng.annotations.Test;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest1 {
	@Test(enabled = false)

	public void test1() {
		System.out.println("Test1");
	}

	@Test
	public void test2() {
		System.out.println("Test2");
	}

	@Test(enabled = false)
	
	public void test3() {
		System.out.println("Test3");
	}

}
