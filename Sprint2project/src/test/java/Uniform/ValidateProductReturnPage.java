package Uniform;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.ProductReturnPage;
import resources.base;

public class ValidateProductReturnPage extends base {

	 public static Logger log =LogManager.getLogger(base.class.getName());
		@Test
		public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 
			 {
				 driver.get(prop.getProperty("url3"));
				 ProductReturnPage r=new ProductReturnPage(driver);
				    r.getFirstName().sendKeys("tejas");
			    	r.getLastName().sendKeys("h a");
			    	r.getEmail().sendKeys("tejas16@gmail.com");
			    	r.getTelephone().sendKeys("9988774497");
			    	r.getOrderID().sendKeys("8tyu");
			    	r.getOrderDate().sendKeys("2022-06-15");
			    	r.getProductName().sendKeys("Joggers");
			    	r.getProductCode().sendKeys("12345");
			    	r.getQuantity().sendKeys("1");
			    	r.getReasonforReturn().click();
			    	r.getProductisOpened().sendKeys("yes");
			    	r.getFaultOrOtherDetails().sendKeys("product is damaged");
			    	
			    	r.getExchangePolicy().click();
			    	r.getSubmitButton().click();
			    	
			 }
		
			 driver.close();
				driver=null;
			 


		}
}


