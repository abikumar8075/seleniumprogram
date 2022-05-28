package com.org;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\Org.com\\Driver4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	 
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		 
		WebElement btn = driver.findElement(By.id("newWindowBtn"));
		 btn.click();
		 Thread.sleep(2000);
		 Set<String> Handles = driver.getWindowHandles();
		 System.out.println(Handles);
		 
		 //driver.findElement(By.id("firstName")).sendKeys("Abinash");
		

	}

}
