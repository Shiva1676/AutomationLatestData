/**
 * 
 */
package testNGFrameworkAdvanceTopics;

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
public class ParametersDemo2 {

	WebDriver driver;
	
	@Parameters({"browser", "url"})
	@Test
	public void test(String browsername, String appURL){
		
		if(browsername.equalsIgnoreCase("Chrome")){
	
			driver = new ChromeDriver();
			
			driver.get(appURL);
			
		}else if (browsername.equalsIgnoreCase("Firefox")) {
			
			driver = new FirefoxDriver();
			
			driver.get(appURL);
			
		}else if (browsername.equalsIgnoreCase("IE")) {
			
			driver = new InternetExplorerDriver();
			
			driver.get(appURL);
		}
		
		System.out.println("The script is running on >>>"+browsername + "   "+ "Application is being test"+appURL);
		
	}
	
}
