package org.stepdefinition;

import org.base.BaseClass;
import org.base.FacebookPOJO;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClass {
	FacebookPOJO f;

	@Given("User has to launch thebrowser and maximize the window.")
	public void user_has_to_launch_thebrowser_and_maximize_the_window() {
		launchBrowser();
	}

	@When("User has to hit the facebook url")
	public void user_has_to_hit_the_facebook_url() {
		Url("https://en-gb.facebook.com/");
	}

	@When("User has pass the datas {string} in email field.")
	public void user_has_pass_the_datas_in_email_field(String em) {
		f = new FacebookPOJO();
		Passtxt(em, f.getEmail());
	}

	@When("User as pass the datas {string} in password field.")
	public void user_as_pass_the_datas_in_password_field(String pass) {
		f = new FacebookPOJO();
		Passtxt(pass, f.getPassword());
	}

	@When("User has to Click the Login Button.")
	public void user_has_to_Click_the_Login_Button() {
		f = new FacebookPOJO();
		Click(f.getLogin());
	}

	@Then("User has to Close the Browser.")
	public void user_has_to_Close_the_Browser() {
		close();
	}

}
