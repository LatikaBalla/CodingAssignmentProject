package org.example.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import org.example.Page.MovieNameSearchIMDB;
import org.example.Page.WikiWebelement;
import org.example.Utility.Hooks;

public class WikiInfo {
	
	
	WebDriver driver;
	@Test
	public void MovieDetails()
	{
		driver=Hooks.setup();
		 //Doing Driver connectivity and Launching url
		 SoftAssert softassert=new SoftAssert();
		 Reporter.log("This Wikipedia  Pusha Movie");
		String MovieName;
		
		//appending Movie name in url  
		MovieName=MovieNameSearchIMDB.SearchMovieName();
		driver.get("https://en.wikipedia.org/wiki/"+MovieName);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Reporter.log("URL Launched");
		
		//validating web elements Country and Released Date is correct or not
		WebElement country =WikiWebelement.CountryName(driver);
	    WebElement ReleaseDate= WikiWebelement.RelaseDateInfo(driver);
	    
	    
	    //Country validation fail
	    String ActualCountry=country.getText();
		String Expectedcountry="India1";
		softassert.assertEquals(ActualCountry,Expectedcountry,"Expected value doesnt match");
		Reporter.log("Assertion Country successfully");
		
		//Country validation pass
		String ActualReleaseDate=ReleaseDate.getText();
		String ExpectedReleaseDate="17 December 2021";
		softassert.assertEquals(ActualReleaseDate,ExpectedReleaseDate,"Expected value doesnt match");
		Reporter.log("Assertion ReleaseDate successfully");
	    	
	   softassert.assertAll(); 
	    System.out.println(country.getText());
	    System.out.println(ReleaseDate.getText());

		
	   //driver.close();
	    Hooks.clear();
		}

	}


