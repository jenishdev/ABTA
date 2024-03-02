package cucumber;

import cucumber.api.CucumberOptions;

//import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io

@CucumberOptions(features="src/test/java/cucumber",glue="stepdefinitions",monochrome=true,plugin= {"html:target/cucumber.html"})
public class Testrunner extends AbstractCucumberTests {

}
