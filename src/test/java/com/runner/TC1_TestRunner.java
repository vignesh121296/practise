package com.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\TC1_Login.feature"},glue = {"com.stepdefinitionadactin"}                                                        )
public class TC1_TestRunner {

}
