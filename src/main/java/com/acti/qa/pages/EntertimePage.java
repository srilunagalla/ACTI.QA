package com.acti.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.qa.base.Driverscript;

public class EntertimePage extends Driverscript {
	public EntertimePage()
	{
		PageFactory.initElements(driver, this);
	}
	
//********************************** Page Elements *************************************************//
	
	@FindBy(id="logoutLink") WebElement logoutLnk;
	@FindBy(xpath="//div[@id='container_tasks']") WebElement taskMenu;
	
// ******************************** Page Actions ***************************************************//
	
	public void clickLogout()
	{
		logoutLnk.click();
	}
	
	public void clickTaskMenu()
	{
		taskMenu.click();
	}

}	
	
	
	

