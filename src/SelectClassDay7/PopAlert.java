package SelectClassDay7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");

		PopAlert classActivities = new PopAlert();
		//classActivities.classTask();
		classActivities.classTask2();
	}
	public void classTask() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		// go to the indicated website
		driver.get("http://practice.primetech-apps.com/practice/alerts");
		// find Confirm button and click on it
		driver.findElement(By.id("confirm")).click();
			wait.until(ExpectedConditions.alertIsPresent());
		Alert handle = driver.switchTo().alert();
			Thread.sleep(1000);
		// Accept the alert
		handle.accept();
	}
	public void classTask2() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		// go to the indicated website
		driver.get("http://practice.primetech-apps.com/practice/alerts");
		// find Prompt Alert, click on it, type PrimeTech, and get the text 
		driver.findElement(By.id("prompt")).click();
			wait.until(ExpectedConditions.alertIsPresent());
		
		Alert handle2 = driver.switchTo().alert();
		handle2.sendKeys("PrimeTech");
			Thread.sleep(1000);
			System.out.println(handle2.getText());
		// dismiss the alert
		handle2.dismiss();
			Thread.sleep(1000);

	}

}
