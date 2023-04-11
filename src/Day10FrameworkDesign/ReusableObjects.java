package Day10FrameworkDesign;

import org.openqa.selenium.By;

import pages.FacebookPage;
import utils.DataReader;
import utils.Driver;


public class ReusableObjects {

	public static void main(String[] args) throws InterruptedException {
		ReusableObjects testCases = new ReusableObjects();
		testCases.testcase1();
		testCases.testcase2();
}
	FacebookPage fbPage; 
	
	public void testcase1() throws InterruptedException {
	
		fbPage = new FacebookPage();
		// Go to Facebook
	Driver.getDriver().get(DataReader.getProperty("appUrl"));
		// Type in Email
		fbPage.FBemailField.sendKeys(DataReader.getProperty("facebookUserName"));
		
			// Type in Password
		fbPage.FBpassField.sendKeys(DataReader.getProperty("facebookPassword"));
		
			// Click Login
		fbPage.FBloginBtn.click();
		
			// Closes the Webpage 
		Driver.quitDriver();
	}

	public void testcase2() throws InterruptedException {
	
		Driver.getDriver().get(DataReader.getProperty("appUrl"));
		Driver.getDriver().findElement(By.linkText("Create new account")).click();
			Thread.sleep(1000);
		Driver.getDriver().findElement(By.name("firstname")).sendKeys(DataReader.getProperty("facebookUserName"));
		Driver.getDriver().findElement(By.name("lastname")).sendKeys("automation");
		Driver.getDriver().findElement(By.name("reg_email__")).sendKeys("automation");
		Driver.getDriver().findElement(By.id("password_step_input")).sendKeys("automation");
		Driver.getDriver().findElement(By.name("websubmit")).click();
	
		Driver.quitDriver();
}
}


