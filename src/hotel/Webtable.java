package hotel;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIDHYAK_GFMK\\eclipse-workspace\\Org.com\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
//		 List<WebElement> find = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
//		 System.out.println(find.size());
//		 //for (int i = 0; i <find.size(); i++) {
//			 WebElement count = find.get(0);
//			 List<WebElement> ele = count.findElements(By.tagName("th"));
//			 System.out.println(ele.size());
//			for (int i = 0; i < ele.size(); i++) {
//				WebElement el = ele.get(i);
//				System.out.println(el.getText());
//				
//				
//			}
//		
		
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println(table.size());
	    // for (int i = 0; i < table.size(); i++) {
	    	 WebElement  lo = table.get(3);
	    	 List<WebElement> td = lo.findElements(By.tagName("td"));
	    	// for (int i = 0; i <td.size(); i++) {
	    	// td.get(0)
				
			//}
	    	 System.out.println(td.get(0).getText());
			
	//	}
		
	     
		
	}

}
