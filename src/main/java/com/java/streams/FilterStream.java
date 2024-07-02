package com.java.streams;

import java.util.stream.Stream;

import org.testng.annotations.Test;

public class FilterStream {
@Test
	public void streamFilter() {
		Stream.of("ashik","abilash","aerin","cater")
		.filter(s-> s.length()>4).forEach(s-> System.out.println(s));
		//print all elements
		
		Stream.of("ashik","abilash","aerin","cater")
		.filter(s-> s.length()>4).limit(1).forEach(s-> System.out.println(s));
		//limiting filter to 1 element so only "ashik" prints
		
		Stream.of("ashik","abilash","aerin","cater")
		.filter(a -> a.matches("abilash")).forEach(a-> System.out.println(a));
		//print abilash
	}
}
