package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

@Test
public class SortandNoDuplicateNumber {
public void sortAndDistinct()
{
	List<Integer> values=Arrays.asList(3,4,5,2,3,5,1,4);
	
	 values.stream().distinct().sorted().forEach(s->System.out.println(s));
	 //1 2 3 4 5
	 
	 List<Integer> n=values.stream().distinct().sorted().collect(Collectors.toList());
	 System.out.println(n.get(3));
	 
	 //4
}
}
