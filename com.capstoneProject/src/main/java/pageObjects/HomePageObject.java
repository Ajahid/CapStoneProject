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
	@FindBy (xpath = "//span[text()='Wish List (0)']")
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
	private WebElement validateText;
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
	@FindBy (xpath = "//h3[text()='Featured']")
	private WebElement validateFeaturedText;
	@FindBy (xpath = "//img[@title='MacBook']")
	private WebElement macBookImage;
	@FindBy (xpath = "//img[@title='iPhone']")
	private WebElement iphoneImage;
	@FindBy (xpath = "//img[@title='Apple Cinema 30\"']")
	private WebElement appleCinemaImage;
	@FindBy (xpath = "//img[@title='Canon EOS 5D']")
	private WebElement canonImage;
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
	


}
