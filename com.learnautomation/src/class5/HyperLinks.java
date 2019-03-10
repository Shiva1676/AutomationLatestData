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
 * @author Lenovo This script is used to know the how to handle hyper links
 *         Created By: Ganesh Created On: 17-02-2019
 *
 *
 */
public class HyperLinks {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		System.out.println("==========Browser started===========");

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.manage().window().maximize();

		System.out.println("=============Sucessfully maximized========");

		System.out.println("======Application is up and running========");

		// This is for username

		WebElement username = driver.findElement(By.id("txtUsername"));

		username.sendKeys("Admin");

		// This is for password

		WebElement password = driver.findElement(By.id("txtPassword"));

		password.sendKeys("admin123");

		// This is for loginButton

		driver.findElement(By.name("Submit")).click();

		Thread.sleep(2000);

		// This is for hyperLink

		List<WebElement> hyperLink = driver.findElements(By.xpath(".//a"));

		int totalCount = hyperLink.size();

		System.out.println("The number of hypeLink are:" + totalCount);

		for (int i = 0; i < totalCount; i++) {

			WebElement textValue = hyperLink.get(i);

			String hrefText = textValue.getAttribute("href");

			System.out.println("The hyperlinks are:" + hrefText);

			/*if (hrefText.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/index.php/auth/logout")) {

				textValue.click();

				break;

			}
*/
		}

		driver.quit();

	}

}
