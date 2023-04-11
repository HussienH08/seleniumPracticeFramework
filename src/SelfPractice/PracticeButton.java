package SelfPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		//go to http://practice.primetech-apps.com/practice/radio-button
		driver.get("http://practice.primetech-apps.com/practice/radio-button");
		//Find those available radio buttons.
		List<WebElement> RadioButtons = driver.findElements(By.cssSelector(".form-check-input"));
		//Check if it’s displayed and enabled
		for (WebElement singleButton : RadioButtons) {
			if (singleButton.isDisplayed() && singleButton.isEnabled()) {
		//if true, check if it’s selected
				if (singleButton.isSelected()) {
					System.out.println("Radio Button is Selected!");
		//if false select the button
				}else {
					System.out.println("Radio Button is NOT Selected!");
					singleButton.click();
					Thread.sleep(1000);
				}
			}
		//check if it’s selected.
			System.out.println("Is Radio Button Selected: " + singleButton.isSelected());
		}
	}
}
