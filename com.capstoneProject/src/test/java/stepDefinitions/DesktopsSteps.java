package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.TakesScreenshot;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopsPageObject;
import utilities.Utilities;

public class DesktopsSteps extends Base {
	
	DesktopsPageObject desktop = new DesktopsPageObject();
	

	@Given("User is on Retail website")
	public void user_is_on_retail_website() throws IOException {
		desktop.verifyDesktopMainPageText();
		logger.info("User is on on Retail Website Home Page");
		Utilities.takeScreenShot("RetailWebsiteHomePage");
	 
	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() throws IOException {
		desktop.clickDesktopsButton();
		logger.info("User click on Desktops Button");
		Utilities.takeScreenShot("ClickDesktopButton");
	 
	}

	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() throws IOException {
		desktop.clickShowAllDesktpButton();
		logger.info("User Click on Show all Desktop");
		Utilities.takeScreenShot("ClickShowAllDesktop");
	 
	}

	@And("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() throws IOException {
		Utilities.takeScreenShot("DesktopPageTopSection");
		Utilities.scrolldownPage();
		Utilities.takeScreenShot("DsktopPageLowerSection");
		

	}

	@And("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() throws IOException {
		desktop.clickHpLP3065AddToCart();
		logger.info("User Click on HP LP3065 Add to Cart");
		Utilities.takeScreenShot("HPAddToCart");
		
	}

	@And("User select quantity {int}")
	public void user_select_quantity(Integer int1) throws IOException {
		desktop.selectQuantity(1);
		logger.info("User can select quantity from Qty tab");
		Utilities.takeScreenShot("SelectQuantity");

	}

	
	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() throws IOException {
	 desktop.clickAddtoCartHpLpPage();
	 logger.info("User can click on add to cart on LP HP3065 Page");
	 Utilities.takeScreenShot("ClickAdd to Cart2");
		
	}

	@Then("User should see a message ‘Success: you have added HP LP3065 to your Shopping cart!’")
	public void User_should_see_a_message_Success_you_have_added_HP_LP3065_to_your_Shopping_cart() throws IOException {
		Assert.assertTrue(desktop.verifySuccessMessage());
		logger.info("User can see Sucess Message");
		Utilities.takeScreenShot("HP LP3065 Success Message");
	
	}
	
	@Then("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void User_click_ADD_TO_CART_option_on_Canon_EOS_5D_item() throws IOException{
		desktop.clickCanonEOSIAddToCart();
		logger.info("User click on Canon Add To Cart");
		Utilities.takeScreenShot("CanonAddToCart");
		
	}
	
	@And ("User select color from dropdown ‘Red’")
	public void User_select_color_from_dropdown_Red() throws IOException {
		desktop.selectCanonColor();
		logger.info("User Select RED color");
		Utilities.takeScreenShot("CanonColor");
		
	}
	
	@Then ("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void User_should_see_a_message_Success_You_have_added_Canon_EOS_5D_to_your_shopping_cart() throws IOException {
		Assert.assertTrue(desktop.verifySuccessMessage());
		logger.info("User Can See sucess message");
		Utilities.takeScreenShot("CanonEOS Success Message");
		
	}
	
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() throws IOException {
		desktop.clickCanonEOSIButton();
		logger.info("Customer can click on canon button");
		Utilities.takeScreenShot("ClickCanonButton");

	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() throws IOException {
		desktop.clickCanonReview();
		logger.info("User can click on Canon Review Link");
		Utilities.takeScreenShot("ReviewLink");

	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) throws IOException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		desktop.yourNameField(data.get(0).get("yourname"));
		desktop.textAreaField(data.get(0).get("yourReview"));
		desktop.selectRatingCheckBox();
		logger.info("User Enter Name, write review and select rating");
		Utilities.takeScreenShot("ReviewPage");
		
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() throws IOException {
		desktop.clickContinue();
		logger.info("User click on continue button");
		Utilities.takeScreenShot("ClickContinue");

	}

	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() throws IOException {
		Assert.assertTrue(desktop.verifyreviewMessage());
		logger.info("User can see thank you for your review message");
		Utilities.takeScreenShot("ReviewMessage");
	    
	}

	
	

}

