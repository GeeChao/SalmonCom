package com.salmon.test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "target/test-classes", tags = {"@UnderTest"}, monochrome = true, plugin = {
        "pretty", "html:target/cucumber-report/runwebat",
        "json:target/cucumber-report/runwebat/cucumber.json","junit:target/cucumber-report/junit/cucumber.xml"})
public class RunSalmonComRegressionTemp extends AbstractTestNGCucumberTests {
}
