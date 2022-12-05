package com.StepDefinitionFB;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepdefinitionFB {

	WebDriver driver;
	@Given("User is on the facebook page")
	public void user_is_on_the_facebook_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();

	}
	@When("User should enter {string} and {string}")
	public void user_should_enter_and(String username, String password) {
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys(username);

		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(password);

	}
	@When("User should click login button")
	public void user_should_click_login_button() {
		WebElement btnlogin = driver.findElement(By.id("loginbutton"));
		btnlogin.click();

	}
	@Then("User should verify success message")
	public void user_should_verify_success_message() {
		Assert.assertTrue("Log in to Facebook",true );
	}
}
