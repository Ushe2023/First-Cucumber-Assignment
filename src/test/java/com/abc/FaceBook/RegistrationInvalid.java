package com.abc.FaceBook;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="C:\\ushe\\Eclipse_Ushe\\Cucumber_Assignment\\src\\test\\java\\com\\abc\\feature\\RegisterInvalidDetails.feature",
			glue="com.StepDefnition",
			dryRun=false,
			plugin={"pretty", "html:target/Cucumber_Assignment/InvaidDetailsmyReport.html"}
			
)
public class RegistrationInvalid {

}
