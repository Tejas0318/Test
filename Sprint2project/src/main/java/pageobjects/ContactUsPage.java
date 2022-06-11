package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage {

	public WebDriver driver ;

	By YourName= By.xpath("/html/body/div[1]/div/div/form/fieldset/div[1]/div/input");
	By EmailAddress=By.xpath("/html/body/div[1]/div/div/form/fieldset/div[2]/div/input");
	By Enquiry= By.xpath("/html/body/div[1]/div/div/form/fieldset/div[3]/div/textarea");
	By SubmitButton= By.xpath("/html/body/div[1]/div/div/form/div/div/input");

	public ContactUsPage(WebDriver driver) {
		this.driver=driver;
	}





	public WebElement getYourName() {
		return driver.findElement(YourName);
	}
	public WebElement getEmailAddress() {
		return driver.findElement(EmailAddress);
	}
	public WebElement getEnquiry() {
		return driver.findElement(Enquiry);
	}
	public WebElement getSubmitButton() {
		return driver.findElement(SubmitButton);

	}
}

