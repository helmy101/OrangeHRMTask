@regression
Feature: New user registration Task
  Scenario: As a User I want to Submit Register new user and delete it
    Given user in Login page and user enter username
    And Enter Password
    And Click on login button.
    Then Verify that user is directed to Home Page
    When User click on admin Button from left side menu
    And Get the number of records
    Then From Admin page, Click on Add button
    And Fill all required fields
    And Click on Save button
    Then Verify that number of records increased by one
    And search for the recently created user
    Then the user should be displayed
    When delete the user from management page
    Then a delete message should be displayed
    And user click on yes button in the pop-up screen
    Then number of users should be decreased by one

