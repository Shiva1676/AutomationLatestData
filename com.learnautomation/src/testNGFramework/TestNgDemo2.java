/**
 * 
 */
package testNGFramework;

import org.testng.annotations.Test;

/**
 * @author Lenovo This script is all about how to handle the testNg concept
 *         Created By: Ganesh Created On: 24-02-2019
 */
public class TestNgDemo2 {

	@Test(description = "This method is to start app")
	public void startApp() {

		System.out.println("Hey i am ready to run the application");

	}

	@Test(description = "This method is to login application")
	public void loginToApp() {

		System.out.println("Hey we are into login page");

	}

	@Test(description = "This method is to create contact")
	public void createContact() {

		System.out.println("You are in the page of createContact");

	}

	@Test(description = "This method is to logout the application")
	public void logOut() {

		System.out.println("Please logout the application once you have done");

	}

}
