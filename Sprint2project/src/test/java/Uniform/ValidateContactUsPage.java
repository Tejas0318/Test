package Uniform;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.ContactUsPage;

import resources.base;
public class ValidateContactUsPage extends base {
	public static Logger log =LogManager.getLogger(base.class.getName());
	@Test
	public void initialize() throws IOException
	{

		driver =initializeDriver();
		driver.get(prop.getProperty("url5"));
		ContactUsPage e=new ContactUsPage (driver);
		
		e.getYourName().sendKeys("tejas h a");
		e.getEmailAddress().sendKeys("tej123$@gmail.com");
		e.getEnquiry().sendKeys("i want to enuiry about my order status");
		e.getSubmitButton().click();

		
		


		driver.close();
		driver=null; 



	}


}





