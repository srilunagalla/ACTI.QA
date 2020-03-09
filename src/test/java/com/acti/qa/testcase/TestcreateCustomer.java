package com.acti.qa.testcase;

import org.testng.annotations.Test;

public class TestcreateCustomer extends Basetest {
	
	@Test
	public void testCreateCustomer()
	{
		Lp.verifylogin(prop.getProperty("username"), prop.getProperty("password"));
		etp.clickTaskMenu();
		TLP.ClickAddnew();
		TLP.CreateNewcustomer();
		TLP.EnterNewName("Saicharan12","Dummy customer");
		
		
	}
	
	
	
	
	

}
