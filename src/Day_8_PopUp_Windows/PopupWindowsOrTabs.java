package Day_8_PopUp_Windows;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopupWindowsOrTabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");
	
		PopupWindowsOrTabs classActivities = new PopupWindowsOrTabs();
		//classActivities.windowHandle();
		//classActivities.testCase1();
		classActivities.testCase2();
	}
	public void windowHandle() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		driver.get("https://www.amazon.com/");
		
		System.out.println("Window Id: " + driver.getWindowHandle());
		
	}

	public void testCase1() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		// go to http://practice.primetech-apps.com/practice/browser-windows
		driver.get("http://practice.primetech-apps.com/practice/browser-windows");
			String mainWindowHandle = driver.getWindowHandle();
				System.out.println("Main Window Id: " + mainWindowHandle);
		// click on the 'New Tab' button
		driver.findElement(By.id("newTab")).click();
	// Then get then window handles and print what they are
		// Way1
		Set<String> WindowIds = driver.getWindowHandles();
			for (String WindowId : WindowIds) {
				System.out.println("Window Id is: " + WindowId);
		}
		//way2	
		Iterator<String> ids = WindowIds.iterator();
			String firstWindowId = ids.next();
			String secondWindowId = ids.next();
				System.out.println("First Window Id: " + firstWindowId);
				System.out.println("Second Window Id: " + secondWindowId);
				
				driver.switchTo().window(firstWindowId);
	}
	
	public void testCase2() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		//go to http://practice.primetech-apps.com/practice/browser-windows1. 
		driver.get("http://practice.primetech-apps.com/practice/browser-windows");
		//Get the main window ID and store it in a String called mainWindowId, 
			String mainWindowId = driver.getWindowHandle();
		//2. Click on the ‘New Tab’ button
			driver.findElement(By.id("newTab")).click();
		//3. Get window IDs and store it into a Set
			Set<String> WindowIds = driver.getWindowHandles();
		//4. Get the first window ID from the Set and Verify it matches with the main window id in step 1
			Iterator<String> ids = WindowIds.iterator();
				String firstWindowId = ids.next();
					System.out.println("First Window Id: " + firstWindowId);
					if (firstWindowId.equals(mainWindowId)) {
						System.out.println("PASS! Window Id Matches");
					}else {
						System.out.println("FAIL! Window Id DOES NOT Match");
			}

		//5. Then get the second window id and store it in variable called secondWindowId.
			String secondWindowId = ids.next();
				System.out.println("Second Window Id: " + secondWindowId);
		//6. Switch to the second window 
			driver.switchTo().window(secondWindowId);
		//7. Verify that there is a button called ‘New Tab’
			WebElement newTab = driver.findElement(By.id("newTab"));
			
				if (newTab.isDisplayed()) {
					System.out.println("PASS! Page is Verified");
				} else {
					System.out.println("FAIL! Page is NOT Verified");
			}
		//8. Close the window,  Switch back to the main window, Verify you are on the main window.
			driver.close();
			driver.switchTo().window(mainWindowId);
			WebElement mainWindowTab = driver.findElement(By.className("mb-5"));
				if (mainWindowTab.isDisplayed()) {
					System.out.println("PASS! You Are on The Main Window");
				} else {
					System.out.println("FAIL! You Are NOT on The Main Window");
			}
	}
			
}
