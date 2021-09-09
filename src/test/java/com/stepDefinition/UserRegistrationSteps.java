package com.stepDefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationSteps {
	
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
		System.out.println("User navigates to registration page");
	}
	
	@When("User enter different test data")
	public void user_enter_different_test_data(DataTable dataTable) {
		List<List<String>> userList = dataTable.asLists(String.class);
		
		for(List<String> list : userList) {
			System.out.println(list);
		}
	}
	
	@When("User enter different test data with columns")
	public void user_enter_different_test_data_with_columns(DataTable dataTable) {
		List<Map<String, String>> userList = dataTable.asMaps(String.class, String.class);
		
//		System.out.println(userList);
		System.out.println(userList.get(0).get("firstName"));
	}
	
	@Then("User registration should be successful")
	public void user_registration_should_be_successful() {
		System.out.println("Registration is successful");
	}

}
