package Com.Automation.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "C:\\Users\\thrishal.g\\eclipse-workspace\\AdvantageShoppingcucumber\\src\\test\\resources\\Feature" }, 
glue = "Com.Automation.StepDef", plugin = {
		"html:reports/reports.html", "json:target/cucumber.json", "rerun:target/rerun.txt"} , tags="@smoketest")

public class Testrunner {

}
