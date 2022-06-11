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
import pageobjects.loginpage;
import resources.base;
public class ValidateLogin extends base {
	public static Logger log =LogManager.getLogger(base.class.getName());
	@Test
	public void initialize() throws IOException
	{

		driver =initializeDriver();
		driver.get(prop.getProperty("url"));
		loginpage e=new loginpage(driver);

		e.getEmail().sendKeys("tej123$@gmail.com");
		e.getPassword().sendKeys("tej797$");
		e.getLogin().click();



		driver.close();
		driver=null; 



	}


}





