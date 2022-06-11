package Step_Definitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/login.feature",glue= {"Step_Definitions"},
monochrome = true,
//plugin = {"pretty", "html:target/HTMLReports/report.html"},
//plugin = {"pretty", "junit:target/JUnitReports/report.xml"},
plugin = {"pretty", "json:target/JSONReports/report.json"},
tags="@smoketest"

)
public class Runner_Class {

}
