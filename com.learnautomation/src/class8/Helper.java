/**
 * 
 */
package class8;

import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @author Lenovo
 *
 */
public class Helper {

	/**
	 * @param args
	 */
	
	public static boolean browserChromeSpecificNotification(){
		
		boolean status = false;
		
		if(status==true){
			ChromeOptions options = new ChromeOptions();
			
			options.addArguments("--disable-popup-blocking");
			
			options.addArguments("start-maximized");
			
			options.addArguments("disable-infobars");
					
		}else{
		
			System.out.println("No browser notification present");
			
		status = false;	
		
		}
	
	return status;
			
		}

}
