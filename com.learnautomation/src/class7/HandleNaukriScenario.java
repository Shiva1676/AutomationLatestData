/**
 * 
 */
package class7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Lenovo This script is all about handling multiple windows Created By:
 *         Ganesh Created On: 19-02-2019
 */
public class HandleNaukriScenario {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		System.out.println("==========Browser is all about============");

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		System.out.println("============PageLoad timeout===========");

		driver.manage().window().maximize();

		driver.get("https://www.naukri.com/jobs-in-india");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		boolean status = Utility.laterElement(driver);

		System.out.println("Is alert is displayed?" + status);

		if (status = true) {
			
			Utility.captureScreenshots(driver);
			
			System.out.println("========Captured screenshot sucessfully===========");
			
			driver.findElement(By.xpath(".//*[text()= 'Later']")).click();
			
			System.out.println("===========Sucessfully handled alert==========");
			
		} else {

			System.out.println("========================There is no alert in the application===============");
			
		}

/*		// This is to finding the element search button
		
		driver.findElement(By.name("qp")).sendKeys("Selenium");
		
		// This is to inspect the element experience button
		
		driver.findElement(By.xpath(".//div[@id = 'exp_dd']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
*/		
		driver.findElement(By.xpath(".//*[text()= 'Jobs']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Utility.handleMultipleWindows(driver);
		
		driver.findElement(By.xpath(".//a[@title= 'Search Recruiters']")).click();
		
		Utility.handleMultipleWindows(driver);
		
		driver.close();
		
		
	}

}
