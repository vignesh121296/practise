Feature: Verifying facebook login details

Scenario: verify facebook login details
Given User is on the facebook page
When User should enter "username" and "password" 
And User should click login button
Then User should verify success message

