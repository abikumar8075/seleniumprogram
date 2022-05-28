package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\Org.com\\Driver4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[text()='Draggable']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[text()='Droppable']")).click();
	driver.switchTo().frame(0);
	WebElement findElement1 = driver.findElement(By.id("draggable"));
	WebElement findElement = driver.findElement(By.id("droppable"));
	
	Actions action = new Actions(driver);
	action.clickAndHold(findElement1).moveToElement(findElement).release().build().perform();
	
	
	

}
}