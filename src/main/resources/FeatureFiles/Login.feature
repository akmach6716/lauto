Feature: As a registered user, i want to login to my account , so that i can access the application
  @smoke
  Scenario: User can login with valid credentials
    Given I am on the home page and able to access application
    When I enter a valid username as "admin@email.com"
    And password as "admin@123"
    And user clicks on login button
    Then user should be able to access the dashboard
  @DataDriver
  Scenario Outline:  User can login with  multiple  credentials
    Given user is on the home page and able to access application
    When Try to  enter a valid username as <username>>
    And enter the  password as <password>
    And user clicks on login button after entering credentials
    Then user should be able to access the dashboard
  Examples:
    | username         | password     |
    |test 123 | testpass              |