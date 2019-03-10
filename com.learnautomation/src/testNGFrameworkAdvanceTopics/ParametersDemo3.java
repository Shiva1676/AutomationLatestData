/**
 * 
 */
package testNGFrameworkAdvanceTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class ParametersDemo3 {

	WebDriver driver;

	@Parameters("browser")
	@Test
	public void test(String browsername) {

		if (browsername.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("IE")) {

			driver = new InternetExplorerDriver();
		}else if (browsername.equalsIgnoreCase("Edge")) {
			
			driver = new InternetExplorerDriver();
			
			
		}

		driver.get("https://www.google.com/");

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		System.out.println("The script is running on following browser is >>>>" + browsername +  "        "
				+ "Title of the application is:" + driver.getTitle());

		driver.close();
		
	}

}
