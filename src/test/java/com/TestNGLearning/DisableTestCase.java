package com.TestNGLearning;

import org.testng.annotations.Test;

public class DisableTestCase {
@Test(enabled = true, invocationCount = 2,priority = 0)
public void TestTwo() {
	System.out.println("TestTwo");
}
}
