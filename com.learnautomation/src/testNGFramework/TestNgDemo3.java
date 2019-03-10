/**
 * 
 */
package testNGFramework;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class TestNgDemo3 {

	@Test(description = "This test case will verify whether app is up and running", priority = 1)
	public void startApp() {

		Reporter.log("Browser started", true);
		Reporter.log("Application started", true);
		Reporter.log("Page title verified", true);

	}

	@Test(description = "This test case will verify whether user is able to login", priority = 2, dependsOnMethods = "startApp")
	public void loginApp() {

		Reporter.log("Username entered", true);

		Reporter.log("Password entered", true);

		Reporter.log("Click on login button", true);

		Assert.assertEquals("Welcome to selenium", "Welcome to Selenium", "Title does not match correctly");

	}

	@Test(description = "This test case will verify whether user is able to create contacts", priority = 3, dependsOnMethods = "loginApp")
	public void createContact() {

		Reporter.log("Contact created", true);

		Assert.assertEquals(12, 13, "The total count of contact is not matching properly");
	}

	@Test(description = "This test case will verify whether user is able to logout or not?", priority = 4, dependsOnMethods = "loginApp")
	public void logOut() {

		Reporter.log("Click on logout", true);

		Reporter.log("LogOut", true);

		String expected = "Good Bye - Hope to serve you again";

		Assert.assertTrue(expected.contains("Good Bye"), "Logout functionality is not working");

	}
}
