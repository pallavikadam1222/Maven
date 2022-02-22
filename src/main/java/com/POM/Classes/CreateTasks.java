package com.POM.Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTasks {
	private WebDriver driver;
	@FindBy(xpath="//span[@unselectable='on']")
	private WebElement createTasks;
	
	@FindBy(xpath="(//em[@unselectable='on'])[1]")
	private WebElement listBox;
	
	@FindBy(xpath="//li[@id='ext-gen171']")
	private WebElement newCust;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name']")
	private WebElement projectName;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancel;
	
	public CreateTasks(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void clickOnCreateTasksTab()
	{
		createTasks.click();
	}
	
	public void clickOnListBox() {
		listBox.click();
	}
	public void selectnewCustName() {
		Actions a = new Actions(driver);
		a.moveToElement(newCust).click().build().perform();
		//newCust.click();	
	}
	
	public void sendprojectName() {
		projectName.sendKeys("java");
	}
	
	
	public void clickonCancelTab()
	{
		cancel.click();
	}
	
}
