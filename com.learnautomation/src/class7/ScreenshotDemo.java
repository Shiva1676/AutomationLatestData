/**
 * 
 */
package class7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Lenovo This script is used to handle screenshot of the application
 *         Created By: Ganesh Created On: 17-02-2019
 */
public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();

		System.out.println("===========Browser started============");

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		
		System.out.println("===========Application is up and running============");
		
		// Downcasting
		
		TakesScreenshot ts = (TakesScreenshot)driver;

		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\Lenovo\\Desktop\\Resume's\\Screenshot.png");
	
		FileUtils.copyFile(src, dest);
	}

}
