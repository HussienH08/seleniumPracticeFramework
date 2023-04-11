package SelectClassDay7;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");
		SelectClass classActivities = new SelectClass();
		//classActivities.amazonActivity();
		//classActivities.nonSelectDropDown();
		classActivities.amazonTestCase1();
	}
	public void amazonActivity() throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//go to amazon
		driver.get("https://www.amazon.com/");
		//select Home & Kitchen option from the dropdown. 
		WebElement selectElement = driver.findElement(By.id("searchDropdownBox"));
			Select department = new Select(selectElement);
			
		department.selectByVisibleText("Home & Kitchen"); // selects an element by its visible name
			Thread.sleep(1000);
			
		department.selectByIndex(2); // selects an element by its index order. 
			Thread.sleep(1000); 
			
		department.selectByValue("search-alias=stripbooks"); // selects an element by value. 
			Thread.sleep(1000);
			
		List<WebElement> allOptions = department.getOptions();
		System.out.println(allOptions.size());
		for (WebElement singleOption : allOptions) {
			System.out.println(singleOption.getText());
		}
		
}
	public void nonSelectDropDown() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		//go to the website
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		
		//Find the dropdown and wait until the dropdown element is visible
		WebElement dropdown = driver.findElement(By.xpath("(//div[@class='ui fluid selection dropdown'])[1]"));
		wait.until(ExpectedConditions.visibilityOf(dropdown));
		
		//click on the dropdown element
		dropdown.click();
		
		//Find 'matt' and wait until 'matt' element is visible, then click on him
		WebElement mattOption = driver.findElement(By.xpath("(//div[@data-value='matt'])"));
		wait.until(ExpectedConditions.visibilityOf(mattOption));
		mattOption.click();
	}

	public void amazonTestCase1() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//go to amazon.com  
		driver.get("https://www.amazon.com/");
		//find the dropdown element
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		//get all the options in the departments select dropdown
		Select choose = new Select(dropdown);
		
		List<WebElement> allDepartments = choose.getOptions();
			System.out.println(allDepartments.size());
		for (WebElement singleDepartment : allDepartments) {
			System.out.println(singleDepartment.getText());
		}
		//verify there are total 58 departments. And print them out.
		if (allDepartments.size()== 58) {
			System.out.println("Pass! 58 Departments");
		}else {
			System.out.println("Fail!");
		}
			
		}
	}
	
	
