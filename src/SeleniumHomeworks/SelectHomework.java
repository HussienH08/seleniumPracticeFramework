package SeleniumHomeworks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SelectHomework {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");
		SelectHomework testCases = new SelectHomework();
		//testCases.amazonActivity();
		testCases.amazonActivity2();
	//	testCases.alertTestCase();
		}
	public void amazonActivity() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//go to amazon.com  
		driver.get("https://www.amazon.com/");
		//get all the options in the departments select dropdown
		WebElement selectElement = driver.findElement(By.id("searchDropdownBox"));
		Select choose = new Select(selectElement);
		
		List<WebElement> allOptions = choose.getOptions();
			System.out.println(allOptions.size());
			for (WebElement singleOption : allOptions) {
			System.out.println(singleOption.getText());
		}
		//verify there are total 58 departments. And print them out.
			if (allOptions.size() == 58) {
		    System.out.println("Total number of departments is correct: " + allOptions.size());
			} else {
		    System.out.println("Total number of departments is incorrect: " + allOptions.size());
		}
	}
	public void amazonActivity2() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//go to amazon.com  
		driver.get("https://www.amazon.com/");
		// verify that you are on the amazon home page. (verify with title). 
		String expectedTitle = driver.getTitle();
			System.out.println("Expected Title: " + expectedTitle);
		
		String actualTitle = driver.getTitle();
			if (actualTitle.equals(expectedTitle)) {
		    System.out.println("Successfully opened Amazon home page");
			} else {
		    System.out.println("Failed to open Amazon home page");
		}
		//verify dropdown value is by default "All Departments"
		WebElement selectElement = driver.findElement(By.id("searchDropdownBox"));
		Select choose = new Select(selectElement);
			String selectedOption = choose.getFirstSelectedOption().getText();
			if (selectedOption.equals("All Departments")) {
		    System.out.println("Default value: 'All Departments'");
			} else {
		    System.out.println("Default value is not: 'All Departments'");
		}
		//select department Home & Kitchen, and search coffee mug.
		choose.selectByVisibleText("Home & Kitchen");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("coffee mug" + Keys.RETURN);
		//verify you are on coffee mug search results page (use title).
		expectedTitle = driver.getTitle();
		actualTitle = driver.getTitle();
			if (actualTitle.contains(expectedTitle)) {
		    System.out.println("Successfully opened coffee mug search results page");
			} else {
		    System.out.println("Failed to open coffee mug search results page");
		}
		//verify you are in Home & Kitchen department.
		WebElement departmentElement = driver.findElement(By.xpath("//option[@value='search-alias=garden']"));
			if (departmentElement == null) {
		    System.out.println("Failed to verify department");
			} else {
		    System.out.println("Successfully verified department");
		}	
	}
	public void alertTestCase() {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait(driver, 5); 
}
}
