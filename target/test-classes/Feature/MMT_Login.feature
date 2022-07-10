Feature: Validate Login page functionality of Make My Trip Application

Background:
Given User should be in Make My Trip Home page

@smoke
Scenario: Validate Login functionality with valid mobilie No in Make My Trip Application
 
When User should click on Login or Create button
And User should enter valid mobile no
And User should click on continue button
Then User should be in OTP page

@sanity @regression
Scenario: Validate search flights functionality
Given User should be in Make My Trip Home page
When User should provide on From Location
And User should provide To Location
And User should provide Date
And User should click on Search button
Then User should able to navigate to Flight availablity page