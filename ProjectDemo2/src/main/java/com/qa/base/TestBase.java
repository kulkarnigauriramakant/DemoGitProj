package com.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.util.MyListener;

public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver event;
	
	public TestBase() throws IOException
	{
		prop=new Properties();
		FileInputStream fin=new FileInputStream("C:\\Gauri\\ProjectDemo2\\src\\main\\java\\com\\qa\\config\\Info.properties");
		prop.load(fin);
	}
	public static void initialization() throws IOException
	{
		String ur_s=prop.getProperty("url");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver=new ChromeDriver();
		
		event=new EventFiringWebDriver(driver);
		MyListener my=new MyListener();
		event.register(my);
		driver=event;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(ur_s);
	}
	
	
}
