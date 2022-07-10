package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=
"C:\\Users\\lenovo\\eclipse-workspace\\MakeMyTrip_Cucumber\\src\\test\\resources\\Feature\\MMT_HomePage.feature", 
		glue="org.stepdefinition", 
		plugin= {"rerun:C:\\Users\\lenovo\\eclipse-workspace\\MakeMyTrip_Cucumber\\Rerun\\failed_HomePage.txt"})
public class TestRunner_MMT 
{

}
