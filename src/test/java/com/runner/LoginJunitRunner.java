package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@InvalidCredentials",features = "src/test/resources/Features/Login.feature", glue = "com.Tabbusree.TechnicalAssessment3",plugin = {"pretty", "html:target/Assessment-reports/Cucumber.html", "junit:target/Assessment-reports/Cucumber.xml", "json:target/Assessment-reports/Cucumber.json"})
public class LoginJunitRunner {
	
}
