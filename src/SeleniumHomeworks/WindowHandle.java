package SeleniumHomeworks;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");
	
		WindowHandle testCases = new WindowHandle();
		//testCases.WindowHandles();
		testCases.iFrame();
	}
	
	public void WindowHandles() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		//go to http://demo.guru99.com/popup.php
		driver.get("http://demo.guru99.com/popup.php");
		
	     //Get title and store it in a variable.
		String pageTitle = driver.getTitle();
		
	    // Click on Click Here button 
		driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
		//switch over to next window
		Set<String> WindowIds = driver.getWindowHandles();
		Iterator<String> ids = WindowIds.iterator();
			String mainWindowId = ids.next();
			String secondWindowId = ids.next();
		driver.switchTo().window(secondWindowId);
		//provide an email and click Submit. 
		driver.findElement(By.xpath("//input[contains(@name, 'emailid')]")).sendKeys("HH123@yahoo.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    // Get text of the user ID and password and store them in variables, print them out. 
		WebElement userId = driver.findElement(By.xpath("(//td[contains(@align,'center')])[3]"));
			String userIdText = userId.getText();
				System.out.println("User Id: " + userIdText);
		WebElement password = driver.findElement(By.xpath("(//td[contains(@align,'center')])[5]"));
			String passwordText = password.getText();
				System.out.println("Password: " + passwordText);
		//td[contains(text(), 'User')]
		
	    // Then verify the text "This access is valid only for 20 days."
			if (driver.findElement(By.xpath("//h3[contains(text(), 'access')]")).isDisplayed()) {
				System.out.println("Pass! Text is Verified");
			}else {
				System.out.println("Fail! Text is NOT Verified");
			}
	    // Close the window.
			driver.close();
				Thread.sleep(1000);
	    // Go back to main window, and get title then verify it equals to your stored title.
			driver.switchTo().window(mainWindowId); 
			String mainPageTitle = driver.getTitle();
			if (mainPageTitle.equals(pageTitle)) {
				System.out.println("Pass! Titles Match");
			} else {
				System.out.println("Fail! Titles Do NOT Match");
			}
	   //  Quite driver. 
			driver.quit();
				Thread.sleep(1000);
	}
	
	public void iFrame() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		//go to http://practice.primetech-apps.com/practice/frames
		driver.get("http://practice.primetech-apps.com/practice/frames");
		//Verify that there is a page header text as "Frames".
		WebElement pageHeader = driver.findElement(By.xpath("//h3[contains(text(), 'Frames')]"));
			String pageHeaderText = pageHeader.getText();
				System.out.println(pageHeaderText);
		//Find the iFrame element and switch into it
			WebElement iFrame = driver.findElement(By.id("iframe1"));
			driver.switchTo().frame(iFrame);
		//Find firstname, lastname, address, city, state, and zipcode, and type relative information.
			driver.findElement(By.id("firstName")).sendKeys("Frankie");
			Thread.sleep(1000);
			driver.findElement(By.id("lastName")).sendKeys("De Jong");
			Thread.sleep(1000);
			driver.findElement(By.id("address")).sendKeys("123 Camp Nou St");
			Thread.sleep(1000);
			driver.findElement(By.id("city")).sendKeys("Barcelona");
			Thread.sleep(1000);
		//	driver.findElement(By.id("state")).sendKeys("Virginia");
			Select choose = new Select(driver.findElement(By.id("state")));
			choose.selectByVisibleText("Virginia");
			Thread.sleep(1000);
			driver.findElement(By.id("zipCode")).sendKeys("21212");
			Thread.sleep(1000);
		//Click on submit button.
			driver.findElement(By.xpath("//button[contains(text(), 'Submit')]")).click();
		//Verify you see "You have submitted below information:" message.
			if (driver.findElement(By.xpath("//h3[contains(text(), 'You have')]")).isDisplayed()) {
				System.out.println("Pass! Message is Visible.");
			} else {
				System.out.println("Fail! Message is NOT Visible");
			}
		//Switch back to main frame
			driver.switchTo().defaultContent();
		//Verify that there is a page header text as "Frames".
		if (driver.findElement(By.xpath("//h3[contains(text(), 'Frames')]")).isDisplayed()) {
			System.out.println("Pass! The Text 'Frame' is Visible");
		} else {
			System.out.println("Fail! The Text 'Frame' is NOT Visible");
		}
	}
	}

