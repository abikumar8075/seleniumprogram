package hotel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) throws AWTException, InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\Org.com\\Driver4\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
			driver.switchTo().frame("globalSqa");
			WebElement fil = driver.findElement(By.id("current_filter"));
			 Actions a= new Actions(driver);
			 a.moveToElement(fil).perform();
			 Thread.sleep(5000);
			 a.moveToElement(driver.findElement(By.xpath(" //div[@data-option-value='.softwaretesting']"))).click().build().perform();
			  
	}

}
