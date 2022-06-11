package stepdefinitions;

import org.openqa.selenium.WebElement;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pageobjects.ContactUsPage;
import pageobjects.loginpage;
import resources.base;
//
//public class ContactUsStepdefinition {
//	
	public class  ContactUsStepdefinition extends base {
		@Given("^initilize browser with chrome$")
	    public void initilize_browser_with_chrome() throws Throwable {
			 driver =initializeDriver();
	        throw new PendingException();
	    }
		@And("^navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
			driver.get(strArg1);
	        throw new PendingException();
	    }
	
		    
		 @And("^enter (.+),  (.+)$")
		    public void enter_(String YourName, String EmailAddress, String Enquiry) throws Throwable {
			ContactUsPage e= new ContactUsPage(driver);
			 e.getYourName().sendKeys("Tejas h a");
			 e.getEmailAddress().sendKeys("tej123$@gmail.com");
			 e.getEnquiry().sendKeys("i want to enuiry about my order status");
			throw new PendingException();
		    }
		  @And("^Click on SubmitButton$")
		    public void click_on_SubmitButton() throws Throwable {
			  ContactUsPage e=new ContactUsPage(driver);
			  e.getSubmitButton().click();
		        throw new PendingException();
		    }

	}

//
//	public WebElement getEmail() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public WebElement getYourName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public WebElement getSubmitButton() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public WebElement getEnquiry() {
//		// TODO Auto-generated method stub
//		return null;
//	}
