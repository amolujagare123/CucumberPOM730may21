# new feature
# Tags: optional

Feature: Another login scenarios


  @login1
  Scenario: to test the functionality of login button for valid inputs
    Given login page should be opened
    When I enter username as "admin" and password as "admin"
    And click on login button
    Then I should be redirected to homepage

  @login1
  Scenario: to test the functionality of login button for invalid inputs
    Given login page should be opened
    When I enter username as "aaaa" and password as "aaaa"
    And click on login button
    Then I should get error message

  @login1
  Scenario: to test the functionality of login button for blank inputs
    Given login page should be opened
    When I enter username as "" and password as ""
    And click on login button
    Then I should get another error message