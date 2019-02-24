package com.qshore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//************************************************************************************
     // Page Name        : HomePage
     // Application Name : www.bharatmatrimony.com
     // Author           : Kishore Kumar
     // Reviewed By      : Abcd
//*************************************************************************************
public class HomePage {	
	public @FindBy(xpath="//*[@id='REGISTERED_BY']") WebElement HomePage_ProfileFor;
	public @FindBy(xpath="//*[@id='NAME']") WebElement HomePage_Name;
	public @FindBy(xpath="//*[@id='close']/center/div[2]/div[3]/div/div/ul/li[11]/a") WebElement HomePage_TeluguLink;
	public @FindBy(xpath="//*[@id='close']/center/div[2]/div[3]/div/div/ul/li[10]/a") WebElement HomePage_TamilLink;
	

}
