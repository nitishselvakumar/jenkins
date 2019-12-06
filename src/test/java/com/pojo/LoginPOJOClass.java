package com.pojo;
import org.libglobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJOClass extends BaseClass {

	public LoginPOJOClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getSignup() {
		return signup;
	}

	@FindBy(id = "pass")
	private WebElement password;
	
	@FindBy(id = "loginbutton")
	private WebElement login;
	
	@FindBy(id = "u_0_")
	private WebElement fname;
	
	@FindBy(id = "u_0_o")
	private WebElement lname;
	
	@FindBy(id = "u_0_13")
	private WebElement signup;

}
