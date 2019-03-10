/**
 * 
 */
package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * @author Lenovo This script is all about to handle orangeHRM Created By:
 *         Ganesh Created On: 13-02-2019
 */
public class OrangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		System.out.println("=========Browser is up and running========");

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");

		System.out.println("=====Application is up and running============");

		// This is username

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		// This is password

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		// This is loginButton

		driver.findElement(By.id("btnLogin")).click();

		String title = driver.getTitle();

		System.out.println("The title of the application is:" + title);

		// This is admin

		driver.findElement(By.xpath(".//*[text()= 'Admin']")).click();
		
		// This validation is to check whether the text with the field is available or not?
		
		WebElement searchButton = driver.findElement(By.id("searchBtn"));
		
		String textSearchButton = searchButton.getAttribute("value");
		
		System.out.println("The text verification of the field is:"+textSearchButton);
		
		Assert.assertEquals(textSearchButton, "Search");
		
		driver.quit();

	}

}
