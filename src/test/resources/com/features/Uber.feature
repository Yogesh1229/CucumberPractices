@All
Feature: Uber booking feature

@Smoke
Scenario: Booking Cab Smoke
Given User wants to select car type "sedan"
When User select the car type "sedan" and pick up point "bangalore" and price is 200
Then Driver starts the journey
And User pays 1000 USD

@Regression
Scenario: Booking Cab Regression
Given User wants to select car type "SUV"
When User select the car type "SUV" and pick up point "Pune" and price is 200
Then Driver starts the journey
And User pays 1000 USD

@Prod
Scenario: Booking Cab Prod
Given User wants to select car type "BMW"
When User select the car type "BMW" and pick up point "hederabad" and price is 200
Then Driver starts the journey
And User pays 1000 USD