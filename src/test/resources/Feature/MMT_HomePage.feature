Feature: Validate Login page functionality of Make My Trip Application

@sanity @regression
Scenario: Validate search flights functionality
Given User should be in Make My Trip Home page
When User should provide on From Location
And User should provide To Location
And User should provide Date
And User should click on Search button
Then User should able to navigate to Flight availablity page