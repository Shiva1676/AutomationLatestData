/**
 * 
 */
package class7;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Lenovo This script is used to handle the screenshot dynamically
 *         Created By: Ganesh Created On: 17-02-2019
 *
 *         *
 */
public class ScreenshotDemo1 {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File(
				System.getProperty("user.dir") + "/CaptureScreenshots/Selenium" + System.currentTimeMillis() + ".png");

		FileUtils.copyFile(src, dest);
		
		Thread.sleep(1000);

		driver.quit();
	}

}
