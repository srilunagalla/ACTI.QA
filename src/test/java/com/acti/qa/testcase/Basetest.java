package com.acti.qa.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.acti.qa.base.Driverscript;
import com.acti.qa.pages.EntertimePage;
import com.acti.qa.pages.LoginPage;
import com.acti.qa.pages.TaskListPage;
import com.acti.qa.pages.UsersPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Basetest extends Driverscript{
	
	public static ExtentHtmlReporter html;
	public static ExtentReports extent;
	public  ExtentTest logger;
	LoginPage Lp;
	
	EntertimePage etp;
	TaskListPage TLP ;
	UsersPage Up;
public Basetest(){
	super();
	
}
@BeforeClass
public void setreport(){
	ExtentHtmlReporter html = new ExtentHtmlReporter("./acti.reports/Actiautomation");
	 ExtentReports extent = new ExtentReports();
	 extent.attachReporter(html);
}

@BeforeMethod

public void beforetest(){
	initBrowser();
	 Lp = new LoginPage();
	 etp = new EntertimePage();
	 TLP = new TaskListPage();
	 Up=new UsersPage();
	
}
@AfterMethod
public void teardown(){
	driver.close();
	extent.flush();		
}

}




	
	
	
	
	



