Feature: Login Feature

  Scenario Outline: Login fail : possible combinations
    Given User is on login page
    When User enters "<Username>" in username field
    And User enters "<Password>" in password field
    And User clicks sign in button
    Then User should get an error message

    Examples: 
      | Username | Password |
      | Yogesh   | test123  |
      | Ankit    | test     |
