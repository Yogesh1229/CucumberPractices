package com.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	public static WebDriver driver;

	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/login");
	}

	@When("User enters UserName and Password")
	public void user_enters_user_name_and_password() {
		driver.findElement(By.id("userName")).sendKeys("test1234");
		driver.findElement(By.id("password")).sendKeys("#T123est?");
		driver.findElement(By.id("login")).click();
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
		System.out.println("Login successful");
		driver.quit();
	}

}
