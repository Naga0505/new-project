package org.Cucumberfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberEmailfile extends BaseClass {
	
	GmailLoginPojo gl;
	
	@Given("User has to Launch the chrome Browser and maximize window")
	public void user_has_to_Launch_the_chrome_Browser_and_maximize_window() {
	    lanuchBrowser();
	    windowMaximize();
	}

	@When("User has to hit the Email url")
	public void user_has_to_hit_the_Email_url() {
	   launchUrl("https://mail.google.com/");
	}

	@When("User has to pass the data {string} in email or phone number field")
	public void user_has_to_pass_the_data_in_email_or_phone_number_field(String ep) {
			gl = new GmailLoginPojo();
			passText(ep, gl.getEmailorPhoneNo());
	}

	@When("User has to click the Next button")
	public void user_has_to_click_the_Next_button() {
		gl = new GmailLoginPojo();
		clickBtn(gl.getNextButton());
	}

	@When("User has to pass the data {string} in password filed")
	public void user_has_to_pass_the_data_in_password_filed(String pw) throws InterruptedException {
		Thread.sleep(3000);
		gl = new GmailLoginPojo();
		passText(pw, gl.getPassword());
	}

	@When("USer has to Click login button")
	public void user_has_to_Click_login_button() {
	    System.out.println("welcome");
	}

	@Then("User has to close the Chrome browser")
	public void user_has_to_close_the_Chrome_browser() {
	    //closeEntireBrowser();
	}


}
