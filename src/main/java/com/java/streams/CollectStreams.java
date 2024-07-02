package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;
@Test
public class CollectStreams {
	public void collector() {
		List<String> l1=Arrays.asList("Ashik","shalin","babu","madan");
		
		 List<String> l2=l1.stream().filter(s -> s.startsWith("s")).map(s -> s.toUpperCase()).
		 collect(Collectors.toList());
		System.out.println(l2.get(0)); 
	
		
	}

}
