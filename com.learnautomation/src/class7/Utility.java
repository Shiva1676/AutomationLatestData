/**
 * 
 */
package class7;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @author Lenovo This script is global method for handle the alert method
 *         Created By: Ganesh Created On: 19-02-2019
 */
public class Utility {

	public static boolean laterElement(WebDriver driver) {

		try {
			driver.findElement(By.xpath(".//*[text()= 'Later']")).isDisplayed();

			return true;

		} catch (NoAlertPresentException e) {

			System.out.println("Exception is:" + e.getMessage());

			System.out.println("There is no alerts");

			return false;

		}

	}

	public static void captureScreenshots(WebDriver ldriver) {

		TakesScreenshot ts = (TakesScreenshot) ldriver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File(
				System.getProperty("user.dir") + "//CaptureScreenshots//Screenshots" + System.currentTimeMillis() + ".png");
		
		try {
			FileUtils.copyFile(src, dest);
			
		} catch (IOException e) {
			
			System.out.println("===========Unable to capture the screenshot==============");
			
			System.out.println("Technical message is:"+e.getMessage());
		}

	}
	
	public static void getparentId(WebDriver ldriver){
		
		String parentID = ldriver.getWindowHandle();
		
		System.out.println("The parentID is:"+parentID);
		
		System.out.println("The title of the parent page is:"+ldriver.getTitle());
		
		System.out.println("The url of the current page is:"+ldriver.getCurrentUrl());
	}
	
	
	public static void getSwitchingWindow(WebDriver ldriver){
		
		Set<String> allChildWindows = ldriver.getWindowHandles();
		
		System.out.println("The child window is:"+allChildWindows);
		
		System.out.println("The total number of child windows are:"+(allChildWindows.size()-1));
		
		
		
	}
	
	public static void closingWindow(WebDriver ldriver){
		
		ldriver.close();
		
	}
	
	
	
	
	public static void handleMultipleWindows(WebDriver ldriver){
		
		String parentID = ldriver.getWindowHandle();
		
		System.out.println("The parent Id is:"+parentID);
		
		Set<String> allwindows = ldriver.getWindowHandles();
		
		System.out.println("The child window is:"+allwindows);
		
		System.out.println("All child windows:"+ (allwindows.size()-1));
		
		for(String ele: allwindows){
			
			if(!parentID.equalsIgnoreCase(ele)){
				
				ldriver.switchTo().window(ele);
				
				System.out.println("Child window url is:"+ldriver.getCurrentUrl());
				
				System.out.println("Child window title is:"+ldriver.getTitle());
				
				ldriver.close();
				
				
			}
		}
		
		
		ldriver.switchTo().window(parentID);
		/*
		System.out.println("The title of the parent ID is:"+ldriver.getTitle());
		*/
		
	}
	
	public static ChromeOptions browserChromeSpecificNotification(){
		
	ChromeOptions options = new ChromeOptions();
	
	options.addArguments("--disable-popup-blocking");
	
	options.addArguments("start-maximized");
	
	options.addArguments("disable-infobars");
	
	return options;
			
		}
	
public static void getHighlighter (WebDriver ldriver, WebElement element) {
	
	JavascriptExecutor js = (JavascriptExecutor)ldriver;
	
	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	 
	try 
	{
	Thread.sleep(1000);
	} 
	catch (InterruptedException e) {
	 
	System.out.println(e.getMessage());
	} 
	 
	js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 
	 
	
	
}
	
}
