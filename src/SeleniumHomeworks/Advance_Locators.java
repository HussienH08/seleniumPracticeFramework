package SeleniumHomeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advance_Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");
		Advance_Locators testCases = new Advance_Locators(); 
			testCases.fb();
			testCases.fb2();
			testCases.indeed();
			}

	public void fb() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//go to facebook.com
		driver.get("https://www.facebook.com/"); 
			Thread.sleep(1000);
		//find the Email or phone number field and type Automation
		driver.findElement(By.xpath("//input[@placeholder='Email or phone number']")).sendKeys("Automation");
			Thread.sleep(1000);
		//find the Password field and type Automation
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Automation");	
			Thread.sleep(1000);
		//find the Login button and click on it.
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
			Thread.sleep(1000);
		driver.quit();
			Thread.sleep(1000);
	}
	
	public void fb2() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//go to facebook.com
		driver.get("https://www.facebook.com/"); 
			Thread.sleep(1000);
	   // find the Create New Account button and click on it
		driver.findElement(By.xpath("//a[@rel='async']")).click();	
			Thread.sleep(1000);
	   // find the FirstName,  LastName, Email and Password fields and type Automation
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Automation");
			Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Automation");
			Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Automation");	
			Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Automation");	
			Thread.sleep(1000);
	   // find the Sign Up button and click on it.
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();	
			Thread.sleep(1000);
		driver.quit();
			Thread.sleep(1000);
	}
			
	public void indeed() throws InterruptedException {
		String searchCriteria = "SDET";
		//go to indeed.com
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.indeed.com/"); 
			Thread.sleep(1000);
		//get the current URL and store it in a variable called homeURL.
		String homeURL = driver.getCurrentUrl();
			System.out.println("This is the current homeURL: " + homeURL);
		//get the website title and store it in a variable homeTitle.
		String homeTitle = driver.getTitle();
			System.out.println("This is the current homeTitle: " + homeTitle);
		//find the input field for WHAT and type SDET
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(searchCriteria);	
			Thread.sleep(1000);
		//find the input field for where, clear the field first and type washington DC
		WebElement whereField = driver.findElement(
			By.xpath("//input[@id='text-input-where']"));
			whereField.sendKeys(Keys.COMMAND + "a"); // selects all content in the box
			whereField.sendKeys(Keys.DELETE); // deletes the selected text in the box
			whereField.sendKeys("washington DC");
			Thread.sleep(1000);
		//find the Search button and click on it.
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
			Thread.sleep(1000);
		//get the current URL and store it as a variable searchURL.
		String searchURL = driver.getCurrentUrl();
				System.out.println("This is the current searchURL: " + searchURL);
		// get the website title and store it in a variable searchTitle.
		String searchTitle = driver.getTitle();
				System.out.println("This is the current searchTitle: " + searchTitle);
		// verify that searchURL does not equal to homeURL and contains the search criteria.
		if(!searchURL.equals(homeURL) && searchURL.contains(searchCriteria)) {
				System.out.println("Valid Search URL");
			}else {
				System.out.println("Invalid Search URL");
			}
		// verify that searchTitle does not equal to homeTitle and has the search criteria.
		if(!searchTitle.equals(homeTitle) && searchTitle.contains(searchCriteria)) {
				System.out.println("Valid Search Title");
			}else {
				System.out.println("Invalid Search Title");
				}
		// Get Text of the JobsInLocation field, store it in a variable, 
		String JobsInLocation = driver.findElement(By.xpath("//h1[@class='jobsearch-SerpTitle i-unmask']")).getText();
			System.out.println("This is the JobsInLocation: " + JobsInLocation);
		// then verify if it's equal to your search criteria.
		if(JobsInLocation.contains(searchCriteria)) {
				System.out.println("Valid JobInLocation");
			}else {
				System.out.println("Invalid JobInLocation");
	}
		driver.quit();
		Thread.sleep(1000);
	}
}
	



