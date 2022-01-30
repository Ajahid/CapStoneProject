package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {
	
	public HomePageObject () {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy (xpath = "//span[text()='Currency']")
	private WebElement currencyButton;
	@FindBy (xpath = "//i[@class='fa fa-phone']")
	private WebElement contactNumber;
	@FindBy (xpath = "//span[text()='My Account']")
	private WebElement myAccount;
	@FindBy (xpath = "//span[contains(text(),'Wish List')]")
	private WebElement wishList;
	@FindBy (xpath = "//span[text()='Shopping Cart']")
	private WebElement shoppingCart;
	@FindBy (xpath = "//span[text()='Checkout']")
	private WebElement checkOut;
	@FindBy (xpath = "//input[starts-with(@class,'form-control')]")
	private WebElement searchBar;
	@FindBy (xpath = "//button[starts-with(@class,'btn btn-default')]")
	private WebElement searchButton;
	@FindBy (xpath = "//button[starts-with(@class,'btn btn-inverse')]")
	private WebElement itemsInCart;
	@FindBy (xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnviromentText;
	@FindBy (xpath = "//a[text()='Desktops']")
	private WebElement desktopButton;
	@FindBy (xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsNoteBooksButton;
	@FindBy (xpath = "//a[text()='Components']")
	private WebElement componentsButton;
	@FindBy (xpath = "//a[text()='Tablets']")
	private WebElement tabletsButton;
	@FindBy (xpath = "//a[text()='Software']")
	private WebElement softwareButton;
	@FindBy (xpath = "//a[text()='Phones & PDAs']")
	private WebElement software;
	@FindBy (xpath = "//a[text()='Cameras']")
	private WebElement cameraButton;
	@FindBy (xpath = "//a[text()='MP3 Players']")
	private WebElement mp3PlayerButton;
	@FindBy (xpath = "//div[@id='slideshow0']/div/div[2]/a")
	private WebElement iPhone6CenterImage;
	@FindBy (xpath = "//div[@id='slideshow0']/div/div[3]/img")
	private WebElement macBookCenterImage;
	@FindBy (xpath = "//h3[text()='Featured']")
	private WebElement validateFeaturedText;
	@FindBy (xpath = "//img[@title='MacBook']")
	private WebElement macBookImage;
	@FindBy (xpath = "//a[text()='MacBook']")
	private WebElement macBookLink;
	@FindBy (xpath = "//p[contains(text(),' Intel Core 2 Duo processor')]")
	private WebElement macBookText;
	@FindBy (xpath = "//p[contains(text(),' Intel Core 2 Duo processor')]//following-sibling::p[@class='price']")
	private WebElement macBookPrice;
	@FindBy (xpath = "//p[contains(text(),' Intel Core 2 Duo processor')]//following-sibling::p[@class='price']//following-sibling::span")
	private WebElement macBookExTax;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[2]/div[1]/div/div[3]/button[1]/span")
	private WebElement macBookAddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[2]/div[1]/div/div[3]/button[2]")
	private WebElement macBookAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[2]/div[1]/div/div[3]/button[3]")
	private WebElement macBookCompareProduct;
	@FindBy (xpath = "//img[@title='iPhone']")
	private WebElement iphoneImage;
	@FindBy (xpath = "//a[text()='iPhone']")
	private WebElement iphoneLink;
	@FindBy (xpath = "//p[contains(text(),'iPhone is a revolutionary')]")
	private WebElement iphoneText;
	@FindBy (xpath = "//p[contains(text(),'iPhone is a revolutionary')]//following-sibling::p[@class='price']")
	private WebElement iphonePrice;
	@FindBy (xpath = "//p[contains(text(),'iPhone is a revolutionary')]//following-sibling::p[@class='price']//following-sibling::span")
	private WebElement iphoneExTax;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[2]/div[2]/div/div[3]/button[1]/span")
	private WebElement iphoneAddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[2]/div[2]/div/div[3]/button[2]")
	private WebElement iphoneAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[2]/div[2]/div/div[3]/button[3]")
	private WebElement iphoneCompareProduct;
	@FindBy (xpath = "//img[@title='Apple Cinema 30\"']")
	private WebElement appleCinemaImage;
	@FindBy (xpath = "//a[text()='Apple Cinema 30\"']")
	private WebElement appleCinemaLink;
	@FindBy (xpath = "//p[contains(text(),'The 30-inch Apple Cinema HD')]")
	private WebElement appleCinemaText;
	@FindBy (xpath = "//p[contains(text(),'The 30-inch Apple Cinema HD')]//following-sibling::p//following-sibling::span[@class='price-new']")
	private WebElement appleCinemaNewPrice;
	@FindBy (xpath = "//p[contains(text(),'The 30-inch Apple Cinema HD')]//following-sibling::p//following-sibling::span[@class='price-old']")
	private WebElement appleCinemaOldPrice;
	@FindBy (xpath = "//p[contains(text(),'The 30-inch Apple Cinema HD')]//following-sibling::p//following-sibling::span[@class='price-tax']")
	private WebElement appleCinemaExTax;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[2]/div[3]/div/div[3]/button[1]/span")
	private WebElement appleCinemaAddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[2]/div[3]/div/div[3]/button[2]")
	private WebElement appleCinemaAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[2]/div[3]/div/div[3]/button[3]")
	private WebElement appleCinemaCompareProduct;
	@FindBy (xpath = "//img[@title='Canon EOS 5D']")
	private WebElement canonImage;
	@FindBy (xpath = "//a[text()='Canon EOS 5D']")
	private WebElement canonLink;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[2]/div[4]/div/div[2]/p[1]/text()")
	private WebElement canonText;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[2]/div[4]/div/div[2]/p[2]/span[1]")
	private WebElement canonNewPrice;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[2]/div[4]/div/div[2]/p[2]/span[2]")
	private WebElement canonOldPrice;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[2]/div[4]/div/div[2]/p[2]/span[3]")
	private WebElement canonExTax;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[2]/div[4]/div/div[3]/button[1]/span")
	private WebElement canonAddToCart;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[2]/div[4]/div/div[3]/button[2]")
	private WebElement canonAddToWishList;
	@FindBy (xpath = "//div[contains(@id,'content')]/div[2]/div[4]/div/div[3]/button[3]")
	private WebElement canonCompareProduct;
	@FindBy (xpath = "//h5[text()='Information']")
	private WebElement informtionText;
	@FindBy (xpath = "//a[text()='About Us']")
	private WebElement aboutUsButton;
	@FindBy (xpath = "//a[text()='Delivery Information']")
	private WebElement deliveryInformationButton;
	@FindBy (xpath = "Privacy Policy")
	private WebElement privacyPolicyButton;
	@FindBy (xpath = "Terms & Conditions")
	private WebElement termsConditionsbutton;
	@FindBy (xpath = "//h5[text()='Customer Service']")
	private WebElement CustomerServiceText;
	@FindBy (xpath = "//a[text()='Contact Us']")
	private WebElement contactUsButton;
	@FindBy (xpath = "//a[text()='Returns']")
	private WebElement returnsButton;
	@FindBy (xpath = "//a[text()='Site Map']")
	private WebElement siteMapButton;
	@FindBy (xpath = "//h5[text()='Extras']")
	private WebElement extrasText;
	@FindBy (xpath = "//a[text()='Brands']")
	private WebElement brandsButton;
	@FindBy (xpath = "//a[text()='Gift Certificates']")
	private WebElement giftCertificatesButton;
	@FindBy (xpath = "//a[text()='Affiliate']")
	private WebElement affiliateButton;
	@FindBy (xpath = "//a[text()='Specials']")
	private WebElement specialButton;
	@FindBy (xpath = "//h5[text()='My Account']")
	private WebElement myAccountText;
	@FindBy (xpath = "//a[text()='My Account']")
	private WebElement myAccountBottomOfThePage;
	@FindBy (xpath = "//a[text()='Order History']")
	private WebElement orderHistoryButton;
	@FindBy (xpath = "//a[text()='Wish List']")
	private WebElement wishListBottomOfThePage;
	@FindBy (xpath = "//a[text()='Newsletter']")
	private WebElement newsLetterButton;
	@FindBy (xpath = "//p[text()='Powered By ']")
	private WebElement poweredByText;
	@FindBy (xpath = "//a[text()='Login']")
	private WebElement loginButton;
	@FindBy (xpath = "//input[@id='input-email']")
	private WebElement userEmail;
	@FindBy (xpath = "//input[@id='input-password']")
	private WebElement userPassword; 
	@FindBy (xpath = "//input[@value='Login']")
	private WebElement loginButtonOnLoginPage;
	@FindBy (xpath = "//h2[text()='My Account']")
	private WebElement loginPageConfirmation;
	

	
	public boolean verifyHomePage() {
		if(testEnviromentText.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickMyAccount() {
		myAccount.click();
	}
	
	public void clickLoginButton() {
		
		loginButton.click();
	}
	
	public void enterUserEmail(String username) {
		
		userEmail.sendKeys(username);
	}
	
	public void enterUserPassword(String password) {
		
		userPassword.sendKeys(password);
	}
	
	public void clickLoginButtonOnLoginPage() {
		loginButtonOnLoginPage.click();
	}
	
	public boolean validateloginPageConfirmation() {
		
		if(loginPageConfirmation.isDisplayed())
			return true;
		else
			return false;
	}
	
}
