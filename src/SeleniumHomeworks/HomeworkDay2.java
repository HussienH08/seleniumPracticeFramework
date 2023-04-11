package SeleniumHomeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkDay2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");
		HomeworkDay2 testCases = new HomeworkDay2(); 
		//	testCases.testCase1();
			testCases.testCase2();

		}

	public void testCase1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.etsy.com/");
		driver.findElement(By.className("select-signin")).click();
			Thread.sleep(1000);
		driver.findElement(By.id("join_neu_email_field")).sendKeys("automation");
		driver.findElement(By.id("join_neu_password_field")).sendKeys("automation");
		driver.findElement(By.name("submit_attempt")).click();
			Thread.sleep(2000);
		driver.quit();
			Thread.sleep(1000);
	}
	
	public void testCase2() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String sc = "SDET";
		driver.get("https://www.indeed.com/");
		String homeURL = driver.getCurrentUrl();
			System.out.println("The currentURL is: " + homeURL);
		String homeTitle = driver.getTitle();
			System.out.println("The Website Title is: " + homeTitle);
		driver.findElement(By.id("text-input-what")).sendKeys(sc);
			Thread.sleep(1000);
			driver.findElement(By.className("yosegi-InlineWhatWhere-primaryButton")).click();
		String searchURL = driver.getCurrentUrl();
			System.out.println("This is the searchURL: " + searchURL);
		String searchTitle = driver.getTitle().toUpperCase();
			System.out.println("This is the searchTitle: " + searchTitle);
		if(!searchURL.equals(homeURL) && searchURL.contains(sc)) {
			System.out.println("Valid Search URL");
		}else {
			System.out.println("Invalid Search URL");
		}
		if(!searchTitle.equals(homeTitle) && searchTitle.contains("Sdet Jobs, Employment in Manassas, VA | Indeed.com")) {
			System.out.println("Valid Search Title");
		}else {
			System.out.println("Invalid Search Title");
		}
		String JobsInLocation = driver.findElement(By.className("jobsearch-SerpTitle")).getText();
			System.out.println("This is the JobsInLocation: " + JobsInLocation);
		if(JobsInLocation.contains(sc)) {
			System.out.println("Valid JobInLocation");
		}else {
			System.out.println("Invalid JobInLocation");
		}
		driver.quit();
			Thread.sleep(1000);
		}

}
