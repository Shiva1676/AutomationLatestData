/**
 * 
 */
package testNGFrameworkAdvanceTopics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class ParametersDemo {

	@Parameters("browser")
	@Test
	public void test(String browsername){
		
		System.out.println("My script is running on following browser >>>>"+browsername);
		
	}
	
}
