package com.demo.rough;

public class Demo {
	public static void main(String[] args) {
		StringBuffer x= new StringBuffer("Please use temporary password 'rahulshettyacademy' to Login.");
		for(int i=x.length()-1;i>0;i--)
				System.out.println(x.charAt(i));
				
		String text= "Please use temporary password 'rahulshettyacademy' to Login.";
		/*
		 * // Please use temporary password 'rahulshettyacademy' to Login. String[]
		 * firstSplit= text.split("'"); System.out.println(firstSplit[0]);
		 * System.out.println(firstSplit[1]); String [ ] secondSplit
		 * =firstSplit[1].split("e"); System.out.println(secondSplit[0]);
		 * System.out.println(secondSplit[1]); System.out.println(secondSplit[2]);
		 * System.out.println(secondSplit.length);
		 */
//		for(int i= text.length()-1;i>0;i--) {
//			
//			System.out.println(text.charAt(i));
//		}
	}

}
