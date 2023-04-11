package SelfPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");
		RadioButton classActivity = new RadioButton();
		//classActivity.radioButtonHomework();
	
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
		//if true, check if it’s selected,
			if (singleRadio.isDisplayed() && singleRadio.isEnabled()) {
		 //if false select the button
			if (singleRadio.isSelected()) {
				System.out.println("Radio Button is Selected!");
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
	
	}
	

