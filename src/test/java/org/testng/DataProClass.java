package org.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProClass {
	
	@DataProvider (name="fbval")
	@Test
	private Object[][] BulkData(){

	 return new Object[][] {
		 {"greens","greens@123"},
		 {"java","java@123"},
		 {"sap","sap@123"}
		 
		 
		 
		 
	 };
	 
	 

}

		
		
	}

