package hotel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggesion {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\Org.com\\Driver4\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("selenium");
			Thread.sleep(2000);
			String s="//li[@class='sbct']";
			 List<WebElement> li = driver.findElements(By.xpath(s));
			 int count = li.size();
			 System.out.println(count);
			 for (int i = 0; i <count; i++) {
				 WebElement suggesion = li.get(i);
				String text = suggesion.getText();
				System.out.println(text);
			}
			 Thread.sleep(3000);
			 
			 li.get(count - 1).click();
			 
}
}