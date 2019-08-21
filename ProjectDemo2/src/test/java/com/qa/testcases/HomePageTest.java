package com.qa.testcases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DashBoard;
import com.qa.pages.HomePage;
import com.qa.pages.UserPage;

public class HomePageTest extends TestBase
{
	HomePage hp;
	DashBoard dp;
	
	Logger log=Logger.getLogger(HomePage.class);
	
	public HomePageTest() throws IOException
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
		hp=new HomePage();
	}
	
	@Test(priority=1)
	public void HomePageTitle()
	{
		String str=hp.validateTitle();
		Assert.assertEquals("AdminLTE 2 | Log in",str);
		log.info("In Home Page");
	}
	@Test(priority=2)
	public void LoginChk() throws IOException
	{
		dp=hp.LoginData(prop.getProperty("username"),prop.getProperty("password"));
	}
	@AfterMethod
	public void clo()
	{
		driver.quit();
	}
}
