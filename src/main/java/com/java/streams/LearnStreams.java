package com.java.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.apache.commons.lang3.stream.Streams;
import org.testng.annotations.Test;

public class LearnStreams {
	@Test(enabled =false)
	public void withoutStreams() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("ashik");
		names.add("babu");
		names.add("archana");
		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actualname = names.get(i);
			if (actualname.startsWith("a")) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	//doing same program using Java Streams
	@Test(enabled= false)
	public void usingStreams() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("ashik");
		names.add("babu");
		names.add("archana");
		System.out.println(names.stream().filter(name -> name.startsWith("a")).count());
	}
	
	@Test(enabled=true)
	public void exploringStreams() {
		
		System.out.println(Stream.of("ashik","abilash","aerin","cater").filter(s-> s.startsWith("a")).count());
		
		Stream.of("ashik","abilash","aerin","cater","vghf").filter(a->
		{
			//if there are multiple operation use curly braces
			a.startsWith("a");
			return true;// so count will be 3
			//return false;// then count will be 0 due to intermediate operation the count() won't work
		}).count();			
	
	
	
	
	
	
	
	
	}
}
