package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		         //features="Features", 
		         //features="E:\\Praveen_Automation\\TCS_SELENIUM\\CucumberProject\\Features\\Tagging.feature",
		         features="E:\\Praveen_Automation\\TCS_SELENIUM\\CucumberProject\\Features\\Hooks.feature",
		         glue="stepDefinations", 
                 format={"pretty","html:test-output","json:json_output/cucumber.json","junit:juint_xml_output/cucumber.xml"},
                 dryRun=false,
                 monochrome=true,
                 strict=false,
                 //tags={"@RegressionTest"} //It will execute only Regression Test Cases
		         //tags={"@RegressionTest,@End2End"} //It will execute only scenarios comes under Regression Test OR Ennd2End Test
		         //tags={"@RegressionTest", "@ReTest"} //It will execute Both Scenarios comes under Regression Test AND ReTest
		         //tags={"~@End2End"} //Will igonre Scenarios under End2End Test cases
		         tags={"~@ReTest","~@RegressionTest"} //Will ignore scenarios under ReTest and Regression Test
		        )
public class TestRunner
{
	
}
