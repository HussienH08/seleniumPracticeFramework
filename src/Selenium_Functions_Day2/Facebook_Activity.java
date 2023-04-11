package Selenium_Functions_Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Activity {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");	
		Facebook_Activity.testcase1();
		//classActivities.testcase2();
	}
		
	public static void testcase1() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
	// Go to Facebook
		driver.get("https://facebook.com");
		Thread.sleep(1000);
	// Type in Email
		driver.findElement(By.id("email")).sendKeys("automation");
	// Type in Password
		driver.findElement(By.id("pass")).sendKeys("automation");
	// Click Login
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	// Closes the Webpage 
		driver.quit();
		Thread.sleep(1000);
	}
	
	public static void testcase2() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("automation");
		driver.findElement(By.name("lastname")).sendKeys("automation");
		driver.findElement(By.name("reg_email__")).sendKeys("automation");
		driver.findElement(By.id("password_step_input")).sendKeys("automation");
		driver.findElement(By.name("websubmit")).click();
		
		driver.close();
	}
}
