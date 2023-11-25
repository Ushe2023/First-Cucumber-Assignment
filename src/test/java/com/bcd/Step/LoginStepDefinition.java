//1-Nov-2023
//Login to the facebook account and editing the user profile

package com.bcd.Step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	ChromeDriver driver;
	ChromeOptions options =new ChromeOptions();
	
	@Given("Open the Browser")
	public void OpenBrowser()
	{
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
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
	
	@When("Click on home")
	public void click_on_home() {
//		driver.findElement(By.xpath("[//a[@aria-label='Home']")).click();
		driver.findElement(By.xpath("//a[@aria-label='Home']")).click();
	}

	@When("Click on Name")
	public void click_on_name() {
		WebElement name = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/span[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='image'][1]"));
		name.click();
	    
	}
	@When("Click on Edit Profile")
	public void click_on_edit_profile() {
		WebElement editProfile =driver.findElement(By.xpath("//span[contains(text(),'Edit profile')]"));
		editProfile.click();
	    
	}
	@When("Describe Yourself")
	public void describe_yourself() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains text(),'Add'")).click();
		WebElement TextArea = driver.findElement(By.xpath("//textarea[@placeholder='Describe who you are']"));
		TextArea.sendKeys("I am a Graduate");
		driver.findElement(By.className("x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft")).click();
	}
	@When("Customise intro")
	public void customise_intro() {
		driver.findElement(By.className("x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft x1j85h84")).click();
	  
	}
	

	@When("Click on search friend")
	public void click_on_search_friend() throws InterruptedException {
		WebElement SearchFriend = driver.findElement(By.xpath("//input[@aria-label='Search Facebook']"));
//		Thread.sleep(10000);
		SearchFriend.sendKeys("ushe");
		System.out.println("Searching a friend");
		SearchFriend.sendKeys(Keys.ENTER);
	    
	}
	@When("Click on your friend profile and verify")
	public void click_on_your_friend_profile() throws InterruptedException {
		WebElement select = driver.findElement(By.xpath("//a[@role='presentation']"));
		Boolean selected = select.isDisplayed();
//		Thread.sleep(5000);
		if (selected)
		{
			System.out.println("Friend is displayed");
		}else
			System.out.println("Friend is not displayed");
	    
	}

	@When("Click on Add Friend")
	public void click_on_add_friend() throws InterruptedException {
			   WebElement AddFriend= driver.findElement(By.xpath("(//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft'])[2]"));
			   Thread.sleep(10000);
			   AddFriend.click();
			   System.out.println("Adding a friend");
			   Thread.sleep(10000);
	}
	

	@When("Enter a valid emailID {string}")
	public void enter_a_valid_email_id(String string) {
		driver.findElement(By.name("email")).sendKeys(string);
	}
	@When("Enter a valid passwordID {string}")
	public void enter_a_valid_password_id(String string) {
		driver.findElement(By.name("pass")).sendKeys(string);
	}



	@When("Click on find friends")
	public void click_on_find_friends() {
WebElement FindFriends  = driver.findElement(By.xpath("//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6'][normalize-space()='Find friends']"));
FindFriends.click();
	}
	
	@When("Confirm\\/delete the friend request")
	
	public void confirm_delete_the_friend_request() {
//	    WebElement Confirm =driver.findElement(By.xpath("//div[@aria-label='Confirm']"));
	    WebElement Confirm = driver.findElement(By.xpath("//div[@class='x9f619 x1n2onr6 x1ja2u2z x78zum5 x2lah0s x1qughib x1qjc9v5 xozqiw3 x1q0g3np xn6708d x1ye3gou xexx8yu xcud41i x139jcc6 x4vbgl9 x1rdy4ex']//div[@class='x1n2onr6 x1ja2u2z x78zum5 x2lah0s xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xn6708d x1ye3gou xtvsq51 x1r1pt67']"));
	    Confirm.click();
	}
	
	@When("Click on Like button")
	public void click_on_like_button() {
		driver.findElement(By.xpath("(//span[contains(text(),'Like')])[1]")).click();
		System.out.println("I liked");
	
	}
	@Then("Add Comments")
	public void add_comments() {
	
		driver.findElement(By.xpath("(//span[normalize-space()='Comment'])[1]")).click();
		WebElement Comment = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]"));
		Comment.sendKeys("I am Enjoying to comment");
		driver.findElement(By.xpath("(//div[@aria-label='Comment'])[1]")).click();
		System.out.println("My Comments");
	}

	@When("Click on account")
	public void click_on_account() {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/a[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]")).click();
		
	    
	}
	@When("Click on SettingPrivacy")
	public void click_on_setting_privacy() {
driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[5]/div[2]/div[1]/div[1]/span[1]")).click();
	    
	}
	@When("Click on Settings")
	public void click_on_settings() {
	   
	}
	@When("Click on Privacy")
	public void click_on_privacy() {
		driver.findElement(By.xpath("//span[normalize-space()='Privacy']")).click();
		driver.findElement(By.xpath("//iframe[@class='x1ejq31n xd10rxx x1sy0etr x17r0tee x1lliihq xat3117 xh8yej3']")).click();
	}
	@When("Access to Posts")
	public void access_to_posts() {
	    
	}
	@When("Access to Profile")
	public void access_to_profile() {
//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]/div[1]/div[1]/span[1]")).click();
//		driver.findElement(By.cssSelector(".x9f619.x1n2onr6.x1ja2u2z.x78zum5.xdt5ytf.x2lah0s.x193iq5w.xeuugli.xsyo7zv.x16hj40l.x10b6aqq.x1yrsyyn[shub-ins='1']")).click();
		driver.findElement(By.cssSelector("input[aria-label='Toggle to enable others to share your posts']")).click();
		driver.findElement(By.xpath("(//i[@class='x1b0d499 xi3auck'])[1]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
	}

	@When("Click on friend search")
	public void click_on_friend_search() {
		driver.findElement(By.xpath("//input[@placeholder='Search Facebook']")).sendKeys("Lipsita");
		Actions actions = new Actions(driver);
//		driver.findElement(By.cssSelector("//input[@placeholder='Search Facebook']")).sendKeys(Keys.ENTER);
		actions.sendKeys(Keys.ENTER).perform();
		
	}
	@Then("Verify if friends are displayed.")
	public void verify_if_friends_are_displayed() {
		String SearchResult = driver.findElement(By.xpath("//h1[@class='x1heor9g x1qlqyl8 x1pd3egz x1a2a7pz']")).getText();
//		System.out.println(SearchResult);
	    if ((SearchResult).contains("Search results")) {
	    System.out.println("Search is successful");
	    }else
	    	System.out.println("could not search");
	}
	
	@Then("Verify if friends are suggested.")
	public void verify_if_friends_are_suggested() {
//		String SearchResult =driver.findElement(By.xpath("//h1[@class='x1heor9g x1qlqyl8 x1pd3egz x1a2a7pz']")).getText();
		String SearchResult =driver.findElement(By.xpath("(//h1[normalize-space()='Suggestions'])[1]")).getText();
		System.out.println(SearchResult);
	    if ((SearchResult).contains("Suggestions")) {
	    System.out.println("Search is successful");
	    }else
	    	System.out.println("could not search");
	}
	
	@When("Click on friend search by suggestion")
	public void click_on_friend_search_by_suggestion() {
driver.findElement(By.xpath("(//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft'])[1]")).click();
driver.findElement(By.xpath("(//span[@class='x193iq5w xeuugli x13faqbe x1vvkbs x1xmvt09 x1lkfr7t x1lbecb7 xk50ysn xzsf02u'])[3]")).click();
	}









	@Then("Logout")
	public void logout() {
//		driver.findElement(By.xpath("(//div[@class='x1ey2m1c xds687c xg01cxk x47corl x10l6tqk x17qophe x13vifvy x1ebt8du x19991ni x1dhq9h x1wpzbip x14yjl9h xudhj91 x18nykt9 xww2gxu'])[1]")).click();
driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/span[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='image'][1]")).click();
driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]")).click();	    
System.out.println("Logged Out Successfully");
	}

	@And("Close the browser")
	public void closeBrowser()
	{
		driver.close();
		System.out.println("Close");

	}
}









