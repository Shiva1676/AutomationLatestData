/**
 * 
 */
package class8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import class7.Utility;

/**
 * @author Lenovo
 *
 */
public class NaukriMutlipleWindows {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		boolean status = false;

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/jobs-in-india");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		WebElement laterButton = driver.findElement(By.xpath(".//*[text()= 'Later']"));

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Utility.getHighlighter(driver, laterButton);

		laterButton.click();

		if (status = true) {

			Helper.browserChromeSpecificNotification();

		} else {

			System.out.println(status);
		}

		WebElement designation = driver
				.findElement(By.xpath("//input[@placeholder='Skills, Designations, Companies']"));

		designation.sendKeys("Selenium");

		Utility.getHighlighter(driver, designation);

		Utility.captureScreenshots(driver);

		WebElement experience = driver.findElement(By.xpath("//input[@placeholder='Experience']"));

		experience.click();
		
		Utility.getHighlighter(driver, experience);

		Utility.captureScreenshots(driver);

		List<WebElement> allListValues = driver.findElements(By.xpath("//div[@id='exp_dd']//li"));

		for (WebElement ele : allListValues) {

			String textValues = ele.getAttribute("innerHTML");

			if (textValues.equalsIgnoreCase("4")) {

				ele.click();

				Utility.getHighlighter(driver, ele);

				break;
			}

		}

	}

}
