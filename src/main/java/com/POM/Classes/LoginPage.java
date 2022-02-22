package com.POM.Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement username;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	private WebElement password;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void sendUsername()
	{
		username.sendKeys("admin");	
	}
	public void sendpassword()
	{
		password.sendKeys("manager");	
	}
	public void clickOnLogin()
	{
		loginButton.click();
	}
	
	
	
}
