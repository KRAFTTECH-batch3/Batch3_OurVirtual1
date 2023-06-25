

Feature: Login

 Scenario: Login
    Given The user is on the login page
    When The user should be able to login with valid "kamer@gmail.com" and "12345_Ka"
    Then The user should be able to see logout button
    When The user clicks on your story to go to the homepage