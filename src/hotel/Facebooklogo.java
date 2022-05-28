package hotel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;


public class Facebooklogo {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\Org.com\\Driver4\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			String title = driver.getTitle();
			System.out.println(title);
      String current = driver.getCurrentUrl();
   boolean b=   driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
   Assert.assertTrue(b);
   if(b) {
	   System.out.println("logo present");
	   
   }
   else {
	   System.out.println("logo not present");
	   
   }
      
      
      

	}

}
