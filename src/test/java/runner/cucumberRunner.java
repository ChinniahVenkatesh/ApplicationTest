package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features"
		,glue={"stepDefinitions"},
		tags = "@regTest",
		plugin = {"pretty","html:target/ApplicationTest.html","json:target/ApplicationTest.json"}
		)
public class cucumberRunner {

}
