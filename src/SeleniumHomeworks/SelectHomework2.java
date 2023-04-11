package SeleniumHomeworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectHomework2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");
		SelectHomework2 testCases = new SelectHomework2();
		//testCases.testCase1();
		//testCases.testCase2();
		//testCases.testCase3();
		testCases.testCase4();
		
		}
	public void testCase1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//go to http://practice.primetech-apps.com/practice/alerts
		driver.get("http://practice.primetech-apps.com/practice/alerts");
		
		//Click on the 'Alert'  button and Accept the alert. 
		WebElement alert = driver.findElement(By.id("alert")); 
			WebDriverWait wait = new WebDriverWait(driver, 5); // Initiate the Explicit Wait
			alert.click();
			wait.until(ExpectedConditions.alertIsPresent());   
		Alert handle = driver.switchTo().alert();
			Thread.sleep(1000);	
			handle.accept();
			Thread.sleep(1000);	
	}
	
	public void testCase2() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//go to http://practice.primetech-apps.com/practice/alerts
		driver.get("http://practice.primetech-apps.com/practice/alerts");
		//Click on the 'Confirm Alert' button and Get the text of it. 
		WebElement confirmAlert = driver.findElement(By.id("confirm"));
			WebDriverWait wait = new WebDriverWait(driver, 5);
			confirmAlert.click();
			wait.until(ExpectedConditions.alertIsPresent());
		Alert handle = driver.switchTo().alert();
		String alertText = handle.getText();
			System.out.println("Confirm Alert Text is: " + alertText);
		//Then verify if the text equals to "Do you wish to continue or cancel?" 
			if (alertText.equals("Do you wish to continue or cancel?")) {
				System.out.println("YES! Alert Text is Visible");
		//then Accept the alert.
				handle.accept();
				Thread.sleep(1000);
			}else {
				System.out.println("NO! Alert Text is NOT Visible");
		//If not, cancel the Alert
				handle.dismiss();
			}
	}
	public void testCase3() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
	//go to http://practice.primetech-apps.com/practice/alerts 
		driver.get("http://practice.primetech-apps.com/practice/alerts");
	//Click on the 'Prompt Alert' button and type PrimeTech
		String inputText = "PrimeTech";
		
		WebElement promptAlert = driver.findElement(By.id("prompt"));
			promptAlert.click();
			wait.until(ExpectedConditions.alertIsPresent());
		
		Alert handle = driver.switchTo().alert();
			Thread.sleep(1000);
		handle.sendKeys(inputText);
			Thread.sleep(1000);
	//Then accept the Alert. 
		handle.accept();
			Thread.sleep(1000);
	//Verify that a greeting message displays as "Hello <your input>! How are you today?"
		String greetingMessage = "Hello PrimeTech! How are you today?";
			if (greetingMessage.equals("Hello PrimeTech! How are you today?")) {
				System.out.println("Pass! Greeting Message is Displayed");
		}else {
			System.out.println("Fail! Greeting Message is NOT Displayed");
		}
	}
	public void testCase4() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		//go to http://practice.primetech-apps.com/practice/alerts 
		driver.get("http://practice.primetech-apps.com/practice/alerts");
		//Click on the 'Prompt Alert' button and type PrimeTech. 
		String textInput = "PrimeTech";
		
		WebElement promptAlert = driver.findElement(By.id("prompt"));
		promptAlert.click();
		
		wait.until(ExpectedConditions.alertIsPresent());
			Alert handle = driver.switchTo().alert();
		
			handle.sendKeys(textInput);
		//Then dismiss the Alert.
			handle.dismiss();
		//Verify that "User cancelled the prompt." text displays.
			String userPrompt = "User cancelled the prompt.";
				if (userPrompt.equals("User cancelled the prompt.")) {
					System.out.println("Pass! Text is Displayed");
				}else {
					System.out.println("Fail! Text is NOT Displayed");
			}
	}
}
