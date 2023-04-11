package Selenium_Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContainsText {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");

		XpathContainsText testcase = new XpathContainsText();
		testcase.etsyXpath();
	}

	public void etsyXpath() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.etsy.com/");
		driver.findElement(By.xpath("//button[contains(text(), 'Sign in')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class, 'select-register')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@type, 'email')]")).sendKeys("jon@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name, 'first_name')]")).sendKeys("Jon");
		driver.findElement(By.xpath("//input[contains(@type, 'password')]")).sendKeys("jrghrg");
		driver.findElement(By.xpath("//button[contains(@value, 'register')]")).click();
		Thread.sleep(1000);
		
		driver.quit();
		Thread.sleep(1000); 
	}
}
