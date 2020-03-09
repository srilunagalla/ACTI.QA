package com.acti.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class LoginPageTest extends Basetest{

@Test(priority=1)
public void testActilogo() throws InterruptedException{
	
  logger = extent.createTest("verify Actilogo");
logger.log(Status.INFO,"browser launched successfully");
logger.log(Status.INFO,"navigated to the application");
Lp.verifylogin("admin", "manager");

Thread.sleep(2000);
	boolean flag = Lp.actilogo();
	System.out.println(flag);
Assert.assertTrue(flag);
logger.log(Status.PASS, "Actilogo displayed");
}
	
@Test(priority=2)
public void gettitle(){
	String title = Lp.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "actiTIME - Login");
}
@Test(priority=3)
public void testLoginFunctionality()
{
	Lp.verifylogin("admin", "manager");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Assert.assertTrue(driver.getTitle().contains("Enter"));
	etp.clickLogout();

	
}
	

}
	
	
	
	
	
	
	

