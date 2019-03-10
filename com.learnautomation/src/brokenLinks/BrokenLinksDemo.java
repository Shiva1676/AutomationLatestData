/**
 * 
 */
package brokenLinks;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Lenovo This script is all about how to handle the broken links
 *         Created By: Ganesh Created On: 18-02-2019
 */
public class BrokenLinksDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// Reporter.log("==========Browser Started in Chrome==========", true);

		driver.manage().window().maximize();

		driver.get("http://english.tupaki.com/");

		// Reporter.log("===============Application started==========", true);

		// Collecting all the Links using list Interface

		List<String> hrefs = new ArrayList<String>();

		List<WebElement> allLinks = driver.findElements(By.xpath(".//a"));

		int count = allLinks.size();

		System.out.println("The total number link in the application is:" + count);

		for (WebElement ele : allLinks) {

			hrefs.add(ele.getAttribute("href"));

		}

		int i = 0;

		for (String href : hrefs) {

			// String navigatingLinks = href.equalsIgnoreCase(ele);

			// driver.navigate().to(href");

			System.out.println(++i + " " + href);

			// System.out.println((++i) + ": navigated to URL with href: " +
			// href);

		}
		
		driver.quit();
	}

}
