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
public class ParametersDemo1 {

	@Parameters({"browser", "url"})
	@Test
	public void test(String browsername, String applicationURL){
		
		System.out.println("The script is running on following>>>"+browsername + "----" + "Application is being test:"+ applicationURL );
		
	}
	
	
}
