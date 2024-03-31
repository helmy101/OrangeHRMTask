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
    When From User Management Page, Search for Created User
    Then Verify that the user is displayed
    When From User Management Page, Delete created user
    Then Verify that the delete pop is Displayed
    When From Delete pop up, Click on Yes Button
    Then Verify that the number of Users decreased by one

