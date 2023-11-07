package com.Tabbusree.TechnicalAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	@FindBy(xpath="//li[contains(text(),'The specified email already exists')]")
	public WebElement assertText;

}
