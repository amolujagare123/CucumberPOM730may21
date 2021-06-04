# new feature
# Tags: optional

Feature: Login another parameterization

  @loginParam2
  Scenario Outline: to test the functionality of login button for valid inputs
    Given login page should be opened
    When I type username as <username> and password as <password>
    And click on login button
    Then I should be redirected to homepage

    Examples:

    | username | password |
    | admin    | admin    |
    | amol     | amol     |
    | sonali   | sonali   |
    | Askhay   | Akshay   |
    | Sunny    | Sunny    |
    | praful   | praful   |


    @userReg
    Scenario: to test the functionality of submit button for valid input
      Given I am on the user registration page
      When I enter below data
      | amol | 898989 | amol@gmail.com | pune |
      Then user should be added
