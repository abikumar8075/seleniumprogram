package hotel;

import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\Org.com\\Driver4\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
//			WebElement google = driver.findElement(By.name("q"));
//			google.sendKeys("facebook login:",Keys.ENTER);
//		    driver.findElement(By.linkText("Log In")).click();
//		    driver.findElement(By.linkText("Sign up for Facebook")).click();
//		    driver.findElement(By.name("firstname")).sendKeys("pappu");
//    		driver.findElement(By.name("lastname")).sendKeys("kumar");
//    		driver.findElement(By.xpath(" //input[@name='reg_email__']")).sendKeys("8015716389");
//    		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("abi@123");
//            //driver.findElement(By.name("//input[@name='birthday_age']")).sendKeys("03/07/1993");
//    		WebElement ele = driver.findElement(By.id("day"));
//    		ele.click();
//    		Select s= new Select(ele);
//    		s.selectByIndex(5);
//    		List<WebElement> options = s.getOptions();
//    		for(WebElement w :options) {
//    			System.out.println(w.getText());
//    		WebElement month = driver.findElement(By.id("month"));
//    			month.click();
//    			Thread.sleep(3000);
//    			Select s1 =new Select (month);
//    			 s1.selectByVisibleText("Jun");
//    		 
//    			WebElement year = driver.findElement(By.id("year"));
//    			year.click();
//    			Select s2 =new Select (year);
//    		   s2.selectByVisibleText("2021");
//    		   Thread.sleep(3000);
//    		  driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[preceding-sibling::label[text()='Male']]")).click();
    		
//		    String parent = driver.getWindowHandle();
//		    System.out.println(parent);
//		    Set<String> child = driver.getWindowHandles();
//		    System.out.println(child);
//		    for(String x:child) {
//		    	if(!parent.equals(x)) {
//		    		driver.switchTo().window(x);
//		    		driver.findElement(By.name("firstname")).sendKeys("pappu");
//		    		driver.findElement(By.name("lastname")).sendKeys("kumar");
//		    		WebElement ele = driver.findElement(By.id("day"));
//		    		ele.click();
//		    		Select s= new Select(ele);
//		    		List<WebElement> options = s.getOptions();
//		    		for(WebElement w :options) {
//		    			System.out.println(w.getText());
		    		String m="Male";
			List<WebElement> genders = driver.findElements(By.xpath("//span[@id='u_0_w_MT']//child::span/label"));
			for (int i = 0; i <genders.size(); i++) {
				String gen = genders.get(i).getText();
				if (gen.equals(m)) {
					driver.findElement(By.xpath("//span[@id='u_0_w_MT']//child::span["+i+1+"]/input")).clear();
					break;
					
				}
				
			}
		    		}
	
		    }
			
		    
		 

	


