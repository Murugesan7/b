package org.stepdefinition;

import org.base.BaseClass;
import org.base.FacebookPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveandNegativeofFb extends BaseClass {
	FacebookPOJO f;
	
	@Given("To Launch the Chrome Browser and Maximize the Window.")
	public void to_Launch_the_Chrome_Browser_and_Maximize_the_Window() {
	    launchBrowser();
	}

	@When("To Launch the url of the Facebook Application.")
	public void to_Launch_the_url_of_the_Facebook_Application() {
	   Url("https://en-gb.facebook.com/");
	}

	@When("To Pass the Valid Username in Email Field.")
	public void to_Pass_the_Valid_Username_in_Email_Field() {
	   f = new FacebookPOJO();
	   Passtxt("naanjil.murugesan@gmail.com", f.getEmail());
	}

	@When("To Pass the Invalid Password in Password Field.")
	public void to_Pass_the_Invalid_Password_in_Password_Field() {
	    f = new FacebookPOJO();
	    Passtxt("abcdef", f.getPassword());
	}

	@When("To Click the Login Button.")
	public void to_Click_the_Login_Button() {
	   f = new FacebookPOJO();
	   Click(f.getLogin());
	}

	@When("To Check Whether Navigate to homepage or not.")
	public void to_Check_Whether_Navigate_to_homepage_or_not() {
	System.out.println("Please Check the Login Credintials");
	}

	@Then("To Close the Browser.")
	public void to_Close_the_Browser() {
	   close();
	}

}
