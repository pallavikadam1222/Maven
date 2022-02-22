package com.POM.Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeHeader {

	@FindBy(xpath="(//img[@width='84'])[4]")
	private WebElement userList;
	
	@FindBy (xpath ="(//img[contains(@src,'/img/default/pixel.gif?hash=274618146')])[7]")
	private WebElement report;
	
	@FindBy (xpath ="(//img[@src='/img/default/pixel.gif?hash=274618146'])[5]")
	private WebElement tasks;
	
	
	public actiTimeHeader(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnUserlist(){
		userList.click();	
	}
	public void clickOnReports(){
		report.click();	
	}
	public void clickOnTasks(){
		tasks.click();	
	}
	
}
