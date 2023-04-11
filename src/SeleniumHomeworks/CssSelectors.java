package SeleniumHomeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");

		WebDriver driver = new ChromeDriver();
	//Go to http://practice.primetech-apps.com/practice/text-box
		driver.get("http://practice.primetech-apps.com/practice/text-box");
		Thread.sleep(1000); 
	//	Find first name, last name, email, password, address fields, and type relevant information. 
	//(Create variables for those information and pass the variable to the sendkey() method).
		
		String fistname = "Pedri";	
			WebElement firstName = driver.findElement(By.xpath("//input[contains(@id, 'firstName')]"));
			firstName.sendKeys(fistname); 
			Thread.sleep(2000);
		String lastname = "Gonz";
			WebElement lastName = driver.findElement(By.xpath("//input[contains(@id, 'lastName')]"));
			lastName.sendKeys(lastname);
			Thread.sleep(2000);
		String theEmail = "Padri.gonz@gmail.com";
			WebElement email = driver.findElement(By.xpath("//input[contains(@id, 'email')]"));
			email.sendKeys(theEmail);
			Thread.sleep(2000);
		String thePassword = "Padrigonz123";
			WebElement password = driver.findElement(By.xpath("//input[contains(@id, 'password')]"));
			password.sendKeys(thePassword);
			Thread.sleep(2000);
		WebElement clickButton = driver.findElement(By.xpath("//button[contains(text(), 'Enable')]"));
			clickButton.click(); 
			Thread.sleep(3000);
		String TheAddressField = "Automation is Fun";
			WebElement addressField = driver.findElement(By.xpath("//textarea[contains(@id, 'address')]"));
			addressField.sendKeys(TheAddressField); 
			Thread.sleep(1000);
	//	Then click on submit button. (your inputs displays under user info section).
		WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(), 'Submit')]"));
			submitButton.click();
			Thread.sleep(3000);
	//	Find your inputs and get text of each and store them into variables.
		WebElement nameInput = driver.findElement(By.xpath("//div[contains(text(), 'Pedri')]")); 
			String nameInputText = nameInput.getText();
			System.out.println(nameInputText); 
			Thread.sleep(2000);
		WebElement nameInput2 = driver.findElement(By.xpath("//div[contains(text(), 'Gonz')]"));
			String nameInputText2 = nameInput2.getText();
			System.out.println(nameInputText2);
			Thread.sleep(1000);
		WebElement nameInput3 = driver.findElement(By.xpath("//div[contains(text(), 'gmail')]"));
			String nameInputText3 = nameInput3.getText();
			System.out.println(nameInputText3);
			Thread.sleep(1000);
		WebElement nameInput4 = driver.findElement(By.xpath("//div[contains(text(), 'z123')]"));
			String nameInputText4 = nameInput4.getText();
			System.out.println(nameInputText4);
			Thread.sleep(1000);
		WebElement nameInput5 = driver.findElement(By.xpath("//div[contains(text(), 'Fun')]"));
			String nameInputText5 = nameInput5.getText();
			System.out.println(nameInputText5);
			Thread.sleep(1000);
	//	Then compare your input with the displayed user information if they match.
		if (nameInputText.equals(firstName)) {
		 System.out.println("Name input text is: 'Pedri'");
			} else {
			    System.out.println("Name input text is: not 'Pedri'");
			}
		if (nameInputText2.equals(lastName)) {
			 System.out.println("Name input text is: 'Gonz'");
				} else {
				    System.out.println("Name input text is: not 'Gonz'");
				}
		if (nameInputText3.equals(theEmail)) {
			 System.out.println("Name input text is: 'Padri.gonz@gmail.com'");
				} else {
				    System.out.println("Name input text is not 'Padri.gonz@gmail.com'");
				}
		if (nameInputText4.equals(thePassword)) {
			 System.out.println("Name input text is: 'Padrigonz123'");
				} else {
				    System.out.println("Name input text is not 'Padrigonz123'");
				}
		if (nameInputText5.equals(TheAddressField)) {
			 System.out.println("Name input text is: 'Automation is Fun'");
				} else {
				    System.out.println("Name input text is not 'Automation is Fun'");
				}
		driver.quit();
		Thread.sleep(1000);
	}

}
