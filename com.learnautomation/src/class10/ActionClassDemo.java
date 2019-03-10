/**
 * 
 */
package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Lenovo This script is all about how to handle the action class
 *         Created By: Ganesh Created On: 22-02-2019
 */
public class ActionClassDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.xpath(".//span[text()= 'right click me']"));

		Actions act = new Actions(driver);

		act.contextClick(ele).build().perform();

		Thread.sleep(1000);

		driver.findElement(By.xpath(
				".//li[@class= 'context-menu-item context-menu-icon context-menu-icon-paste']/span[text()='Paste']")).click();
		 
		
		

	}

	
	public static void get(){
		
	}
}
