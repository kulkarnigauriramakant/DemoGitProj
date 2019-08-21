package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class UserPage extends TestBase
{

	public UserPage() throws IOException 
	{
		super();
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[@class='btn btn-block btn-primary btn-sm pull-right']")
	WebElement ad;
	
	
	@FindBy(id="username")
	WebElement user;
	
	@FindBy(id="mobile")
	WebElement mob;
	
	@FindBy(id="email")
	WebElement em;
	
	@FindBy(name="gender")
	WebElement ma;
	
	@FindBy(id="password")
	WebElement pass;
	
	public void clickadUser()
	{
		ad.click();
	}
	
	public String getTitleUser()
	{
		return driver.getTitle();
	}
	
	public void addUserData(String us,String mb,String eml,String ge,String h,String pa)
	{
		user.sendKeys(us);
		mob.sendKeys(mb);
		em.sendKeys(eml);
		ma.sendKeys(ge);
		ma.click();
		
		
		WebElement se=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select s=new Select(se);
		s.selectByVisibleText(h);		
		pass.sendKeys(pa);
		
		WebElement btn=driver.findElement(By.id("submit"));
		btn.click();
		
		Alert a=driver.switchTo().alert();
		a.accept();
	}

}
