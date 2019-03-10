/**
 * 
 */
package testNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author Lenovo This script is used to handle the OrangeHRM application
 *         Created By: Ganesh Created On: 24-02-2019
 */
public class RegressionTest {

	WebDriver driver;

	@Test
	public void startApp() {

        Reporter.log("================Browser is about to start==========", true);
		
		driver = new ChromeDriver();
		
		Reporter.log("================Browser started==========", true);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		Reporter.log("===========Browser maximized sucessfully==========", true);
		
}
	@Test(dependsOnMethods= "startApp")
	public void loginApp(){
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		
	}

	@Test(dependsOnMethods = "loginApp")
	public void closeApp(){
		
		driver.close();
		
		Reporter.log("Browser closed", true);
	}
	
}
