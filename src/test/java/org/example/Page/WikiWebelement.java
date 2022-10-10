package org.example.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikiWebelement 
{
	
	static WebElement element;
	public  static WebElement CountryName(WebDriver driver)
	{
		
		element=driver.findElement(By.xpath("//td[contains(text(),'India')]"));
	return element;
	}
	public  static WebElement RelaseDateInfo(WebDriver driver) 
	{
    
		element= driver.findElement(By.xpath("//body[1]/div[3]/div[3]/div[5]/div[1]/table[1]/tbody[1]/tr[12]/td[1]/div[1]/ul[1]/li[1]"));
	return element ;
	}
    
}
