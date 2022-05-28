package hotel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelFull {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\Org.com\\Driver4\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://adactinhotelapp.com/index.php");
			driver.findElement(By.id("username")).sendKeys("abikumar");
			driver.findElement(By.id("password")).sendKeys("abi@123");
			driver.findElement(By.id("login")).click();
			
		    boolean b=     driver.findElement(By.xpath("//div[@class='auth_error']")).isDisplayed();
		    if(b=true) {
		    	System.out.println("invalid msg shown");
		    }
		    else {
		    	System.out.println("not");
		    }
}
}