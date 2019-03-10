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
 * @author Lenovo This script is used to handle the drop down using for each
 *         loop Created By: Ganesh Created On: 16-02-2018
 */
public class DropDownUsingForEachLoop {

	public static void main(String[] args) {

		// Accessing the webdriver interface

		System.out.println("======Browser is about to start========");

		WebDriver driver = new ChromeDriver();

		System.out.println("======Browser started=============");

		// Making the browser maximise

		driver.manage().window().maximize();

		System.out.println("=========Sucessfully the browser is maximized===========");

		driver.get("http://seleniumpractise.blogspot.com/2016/09/complete-registration-form.html");

		System.out.println("=========Application is up and running=========");

		// Finding the webElement on the webpage

		List<WebElement> alldropdownValues = driver.findElements(By.xpath(".//*[@name= 'dropdown']/option"));

		int count = alldropdownValues.size();

		System.out.println("The total values in the dropdown are:" + count);

		// Taking one global variable

		boolean status = false;

		// Accessing for each loop

		for (WebElement ele : alldropdownValues) {

			String text = ele.getAttribute("innerHTML");

			System.out.println("The values are in dropdown are:" + text);

			if (text.equalsIgnoreCase("Physics")) {

				status = true;

				ele.click();

				System.out.println("Sucessfully selected the physic");

				break;

			}
		}

		System.out.println("The status of the drop down is:" + status);

	}

}
