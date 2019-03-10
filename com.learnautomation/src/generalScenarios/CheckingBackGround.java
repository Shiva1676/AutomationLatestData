/**
 * 
 */
package generalScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

/**
 * @author Lenovo This script is all about how to handle the backgound colour
 *         Created By: Ganesh Created on: 22-02-2019
 */
public class CheckingBackGround {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.get("http://seleniumpractise.blogspot.com/2016/11/handle-bootstrap-model-dialog-in.html");

		System.out.println("===============The application is up and running===================");

		
		
		/*
		 * String buttonColor =
		 * driver.findElement(By.xpath(".//button[contains(text(), 'Click')]"))
		 * .getCssValue("background-color");
		 * 
		 * System.out.println(buttonColor);
		 * 
		 * String buttonTextColor =
		 * driver.findElement(By.xpath(" .//button[contains(text(), 'Click')]"))
		 * .getCssValue("color");
		 * 
		 * System.out.println("Text color " + buttonTextColor);
		 */

		String color = driver.findElement(By.xpath(".//button[contains(text(), 'Click')]")).getCssValue("color");

		/*
		 * String[] numbers = color.replace("rgba(", "").replace(")",
		 * "").split(",");
		 * 
		 * int r = Integer.parseInt(numbers[0].trim());
		 * 
		 * int g = Integer.parseInt(numbers[1].trim());
		 * 
		 * int b = Integer.parseInt(numbers[2].trim());
		 * 
		 * System.out.println("r: " + r + "g: " + g + "b: " + b);
		 * 
		 * String hex = "#" + Integer.toHexString(r) + Integer.toHexString(g) +
		 * Integer.toHexString(b); System.out.println(hex);
		 */

		// String color =
		// driver.findElement(By.xpath("xpath_value")).getCssValue("color");
		System.out.println(color);

		String hex = Color.fromString(color).asHex();

		 System.out.println(hex);

		Thread.sleep(2000);

		driver.quit();

	}

}
