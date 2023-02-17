package stepdefinition;

	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/feature",glue= {"stepdefinition"},

	monochrome = true, 
	//to generate html reports// 
	//plugin = {"pretty","html:target/htmlreport"}

	//to generate json report//
	plugin = {"pretty","json:target/Jsonreport"}



	)
	public class testrun {
		
}
