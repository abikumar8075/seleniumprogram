package com.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\Org.com\\Driver4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		WebElement simple = driver.findElement(By.name("alert"));
		simple.click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		a.accept();
		WebElement confirm = driver.findElement(By.name("confirmation"));
		confirm.click();
		Alert confirm1 = driver.switchTo().alert();
		Thread.sleep(3000);
		confirm1.dismiss();
		WebElement prompet = driver.findElement(By.xpath("//input[@type='button'][@name='prompt']"));
		prompet.click();
		Alert prompet5 = driver.switchTo().alert();
		 prompet5.getText();
		 prompet5.sendKeys("Abinash");
		 Thread.sleep(3000);
		 prompet5.accept();
		 driver.close();
		 
		
		
	}

}
