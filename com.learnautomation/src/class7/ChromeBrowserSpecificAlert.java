/**
 * 
 */
package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Lenovo
 *
 */
public class ChromeBrowserSpecificAlert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ChromeOptions options = Utility.browserChromeSpecificNotification();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

	driver.get(
				"https://www.google.com/search?q=ora&oq=ora&aqs=chrome..69i57j69i60l3j69i59j0.1503j0j7&sourceid=chrome&ie=UTF-8");
		
		
//		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath(".//a[contains(text(), 'English')]")).click();

	}

}
