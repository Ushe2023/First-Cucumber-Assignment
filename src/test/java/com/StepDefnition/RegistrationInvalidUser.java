// User Registration:
//	 Verify that users cannot register with invalid or duplicate information 
package com.StepDefnition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationInvalidUser {

	ChromeDriver driver;
	
	@Given("Open the Facebook browser")
	public void open_the_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    }
	@Given("Navigate to the Facebook browser")
	public void navigate_to_the_browser() {

		driver.get("https://www.facebook.com/");
	    }
	@When("Click on Registration button")
	public void click_on_registration_button() {
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	}
		@When("Enter FirstName")
	public void enter_first_name() {
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("rani");
		}
	@When("Enter LastName")
	public void enter_last_name() {
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("singh");
		}
	@When("Enter Email or mobile number")
	public void enter_email_mobile_number() {
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("ert@gmail.com");
		driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("iuhgvc678@gmail.com");
	}
	@When("Enter Password")
	public void enter_password() {
		driver.findElement(By.cssSelector("input[data-type='password']")).sendKeys("Welcome@123");
	}
	@When("Enter Date of birthday")
	public void enter_date_of_birthday() {
		Select day= new Select (driver.findElement(By.id("day")));
		day.selectByValue("1");
		Select mon= new Select (driver.findElement(By.id("month")));
		mon.selectByValue("2");
		Select year= new Select (driver.findElement(By.id("year")));
		year.selectByValue("2000");
	}
	@When("Enter Gender")
	public void enter_gender() {
		WebElement gender= driver.findElement(By.cssSelector("input[value='1']"));
		gender.click(); 
	    
	}
	@Then("Click on the SignUpButton")
	public void click_on_sign_up_button() {
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
    
	}

	@And("successful")
public void success() {
		String ExpectedMessage ="Sign Up";
		String ActualMessage = driver.findElement(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']")).getText();
		if((ExpectedMessage).equalsIgnoreCase(ActualMessage))
		
	{
		System.out.println("Please enter the user details correctly");
	}
	else System.out.println("User is successfully registered");
}
	
}


