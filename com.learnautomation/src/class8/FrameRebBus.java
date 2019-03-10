/**
 * 
 */
package class8;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import class7.Utility;

/**
 * @author Lenovo This script is all about how to handle frame Created By:
 *         Ganesh Created On: 20-02-2019
 */
public class FrameRebBus {

	public static void main(String[] args) {

		// ChromeOptions options = Utility.browserChromeSpecificNotification();

		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("profile.default_content_setting_values.notifications", 2);

		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();

		// Switching to frame
		
		WebElement signButton = driver.findElement(By.xpath("//i[@id='i-icon-profile']"));
		
		Utility.getHighlighter(driver, signButton);
		
		signButton.click();
		
		WebElement loginButton = driver.findElement(By.xpath("//li[@id='signInLink']"));
		
		Utility.getHighlighter(driver, loginButton);
		
		loginButton.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement switchFrame = driver.findElement(By.xpath("//iframe[contains(@class,'modalIframe')]"));

		driver.switchTo().frame(switchFrame);

		WebElement faceBook = driver.findElement(By.xpath("//button[contains(@class,'fb-loaded')]"));

		Utility.getHighlighter(driver, faceBook);

		faceBook.click();
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
//		Utility.handleMultipleWindows(driver);

	}

}
