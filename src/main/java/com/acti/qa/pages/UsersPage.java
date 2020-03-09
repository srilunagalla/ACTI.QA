package com.acti.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.qa.base.Driverscript;

public class UsersPage extends Driverscript {

	@FindBy(xpath="//div[@id='container_users']")WebElement UsersLink;
	
	

public UsersPage(){
	PageFactory.initElements(driver, this);
	
}

public void clickUserspage(){
	UsersLink.click();
}








}