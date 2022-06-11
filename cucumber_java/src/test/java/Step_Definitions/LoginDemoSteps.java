package Step_Definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {
	
	WebDriver driver = null;
	@Given("browser is open")
	public void browser_is_open() {
		
		System.out.println("inside step-browser is open");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is:"+projectPath);
		
		System.setProperty("webdriver.chrome.driver",projectPath+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	    
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		
		driver.navigate().to("http://uniformm1.upskills.in/");
		
	    
	}

	private Object navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	   
	}

	@And("user cliks on login")
	public void user_cliks_on_login() {
	   
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	   
	}
	

	
}
