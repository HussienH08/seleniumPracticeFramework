package SelfPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleAccount {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");
	// Maximize the window and set implicitly wait to 5 seconds 
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 7);
	// go to the website
		driver.get("https://accounts.google.com");
	//Click on "Create Account" 
		driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[3]")).click();
	//Choose "For my personal use"
		WebElement accountType = driver.findElement(By.xpath("(//span[@jsname='K4r5Ff'])[1]")); 
			wait.until(ExpectedConditions.elementToBeClickable(accountType));
			accountType.click();
	// Verify that you are on the create account page 
		if (driver.findElement(By.xpath("//h1[@jsname='r4nke']")).isDisplayed()) {
			System.out.println("PASS! You Are on The Create Account Page");
		} else {
			System.out.println("FAIL! You Are NOT on The Create Account Page");
		}
	// Create a new Professional account for your resume 
		WebElement firstName = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[1]"));
			wait.until(ExpectedConditions.elementToBeClickable(firstName));
			firstName.sendKeys("Enter First Name");
		driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[2]")).sendKeys("Enter Last Name");
		driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[3]")).sendKeys("Enter Username");
		driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[4]")).sendKeys("Enter Password");
		driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[5]")).sendKeys("Enter Password");

	// Click on "Show password", then Un-click it. 
		WebElement showPassword = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[6]"));
			showPassword.click();
			Thread.sleep(1000);
			showPassword.click();
	//Click on the "Next" button. 
		driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]")).click();
	// Verify that you are on the "Verify Phone Number Page"
		if (driver.findElement(By.xpath("//h1[@jsname='r4nke']")).isDisplayed()) {
			System.out.println("PASS! You Are on the Verify Phone Number Page");
		} else {
			System.out.println("FAIL! You Are NOT on the Verify Phone Number Page");
		}
	// Enter you Phone Number 
		WebElement phoneNumber = driver.findElement(By.xpath("//label[@jsname='vhZMvf']"));
			wait.until(ExpectedConditions.elementToBeClickable(phoneNumber));
			phoneNumber.sendKeys("5712682622");
			Thread.sleep(1000);
	// Click on "Next" Button 
			driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]")).click();
	
	// Finish the rest of process Manually. 

		
	}

}
