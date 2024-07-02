package com.TestNGLearning;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 1, priority = 1)
	public void TestOne() {
		System.out.println("TestOne");
	}

}
