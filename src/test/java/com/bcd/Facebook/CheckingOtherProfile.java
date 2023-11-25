//24-nov
//Verify if the user can check if other friend users are displayed.


package com.bcd.Facebook;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\ushe\\Eclipse_Ushe\\Cucumber_Assignment\\src\\test\\java\\com\\bcd\\feature\\SendingFriendRequest.feature",
//		"C:\\ushe\\Eclipse_Ushe\\Cucumber_Assignment\\src\\test\\java\\com\\bcd\\feature\\CheckingOtherProfile.feature",
		glue = "com.bcd.Step",
		dryRun = true,
		plugin = {"pretty", "html:C:\\ushe\\Eclipse_Ushe\\Cucumber_Assignment\\target\\cucumber-reports\\CheckotherProfile.html"}
		)

public class CheckingOtherProfile {

}




