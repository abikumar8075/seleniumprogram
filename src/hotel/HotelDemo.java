package hotel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\Org.com\\Driver4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement user= driver.findElement(By.id("username"));
		user.sendKeys("abikumar");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Pappu@8075");
		WebElement log = driver.findElement(By.id("login"));
		log.click();
		WebElement loct = driver.findElement(By.id("location"));
		Select s= new Select(loct);
		List<WebElement> options = s.getOptions();
		for(WebElement x:options) {
			
			System.out.println(x.getText());
			
		}
				s.selectByIndex(3);
		WebElement find = driver.findElement(By.id("hotels"));
		Select s1= new Select( find);
		 s1.selectByVisibleText("Hotel Creek");
		WebElement room = driver.findElement(By.id("room_nos"));
		Select s3 = new Select (room);
		//s3.selectByValue("Four");
		s3.selectByIndex(4);
		
		
		
		WebElement sum = driver.findElement(By.id("Submit"));
		sum.click();
		//driver.findElement(By.xpath(""))
		
	}

}
