package com.acti.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driverscript {
	
	
	public static WebDriver driver;
	 public static Properties prop;
	public Driverscript(){
		try
		{
			prop  = new Properties();
			File src = new File("./acti.properties/config.properties");
			FileInputStream fis = new FileInputStream(src);
			prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("File Not Found "+e.getMessage());
		}
	}
	
	
	public void initBrowser()
	{
		String browser = prop.getProperty("Browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./acti.browsers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.contentEquals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./acti.browsers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.contentEquals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "./acti.browsers/iedriver.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
	
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("qURL"));
		
	}

}
