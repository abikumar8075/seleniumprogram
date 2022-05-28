package freecrm;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\Org.com\\Driver4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://classic.freecrm.com/");
		
		driver.findElement(By.name("username")).sendKeys("abikumar");
		driver.findElement(By.name("password")).sendKeys("Pappu@8075");
		driver.findElement(By.xpath("//input[@type= 'submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		 
		 
		Actions a = new Actions (driver);
		WebElement cont = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		a.moveToElement(cont).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
		//driver.findElement(by)
	WebElement tit= driver.findElement(By.xpath("//select[@name='title']"));
	tit.click();
	 Select s= new Select(tit);
	 s.selectByIndex(3);
     List<WebElement> options = s.getOptions();
     for(WebElement x:options) {
    	 System.out.println(x.getText());
     }
	 
	  driver.findElement(By.id("first_name")).sendKeys("Abinash");
	  driver.findElement(By.id("middle_initial")).sendKeys("kumar");
	  driver.findElement(By.id("surname")).sendKeys("yadav");
	  
	  WebElement element = driver.findElement(By.name("suffix"));
	  element.click();
	  Select s1= new Select(element);
	  s1.selectByValue("III");
	  
	  WebElement  ty = driver.findElement(By.name("type"));
	  ty.click();
	  Select s3 = new Select(ty);
	  s3.selectByIndex(1);
	  WebElement time = driver.findElement(By.id("timezone"));
	  Select s4 = new Select(time);
	  s4.selectByIndex(4);
	  
	   driver.findElement(By.xpath("//input[@type='radio'][@name='receive_email'][@value='N']")).click();
	  // driver.findElement(   ")).click();
	  driver.findElement(By.xpath(" //input[@value='Save' and @type='submit'] ")).click();
	   Thread.sleep(2000);
	 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	 
	  // driver.switchTo().frame("leftpanel");
	  // driver.findElement(By.xpath("//a[contains(text(),'Shortlist')]")).click();
	   FileUtils.copyFile(src, new File("C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\Org.com\\Screenshort.png"));
	   
	   

	 
	 
	}

}

