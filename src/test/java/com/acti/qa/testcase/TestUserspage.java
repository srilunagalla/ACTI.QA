package com.acti.qa.testcase;

import org.testng.annotations.Test;

public class TestUserspage extends Basetest{
@Test
	
	public void Userpage(){
		
		Lp.verifylogin(prop.getProperty("username"), prop.getProperty("password"));
		Up.clickUserspage();
		
	}
	
	
	
}
