package com.Tabbusree.TechnicalAssessment3;

import org.openqa.selenium.support.PageFactory;

public class RegisterPageActions {
	RegisterPageLocators registerPageLocators = null;
	String strFirstName, strLastName, strEmail, strPassWord, strConfirmPassword;
	
	public  RegisterPageActions() {  
		this.registerPageLocators = new RegisterPageLocators();
		PageFactory.initElements(HelperClass.getDriver(),registerPageLocators);
	}
	public void clickRegisterForm() {
		registerPageLocators.register.click();
	}
	public void clickGender() {
		registerPageLocators.genderFemale.click();
	}
	public void setFirstName(String strFirstName) {
		registerPageLocators.firstName.sendKeys(strFirstName);
	}
	
	public void setLastName(String strLastName) {
		registerPageLocators.lastName.sendKeys(strLastName);
	}
	public void setEmail(String strEmail) {
		registerPageLocators.eMail.sendKeys(strEmail);
	}
	public void setPassWord(String strPassWord) {
		registerPageLocators.passWord.sendKeys(strPassWord);
	}
	public void setConfirmPassword(String strConfirmPassword) {
		registerPageLocators.confirmPassWord.sendKeys(strConfirmPassword);
	}
		
	public void clickRegister() {
		registerPageLocators.registerClick.click();
	}
	
	public void register(String strFirstName, String strLastName, String strEmail, String strPassWord, String strConfirmPassword) {
		this.setFirstName(strFirstName);
		this.setLastName(strLastName);
		this.setEmail(strEmail);
		this.setPassWord(strPassWord);
		this.setConfirmPassword(strConfirmPassword);

	}

}
