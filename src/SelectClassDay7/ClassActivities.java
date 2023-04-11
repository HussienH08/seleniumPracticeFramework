package SelectClassDay7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassActivities {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");
			ClassActivities classActivity = new ClassActivities();
			//classActivity.radioButtonHomework();
			//classActivity.checkBox();
			//classActivity.amazonActivity();
		}
		
		public void radioButtonHomework() throws InterruptedException {

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//go to http://practice.primetech-apps.com/practice/radio-button
			driver.get("http://practice.primetech-apps.com/practice/radio-button");
			//Find those available radio buttons.
			List<WebElement> radioButtons = driver.findElements(By.cssSelector(".form-check-input"));
			//Check if it’s displayed and enabled
			for (WebElement singleRadio : radioButtons) {
			
				if (singleRadio.isDisplayed() && singleRadio.isEnabled()) {
					System.out.println("Radio Button is Displayed and Enabled");
			//if true, check if it’s selected,
				if (singleRadio.isSelected()) {
					System.out.println("Radio Button is Selected!");
			//if false select the button
				}else {
					System.out.println("Radio Button is NOT Selected!");
					Thread.sleep(1000);
					singleRadio.click();
				}
				}else {
					System.out.println("Radio Buttons are NOT Displayed and Enabled!");
				}
				Thread.sleep(1000);
				//check if it’s selected.
				System.out.println("Is Radio Button Selected? " + singleRadio.isSelected());
				}
		}
		public void checkBox() throws InterruptedException {

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//go to http://practice.primetech-apps.com/practice/check-box 
			driver.get("http://practice.primetech-apps.com/practice/check-box");
			//find the checkboxes 
			List<WebElement> checkBox = driver.findElements(By.cssSelector(".form-check-input"));
			//verify if it’s displayed
			for (WebElement singleBox : checkBox) {
				if (singleBox.isDisplayed()) {
					System.out.println("Check Box is Displayed!");
			//if true, then verify if it’s enabled,
					if (singleBox.isEnabled()) {
						System.out.println("Check Box is Enabled!");
			//if true, verify if it’s selected, 
					if (singleBox.isSelected()) {
						System.out.println("Check Box is Selectd!");
			//if false, then check the boxes. 
					}else {
						System.out.println("Check Box is NOT Selected!");
						singleBox.click();
						Thread.sleep(1000);
					}
					}
			//Then verify if it’s checked.
					System.out.println("Is the Check Box Selected! " + singleBox.isSelected());
				}
			}
		}
			public void amazonActivity() throws InterruptedException {
				
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//go to amazon.com   
			driver.get("https://www.amazon.com/");
			//click on signin     
			driver.findElement(By.xpath("//span[text()= \"Hello, sign in\"]")).click();
				Thread.sleep(1000);
			//verify that you are on sign in page (either by sign-in text or email field). 
			if (driver.findElement(By.id("ap_email")).isDisplayed()) {
				System.out.println("Sign In Page Is Displayed");
			}else {
				System.out.println("Sign In is NOT Displayed");
			}
			//navigate back, and navigate forward 
			driver.navigate().back();
				Thread.sleep(1000);
			driver.navigate().forward();
				Thread.sleep(1000);
			//verify that you are on sign in page (either by sign-in text or email field).   
			if (driver.findElement(By.id("ap_email")).isDisplayed()) {
				System.out.println("Sign In Page Is Displayed, On the Second Time");
			}else {
				System.out.println("Sign In is NOT Displayed, On the Second Time");
			}
			//click on create new account, 
			driver.findElement(By.id("auth-create-account-link")).click();
				Thread.sleep(1000);
			//verify you are on new account create page. 
			if (driver.findElement(By.id("ap_customer_name")).isDisplayed()) {
				System.out.println("New Account Page Is Displayed");
			}else {
				System.out.println("New Account is NOT Displayed");
			}
			//navigate back, verify you are on the sign-in page. 
			driver.navigate().back();
				Thread.sleep(1000);
			if (driver.findElement(By.id("ap_email")).isDisplayed()) {
				System.out.println("Sign In Page Is Displayed, On the Third Time");
			}else {
				System.out.println("Sign In is NOT Displayed, On the Third Time");
			}
			//navigate forward, verify you are on the create account page.
			driver.navigate().forward();
				Thread.sleep(1000);
			if (driver.findElement(By.id("ap_customer_name")).isDisplayed()) {
				System.out.println("New Account Page Is Displayed, On the Second Time");
			}else {
				System.out.println("New Account is NOT Displayed, On the Second Time");
			}
			//click on the Continue button without filling the form 
			driver.findElement(By.id("continue")).click();
		//verify error messages displayed and get text to verify
			//Enter your name    
			WebElement nameError = driver.findElement(By.xpath("//div[contains(text(), 'Enter your name')]"));
			if (nameError.isDisplayed()) {
				if (nameError.getText().equals("Enter your name")) {
					System.out.println("Name Error message Displays and it Matches");
				}else {
					System.out.println("Name Error Does NOT message Displays and NOT Matches");
				}
			}
			//Enter your email or mobile phone number
			WebElement emailError = driver.findElement(By.xpath("//div[contains(text(), 'Enter your email')]"));
			if (emailError.isDisplayed()) {
				if (emailError.getText().equals("Enter your email or mobile phone number")) {
					System.out.println("Email Error message Displays and it Matches");
				}else {
					System.out.println("Email Error Does NOT message Displays and NOT Matches");
				}
			}
			//Minimum 6 characters required
			WebElement passwordError = driver.findElement(By.xpath("//div[contains(text(), 'Minimum 6 characters required')]"));
			if (passwordError.isDisplayed()) {
				if (passwordError.getText().equals("Minimum 6 characters required")) {
					System.out.println("Password Error message Displays and it Matches");
				}else {
			System.out.println("Password Error Does NOT message Displays and NOT Matches");

		}
		}
			}
}
	
			
			
	
		
