/**
 * 
 */
package class10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *This script is designed through sikuli class
 */
public class SikuliDemo2 {

	/**
	 * @param args
	 */

	WebDriver driver;

	// @BeforeClass
	@Test
	public void startApp() throws InterruptedException {

		Reporter.log("Browser about to start", true);

		driver = new ChromeDriver();

		Reporter.log("Browser is up and running", true);

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.get(
				"https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@class='TquXA']")).click();

		Actions act = new Actions(driver);
		

	}

}
