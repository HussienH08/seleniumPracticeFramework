package day1_seleniumLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_selenium {

	public static void main(String[] args) throws InterruptedException { 
	
		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");	
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
	// get page title.
	//	System.out.println("Home Page Title is: "+ driver.getTitle());
		
		Thread.sleep(1000);
		
// find by Id. 
	//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Coffee mug");
	//	driver.findElement(By.id("nav-search-submit-button")).click();
		
// find by linkText. 
		driver.findElement(By.linkText("Best Sellers")).click();
		
// find by Name. 
	//	driver.findElement(By.name("q")).sendKeys("Software Engineer Tester");
	}

}
