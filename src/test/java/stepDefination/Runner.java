package stepDefination;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src\\test\\resources\\feature",
		glue = "stepDefination",
		dryRun = false,
	    publish = true
		
	   
	
		)
 class CucumberRunnerTests extends AbstractTestNGCucumberTests {
	   
}
public class Runner {

}
//tags = " ",