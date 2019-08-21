package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class DashBoard extends TestBase
{

	@FindBy(linkText="Users")
	WebElement user;
	
	public DashBoard() throws IOException 
	{
		super();
		PageFactory.initElements(driver,this);
	}
	
	public String getDashTitle()
	{
		return driver.getTitle();
	}
	
	public UserPage clickOnUser() throws IOException
	{
		user.click();
		return new UserPage();
	}
}
