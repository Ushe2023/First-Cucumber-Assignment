package com.abc.FaceBook;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)// We want to run Cucumber related code using Junit
@CucumberOptions(
		features = "C:\\ushe\\Eclipse_Ushe\\Cucumber_Assignment\\src\\test\\java\\com\\abc\\feature\\Facebook.feature",
		glue = "com.StepDefnition",
		dryRun = true,
		plugin = {"pretty", "html:target/cucumber-reports/myReport.html",
				  "json:target/Cucumber_Assignment/myReport.json",
				  "junit:target/Cucumber_Assignment/myReport.xml"}
		)

public class Facebook {

}
