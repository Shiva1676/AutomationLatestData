/**
 * 
 */
package class8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Lenovo
 *This script is used for desired capabilities
 *Created By: Ganesh
 *Created On: 18-02-2019
 */
public class DesiredCapabilitiesDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.cacert.org/");
		
		
	}

}
