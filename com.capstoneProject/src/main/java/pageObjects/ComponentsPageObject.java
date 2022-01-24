package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObject extends Base {
	
	public ComponentsPageObject() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Components']")
	private WebElement componentsHomePage;
	@FindBy (xpath = "//a[starts-with(text(),'Mice and Trackballs')]")
	private WebElement miceTrackballsButton;
	@FindBy (xpath = "//a[starts-with(text(),'Monitors')]")
	private WebElement monitorsButton;
	@FindBy (xpath = "//a[starts-with(text(),'Printers')]")
	private WebElement printersButton;
	@FindBy (xpath = "//a[starts-with(text(),'Scanners')]")
	private WebElement scannersButton;
	@FindBy (xpath = "//a[starts-with(text(),'Web Cameras')]")
	private WebElement webCamerasButton;
	@FindBy (xpath = "//a[starts-with(text(),'Show All Components')]")
	private WebElement showAllComponenetsButton;
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
	private WebElement laptopsNoteBooksButton2ndPage;
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
	@FindBy (xpath = "//i[@class='fa fa-home']")
	private WebElement homeButton;
	@FindBy (xpath = "//div[@id='product-category']//ul//li//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25' and text()='Components']")
	private WebElement componentsNextToHomeButton;
	@FindBy (xpath = "//a[starts-with(text(),'Desktops ')]")
	private WebElement desktopSideTable;
	@FindBy (xpath = "//a[starts-with(text(),'Laptops & Notebooks ')]")
	private WebElement deskTopSideTable;
	@FindBy (xpath = "//a[starts-with(text(),'Components ')]")
	private WebElement componentsSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25_29' and @class='list-group-item']")
	private WebElement miceTrackballsSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25_28' and @class='list-group-item']")
	private WebElement monitorsSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25_30' and @class='list-group-item']")
	private WebElement printersSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25_31' and @class='list-group-item']")
	private WebElement scannersSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25_32' and @class='list-group-item']")
	private WebElement webCamersSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=57' and @class='list-group-item']")
	private WebElement tabletsSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=17' and @class='list-group-item']")
	private WebElement softwareSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=24' and @class='list-group-item']")
	private WebElement phonesPDAsSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=33' and @class='list-group-item']")
	private WebElement camerasSideTable;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=34' and @class='list-group-item']")
	private WebElement mp3PlayersSideTable;
	@FindBy (xpath = "//img[@alt='HP Banner']")
	private WebElement destktopPCImage;
	@FindBy (xpath = "Components")
	private WebElement componentsText;
	@FindBy (xpath = "//h3[text()='Refine Search']")
	private WebElement refineSearchText;
	@FindBy (xpath = "//div[@class='col-sm-3']//ul//li//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25_29']")
	private WebElement miceTrackballsLink;
	@FindBy (xpath = "//div[@class='col-sm-3']//ul//li//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25_28']")
	private WebElement monitorsLink;
	@FindBy (xpath = "//div[@class='col-sm-3']//ul//li//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25_30']")
	private WebElement printersLink;
	@FindBy (xpath = "//div[@class='col-sm-3']//ul//li//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25_31']")
	private WebElement scannersLink;
	@FindBy (xpath = "//div[@class='col-sm-3']//ul//li//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25_32']")
	private WebElement webCamerasLinks;
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
	private WebElement customerServiceText;
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


