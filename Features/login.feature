Feature: all login scenarios


  Scenario: to test the functionality og login button for valid inputs
    Given login page should be opened
    When I enter valid username and valid password
    And click on login button
    Then I should be redirected to homepage