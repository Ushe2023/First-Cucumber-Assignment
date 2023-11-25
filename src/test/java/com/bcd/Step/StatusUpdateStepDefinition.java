//21-Nov-2023
// assignment-2 
//4a... 4b... Verify that users can post status updates and view status on their profiles.
package com.bcd.Step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StatusUpdateStepDefinition {

	ChromeDriver driver;
	ChromeOptions options =new ChromeOptions();
	
	@Given("Open the Facebook Browser")
	public void OpenBrowser()
	{
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Given("Navigate to Website")
	public void navigate()
	{
		driver.get("https://www.facebook.com/");
	}
	
	
	@When("Enter a valid Email {string}")
	public void enterEmail(String myEmail)
	{
		driver.findElement(By.name("email")).sendKeys(myEmail);
	}
	
	@When("Enter a valid Password {string}")
	public void enterPassword(String myPassword)
	{
		driver.findElement(By.name("pass")).sendKeys(myPassword);
	}
	
	@When("Click on Login button")
	public void clickLogin()
	{
		driver.findElement(By.name("login")).click();
	}
	
	@When("Click on Home")
	public void click_on_home() {
//		driver.findElement(By.xpath("[//a[@aria-label='Home']")).click();
		WebElement Home= driver.findElement(By.xpath("//a[@aria-label='Home']"));
		Home.click();

	}
	
	@When("Write status")
	public void write_status() {
WebElement status = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[1]/span"));
status.click();

WebElement message = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]"));
message.sendKeys("Hello Good morning");
driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[3]/div[2]/div/div/div[1]")).click();
System.out.println("Status message successfully entered");
	}

	@Then("Display Status")
	public void display_status() {
	    
WebElement DisplayedStatus = driver.findElement(By.xpath("//div[@class='xdj266r x11i5rnm xat24cr x1mh8g0r x1vvkbs']"));
Boolean Thought= DisplayedStatus.isDisplayed();
if(Thought)
{
	System.out.println("Status is displayed");
}
else
{
	System.out.println("Status is not displayed");
}
	}


	@And("Close the Browser")
	public void closeBrowser()
	{
		driver.close();
		System.out.println("Close");

	}
}









