package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class MergeListUsingStreams {
	public void mergeDifferentList() {
		Collection<String> names1 = new ArrayList<String>();
		names1.add("ashik");
		names1.add("abi");
		names1.add("manju");
		
		
		List<String> names2=Arrays.asList("man","woman","god","dog");
		
		//converting 2 list to stream an concatinating it
		 Stream.concat(names1.stream(),names2.stream()).sorted().forEach(s-> System.out.println(s));
		 Stream<String> newStream= Stream.concat(names1.stream(), names2.stream());	
		 
		 
		 boolean flag= newStream.anyMatch(s -> s.equalsIgnoreCase("MAN"));
		 Assert.assertTrue(flag);
		 //assertion pass due to equalsignorecase method used for MAN
		 
	}
	

}
