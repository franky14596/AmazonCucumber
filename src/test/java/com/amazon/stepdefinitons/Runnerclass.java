package com.amazon.stepdefinitons;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features",
                     glue="com.amazon.stepdefinitons",
                   plugin={"html:target","json:target/reports.json"},
                   monochrome=true)
public class Runnerclass {
	
}
