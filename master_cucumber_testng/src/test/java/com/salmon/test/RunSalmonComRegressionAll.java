package com.salmon.test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "target/test-classes", tags = "@SalmonP1,@SalmonP2,@SalmonP3,@SalmonP4", monochrome = true, plugin = {
        "pretty", "html:target/cucumber-report/runwebat",
        "json:target/cucumber-report/runwebat/cucumber.json"})
public class RunSalmonComRegressionAll extends AbstractTestNGCucumberTests {
}
