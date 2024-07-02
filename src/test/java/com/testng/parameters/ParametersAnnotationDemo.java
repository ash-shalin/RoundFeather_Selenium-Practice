package com.testng.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersAnnotationDemo {
	
	@Parameters({"browser","url"})
	//check the testngParameters.xml file 
	@Test
	public void parametersAnnotation(String Browser,String Testurl) {
		System.out.println("browser name is:"+ Browser);
		System.out.println("url is :"+ Testurl);
		
	}

}
