package org.example.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


import org.example.Page.IMDBWebelement;

import org.example.Page.MovieNameSearchIMDB;
import org.example.Utility.Hooks;

public class IMDBInfo {
		
	 WebDriver driver;
	
		@Test
		public void MovieDetails() throws InterruptedException
		{
			driver=Hooks.setup();
			String Moviename;
		  //Doing Driver connectivity and Launching url
			Reporter.log("This IMDB Movie ");
			driver.get("https://www.imdb.com/");
			Reporter.log("URL Launched\n");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			
			//Searching Movie name and Clicking on Movie
		    Moviename=MovieNameSearchIMDB.SearchMovieName();
			driver.findElement(By.xpath("//input[@id='suggestion-search']")).sendKeys(Moviename);
			driver.findElement(By.id("suggestion-search-button")).click();
			driver.findElement(By.xpath("//a[contains(text(),'"+Moviename+"')]")).click();
		   System.out.println("clicked");
					
			//validating web elements Country and Released Date is correct or not
			WebElement country= IMDBWebelement.CountryName(driver);
		    WebElement ReleaseDate=IMDBWebelement.RelaseDateInfo(driver);
		    
		    //Country validation pass
		    String ActualCountry=country.getText();
			String Expectedcountry="India";
			Assert.assertEquals(ActualCountry,Expectedcountry,"Expected value doesnt match");
			Reporter.log("Assertion Country successfully\n");
			
			//ReleasedDate validation pass
			String ActualReleaseDate=ReleaseDate.getText();
			String ExpectedReleaseDate="December 17, 2021 (United States)";
			Assert.assertEquals(ActualReleaseDate,ExpectedReleaseDate,"Expected value doesnt match");
			Reporter.log("Assertion ReleaseDate successfully\n");

			
		    System.out.println(country.getText());
		    System.out.println(ReleaseDate.getText());
		   // driver.close();
		    Hooks.clear();
		}
		
}
