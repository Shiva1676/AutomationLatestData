/**
 * 
 */
package brokenLinks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import class7.Utility;

/**
 * @author Lenovo This script is all about how to handle the application broken
 *         links Created By: Ganesh Created On: 20-02-2019
 */
public class HandlingBrokenLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://123telugu.com/");

		driver.manage().window().maximize();

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		System.out.println("The total number of links are:" + allLinks.size());
		
		List<String> list = new ArrayList<>();
		
		for(WebElement str: allLinks){
			
			String text = str.getAttribute("href");
			
			list.add(text);
			
		}
		
		int i=0;
		
		for(String ele: list){
			
//			System.out.println(i++  + " " + ele);
			
			driver.navigate().to(ele);
			
			System.out.println(i++ +"The title of the application is:"+driver.getTitle());
			
			System.out.println("The application of the url is:"+driver.getCurrentUrl());
			
			Utility.captureScreenshots(driver);
			
			System.out.println("==============Captured screenshot sucessfully=============");
			
			Utility.handleMultipleWindows(driver);
			
			System.out.println("===========Handled child window sucessfully=============");
			
		}

		
		driver.quit();
		
		System.out.println("==============Application closed=========");
	}

}
