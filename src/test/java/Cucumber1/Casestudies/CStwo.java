package Cucumber1.Casestudies;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CStwo 
{
	WebDriver driver;
@Given("^user is on the home page$")
public void user_is_on_the_home_page() throws Throwable
{
	driver = UtilityTest.openBrowser("Chrome");
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
}

@When("^User enter the valid credentials \"([^\"]*)\" And \"([^\"]*)\"$")
public void user_enter_the_valid_credentials_And(String arg1, String arg2) throws Throwable 
{
	driver.findElement(By.name("userName")).sendKeys(arg1);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(arg2);
	driver.findElement(By.name("Login")).click();
}

@Then("^User successfully login$")
public void user_successfully_login() throws Throwable 
{

	Assert.assertEquals(driver.getTitle(), "Home");
	System.out.println("Registered Successfully !!");
	driver.close();
}
	
}
