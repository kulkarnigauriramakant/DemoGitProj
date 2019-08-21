package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase
{
	
	@FindBy(id="email")
	WebElement user;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-block btn-flat']")
	WebElement btn;
	
	public HomePage() throws IOException
	{
		super();
		PageFactory.initElements(driver,this);
	}
	public String validateTitle()
	{
		return driver.getTitle();
		
	}
	public DashBoard LoginData(String us,String pa) throws IOException
	{
		user.sendKeys(us);
		pass.sendKeys(pa);
		btn.click();
		return new DashBoard();
	}
}
