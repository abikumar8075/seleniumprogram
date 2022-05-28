package hotel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookErrorMsg {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\Org.com\\Driver4\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			driver.findElement(By.name( "email")).sendKeys("abi123@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("abi@123");
			driver.findElement(By.name("login")).click();
			WebElement error = driver.findElement(By.xpath("//div[@class='_9ay7']"));
			System.out.println(error.getText());
			
			
			

	}

}
