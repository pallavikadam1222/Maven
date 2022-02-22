package com.POM.Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	//private WebDriver driver;
	
	@FindBy (xpath= "//a[@class='logout']")
	private WebElement logout;
	
	public  LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnLogoutButton()
	{
		logout.click();
	}
}
