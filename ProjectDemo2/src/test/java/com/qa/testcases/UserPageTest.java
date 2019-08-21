package com.qa.testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DashBoard;
import com.qa.pages.HomePage;
import com.qa.pages.UserPage;
import com.qa.util.TestUtil;

import junit.framework.Assert;

public class UserPageTest extends TestBase
{
	HomePage hp;
	DashBoard dp;
	UserPage up;
	
	public String sheetName="Sheet1";
	
	public UserPageTest() throws IOException 
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		initialization();
		hp=new HomePage();
		dp=hp.LoginData(prop.getProperty("username"),prop.getProperty("password"));
		up=dp.clickOnUser();
	}
	
	@Test(priority=1)
	public void chkTitleUser() throws IOException
	{
		String ss=up.getTitleUser();
		Assert.assertEquals(ss,"AdminLTE 2 | User");
	}
	
	@Test(priority=2)
	public void AddUserBtn()
	{
		up.clickadUser();
	}
	
	@DataProvider
	public Object[][] getUserData() throws InvalidFormatException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	@Test(priority=3,dataProvider="getUserData")
	public void AddValues(String u,String m,String e,String g,String s,String p)
	{
		up.clickadUser();
		//up.addUserData("Gauri", "939292","kulkarni.gauiri@gmail.com","Female","HP", "as12");
		up.addUserData(u, m, e, g, s, p);
	}
	//@AfterMethod
	public void clo()
	{
		//driver.quit();
	}
}
