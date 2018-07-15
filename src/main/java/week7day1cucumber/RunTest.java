package week7day1cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features="src/main/java/week7day1cucumber/CreateLead.feature",
glue= {"pagesforcucumber", "week7day1cucumber"}, monochrome=true)

@RunWith(Cucumber.class)

public class RunTest {
	

}
