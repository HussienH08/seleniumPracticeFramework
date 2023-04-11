package WebElementsDay6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyEventPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");

		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // waits for the page to be loaded. 
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(("Coffee Mug" + Keys.ENTER));
			Thread.sleep(1000);
			
		WebElement newSearchBox = driver.findElement(By.name("q"));
		newSearchBox.clear();
			Thread.sleep(1000);
			
		newSearchBox.sendKeys("Selenium Webdriver" + Keys.ENTER);
		driver.navigate().back();
			Thread.sleep(1000);
		driver.findElement(By.name("q")).clear();
		driver.navigate().forward();
			Thread.sleep(1000);
		driver.navigate().refresh();
			Thread.sleep(1000);
		
		//driver.quit();
		
	}

}
