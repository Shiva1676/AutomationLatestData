/**
 * 
 */
package class8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import class7.Utility;

/**
 * @author Lenovo This script is all about how to handle the field when it is
 *         inside the frame Creating By: Ganesh Creating On: 20-02-2019
 */
public class FrameDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://netbanking.hdfcbank.com/netbanking/?_ga=2.15605119.877412547.1550646139-825672854.1550646139");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		// Here the scenario is first we need to switch to the frame first
		
		WebElement iframeElement = driver.findElement(By.xpath(".//frame[@name= 'login_page']"));
		
		driver.switchTo().frame(iframeElement);
		
		System.out.println("Successfully switched to frame");
		
		WebElement ele = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		
		ele.sendKeys("Mohan");
		
		Utility.getHighlighter(driver, ele);
		
		Utility.captureScreenshots(driver);
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
