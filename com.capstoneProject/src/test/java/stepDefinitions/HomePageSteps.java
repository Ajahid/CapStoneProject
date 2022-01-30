package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObject;
import utilities.Utilities;

public class HomePageSteps extends Base {

	
	HomePageObject homePage = new HomePageObject();
	
	
	@Given("^User is on Retail website$")
	public void  User_is_on_Retail_website() throws IOException {
		homePage.verifyHomePage();
		logger.info("User on Retail Website");
		Utilities.takeScreenShot("Homepage");
	}
	
	@When("user click on myaccount button")
	public void user_click_on_myaccount_button() throws IOException {
		homePage.clickMyAccount();
		logger.info("My account button was clicked successfully");
		Utilities.takeScreenShot("ClickMyAccount");
	}

	@And("user click on login")
	public void user_click_on_login() throws IOException {
		homePage.clickLoginButton();
		logger.info("Login button was clicked successfully");
		Utilities.takeScreenShot("LoginButton");
	}

	@And("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String username, String password) throws IOException {
		homePage.enterUserEmail(username);
		homePage.enterUserPassword(password);
		logger.info("User enter username and password successfully");
		Utilities.takeScreenShot("EnterUsernamePassword");
		
	}
	
	@And("User click on Login button")
	public void User_click_on_Login_button() throws IOException {
		homePage.clickLoginButtonOnLoginPage();
		logger.info("Login button was clicked successfully");
		Utilities.takeScreenShot("LoginPage");
	}
	
	@Then ("User should be logged in to MyAccount dashboard")
	public void User_should_be_logged_in_to_MyAccount_dashboard() throws IOException {
		Assert.assertTrue(homePage.validateloginPageConfirmation());
		logger.info("User scucessfully loged in to login page");
		Utilities.takeScreenShot("UserLoginPage");
	}
}
