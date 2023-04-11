package Day3_Advanced_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");
		XpathDemo amazonActivity= new XpathDemo(); 
		amazonActivity.amazonSearch();
		
	}
	
	public void amazonSearch() {
	WebDriver driver = new ChromeDriver(); 
	driver.get("https://www.amazon.com/");
	driver.findElement(By.xpath("//input[ @value='Go']")).click();
	

	}

}

