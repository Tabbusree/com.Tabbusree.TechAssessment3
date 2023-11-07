//package com.Tabbusree.TechnicalAssessment3;
//
//import java.util.List;
//import java.util.Map;
//
//import org.testng.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class RegisterStepDefinition {
//	
//	RegisterUtility data = new RegisterUtility();
//	RegisterPageActions objLogin = new RegisterPageActions();
//	HomePageActions objHome = new HomePageActions();
//
////	@Given("User is on register page")
////	public void user_is_on_register_page() {
////		HelperClass.openPage(data.url);
////	    System.out.println("Register page");
////	}
////	
////	@When("User clicks register")
////	public void user_clicks_register() {
////	    objLogin.clickRegisterForm();
////	    System.out.println("User clicks register");
////	}
////	
////	@When("User clicks gender")
////	public void user_clicks_gender() {
////	    objLogin.clickGender();
////	    System.out.println("Gender is selected");
////	}
////	
////	@When("User provides the credentials")
////	public void user_provides_the_credentials() {
////		objLogin.register(data.firstname, data.lastname, data.Email, data.Password, data.confirmpassword);
////		System.out.println("User logged in");
////	}
////	
////	@When("User clicks register button")
////	public void user_clicks_register_button() {
////	    objLogin.clickRegister();
////	}
////	
////	@Then("User successfully registered")
////	public void user_successfully_registered() {
////		Assert.assertTrue(objHome.getVerifyText().contains("The specified email already exists"));
////		System.out.println("User has already exist");
////	}
//	
//	@Given("User launches the webpage")
//	public void user_launches_the_webpage() {
//		HelperClass.openPage(data.url);
//	    System.out.println("Register page");
//	}
//
//	@When("User clicks the register")
//	public void user_clicks_the_register() {
//		objLogin.clickRegisterForm();
//	    System.out.println("User clicks register");
//	}
//
//	@When("User clicks the gender checkbox")
//	public void user_clicks_the_gender_checkbox() {
//		objLogin.clickGender();
//	    System.out.println("Gender is selected");
//	}
//
//	@When("User provides the credentials to register")
//	public void user_provides_the_credentials_to_register(io.cucumber.datatable.DataTable dataTable) {
//		List<Map<String,String>> signUpForm = dataTable.asMaps(String.class,String.class);
//	    for(Map<String,String> data : signUpForm) {
//	    	
//	    	String FirstName=data.get("FirstName");
//	    	objLogin.setFirstName(FirstName);
//	    	
//	    	String LastName=data.get("LastName");
//	    	objLogin.setLastName(LastName);
//	    	
//	    	String Email=data.get("Email");
//	    	objLogin.setEmail(Email);
//	    	
//	    	String Password=data.get("Password");
//	    	objLogin.setPassWord(Password);
//	    	
//	    	String Confirm=data.get("Confirm Password");  
//	    	objLogin.setConfirmPassword(Confirm);
//	    }
//	}
//
//	@When("User clicks register button")
//	public void user_clicks_register_button() {
//		objLogin.clickRegister();
//	}
//
//	@Then("Checking for registration")
//	public void checking_for_registration() {
//		Assert.assertTrue(objHome.getVerifyText().contains("The specified email already exists"));
//		System.out.println("User has already exist");
//	}
// }