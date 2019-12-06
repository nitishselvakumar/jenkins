package com.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.libglobal.BaseClass;
import org.openqa.selenium.WebDriver;

import com.pojo.LoginPOJOClass;

import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass {

	LoginPOJOClass l;

	@Given("User on the login page")
	public void user_on_the_login_page() {

	}

	@When("User enters username  and password")
	public void user_enters_username_and_password() {
		l = new LoginPOJOClass();

		type(l.getUsername(), "nitish11198@gmail.com");
		type(l.getPassword(), "345678");

	}

	@Then("User clicks login button")

	public void user_clicks_login_button() {
		l = new LoginPOJOClass();

		btnClick(l.getLogin());
	}

	@When("User enters fname and lname")
	public void user_enters_fname_and_lname() {
		l = new LoginPOJOClass();

		type(l.getFname(), "nitish");
		type(l.getLname(), "kumar");

	}

	@Then("User click signup button")
	public void user_click_signup_button() {
		l = new LoginPOJOClass();

		btnClick(l.getSignup());
	}

	@When("User enters username  and password for {int}d")
	public void user_enters_username_and_password_for_d(Integer int1, io.cucumber.datatable.DataTable d) {
		List<String> li = d.asList();
		l = new LoginPOJOClass();

		type(l.getUsername(), li.get(0));
		type(l.getPassword(), li.get(1));
	}

	@When("User enters username  and password for {int}d without header")
	public void user_enters_username_and_password_for_d_without_header(Integer int1,
			io.cucumber.datatable.DataTable d) {
		List<List<String>> list = d.asLists();
		l = new LoginPOJOClass();

		type(l.getUsername(), list.get(0).get(0));
		type(l.getPassword(), list.get(0).get(1));

	}

	@When("User enters the username and password")
	public void user_enters_the_username_and_password() throws IOException {
		l = new LoginPOJOClass();
		type(l.getUsername(),getDataFromExcel(1, 1));
		type(l.getPassword(), getDataFromExcel(1, 1));

	}

	@Then("User clicks the login button")
	public void user_clicks_the_login_button() {
		btnClick(l.getLogin());
	}

}
