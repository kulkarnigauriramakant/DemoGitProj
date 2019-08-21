package com.qa.util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.qa.base.TestBase;

public class MyListener extends TestBase implements WebDriverEventListener
{

	public MyListener() throws IOException
	{
		super();
	}

	public void afterAlertAccept(WebDriver arg0) 
	{
		System.out.println("afterAlertAccept");
	}

	public void afterAlertDismiss(WebDriver arg0) 
	{
		System.out.println("afterAlertDismiss");
	}
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) 
	{
		System.out.println("afterChangeValueOf");
	}

	public void afterClickOn(WebElement arg0, WebDriver arg1) 
	{
		System.out.println("afterClickOn");
	}

	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2)
	{
		System.out.println("afterFindBy");
	}

	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) 
	{
		System.out.println("afterGetScreenshotAs");
	}

	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2)
	{
		System.out.println("afterGetText");
	}

	public void afterNavigateBack(WebDriver arg0) 
	{
		System.out.println("afterNavigateBack");
	}

	public void afterNavigateForward(WebDriver arg0)
	{
		System.out.println("afterNavigateForward");
	}

	public void afterNavigateRefresh(WebDriver arg0) 
	{
		System.out.println("afterNavigateRefresh");
	}

	public void afterNavigateTo(String arg0, WebDriver arg1)
	{
		System.out.println("afterNavigateTo");
	}

	public void afterScript(String arg0, WebDriver arg1)
	{
		System.out.println("afterScript");
	}

	public void afterSwitchToWindow(String arg0, WebDriver arg1)
	{
		System.out.println("afterSwitchToWindow");
	}

	public void beforeAlertAccept(WebDriver arg0) 
	{
		System.out.println("beforeAlertAccept");
	}

	public void beforeAlertDismiss(WebDriver arg0) 
	{
		System.out.println("beforeAlertDismiss");
	}

	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2)
	{
		System.out.println("beforeChangeValueOf");
	}

	public void beforeClickOn(WebElement arg0, WebDriver arg1)
	{
		System.out.println("beforeClickOn");
	}

	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2)
	{
		System.out.println("beforeFindBy");
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) 
	{
		System.out.println("beforeGetScreenshotAs");
	}

	public void beforeGetText(WebElement arg0, WebDriver arg1)
	{
		System.out.println("beforeGetText");
	}

	public void beforeNavigateBack(WebDriver arg0) 
	{
		System.out.println("beforeNavigateBack");
	}

	public void beforeNavigateForward(WebDriver arg0) 
	{
		System.out.println("beforeNavigateForward");
	}
	public void beforeNavigateRefresh(WebDriver arg0)
	{
		System.out.println("beforeNavigateRefresh");
	}

	public void beforeNavigateTo(String arg0, WebDriver arg1)
	{
		System.out.println("beforeNavigateTo");
	}

	public void beforeScript(String arg0, WebDriver arg1) 
	{
		System.out.println("beforeScript");
	}

	public void beforeSwitchToWindow(String arg0, WebDriver arg1)
	{
		System.out.println("beforeSwitchToWindow");
	}

	public void onException(Throwable arg0, WebDriver arg1) 
	{
		System.out.println("onException");
		
		try
		{
			TestUtil.takeScreenShot();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}