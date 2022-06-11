package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageobjects.loginpage;

import org.junit.runner.RunWith;
import resources.base;
//import pageobjects.loginpage;

//public class loginstepdefinition {
//	@RunWith(Cucumber.class)
	public class loginstepdefinition extends base {
		@Given("^initilize browser with chrome$")
		public void initilize_browser_with_chrome() throws Throwable {
			driver =initializeDriver();
			throw new PendingException();
		}
		@And("^navigate to \"([^\"]*)\" site$")
		public void navigate_to_something_site(String strArg2) throws Throwable {
			driver.get(strArg2);
			throw new PendingException();
		}


		@And("^enter (.+),  (.+)$")
		public void enter_(String emailaddress, String password) throws Throwable {
			loginpage e=new loginpage(driver);
			e.getEmail().sendKeys("tej123$@gmail.com");
			e.getPassword().sendKeys("tej797$");
			throw new PendingException();
		}
		@And("^Click on loginButton$")
		public void click_on_loginButton() throws Throwable {
			loginpage e=new loginpage(driver);
			e.getLogin().click();
			throw new PendingException();
		}
		
		@And("^close the browser$")
		public void close_the_browser() throws Throwable {
			driver.close();
			throw new PendingException();
		}

	}



