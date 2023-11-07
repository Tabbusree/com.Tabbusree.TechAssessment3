package com.Tabbusree.TechnicalAssessment3;

import org.openqa.selenium.support.PageFactory;

public class WishListActions {
	WishListLocators wishListlocators = null;
	
	 
	WishListActions(){
		this.wishListlocators = new WishListLocators();
		PageFactory.initElements(HelperClass.getDriver(), wishListlocators);
	}
	public void search() {
		wishListlocators.search.click();
	}
	public void clicksearch() {
		wishListlocators.search.sendKeys("Smartphone");
		wishListlocators.searchButton.click();
	}
	
	public void mobileFunction() {
		wishListlocators.mobile.click();
	}
	
	public void WishList() {
		wishListlocators.AddtoWish.click();
	}
	
	public void WishlistOpt() {
		wishListlocators.whishlists.click();
	}
	
	public void removeWhishlist() {
		wishListlocators.removelist.click();
	}
	
	public void removefrom() {
		wishListlocators.remove.click();
	}

}
