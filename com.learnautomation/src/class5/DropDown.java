/**
 * 
 */
package class5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Lenovo
 *This script is used to handle the drop down 
 *Created By: Ganesh
 *Created On: 16-02-2019
 */
public class DropDown {

	public static void main(String[] args) throws InterruptedException {
	
		// Accessing the browser acesss
		WebDriver driver = new ChromeDriver();
		
		// Acessing the application
		driver.get("http://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html");
		
		System.out.println("=====Application is up and running=========");
		
		// Validating the drop dowwn button
		
		List<WebElement> allDropdownButton = driver.findElements(By.xpath(".//*[@name= 'dropdown']/option"));
		
        int count = allDropdownButton.size();
        
        System.out.println("The total values in the dropdown button are:"+count);
        
        // We will retrive the value normal loop 
        
        boolean status = false;
        
        for(int i=0; i<count; i++){
        	
        	WebElement ele = allDropdownButton.get(i);
        	
        	String textValues = ele.getAttribute("innerHTML");
        	
        	System.out.println("The values in the dropdown are:"+textValues);
        	
        	if(textValues.equalsIgnoreCase("Physics")){
        		
        		status = true;
        		
        		ele.click();
        		
        		break;
        	}
        	
        	
        }
		
        System.out.println("Is that value exist in the dropdown?:"+status);
        
        
        Thread.sleep(2000);
        
        driver.quit();
	}

}
