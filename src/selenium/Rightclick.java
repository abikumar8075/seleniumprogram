package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\Org.com\\Driver4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		WebElement rightclick = driver.findElement(By.cssSelector(".context-menu-one "));
		action.contextClick(rightclick).build().perform();
	WebElement copy = driver.findElement(By.cssSelector("context-menu-icon-paste"));
		copy.click();
		//copy.getText();
		
		//driver.switchTo().alert(
		
		
		
	   
}
}