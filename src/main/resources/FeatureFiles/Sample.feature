Feature: Testing the  login page
  scenario
    Given I am on the login page
    When I enter a valid username and password
    Then I should be redirected to the home page
    And I should see a welcome message
    When I click on the logout button
    Then I should be redirected to the login page
    And I should see a logout confirmation message
    When I enter an invalid username and password
    Then I should see an error message