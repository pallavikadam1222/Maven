package com.POM.Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserList {

	@FindBy (xpath="//span[text()='User']")
	private WebElement user;
	@FindBy (xpath="(//img[@title='Close'])[2]")
	private WebElement close;
	
	public UserList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnUserTab()
	{
		user.click();	
	}
	public void clickOnclosedTab() throws InterruptedException
	{
		Thread.sleep(3000);
	 close.click();
	}
}
