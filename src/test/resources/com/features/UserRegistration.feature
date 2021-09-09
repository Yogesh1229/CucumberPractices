Feature: User Registration

  Scenario: User registration with different test data
    Given User is on registration page
    When User enter different test data
      | Yogesh | Kumar   | yogeshchugh05@gmail.com | 1234567891 | 2000 |
      | Ankit  | Chhabra | ankitchhabra@gmail.com  | 8596745869 | 3000 |
    Then User registration should be successful

  Scenario: User registration with different test data with columns
    Given User is on registration page
    When User enter different test data with columns
      | firstName | lastname | email                   | phoneNumber | salary |
      | Yogesh    | Kumar    | yogeshchugh05@gmail.com |  1234567891 |   2000 |
      | Ankit     | Chhabra  | ankitchhabra@gmail.com  |  8596745869 |   3000 |
    Then User registration should be successful
