/**
 * 
 */
package class3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Lenovo This script is going to handle the registartion form Created
 *         By: Ganesh Created On: 13-02-2019
 */
public class Demo1 {

	public static void main(String[] args) {

		System.out.println("==============Browser is about to start===========");
		
		WebDriver driver = new ChromeDriver();

		System.out.println("================Browser started=============");
		
		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html");
		
		System.out.println("===============Application is up and running==============");
		
		// This is for first name
		
		driver.findElement(By.name("first_name")).sendKeys("Mukesh");
		
		// This is last name
		
		driver.findElement(By.name("last_name")).sendKeys("Otwani");
		
		// This is for password
		
		driver.findElement(By.name("password")).sendKeys("Mukesh");
		
		// This is to enter some description
		
		driver.findElement(By.name("description")).sendKeys("Welcome to automation testing");
		
		
		// This is to check the check box
		
		WebElement checkButton = driver.findElement(By.name("maths"));
		
		boolean status_radioButton = checkButton.isSelected();
		
		System.out.println("Is it the radioButton was checked by default:"+ status_radioButton);
        
		
		if(status_radioButton==false){
			
			checkButton.click();
		}else {
			
			System.out.println("Hey! by default it was checked the checkbox. Thank you!");
		}

		// This is to check the radio buttons 
		
		WebElement radioButton = driver.findElement(By.name("subject"));
		
		boolean status_RadioButton = radioButton.isSelected();
		
		System.out.println("Is radioButton wass selected by default or not?"+status_radioButton);
		
		if(status_RadioButton== false){
			
			radioButton.click();
			
		}
		
		List<WebElement> allValues = driver.findElements(By.xpath(".//select[@name='dropdown']/option"));
		
		System.out.println("Total number of values in dropDown are:"+allValues.size());
		
		// Now we are iterating the dropdown
		
		for(WebElement ele:allValues){
			
			String text = ele.getAttribute("innerHTML");
			
			if(text.equalsIgnoreCase("Physics")){
				
				ele.click();
				
				System.out.println("Selected as per client");
				
			}
		}

		
		
	}

}
