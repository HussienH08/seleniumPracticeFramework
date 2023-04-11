package SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPruchase {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");

	WebDriver driver = new ChromeDriver();
	//Amazon Website And Sign in
		driver.get("https://www.amazon.com/dp/B0BNT9KPS3/ref=twister_B0BJ91PPT3?_encoding=UTF8&th=1");
		driver.findElement(By.id("buy-now-button")).click();
			Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("hussien121@icloud.com");
			Thread.sleep(1000); 
		driver.findElement(By.id("continue")).click();
			Thread.sleep(1000); 
		driver.findElement(By.name("password")).sendKeys("Hussain1208?");
			Thread.sleep(1000);
		driver.findElement(By.id("signInSubmit")).click();
			Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-labelledby='orderSummaryPrimaryActionBtn-announce']")).click();
			Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='a-button-text a-text-center']")).click();
			Thread.sleep(3000);
		
		
		//driver.quit();
			//Thread.sleep(1000);
		
	}

}
