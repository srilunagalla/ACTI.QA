package com.acti.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.qa.base.Driverscript;

public class TaskListPage extends Driverscript{


public   TaskListPage(){
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//div[@class='title ellipsis']")WebElement AddNewbtn;
@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement CreateNewCust;
@FindBy(xpath="//div[@class='customerNameDiv']//input[@placeholder='Enter Customer Name']")WebElement EnterNewname;
@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")WebElement CustDesc;
@FindBy(xpath="//div[contains(text(),'Create Customer')]") WebElement CreateNew;
 
public void  ClickAddnew(){
	 AddNewbtn.click();
}

public void CreateNewcustomer(){
	CreateNewCust.click();
}

public void EnterNewName(String name,String Description){
	EnterNewname.sendKeys(name);
	CustDesc.sendKeys(Description);
	CreateNew.click();
	
}


}