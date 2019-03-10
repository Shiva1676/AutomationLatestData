/**
 * 
 */
package class5;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Lenovo This script is to compare the drop down values Created By:
 *         Ganesh Create On: 16-02-2019
 */
public class DropDownComparsion {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("========Browser is all about to start==========");

		WebDriver driver = new ChromeDriver();

		System.out.println("========Browser started===========");

		driver.get("http://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html");

		System.out.println("======Application is up and running========");
		
		driver.manage().window().maximize();

		List<WebElement> alldropdown = driver.findElements(By.xpath(".//*[@name= 'dropdown']/option"));

		int count = alldropdown.size();

		System.out.println("The total count in the drop down are:" + count);

		// Comparsion process

		List<String> actual = new ArrayList<>();

		for (WebElement ele : alldropdown) {

			String textValues = ele.getText();

			actual.add(textValues);

		}

		List<String> expected = new ArrayList<>();

		expected.add("Maths");

		expected.add("Physics");

	
	if(actual.equals(expected)){
		
		System.out.println("PASS");
	
	}else{
		
		System.out.println("FAIL");
	}
	
	Thread.sleep(2000);
	
	driver.quit();
	
	}

}
