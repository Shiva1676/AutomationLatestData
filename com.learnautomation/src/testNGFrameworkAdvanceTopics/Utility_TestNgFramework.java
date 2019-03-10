/**
 * 
 */
package testNGFrameworkAdvanceTopics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author Lenovo
 *
 */
public class Utility_TestNgFramework {

	public static void getScreenshots(WebDriver ldriver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) ldriver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File(
				System.getProperty("user.dir") + "//Screenshots//CrossBrowsing" + System.currentTimeMillis() + ".png");

		FileUtils.copyDirectory(src, dest);

	}

}
