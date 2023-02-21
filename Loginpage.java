package org.Arul;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver driver;
	
	
	
	@FindBy(xpath = "//input[@id=\"username\"]")
	private WebElement  user;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath = "//input[@class='login_button']")
	private WebElement login;
	
	
	public Loginpage(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

}
