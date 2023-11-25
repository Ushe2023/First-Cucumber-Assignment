//1-Nov-2023

package com.StepDefnition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FaceBookStepDefinition {

	ChromeDriver driver;
	
	@Given("Open the Browser")
	public void OpenBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Given("Navigate to Facebook Website")
	public void navigate()
	{
		driver.get("https://www.facebook.com/");
	}
	
	
	@When("Enter a valid email {string}")
	public void enterEmail(String myEmail)
	{
		driver.findElement(By.name("email")).sendKeys(myEmail);
	}
	
	@When("Enter a valid password {string}")
	public void enterPassword(String myPassword)
	{
		driver.findElement(By.name("pass")).sendKeys(myPassword);
	}
	
	@When("Click on login button")
	public void clickLogin()
	{
		driver.findElement(By.name("login")).click();
	
	}
	
	@Then("Verify home page")
	public void verfiyHomePage()
	{
		String expectedOutput = "Home";
		String actualOutput = driver.findElement(By.xpath("//h1[text()='Home']")).getText();

	
		
		if(expectedOutput.equals(actualOutput))
		{
			System.out.println("Home page is successfully opened after entering"
					+ " valid credentials");
		}
		else
		{
			System.out.println("Home page is not displayed!");
		}	
	}
	@Then("Invalid credentials")
	public void verifyErrorPage()
	{
//		String expectedOutput = "My Account";
		Boolean actualOutput= driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		
		if(actualOutput)
		{
			System.out.println("Please Enter valid credentials");
		}
		else
		{
			System.out.println("Home page is displayed!");
		}	
	}
	
	
	@And("Close the browser")
	public void closeBrowser()
	{
		driver.close();
		System.out.println("Close");

	}
}









