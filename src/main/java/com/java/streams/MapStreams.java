package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

@Test
public class MapStreams {
	public void map() {
		Stream.of("ashik","ramu","Ashik").filter(b-> b.startsWith("r")).map(b-> b.toUpperCase())
		.forEach(b-> System.out.println(b +"\n"));
		//output ="RAMU"
		
		
		List<String> a=Arrays.asList("ashik","ramu","Ashik", "monica","maha");
		a.stream().filter(f -> f.startsWith("m")).sorted().map(f -> f.toUpperCase())
		.forEach(f->System.out.println(f));
	}
}
