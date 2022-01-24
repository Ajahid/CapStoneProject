package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsNoteBooksPageObject extends Base {
	
	
	public LaptopsNoteBooksPageObject() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsNoteBooksbuttonMainPage;
	@FindBy (xpath = "//a[text()='Macs (0)']")
	private WebElement macsButtonMainPage;
	@FindBy (xpath = "//a[text()='Windows (0)']")
	private WebElement windowsButtonMainPage;
	@FindBy (xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsNoteBooksMainPage;
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
	@FindBy (xpath = "//div[@id='product-category']//ul//li//a[text()='Laptops & Notebooks']")
	private WebElement laptopsNoteBooksNearHomeButton;
	@FindBy (xpath = "//a[text()='Desktops (13)']")
	private WebElement desktopsButton;
	@FindBy (xpath = "//div[@class='list-group']//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=18']")
	private WebElement laptopsNoteBooksSideTableButton;
	@FindBy (xpath = "//div[@class='list-group']//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=18_46']")
	private WebElement macsButtonSideTable;
	@FindBy (xpath = "//div[@class='list-group']//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=18_45']")
	private WebElement windowsButtonSideTable;
	@FindBy (xpath = "http://tek-school.com/retail/index.php?route=product/category&path=25")
	private WebElement componentsButtonSideTable;
	@FindBy (xpath = "//div[@class='list-group']//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=57']")
	private WebElement tabletsButtonSideTable;
	@FindBy (xpath = "http://tek-school.com/retail/index.php?route=product/category&path=24")
	private WebElement phonesPDAsButtonSideTable;
	@FindBy (xpath = "http://tek-school.com/retail/index.php?route=product/category&path=33")
	private WebElement camerasButtonSideTable;
	@FindBy (xpath = "http://tek-school.com/retail/index.php?route=product/category&path=34")
	private WebElement mp3PlayersButtonSideTable;
	@FindBy (xpath = "//img[@src='http://tek-school.com/retail/image/cache/catalog/demo/compaq_presario-182x182.jpg']")
	private WebElement desktopPCImageLink;
	@FindBy (xpath = "//h2[text()='Laptops & Notebooks']")
	private WebElement laptopNoteBookText;
	@FindBy (xpath = "//img[@src='http://tek-school.com/retail/image/cache/catalog/demo/hp_2-80x80.jpg']")
	private WebElement laptopImageUnderText;
	@FindBy (xpath = "//*[@id=\"content\"]/div[1]/div[2]/p")
	private WebElement laptopparagraphText; 
	@FindBy (xpath = "//h3[text()='Refine Search']")
	private WebElement refineSearchText;
	@FindBy (xpath = "//div/div//div//ul//li//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=18_46']")
	private WebElement macsUnderRefineSearch;
	@FindBy (xpath = "//div/div//div//ul//li//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=18_45']")
	private WebElement windowsUnderRefineSearch;
	@FindBy (xpath = "//i[@class='fa fa-th-list']")
	private WebElement listViewbutton;
	@FindBy (xpath = "//button[@id='grid-view']")
	private WebElement gridViewButton;
	@FindBy (xpath = "//a[@href='http://tek-school.com/retail/index.php?route=product/compare']")
	private WebElement compareProductLink;
	@FindBy (xpath = "//label[@for='input-sort']")
	private WebElement sortByText;
	@FindBy (xpath = "//select[@id='input-sort']")
	private WebElement sortByTab;
	@FindBy (xpath = "//label[@for='input-limit']")
	private WebElement showText;
	@FindBy (xpath = "//select[@id='input-limit']")
	private WebElement showTab;
	@FindBy (xpath = "//img[@title='HP LP3065']")
	private WebElement hpLP3065Image;
	@FindBy (xpath = "//a[text()='HP LP3065']")
	private WebElement hpLP3065Link;
	@FindBy (xpath = "//p[starts-with(text(),'Stop your co')]")
	private WebElement hpLP3065Text;
	@FindBy (xpath = "//p[starts-with(text(),'Stop your co')]//following-sibling::p")
	private WebElement hpLP3065Price;
	@FindBy (xpath = "//p[starts-with(text(),'Stop your co')]//following-sibling::p//following-sibling::span")
	private WebElement hpLP3065EXTax;
	@FindBy (xpath = "//img[@title='MacBook']")
	private WebElement macBookImage;
	@FindBy (xpath = "//a[text()='MacBook']")
	private WebElement macBookLink;
	@FindBy (xpath = "//p[starts-with(text(),'Intel Core 2 Duo')]")
	private WebElement macBookText;
	@FindBy (xpath = "//p[starts-with(text(),'Intel Core 2 Duo')]//following-sibling::p")
	private WebElement macBookPrice;
	@FindBy (xpath = "//p[starts-with(text(),'Intel Core 2 Duo')]//following-sibling::p//following-sibling::span")
	private WebElement macBookEXTax;
	@FindBy (xpath = "//img[@title='MacBook Air']")
	private WebElement macBookAirImage;
	@FindBy (xpath = "//a[text()='MacBook Air']")
	private WebElement macBookAirLink;
	@FindBy (xpath = "//p[starts-with(text(),'MacBook Air ')]")
	private WebElement macBookAirText;
	@FindBy (xpath = "//p[starts-with(text(),'MacBook Air ')]//following-sibling::p")
	private WebElement macBookAirPrice;
	@FindBy (xpath = "//p[starts-with(text(),'MacBook Air ')]//following-sibling::p//following-sibling::span")
	private WebElement macBookAirEXTax; 
	@FindBy (xpath = "//img[@title='MacBook Pro']")
	private WebElement macBookProImage;
	@FindBy (xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookProLink; 
	@FindBy (xpath = "//p[starts-with(text(),'Latest Intel mobile')]")
	private WebElement macBookProText; 
	@FindBy (xpath = "//p[starts-with(text(),'Latest Intel mobile')]//following-sibling::p")
	private WebElement macBookProPrice;
	@FindBy (xpath = "//p[starts-with(text(),'Latest Intel mobile')]//following-sibling::p//following-sibling::span")
	private WebElement macBookProEXTax;
	@FindBy (xpath = "//img[@title='Sony VAIO']")
	private WebElement sonyVaioImage;
	@FindBy (xpath = "//a[text()='Sony VAIO']")
	private WebElement sonyVaioLink; 
	@FindBy (xpath = "//p[starts-with(text(),'Unprecedented')]")
	private WebElement sonyVaioText;
	@FindBy (xpath = "//p[starts-with(text(),'Unprecedented')]//following-sibling::p")
	private WebElement sonyVaioPrice;
	@FindBy (xpath = "//p[starts-with(text(),'Unprecedented')]//following-sibling::p//following-sibling::span")
	private WebElement sonyVaioEXTax;
	@FindBy (xpath = "//div[@class='col-sm-6 text-right']")
	private WebElement showingPageText;
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
	
	
	
	
	
	public void clicklaptopsNoteBooksOnMainPage() {
		laptopsNoteBooksbuttonMainPage.click();
	}
	public void clickMacsOnMainPage() {
		macsButtonMainPage.click();
	}
	public void clickWindowsOnMainPage() {
		windowsButtonMainPage.click();
	}
	public void clickShowAllLatptopsNoteBooksMainPage() {
		showAllLaptopsNoteBooksMainPage.click();
	}
	public void clickHomeButtonLaptopsNoteBooksPage() {
		homeButton.click();
	}
	public void clickLaptopsNoteBooksNearHomeButton() {
		laptopsNoteBooksNearHomeButton.click();
	}
	public void clickDesktops() {
		desktopsButton.click();
	}
	public void clickLaptopsNoteBooksSideTable() {
		laptopsNoteBooksSideTableButton.click();
	}
	public void clickComponentsSideTable() {
		componentsButtonSideTable.click();
	}
	public void clickMacsSideTable() {
		macsButtonSideTable.click();
	}
	public void clickWindowsSideTable() {
		windowsButtonSideTable.click();
	}
	public void clickTabletsSideTable() {
		tabletsButtonSideTable.click();
	}
	public void clickPhonesPDAsSideTable() {
		phonesPDAsButtonSideTable.click();
	}
	public void clickCamerasSideTable() {
		camerasButtonSideTable.click();
	}
	public void clickMP3PlayersSideTable() {
		mp3PlayersButtonSideTable.click();
	}
	public void clickDesktopPCImage() {
		desktopPCImageLink.click();
	}
	public boolean validateLaptopNoteBookText() {
		if(laptopNoteBookText.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifyLaptopImage() {
		if(laptopImageUnderText.isDisplayed())
		return true;
		else
			return false;
	}
	public boolean verifyLaptopparagraphText() {
		if(laptopparagraphText.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifyRefineSearchText() {
		if (refineSearchText.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickMacsUnderRefineSearch() {
		macsUnderRefineSearch.click();
	}
	public void clickWindowUnderRefineSearch() {
		windowsUnderRefineSearch.click();
	}
	public void clickListView() {
		listViewbutton.click();	
	}
	public void clickGridView() {
		gridViewButton.click();
	}
	public void clickcompareProduct() {
		compareProductLink.click();
	}
	public boolean verifySortByText() {
		if (sortByText.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickSortByTab() {
		sortByTab.click();
	}
	public boolean verifyShowText() {
		if(showText.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickshowTab() {
		showTab.click();
	}
	public void clickHPLP3065Image() {
		hpLP3065Image.click();
	}
	public void clickHPLP3065Link() {
		hpLP3065Link.click();
	}
	public boolean verifyHPLP3065Text() {
		if(hpLP3065Text.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifyHPLP3065Price() {
		if (hpLP3065Price.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifyHPLP3065EXTax() {
		if (hpLP3065EXTax.isDisplayed())
			return true;
		else 
			return false;
	}
	public void clickMacBookImage() {
		macBookImage.click();
	}
	public void clickMacBookLink() {
		macBookLink.click();
	}
	public boolean verifyMaBookText() {
		if(macBookText.isDisplayed())
			return true;
			else
				return false;
	}
	public boolean verifyMacBookPrice() {
		if(macBookPrice.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifyMacBookEXTax() {
		if(macBookEXTax.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickMacBookAirImage() {
		macBookAirImage.click();
	}
	public void clickMacBookAirLink() {
		macBookAirLink.click();
	}
	public boolean verifyMacBookAirText() {
		if(macBookAirText.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifyMacBookAirPrice() {
		if(macBookAirPrice.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifyMacBookAirEXTax() {
		if(macBookAirEXTax.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickMacBookProImage() {
		macBookProImage.click();
	}
	public void clickMacBookProLink() {
		macBookProLink.click();
	}
	public boolean verifyMacBookProText() {
		if(macBookProText.isDisplayed())
			return true;
			else
				return false;
	}
	public boolean verifyMacBookProPrice() {
		if(macBookProPrice.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifyMacBookProEXTax() {
		if(macBookProEXTax.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickSonyVaioImage() {
		sonyVaioImage.click();
	}
	public void clickSonyVaioLink() {
		sonyVaioLink.click();
	}
	public boolean verifySonyVaioText() {
		if(sonyVaioText.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifySonyVaioPrice() {
		if (sonyVaioPrice.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifySonyVaioEXTax() {
		if (sonyVaioEXTax.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifyShowingPageText() {
		if (showingPageText.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean verifyInformtionText() {
		if(informtionText.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickAboutUsButton() {
		aboutUsButton.click();
	}
	public void verifyDeliveryInformationButton() {
		deliveryInformationButton.click();
	}
	public void clickPrivacyPolicyButton() {
		privacyPolicyButton.click();
	}
	public void clicktermsConditionsbutton() {
		termsConditionsbutton.click();
	}
	public boolean verifyCustomerServiceText() {
		if(customerServiceText.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickContactUsButton() {
		contactUsButton.click();
	}
	public void clickReturnsButton() {
		returnsButton.click();
	}
	public void clickSiteMapButton() {
		siteMapButton.click();
	}
	public boolean verifyExtrasText() {
		if (extrasText.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickBrandsButton() {
		brandsButton.click();
	}
	public void clickGiftCertificatesButton() {
		giftCertificatesButton.click();
	}
	public void clickAffiliateButton() {
		affiliateButton.click();
	}
	public void clickSpecialButton() {
		specialButton.click();
	}
	public boolean verifyMyAccountText() {
		if(myAccountText.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickMyAccountBottomOfThePage() {
		myAccountBottomOfThePage.click();
	}
	public void clickOrderHistoryButton() {
		orderHistoryButton.click();
	}
	public void clickWishListBottomOfThePage() {
		wishListBottomOfThePage.click();
	}
	public void clickNewsLetterButton() {
		newsLetterButton.click();
	}
	public boolean verifyPoweredByText() {
		if(poweredByText.isDisplayed())
			return true;
		else
			return false;
	}
	
}
