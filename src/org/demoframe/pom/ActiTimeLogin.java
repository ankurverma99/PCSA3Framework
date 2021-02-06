package org.demoframe.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLogin {
	@FindBy(id = "username")
	private WebElement username;

	@FindBy(name = "pwd")
	private WebElement password;

	@FindBy(xpath = "//a[@id='loginButton']")
	private WebElement login;

	@FindBy(linkText = "Forgot your password?")
	private WebElement forgotpassword;

	public ActiTimeLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void sendUsername(String user) {
		username.sendKeys(user);
	}

	public void sendPassword(String pass) {
		password.sendKeys(pass);
	}

	public void clicklogin() {
		login.click();
	}

	public void forgetpassClick() {
		forgotpassword.click();
	}

}
