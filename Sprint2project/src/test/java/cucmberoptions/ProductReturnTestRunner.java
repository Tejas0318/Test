package cucmberoptions;

	import org.junit.runner.RunWith;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;
	import cucumber.api.testng.AbstractTestNGCucumberTests;

	//@RunWith(Cucumber.class)
	@CucumberOptions(  
		    features = "src/test/java/features",
		    glue="ProductReturnStepdefinition")
	public class ProductReturnTestRunner extends AbstractTestNGCucumberTests  {

	}


