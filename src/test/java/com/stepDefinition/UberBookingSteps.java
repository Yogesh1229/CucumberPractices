package com.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {

	@Given("User wants to select car type {string}")
	public void user_wants_to_select_car_type(String string) {
		System.out.println("Uber");
	}
	
	@When("^User select the car type \"([^\"]+)\" and pick up point \"([^\"]+)\" and price is (\\d+)$")
	public void user_select_the_car_type_and_pick_up_point(String carType, String pickUpLocation, int price) {
		System.out.println("cartype: " + carType);
		System.out.println("pickUpLocation: " + pickUpLocation);
		System.out.println("Price: " + price);
	}
	
	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("Step3");
	}
	
	@Then("User pays {int} USD")
	public void user_pays_usd(Integer price) {
		System.out.println("Price: " + price);
	}
}
