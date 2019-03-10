/**
 * 
 */
package testNGFrameworkAdvanceTopics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import class7.Utility;

/**
 * @author Lenovo
 *
 */
public class ParallelExecution {

	WebDriver driver;

	@Parameters({ "browser", "url" })
	@Test
	public void test(String browsername, String appURL) throws IOException, InterruptedException {

		if (browsername.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();

			Reporter.log("The script is running on following browser:" + browsername, true);

		} else if (browsername.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();

			Reporter.log("The script is running on following browser is >>>>" + browsername, true);

		}

		driver.get(appURL);
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();

		System.out.println("The title of the page is:" + title);
		
		Utility.captureScreenshots(driver);
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
