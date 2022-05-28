package selectclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Method {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\Org.com\\Driver4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		 WebElement day = driver.findElement(By.id("day"));
		 day.click();
		 
		 Select s= new Select(day);
		 boolean multiple = s.isMultiple();
		 System.out.println(multiple);
		 
		 List<WebElement> options = s.getOptions();
		 for(WebElement X:options) {
			 System.out.println(X.getText());
			
		}
		// System.out.println(options);
		// s.deselectByIndex(10);
		 
}
}