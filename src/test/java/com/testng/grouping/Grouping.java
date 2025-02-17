package com.testng.grouping;

import org.testng.annotations.Test;

//Check testngGrouping.xml for further flow
public class Grouping {
	@Test(groups = {"smoke","regression"})
	public void test1() {
		System.out.println("test 1");
	}

	@Test(groups = {"sanity"})
	public void test2() {
		System.out.println("test 2");
	}

	@Test(groups = {"smoke","sanity"})
	public void test3() {
		System.out.println("test 3");
	}

	@Test(groups = {"smoke"})
	public void test4() {
		System.out.println("test 4");
	}

	@Test(groups = {"regression"})
	public void test5() {
		System.out.println("test 5");
	}

	@Test
	public void test6() {
		System.out.println("test 6");
	}

}
