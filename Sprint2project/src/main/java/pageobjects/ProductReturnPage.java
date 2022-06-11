package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductReturnPage {

	public WebDriver driver ;
	By ReturnHyperlink= By.xpath("//*[@id=\"footer\"]/div[1]/div[2]/ul/li[2]/a");
	By FirstName=By.id("input-firstname");
	By LastName=By.id("input-lastname");
	By Email=By.id("input-email");
	By Telephone=By.id("input-telephone");
	By OrderID=By.id("input-order-id");
	By OrderDate=By.xpath("//*[@id=\"input-date-ordered\"]");
	By ProductName=By.xpath("/html/body/div[1]/div/div/form/fieldset[2]/div[1]/div/input");
	By ProductCode=By.xpath("/html/body/div[1]/div/div/form/fieldset[2]/div[2]/div/input");
	By Quantity=By.xpath("/html/body/div[1]/div/div/form/fieldset[2]/div[3]/div/input");
	By ReasonforReturn=By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[4]/div/div[2]/label/input");

	By ProductisOpened=By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[5]/div/label[2]/input");
	By FaultOrOtherDetails=By.xpath("/html/body/div[1]/div/div/form/fieldset[2]/div[6]/div/textarea");
	By  IhavereadandagreetotheExchangePolicy =By.xpath("//*[@id=\"content\"]/form/div/div[2]/input[1]");
	By SubmitButton=By.xpath("//*[@id=\"content\"]/form/div/div[2]/input[2]");

	public ProductReturnPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getReturnHyperlink() {
		return driver.findElement(ReturnHyperlink) ;
	}
	public WebElement getFirstName() {
		return driver.findElement(FirstName);
	}
	public WebElement getLastName() {
		return driver.findElement(LastName) ;
	}
	public WebElement getEmail() {
		return driver.findElement(Email) ;
	}
	public WebElement getTelephone() {
		return driver.findElement(Telephone) ;
	}
	public WebElement getOrderID() {
		return driver.findElement(OrderID) ;
	}
	public WebElement getOrderDate() {
		return driver.findElement(OrderDate) ;
	}
	public WebElement getProductName() {
		return driver.findElement(ProductName);
	}
	public WebElement getProductCode() {
		return driver.findElement(ProductCode) ;
	}
	public WebElement getQuantity() {
		return driver.findElement(Quantity) ;
	}

	public WebElement getReasonforReturn() {
		return driver.findElement(ReasonforReturn) ;
	}
	public WebElement getProductisOpened() {
		return driver.findElement(ProductisOpened) ;
	}
	public WebElement getFaultOrOtherDetails() {
		return driver.findElement(FaultOrOtherDetails) ;
	}
	public WebElement getExchangePolicy() {
		return driver.findElement(IhavereadandagreetotheExchangePolicy) ;
	}
	public WebElement getSubmitButton() {
		return driver.findElement(SubmitButton) ;
	}



}
