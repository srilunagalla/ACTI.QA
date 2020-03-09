package com.acti.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.qa.base.Driverscript;

public class LoginPage  extends Driverscript{
	

	@FindBy(xpath="//div[@class='atLogoImg']") WebElement actiLogo;
	@FindBy(id="username") WebElement usernameTb;
	@FindBy(name="pwd") WebElement passwordTb;
	@FindBy(id="loginButton") WebElement loginBtn;




public  LoginPage(){
	
	PageFactory.initElements(driver, this);
}

public boolean  actilogo(){
	
return	actiLogo.isDisplayed();
}

public  void verifylogin(String username,String password){

usernameTb.sendKeys(username);
passwordTb.sendKeys(password);
loginBtn.click();

}

public String getTitle(){
	
return	driver.getTitle();
}



}

	

