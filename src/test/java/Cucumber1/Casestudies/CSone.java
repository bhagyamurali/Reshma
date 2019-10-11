package Cucumber1.Casestudies;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class CSone
{
	WebDriver driver;
	
	@Given("^user is on the Registration page$")
	public void user_is_on_the_Registration_page() throws Throwable 
	{
		driver = UtilityTest.openBrowser("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@When("^user name \"([^\"]*)\"$")
	public void user_name(String arg1) throws Throwable
	{
		 driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^first name \"([^\"]*)\"$")
	public void first_name(String arg1) throws Throwable 
	{
		driver.findElement(By.name("firstName")).sendKeys(arg1);  
	}

	@When("^last name \"([^\"]*)\"$")
	public void last_name(String arg1) throws Throwable 
	{
		driver.findElement(By.name("lastName")).sendKeys(arg1);
	}

	@When("^password \"([^\"]*)\"$")
	public void password(String arg1) throws Throwable
	{
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(arg1);   
	}

	@When("^confirm password \"([^\"]*)\"$")
	public void confirm_password(String arg1) throws Throwable
	{
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(arg1);
	}

	@When("^gender$")
	public void gender() throws Throwable {
	    driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/input[2]")).click();
	}

	@When("^email \"([^\"]*)\"$")
	public void email(String arg1) throws Throwable 
	{
		driver.findElement(By.name("emailAddress")).sendKeys(arg1);
	}

	@When("^phoneno \"([^\"]*)\"$")
	public void phoneno(String arg1) throws Throwable 
	{
		driver.findElement(By.name("mobileNumber")).sendKeys(arg1);
	}

	@When("^dob \"([^\"]*)\"$")
	public void dob(String arg1) throws Throwable 
	{
		driver.findElement(By.name("dob")).sendKeys(arg1);  
	}

	@When("^address \"([^\"]*)\"$")
	public void address(String arg1) throws Throwable
	{
		 driver.findElement(By.name("address")).sendKeys(arg1);
	}

	@When("^security question \"([^\"]*)\"$")
	public void security_question(String arg1) throws Throwable 
	{
		driver.findElement(By.name("securityQuestion")).sendKeys(arg1);
	}

	@When("^answer \"([^\"]*)\"$")
	public void answer(String arg1) throws Throwable
	{
		driver.findElement(By.name("answer")).sendKeys(arg1);
	}

	@Then("^registration successful$")
	public void registration_successful() throws Throwable 
	{
	    driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	    WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("userName")));
		Assert.assertEquals(driver.getTitle(), "Login");
		System.out.println("Registered Successfully !!");
		 //driver.close();
	}
		
	}


