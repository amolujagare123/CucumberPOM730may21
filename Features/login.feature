Feature: all login scenarios

  Background: before all the steps
    Given browser should be opened
# whatever you write in background it will execute before
# every senario of that particular feature file

  @validLogin  @login
  Scenario: to test the functionality of login button for valid inputs
    Given login page should be opened
    When I enter valid username and valid password
    And click on login button
    Then I should be redirected to homepage

  @invalidLogin @login
  Scenario: to test the functionality of login button for invalid inputs
    Given login page should be opened
    When I enter invalid username and valid password
    And click on login button
    Then I should get error message

  @invalidLogin @login
  Scenario: to test the functionality of login button for blank inputs
    Given login page should be opened
    When I dont enter username and password
    And click on login button
    Then I should get another error message