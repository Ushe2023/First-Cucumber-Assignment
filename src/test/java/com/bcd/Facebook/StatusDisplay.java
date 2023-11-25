package com.bcd.Facebook;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features= "C:\\ushe\\Eclipse_Ushe\\Cucumber_Assignment\\src\\test\\java\\com\\bcd\\feature\\StatusUpdateDisplay.feature",
		glue= "com.bcd.Step",
		dryRun = false,
		plugin = {"pretty", "html: ushe\\Eclipse_Ushe\\Cucumber_Assignment\\target\\cucumber-reports\\StatusDisplay.html"}
				
		)
public class StatusDisplay {
	

}
