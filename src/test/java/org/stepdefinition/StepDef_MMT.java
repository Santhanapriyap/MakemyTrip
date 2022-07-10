package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.baseClass.BaseClass;
import org.pojo.HomePage_MMT;
import org.pojo.Login_MMT;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_MMT extends BaseClass
{
	
	@Given("User should be in Make My Trip Home page")
	public void user_should_be_in_Make_My_Trip_Home_page() 
	{
	toLaunchBrowser();
	toLoadURL("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Variants|Brand-Variants-Exact|RSA|Regular|V2|274470846615&s_kwcid=AL!1631!3!274470846615!e!!g!!make%20myn%20trip&ef_id=CjwKCAjwwo-WBhAMEiwAV4dybYJCdu5dPGWBSFfd3hb-o5OD37Uh26YI7bZnqZSt714mEzgadtvQrRoCG6QQAvD_BwE:G:s&gclid=CjwKCAjwwo-WBhAMEiwAV4dybYJCdu5dPGWBSFfd3hb-o5OD37Uh26YI7bZnqZSt714mEzgadtvQrRoCG6QQAvD_BwE");
	toMaximizeBrowser();
	}

	@When("User should click on Login or Create button")
	public void user_should_click_on_Login_or_Create_button() throws InterruptedException 
	{
	Login_MMT l=new Login_MMT();
	toClickButton(l.getLoginBtn());
	Thread.sleep(3000);
	}

	@When("User should enter valid mobile no")
	public void user_should_enter_valid_mobile_no() throws InterruptedException 
	{
	Login_MMT l=new Login_MMT();
	toFillTextBox(l.getUserName(), "9677408056");
	Thread.sleep(5000);
	}

	@When("User should click on continue button")
	public void user_should_click_on_continue_button() throws InterruptedException 
	{
	Login_MMT l=new Login_MMT();
	toClickButton(l.getContinueBtn());
	Thread.sleep(5000);
	}

	@Then("User should be in OTP page")
	public void user_should_be_in_OTP_page() 
	{
	System.out.println("User should be in OTP page");   
	}
	
	@When("User should provide on From Location")
	public void user_should_provide_on_From_Location() throws InterruptedException 
	{
		HomePage_MMT hp=new HomePage_MMT();
		toClickButton(hp.getFromCity());
		Thread.sleep(5000);
		toClickButton(hp.getFromCityMumbai());
		Thread.sleep(5000);
	}

	@When("User should provide To Location")
	public void user_should_provide_To_Location() throws AWTException, InterruptedException 
	{
		HomePage_MMT hp=new HomePage_MMT();
		toClickButton(hp.getToCity());
		Thread.sleep(3000);
		toFillTextBox(hp.getTotextCity(), "Madurai");
		
		/*Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		//Actions ac=new Actions(driver);
		//ac.moveToElement(hp.getToCityDelhi()).click().perform();
		//toClickButton(hp.getToCityDelhi());*/
	}

	@When("User should provide Date")
	public void user_should_provide_Date() 
	{
		HomePage_MMT hp=new HomePage_MMT();
		toClickButton(hp.getCalendar());
		toClickButton(hp.getDate());
	}

	@When("User should click on Search button")
	public void user_should_click_on_Search_button() 
	{
		HomePage_MMT hp=new HomePage_MMT();
		toClickButton(hp.getSearchBtn());
	}

	@Then("User should able to navigate to Flight availablity page")
	public void user_should_able_to_navigate_to_Flight_availablity_page() 
	{
	    System.out.println("Flight availability page");
	}
	
	

}
