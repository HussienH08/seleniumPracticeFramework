package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class indeedPage {

	
	
	public indeedPage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
		
	}
	@FindBy (xpath = "//input[@id='text-input-where']")
	public WebElement whereField; 
	
	
	@FindBy (id="text-input-what")
	public WebElement whatField; 
	
	@FindBy (xpath = "//button[text()='Search']")
	public WebElement submitBtn; 
	
	
}
