Feature: Hooks Concept in Cucumber

Scenario: Add New user
Given User is on Register Page
When User enters details
Then User added


Scenario: Edit New User
Given User is on Edit Page
When User enters the new details
Then User is edited details

Scenario: Delete the User
Given User is on Delete page
When user deletes the page
Then user is deleted