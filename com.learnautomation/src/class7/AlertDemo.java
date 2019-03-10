/**
 * 
 */
package class7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Lenovo This script is all about how to handle the alerts on web
 *         application We have different types of alerts 1. Normal alerts where
 *         you can inspect the webelement and perform with operations like click
 * 
 *         2. HTML alert means where we can't inspect the webElement. For that
 *         we have to approach through alert class
 * 
 *         3. Angular JS alerts are like we inspect in normal ways
 * 
 *         4. There are some browser specific alerts. Thats a different story.
 *         Will discuss this in next script
 * 
 * 
 *         *
 */
public class AlertDemo {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		System.out.println("=========Browser is about to start==========");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		System.out.println("==============Browser started=========");

		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");

		driver.manage().window().maximize();

		System.out.println("Application is up and running");
		
		try {
			
			driver.findElement(By.xpath(".//button[contains(text(), 'Search')]")).click();
			
		    boolean status = AlertDemo.isAlertDisplayed(driver);
			
			System.out.println("The status of the alert is:"+status);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();*/
		
		Thread.sleep(3000);

		driver.quit();

	}

	
	
	public static boolean isAlertDisplayed(WebDriver ldriver){
		
		try {
			
			Alert alt = ldriver.switchTo().alert();
			
			alt.accept();
			
			return true;
			
		} catch (NoAlertPresentException e) {
			
			System.out.println("Exception is:"+e.getMessage());
			
			System.out.println("============Alert is not present============");
			
			return false;
		}
		
	}
	
}
