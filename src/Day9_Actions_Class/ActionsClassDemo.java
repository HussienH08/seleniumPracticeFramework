package Day9_Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClassDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");
		ActionsClassDemo classActivities = new ActionsClassDemo();
		//ActionsClassDemo.ActionsDemo();
		ActionsClassDemo.DragAndDrop();
	}
	
	public static  void ActionsDemo() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		Actions letsDo = new Actions(driver);
		//go to Etsy.com
		driver.get("https://www.etsy.com/");
		// Hover Over on Jewelry & Accessories
		WebElement jewelaryTap = driver.findElement(By.xpath("//span[contains(text(), 'Jewelry & Accessories')]"));
			letsDo.moveToElement(jewelaryTap).build().perform();
			Thread.sleep(1000);
		//3.Mouseover on Bags & Purses
		WebElement bagsPurses = driver.findElement(By.xpath("(//span[contains(text(), 'Bags & Purses')])[1]"));
			letsDo.moveToElement(bagsPurses).build().perform();
			Thread.sleep(1000);

		//4.Mouseover to Shoulder Bags
		WebElement shoulderBags = driver.findElement(By.xpath("//a[contains(text(), 'Shoulder Bags')]"));
			letsDo.moveToElement(shoulderBags).build().perform();
			Thread.sleep(1000);
		//5.Click on the shoulder bags
			shoulderBags.click();
		//6.Verify you are on the Shoulder bags page
			if (driver.findElement(By.xpath("//h1[contains(text(), 'Shoulder Bags')]")).isDisplayed()) {
				System.out.println("Pass! On the Bag Page");
			} else {
				System.out.println("Fail! NOT On the Bag Page");

			}
	}
	public static void DragAndDrop() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		Actions letsDo = new Actions(driver);
	// go to the website
		driver.get("http://practice.primetech-apps.com/practice/drag-and-drop");
	// drag the Text Element to the next window 
		WebElement text = driver.findElement(By.id("text"));
		WebElement dropZone = driver.findElement(By.id("dropzone"));
		letsDo.dragAndDrop(text, dropZone).build().perform();
	}
}
