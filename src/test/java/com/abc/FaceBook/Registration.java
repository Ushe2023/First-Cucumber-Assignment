package com.abc.FaceBook;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="C:\\ushe\\Eclipse_Ushe\\Cucumber_Assignment\\src\\test\\java\\com\\abc\\feature\\Registration.feature",
			glue="com.StepDefnition",
			dryRun=true,
			plugin={"pretty", "html:target/cucumber-reports/myReport.html"}
			
)
public class Registration {

}
