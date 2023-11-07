package com.Tabbusree.TechnicalAssessment3;

import org.openqa.selenium.support.PageFactory;

public class LoginHomePageActions {
	LoginHomePageLocators loginHomePageLocators = null;
	
	public  LoginHomePageActions() {  
		this.loginHomePageLocators = new LoginHomePageLocators();
		PageFactory.initElements(HelperClass.getDriver(),loginHomePageLocators);
	}
	public String getVerifyText() {
		return loginHomePageLocators.assertContains.getText();
	}
	public String VerifyErrorMessage() {
		return loginHomePageLocators.VerifyErrorMessage.getText();
	}
	public String assercheck() {
		return loginHomePageLocators.WishlistText.getText();
	}

}
