package com.org;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenhort {

	public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\Org.com\\Driver4\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
			FileUtils.copyFile(src,new File("C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\Org.com\\Screenshort.png"));
			 
		 

	}

}
