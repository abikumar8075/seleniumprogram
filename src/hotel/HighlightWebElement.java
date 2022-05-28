package hotel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\Org.com\\Driver4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com/");
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 WebElement link = driver.findElement(By.linkText("New User Register Here"));
		 js.executeScript("arguments[0].setAttribute('style','background:red');", link);
		// link.click();
//		 WebElement lin = driver.findElement(By.id("username"));
//		  js.executeScript("arguments[0].setAttribute('style','background:blue;border:solid 2px red');", lin);
//		  lin.sendKeys("abikumar");
//		 
//		 WebElement pass = driver.findElement(By.id("password"));
//		  js.executeScript("arguments[0].setAttribute('style','background:green;border:solid 2px red');", pass);
//		  pass.sendKeys("Pappu@8075");
//		  Thread.sleep(30000);
//		   
//		  
//		  WebElement log = driver.findElement(By.id("login"));
//		  js.executeScript("arguments[0].setAttribute('style','background:yellow;border:solid 2px green');", log);
//		  log.click();
//		
//		
		 
		
		
		
		 

	}

}
