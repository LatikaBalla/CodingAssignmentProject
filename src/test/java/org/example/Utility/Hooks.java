package org.example.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Hooks 
{
public static	WebDriver driver;
	//@BeforeMethod
   public static  WebDriver setup()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\lib\\chromedriver.exe");

	driver=new ChromeDriver();
	System.out.println("driver info"+driver);
	return driver;
	}

		//@AfterMethod
public static void clear()
{driver.close();
	driver.quit();
}


}
