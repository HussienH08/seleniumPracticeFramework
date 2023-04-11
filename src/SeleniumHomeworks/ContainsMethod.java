package SeleniumHomeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/hussienhammad/Desktop/SeleniumTools/chromeDriver/chromedriver_mac64 (6)/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//Go to http://practice.primetech-apps.com/practice/web-tables
		driver.get("http://practice.primetech-apps.com/practice/web-tables");
		
		//	2. Verify that you see Web Tables text
		WebElement webTables = driver.findElement(By.xpath("//h3[contains(@class, 'mb-5')]"));
			String webTablesText = webTables.getText();
			System.out.println("PASS, User is able to view the text : " + webTablesText); 
			
		//	3. Find id, firstname, lastname, salary fields and give a relevant input. (store the information into variables, then pass the variable to sendKeys() method) 
			String userId = "B-R4A";
				WebElement Id = driver.findElement(By.xpath("//input[contains(@id, 'Id')]"));
				Id.sendKeys(userId);
				Thread.sleep(1000);
			String firstname = "Ronald";
				WebElement firstName = driver.findElement(By.id("First Name"));
				firstName.sendKeys(firstname);
				Thread.sleep(1000);
			String lastname = "Araujo";
				WebElement lastName = driver.findElement(By.id("Last Name")); 
				lastName.sendKeys(lastname);
				Thread.sleep(1000);
			String userSalary = "120,000";
				WebElement salary = driver.findElement(By.id("Salary")); 
				salary.sendKeys(userSalary);
				Thread.sleep(1000);
				
		//	4. Click on Add button
			driver.findElement(By.xpath("//button[contains(text(), 'Add')]")).click();
			Thread.sleep(1000);
			
		//	5. Then your inputs will display under the table. (use xpath text() contains() functions to locate those elements. get text and store them into variables)
			WebElement idInput = driver.findElement(By.xpath("//td[contains(text(), 'R4A')]")); 
				String idInputText = idInput.getText();
				System.out.println(idInputText); 
				Thread.sleep(1000);
			WebElement firstNameInput = driver.findElement(By.xpath("//td[contains(text(), 'Ron')]")); 
				String firstNameInputText = firstNameInput.getText();
				System.out.println(firstNameInputText); 
				Thread.sleep(1000);
			WebElement lastNameInput = driver.findElement(By.xpath("//td[contains(text(), 'Ara')]")); 
				String lastNameInputText = lastNameInput.getText();
				System.out.println(lastNameInputText); 
				Thread.sleep(1000);
			WebElement salaryInput = driver.findElement(By.xpath("//td[contains(text(), '120')]")); 
				String salaryInputText = salaryInput.getText();
				System.out.println(salaryInputText); 
				Thread.sleep(1000);
		//	6. Verify your input under the table match the input you added. 
			if (idInputText.equals(userId)) {
				 System.out.println("PASS, User-Id input text is: " + userId);
				} else {
			     System.out.println("FAIL, User-Id input text is not: " + userId);
						}
			if (firstNameInputText.equals(firstname)) {
				 System.out.println("PASS, First Name input text is: " + firstname);
				} else {
				 System.out.println("FAIL, First Name input text is not: " + firstname);
					}	
			if (lastNameInputText.equals(lastname)) {
				 System.out.println("PASS, Last Name input text is: " + lastname);
				} else {
				 System.out.println("FAIL, Last Name input text is not: " + lastName);
					}
			if (salaryInputText.equals(userSalary)) {
				 System.out.println("PASS, Salary input text is: " + userSalary);
				} else {
				 System.out.println("FAIL, Salary input text is not: " + userSalary);
					}
				
			driver.quit();
			Thread.sleep(1000);
			
			}

}
