/**
 * 
 */
package class10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

/**
 * @author Lenovo This script is how to handle desktop application Created By:
 *         Ganesh Created On: 21-02-2018
 */
public class SikuliDemo {

	public static void main(String[] args) throws FindFailed, InterruptedException, AWTException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_WINDOWS);

		r.keyPress(KeyEvent.VK_D);

		r.keyRelease(KeyEvent.VK_WINDOWS);

		r.keyRelease(KeyEvent.VK_D);

		Thread.sleep(2000);

		Screen s = new Screen();

		s.doubleClick("C:\\Users\\Lenovo\\Desktop\\SikuliFolder\\Capture.PNG");
		
		

		
	}

}
