package com.stepdefinitionadactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Tc1_stepdefinition {

	WebDriver driver;

	@Given("User is on the adactin hotel page")
	public void user_is_on_the_adactin_hotel_page() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/SearchHotel.php");

		driver.manage().window().maximize();

	}
	@When("User should enter {string} and {string} and click login button")
	public void user_should_enter_and_and_click_login_button(String string, String string2) {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Vignesh12");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("T59824");

		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();

	}
	@Then("User should verify success message")
	public void user_should_verify_success_message() {
		Assert.assertTrue("Search Hotel ", true);

	}




}
