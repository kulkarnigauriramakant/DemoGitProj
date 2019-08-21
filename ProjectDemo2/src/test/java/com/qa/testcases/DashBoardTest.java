package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DashBoard;
import com.qa.pages.HomePage;
import com.qa.pages.UserPage;

import junit.framework.Assert;

public class DashBoardTest extends TestBase
{
	HomePage hp;
	DashBoard dp;
	UserPage up;
	
	public DashBoardTest() throws IOException
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
		hp=new HomePage();
		dp=hp.LoginData(prop.getProperty("username"),prop.getProperty("password"));
	
	}
	
	@Test(priority=1)
	public void verifyTitleDashTest()
	{
		String ss=dp.getDashTitle();
		Assert.assertEquals(ss, "AdminLTE 2 | Dashboard");
	}
	@Test(priority=2)
	public void clickiUs() throws IOException
	{
		up=dp.clickOnUser();
	}
	
	@AfterMethod
	public void clo()
	{
		driver.quit();
	}
}
