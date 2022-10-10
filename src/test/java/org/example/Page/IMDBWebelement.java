package org.example.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IMDBWebelement
{
	static WebElement element;
	public  static WebElement CountryName(WebDriver driver)
	{
				element=driver.findElement(By.linkText("India"));
	return element;
	}
	public  static WebElement RelaseDateInfo(WebDriver driver) 
	{
    
		element= driver.findElement(By.partialLinkText("December 17, 2021 (Uni"));
	return element ;
	}
 
}
