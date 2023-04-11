package Day3_Advanced_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyClassActivity {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");
		EtsyClassActivity etsyActivity= new EtsyClassActivity(); 
		etsyActivity.etsySearch();
		
	}
	public void etsySearch() throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		//Go to etsy.com
		driver.get("https://www.etsy.com/");
			Thread.sleep(1000);
		//Click on Sign in.
		driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']\n"
				+ "")).click();
			Thread.sleep(1000);
		//Click on Register.
		driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--secondary wt-btn--small inline-overlay-trigger register-header-action select-register']']\n"
				+ "")).click();
			Thread.sleep(1000);
		//Enter an email address, (jon.dow@gmail.com)
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jon.dow@gmail.com");
			Thread.sleep(1000);
		//Enter first name.
		//Enter password.
		//Click on Register.
		//Verify you get the error message:
		//"Sorry, the email you have entered is already in use."
	} 

}
