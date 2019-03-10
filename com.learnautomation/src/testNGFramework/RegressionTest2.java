/**
 * 
 */
package testNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class RegressionTest2 {

	WebDriver driver;

	@BeforeTest
	public void startApp() {

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		Reporter.log("Browser maximised", true);

	}

	@Test
	public void login() {

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		Reporter.log("==========Sucessfully Logged in===========", true);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String title = driver.getTitle();

		System.out.println("The title of the page is:" + title);

		Assert.assertTrue(title.contains("OrangeHRM"), "Title doesn't match properly");

	}

	@AfterClass
	public void closingBrowser() {

		driver.close();

		Reporter.log("================Closed the browser sucessfully============", true);

	}

}
