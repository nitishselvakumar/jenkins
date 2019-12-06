package com.stepdefinition;

import java.io.IOException;

import org.libglobal.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	@Before
	public void beforeExecution() {

		launchBrowser();
		loadUrl("https://www.facebook.com/");
		maximizeWindow();

	}

	@After
	public void afterExecution() throws IOException {
		
		quitBrowser();

	}
}
