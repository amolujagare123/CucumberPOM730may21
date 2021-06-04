# new feature
# Tags: optional

Feature: A description

  Background: open the browser
    Given I open browser

  @bgDemo
  Scenario: check user registraion
    Given I am on the user registration page
    When I enter details
    And click on subit button
    Then the user should be added
  @bgDemo @forgot
  Scenario: check Forgot password
    Given I am on the user forgot password page
    When I enter email
    And click on reset button
    Then password should be reset
  @bgDemo
  Scenario: check openInfo link
    Given I am on the home page
    When I click on the link open info
    Then I should be redirected to OpenInfo page