/**
 * 
 */
package class7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Lenovo
 *This script is used to hight light webelement as require
 *Created By: Ganesh
 *Created On: 19-02-2019
 *
 */
public class HighLightFunctionality {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		System.out.println("=======Browser is about to start===========");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		
		System.out.println("=============Application is up and running===================");
		
		// This is to inspect the element for username
		
		WebElement username = driver.findElement(By.xpath(".//input[@id = 'txtUsername']"));
		
		username.sendKeys("Admin");
		
		Utility.getHighlighter(driver, username);
		
		Utility.captureScreenshots(driver);
		
		WebElement pass = driver.findElement(By.xpath(".//input[@id = 'txtPassword']"));
		
		pass.sendKeys("admin123");
		
		Utility.getHighlighter(driver, pass);
		
		Utility.captureScreenshots(driver);
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
