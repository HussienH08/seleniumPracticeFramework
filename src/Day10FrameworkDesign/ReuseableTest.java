package Day10FrameworkDesign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils2.Driver;

public class ReuseableTest {

	public static void main(String[] args) {


//		go to https://saucedemo.com
			Driver.getDriver().get("https://saucedemo.com");
		// log in with username = standard_user   password = secret_sauce
			WebElement userName = Driver.getDriver().findElement(By.id("user-name"));
				userName.sendKeys("standard_user");
			WebElement password = Driver.getDriver().findElement(By.id("password"));
				password.sendKeys("secret_sauce");
			WebElement login = Driver.getDriver().findElement(By.id("login-button"));
				login.click();
		//		find all the results.
			List<WebElement> results = Driver.getDriver().findElements(By.className("inventory_item_name"));
		//		print the price of each result. 
			List<WebElement> prices = Driver.getDriver().findElements(By.className("inventory_item_price"));

			for (int i = 0; i < results.size(); i++) {
				String priceText = prices.get(i).getText();
			    System.out.println(priceText);
			}	
			}
	}


