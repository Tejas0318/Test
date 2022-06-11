package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.ProductReturnPage;

import resources.base;

public class ProductReturnStepdefinition extends base {
	
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

    @And("^click on return hyper link$")
    public void click_on_return_hyperlink() throws Throwable {
    	ProductReturnPage r=new ProductReturnPage (driver); //driver.findElement
    	r.getReturnHyperlink().click(); 
        throw new PendingException();
    }

    @And("^ user enters (.+),(.+) ,(.+),(.+) ,(.+),(.+),(.+),(.+),(.+),(.+) ,(.+) ,(.+) ,(.+) $")
    public void user_enters_(String firstname, String lastname, String email, String telephone, String OrderId, String OrderDate, String ProductName, String ProductCode, String Quantity ,  String ReasonforReturn, String ProductisOpened , String FaultOrOtherDetails ) throws Throwable {
    	ProductReturnPage r=new ProductReturnPage(driver);
    	r.getFirstName().sendKeys("tejas");
    	r.getLastName().sendKeys("h a");
    	r.getEmail().sendKeys("tejas16@gmail.com");
    	r.getTelephone().sendKeys("9988774497");
    	r.getOrderID().sendKeys("8tyu");
    	r.getOrderDate().sendKeys("2022-06-15");
    	r.getProductName().sendKeys("Joggers");
    	r.getProductCode().sendKeys("R345");
    	r.getQuantity().sendKeys("1");
    	r.getReasonforReturn().click();
    	r.getProductisOpened().sendKeys("yes");
    	r.getFaultOrOtherDetails().sendKeys("product is damaged");
	
    	
        throw new PendingException();
    }


    
    @And("^Click on IhavereadandagreetotheExchangePolicy$")
    public void click_on_Exachangepolicy() throws Throwable {
    	ProductReturnPage r=new ProductReturnPage(driver);
    	r.getExchangePolicy().click();
        throw new PendingException();
    }

    @And("^Click on SubmitButton$")
    public void click_on_SubmitButton() throws Throwable {
    	ProductReturnPage r=new ProductReturnPage(driver);
    	r.getSubmitButton().click();
        throw new PendingException();
    }
   

    @And("^close the browser$")
    public void close_the_browser() throws Throwable {
    	driver.close();
        throw new PendingException();
    }

}





