package com.TEST.Classes;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.POM.Classes.LoginPage;
import com.POM.Classes.LogoutPage;
import com.POM.Classes.UserList;
import com.POM.Classes.actiTimeHeader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	
	WebDriver driver;
	
	@BeforeMethod
	public void beformethod() {
		
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.get("http://localhost/login.do");
		LoginPage loginPage = new LoginPage(this.driver);
		loginPage.sendUsername();
		loginPage.sendpassword();
		loginPage.clickOnLogin();
	}
	
	@Test
	public void test1() throws InterruptedException {
		actiTimeHeader actiHeader =new actiTimeHeader(driver);
		actiHeader.clickOnUserlist();
		UserList userList=new UserList(driver);
		userList.clickOnUserTab();
		userList.clickOnclosedTab();
		
	}
	@AfterMethod
	public void aftermethod() {
		LogoutPage logoutPage = new LogoutPage(driver);
		logoutPage.ClickOnLogoutButton();
	}
	

}
