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


import pageobjects.Registerpage;
import resources.base;


public class Validateregisterpage extends base {
	 public static Logger log =LogManager.getLogger(base.class.getName());
		@Test
		public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 
			 {
				 driver.get(prop.getProperty("url1"));
				 Registerpage r=new Registerpage(driver);
				 r.getFirstName().sendKeys("tej");
			    	r.getLastName().sendKeys("B R");
			    	r.getEmail().sendKeys("tej16@gmail.com");
			    	r.getTelephone().sendKeys("9088774497");
			    	r.getFax().sendKeys("8tyu");
			    	r.getCompany().sendKeys("capgemini");
			    	r.getAddress1().sendKeys("Sri nilaya,no56");
			    	r.getAddress2().sendKeys("basveshwara nagara, banglore");
			    	r.getCity().sendKeys("Banglore");
			    	r.getPostcode().sendKeys("563002");
			    	r.getRegionstate().click();
			    	r.getCountry().click();
			    	r.getpassowrd().sendKeys("Error@12345");
			    	r.getconfirmpassword().sendKeys("Error@12345");
			    	r.getYes().click();
			    	r.getPrivacyPolicy().click();
			    	r.getContinue().click();
			    	
			 }
		
			 driver.close();
				driver=null;
			 


		}
}
