package hotel;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\Org.com\\Driver4\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWindowBtn")).click();
		String parent  = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for(String x:child) {
			if(!parent.equals(x)){
				driver.switchTo().window(x);
				driver.close();
				
			}
				
			
		}
		
//		driver.findElement(By.id("firstName")).sendKeys("Abinash");
//		Thread.sleep(5000);
//		driver.findElement(By.id("lastName")).sendKeys("kumar");
//		
//	    driver.quit();
//	    Thread.sleep(20000);
//	    String windowHandle = driver.getWindowHandle();
//	    Set<String> windowHandles = driver.getWindowHandles();
//	    for(String w:windowHandles) {
//	    	if(!windowHandles.equals(w)) {
//	    		 driver.switchTo().window("windowHandles");
//	    		 driver.close();
//	    	}
//	    }
	    
	    driver.switchTo().window(parent);
	     driver.findElement(By.id("name")).sendKeys("pappu");
	     
	     driver.findElement(By.id("newWindowsBtn")).click();
	     Thread.sleep(20000);
	     String parent1 = driver.getWindowHandle();
	     Set<String> chield1 = driver.getWindowHandles();
	     System.out.println(chield1);
 
	     driver.manage().window().maximize();
	     driver.findElement(By.id("email")).sendKeys("yadav@123");
		 driver.findElement(By.id("password")).sendKeys("yadav#123");
	     
		
		

	}

}
