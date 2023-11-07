package com.Tabbusree.TechnicalAssessment3;

import org.openqa.selenium.support.PageFactory;

public class HomePageActions {
	HomePageLocators homePageLocators = null;
	
	public  HomePageActions() {  
		this.homePageLocators = new HomePageLocators();
		PageFactory.initElements(HelperClass.getDriver(),homePageLocators);
	}
	public String getVerifyText() {
		return homePageLocators.assertText.getText();
	}

}
