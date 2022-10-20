package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\racha\\eclipse-workspace\\g\\src\\main\\java\\Feature\\Free.feature",
		glue= {"StepDefination"},
		dryRun= false,
		monochrome = false,
		plugin= {"pretty","html:test-output","junit:junit_xml/cucumber.xml"}
		
		)





public class TestRunner{
	
}
