package hotel;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class Handles {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\Org.com\\Driver4\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(" https://www.amazon.in/");
        WebElement enter = driver.findElement(By.id("twotabsearchtextbox"));
        enter.sendKeys("Apple iPhone 13 Pro Max (256GB) - Sierra Blue" );
        enter.sendKeys(Keys.ENTER);
      
        		 driver.findElement(By.linkText("Apple iPhone 13 Pro Max (256GB) - Sierra Blue")).click();
        	       
        	      String parent = driver.getWindowHandle();
        	        Set<String> child = driver.getWindowHandles();
        	        for(String x:child) {
        	        	if(!x.equals(parent)) {
        	        		driver.switchTo().window(x);
        	        		 
        	        		WebElement  surch = driver.findElement(By.id("buy-now-button"));
        	        		JavascriptExecutor js = (JavascriptExecutor)driver;
        	        		js.executeScript("arguments[0].click()", surch);
        	        		System.out.println("complete");
        	        		
        	        		driver.findElement(By.id("ap_email")).sendKeys("8015716389");
        	        		driver.findElement(By.id("continue")).click();
        	        		driver.close();
        	        		 
        	        		
        	}
        
        	        }
        	       // driver.switchTo().defaultContent();
        	        driver.findElement(By.linkText("Apple iPhone 13 Pro Max (256GB) - Gold")).click();
        	        
          	      String parent1 = driver.getWindowHandle();
          	        Set<String> child1 = driver.getWindowHandles();
          	        for(String s:child1) {
          	        	if(!s.equals(parent1)) {
          	        		
          	        		driver.switchTo().window(s);
          	        		driver.findElement(By.id("buy-now-button")).click();
          	        		
          	        		
          	        	}   	        
        	        
	}
		 
		
	}
}

