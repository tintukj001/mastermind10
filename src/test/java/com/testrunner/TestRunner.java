package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="./src/test/resources/CucumberFeature",
		glue="com.stepdefinition"
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
