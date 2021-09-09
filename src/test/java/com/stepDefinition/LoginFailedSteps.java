package com.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFailedSteps {
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	}
	@When("User enters {string} in username field")
	public void user_enters_in_username_field(String string) {
	}
	@When("User enters {string} in password field")
	public void user_enters_in_password_field(String string) {
	}
	@When("User clicks sign in button")
	public void user_clicks_sign_in_button() {
	}
	@Then("User should get an error message")
	public void user_should_get_an_error_message() {
	}

}
