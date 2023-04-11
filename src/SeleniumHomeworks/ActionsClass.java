package SeleniumHomeworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		Actions letsDo = new Actions(driver);
		
	// go to "http://practice.primetech-apps.com/practice/drag-and-drop"
		driver.get("http://practice.primetech-apps.com/practice/drag-and-drop");
	// Verify Drag And Drop text displays
		if (driver.findElement(By.xpath("//h3[contains(text(), 'Drag')]")).isDisplayed()) {
			System.out.println("Pass! Text is Displayed");
		} else {
			System.out.println("Fail! Text is NOT Displayed");
		}
	// drag the Text element to target window
		WebElement sourceText = driver.findElement(By.id("text"));
		WebElement sourceTarget = driver.findElement(By.id("dropzone"));
			letsDo.dragAndDrop(sourceText, sourceTarget).build().perform();
	// drag the Textarea element to target window
		WebElement sourceTextArea = driver.findElement(By.id("textarea"));
			letsDo.dragAndDrop(sourceTextArea, sourceTarget).build().perform();
	// drag the Number element to target window
		WebElement sourceNumber = driver.findElement(By.id("Number"));
			letsDo.dragAndDrop(sourceNumber, sourceTarget).build().perform();
	// delete all those dragged items from target window
		driver.findElement(By.xpath("(//button[contains(@class, 'btn-default')])[1]")).click();
		driver.findElement(By.xpath("(//button[contains(@class, 'btn-default')])[2]")).click();
		driver.findElement(By.xpath("//button[contains(@class, 'btn-default')]")).click();
		
		driver.quit();
	}

}
