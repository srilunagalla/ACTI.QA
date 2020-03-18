package com.acti.qa.testcase;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class Samplesc {
	public void shot() throws IOException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagal\\Downloads\\new\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		TakesScreenshot shot=(TakesScreenshot)driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File target= new File("./acti.reports/acti.screenshots.png");
		FileUtils.copyFile(src, target);
		
		
		
		
		
		
	}
	

}

