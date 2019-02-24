package com.kishore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qshore.HomePage;
import com.qshore.Methods;

public class Module1 {
	
	// TestCase Name : Mod1_TC01
	// Test Script Name : Mod1_TC01
	// Module Name : Module1
	// Project Name : BOFA
	// Author      : Kishore Kumar
	// Date Created: 0223
	// Reviewed By : Abcdef
	//*************************************************************************************
		public void Mod1_TC01() throws Exception{			
		// Importing Methods Class
		Methods m=new Methods();		
		// Import ExcelCon Method
		m.excelCon("C:\\Users\\Kishore Kumar\\Desktop\\Hybrid8\\Test Data\\Kishore\\Module1\\TC01.xls", "Sheet1");
		// Launching application by calling method
		m.launchApp(m.s.getCell(0, 0).getContents(), "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid8\\Test Results\\Kishore\\Module1\\TC01\\launchapp.png");
		// Verifying TitleLength
		m.titlelength(30);
		// Verifying Title Contains India
		m.titleContains("India", true);		
		// Importing Page Objects using Page factory 
		HomePage home=PageFactory.initElements(m.driver, HomePage.class);
		// Verifying profilefor element present or not
		m.elementPresent(home.HomePage_ProfileFor, true, "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid8\\Test Results\\Kishore\\Module1\\TC01\\ProfileForAvailable.png");
		// Verifying Name enabled or not
		m.elementEnabled(home.HomePage_Name, true, "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid8\\Test Results\\Kishore\\Module1\\TC01\\nameenabled.png");
		// Selecting Profile For Value based on Index
		Select s=new Select(home.HomePage_ProfileFor);
		s.selectByIndex(3);
		// Counting Number Of Values in Dropdown
		List<WebElement> items=home.HomePage_ProfileFor.findElements(By.tagName("option"));
		if(items.size()==20)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		if(items.get(1).getText()=="Son")
			System.out.println("Pass");
		else
			System.out.println("Fail");
		// Entering Name
		home.HomePage_Name.sendKeys(m.s.getCell(0, 1).getContents());
		// Counting Number Of Links
		m.elementsCount("a", 30);
		// Clicking On Telugu Link
		home.HomePage_TeluguLink.click();
		// Applying Webdriverwait to navigate telugumatrimony page
		WebDriverWait ww=new WebDriverWait(m.driver, 60);
		// Waiting for page load
		ww.until(ExpectedConditions.titleContains("Telugu"));
		// Verifying Title contains Telugu or not
		m.titleContains("Telugu", true);
		m.closeApp();		
	}
	//******************************************************************************
       public void Mod1_TC02() throws Exception {
    	// Importing Methods Class
   		Methods m=new Methods();		
   		// Import ExcelCon Method
   		m.excelCon("C:\\Users\\Kishore Kumar\\Desktop\\Hybrid8\\Test Data\\Kishore\\Module1\\TC01.xls", "Sheet1");
   		// Launching application by calling method
   		m.launchApp(m.s.getCell(0, 0).getContents(), "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid8\\Test Results\\Kishore\\Module1\\TC01\\launchapp.png");
   		// Verifying TitleLength
   		m.titlelength(30);
   		// Verifying Title Contains India
   		m.titleContains("India", true);		
   		// Importing Page Objects using Page factory 
   		HomePage home=PageFactory.initElements(m.driver, HomePage.class);
   		// Verifying profilefor element present or not
   		m.elementPresent(home.HomePage_ProfileFor, true, "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid8\\Test Results\\Kishore\\Module1\\TC01\\ProfileForAvailable.png");
   		// Verifying Name enabled or not
   		m.elementEnabled(home.HomePage_Name, true, "C:\\Users\\Kishore Kumar\\Desktop\\Hybrid8\\Test Results\\Kishore\\Module1\\TC01\\nameenabled.png");
   		// Selecting Profile For Value based on Index
   		Select s=new Select(home.HomePage_ProfileFor);
   		s.selectByIndex(3);
   		// Counting Number Of Values in Dropdown
   		List<WebElement> items=home.HomePage_ProfileFor.findElements(By.tagName("option"));
   		if(items.size()==20)
   			System.out.println("Pass");
   		else
   			System.out.println("Fail");
   		if(items.get(1).getText()=="Son")
   			System.out.println("Pass");
   		else
   			System.out.println("Fail");
   		// Entering Name
   		home.HomePage_Name.sendKeys(m.s.getCell(0, 1).getContents());
   		// Counting Number Of Links
   		m.elementsCount("a", 30);
   		// Clicking On Telugu Link
   		home.HomePage_TeluguLink.click();
   		// Applying Webdriverwait to navigate telugumatrimony page
   		WebDriverWait ww=new WebDriverWait(m.driver, 60);
   		// Waiting for page load
   		ww.until(ExpectedConditions.titleContains("Telugu"));
   		// Verifying Title contains Telugu or not
   		m.titleContains("Telugu", true);
   		m.closeApp();		
       }
}
