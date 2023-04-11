package WebElementsDay6;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatePractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");
		
		NavigatePractice testCases = new NavigatePractice(); 
		//testCases.navigate();
		//testCases.listElement();
		//testCases.listElement2();
		testCases.elementStatus();
	}

	public void navigate() {

		WebDriver driver = new ChromeDriver();
	//maximize browser
		driver.manage().window().maximize();
	//declare implicitly wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//go to amazon.com
		driver.get("https://www.amazon.com/");
		String homePageUrl = driver.getCurrentUrl();
	//Search coffee mug
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.click(); 
			searchBox.sendKeys("coffee mug");
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
			searchButton.click();
	//Navigate back then search pretty coffee mug.  
		driver.navigate().to(homePageUrl);
		searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.click();
			searchBox.sendKeys("pretty coffee mug");
		searchButton = driver.findElement(By.id("nav-search-submit-button"));
			searchButton.click();
	//Navigate back then navigate forward  
			driver.navigate().back();
			driver.navigate().forward();
	//Refresh the page.
			driver.navigate().refresh();
	// quit driver
			driver.quit();
	}
	public void listElement() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//go to https://saucedemo.com
		driver.get("https://saucedemo.com");
	// log in with username = standard_user   password = secret_sauce
		WebElement userName = driver.findElement(By.id("user-name"));
			userName.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
			login.click();
		// find all the results and get them in a list 
		List<WebElement> results = driver.findElements(By.className("inventory_item_name"));
		  int listSize = results.size();
	   // print the size of the list.
		    System.out.println(listSize);
		}
	
	public void listElement2() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	go to https://saucedemo.com
		driver.get("https://saucedemo.com");
	// log in with username = standard_user   password = secret_sauce
		WebElement userName = driver.findElement(By.id("user-name"));
			userName.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
			login.click();
	//		find all the results.
		List<WebElement> results = driver.findElements(By.className("inventory_item_name"));
	//		print the price of each result. 
		List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));

		for (int i = 0; i < results.size(); i++) {
			String priceText = prices.get(i).getText();
		    System.out.println(priceText);
		}	
		}
	public  void elementStatus() {

		WebDriver driver = new ChromeDriver();
		//go to indeed
		driver.get("https://www.indeed.com/");
		WebElement whatField = driver.findElement(By.id("text-input-what"));
		WebElement whereField = driver.findElement(By.id("text-input-where"));
		System.out.println(whatField.isEnabled());
		System.out.println(whatField.isDisplayed());

		System.out.println(whereField.isEnabled());
		System.out.println(whereField.isDisplayed());

		if(whatField.isEnabled() && whatField.isDisplayed()) {
			System.out.println("WhatField is enabled and Displayed");
		}else {
			System.out.println("WhatField is NOT enabled and Displayed");
		}
		if(whereField.isEnabled() && whereField.isDisplayed()) {
			System.out.println("WhereField is enabled and Displayed");
		}else {
			System.out.println("WhereField is NOT enabled and Displayed");
		}
	}
}
