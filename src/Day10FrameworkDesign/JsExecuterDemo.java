package Day10FrameworkDesign;

import org.openqa.selenium.JavascriptExecutor;

import pages.indeedPage;
import utils.BrowserUtils;
import utils.DataReader;
import utils.Driver;

public class JsExecuterDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		indeedPage indeedPage = new indeedPage();
		BrowserUtils utils = new BrowserUtils();
		Driver.getDriver().get(DataReader.getProperty("indeedUrl"));
		indeedPage.whatField.sendKeys("SDET");
		indeedPage.submitBtn.click();
		Thread.sleep(1000);
		utils.scrollDownByPixel(1500);
		
		
		
	}

}
