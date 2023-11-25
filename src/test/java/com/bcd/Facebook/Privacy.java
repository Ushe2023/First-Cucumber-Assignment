package com.bcd.Facebook;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\ushe\\Eclipse_Ushe\\Cucumber_Assignment\\src\\test\\java\\com\\bcd\\feature\\Privacy.feature",
		glue = "com.bcd.Step",
		dryRun = false,
		plugin = {"pretty", "html:C:\\ushe\\Eclipse_Ushe\\Cucumber_Assignment\\target\\cucumber-reports\\Privacy.html"}
		)
public class Privacy {

}
