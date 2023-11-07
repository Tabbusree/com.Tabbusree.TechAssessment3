package com.Tabbusree.TechnicalAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginHomePageLocators {
	@FindBy(xpath="//a[contains(text(),'tomcruize@gmail.com')]")
	public WebElement assertContains;
	
	@FindBy(xpath="//span[text()=\"Login was unsuccessful. Please correct the errors and try again.\"]")
	public WebElement VerifyErrorMessage;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div") 
	public WebElement WishlistText;
	
	

}
