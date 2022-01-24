package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopsPageObject extends Base {

	
	public DesktopsPageObject () {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath = "//a[text()='Desktops']")
	private WebElement desktopsButton;
	@FindBy (xpath = "//div[@class='dropdown-menu']//child::div//following-sibling:: ul//following-sibling::li//a[text()='PC (0)']")
	private WebElement pcDesktopsDropDown;
	@FindBy (xpath = "//div[@class='dropdown-menu']//child::div//following-sibling:: ul//following-sibling::li//a[text()='Mac (1)']")
	private WebElement macDesktopsDropDown;
	@FindBy (xpath = "//a[text()='Laptops & Notebooks (5)']")
	private WebElement laptopsNoteBookDesktopsDropDown;
	@FindBy (xpath = "//i[@class='fa fa-home']")
	private WebElement homeButton;
	@FindBy (xpath = "//div[@id='product-category']//ul[@class='breadcrumb']//following-sibling::li//following-sibling::li//child::a[text()='Desktops']")
	private WebElement desktopsHomeButton;
	@FindBy (xpath = "//a[text()='Desktops (13)']")
	private WebElement desktops13Button;
	@FindBy (xpath = "//aside[@id='column-left']//child::div//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=20_26']")
	private  WebElement pcButton;
	@FindBy (xpath = "//aside[@id='column-left']//child::div//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=20_26']")
	private WebElement macButton;
	@FindBy (xpath = "//aside[@id='column-left']//child::div//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=18']")
	private WebElement laptopsNoteBookButton;
	@FindBy (xpath = "//aside[@id='column-left']//child::div//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=25']")
	private WebElement componentsButton;
	@FindBy (xpath = "//aside[@id='column-left']//child::div//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=57']")
	private WebElement tabletsButton;
	@FindBy (xpath = "//aside[@id='column-left']//child::div//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=17']")
	private WebElement softwareButton;
	@FindBy (xpath = "//aside[@id='column-left']//child::div//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=24']")
	private WebElement phonePDAsButton;
	@FindBy (xpath = "//aside[@id='column-left']//child::div//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=33']")
	private WebElement camerasButton;
	@FindBy (xpath = "//aside[@id='column-left']//child::div//following-sibling::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=34']")
	private WebElement mp3PlayersButton;
	@FindBy (xpath = "//img[@src='http://tek-school.com/retail/image/cache/catalog/demo/compaq_presario-182x182.jpg']")
	private WebElement hpImageButton;
	@FindBy (xpath = "//h2[text()='Desktops']")
	private WebElement desktopText;
	@FindBy (xpath = "Desktops")
	private WebElement desktopImage;
	@FindBy (xpath = "//div[@class='col-sm-10']//child::p")
	private WebElement exempleText;
	@FindBy (xpath = "//h3[text()='Refine Search']")
	private WebElement refineSearchtext;
	@FindBy (xpath = "//div[@class='dropdown-menu']//child::div//child::ul//child::li//child::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=20_26']")
	private WebElement pcUnderRefineSearch;
	@FindBy (xpath = "//div[@class='dropdown-menu']//child::div//child::ul//child::li//child::a[@href='http://tek-school.com/retail/index.php?route=product/category&path=20_27']")
	private WebElement macUnderRefineSearch;
	@FindBy (xpath = "//i[@class='fa fa-th-list']")
	private WebElement listTab;
	@FindBy (xpath = "//i[@class='fa fa-th']")
	private WebElement gridTab;
	@FindBy (id = "//a[text()='Product Compare (0)']")
	private WebElement productCompareButton;
	@FindBy (xpath = "//label[@for='input-sort']")
	private WebElement inputSortByText;
	@FindBy (xpath = "//select[@id='input-sort']")
	private WebElement sortByDropDown;
	@FindBy (xpath = "//label[text()='Show:']")
	private WebElement showText;
	@FindBy (xpath = "//select[@id='input-limit']")
	private WebElement showDropDown;
	@FindBy (xpath = "//img[@title='Apple Cinema 30\"']")
	private WebElement appleCienama30Image;
	@FindBy (xpath = "//a[text()='Apple Cinema 30\"']")
	private WebElement appleCinemaButton;
	@FindBy (xpath = "//p[starts-with(text(),'The 30-inch')]")
	private WebElement appleCinemaText;
	@FindBy (xpath = "//p[starts-with(text(),'The 30-inch')]//following-sibling::p//following-sibling::span[@class='price-new']")
	private WebElement appleCinemaNewPrice;
	@FindBy (xpath = "//p[starts-with(text(),'The 30-inch')]//following-sibling::p//following-sibling::span[@class='price-old']")
	private WebElement appleCinemaOldPrice;
	@FindBy (xpath = "//p[starts-with(text(),'The 30-inch')]//following-sibling::p//following-sibling::span[@class='price-tax']")
	private WebElement appleCinemaEXTaxPrice;
	@FindBy (xpath = "//img[@title='Canon EOS 5D']")
	private WebElement canonEOSImage;
	@FindBy (xpath = "//a[text()='Canon EOS 5D']")
	private WebElement canonEOSIButton;
	@FindBy (xpath = "//p[starts-with(text(),'Canon')]")
	private WebElement canonEOSIText;
	@FindBy (xpath = "//p[starts-with(text(),'Canon')]//following-sibling::p//following-sibling::span[@class='price-new']")
	private WebElement canonEOSINewPrince;
	@FindBy (xpath = "//p[starts-with(text(),'Canon')]//following-sibling::p//following-sibling::span[@class='price-old']")
	private WebElement canonEOSIOldPrince;
	@FindBy (xpath = "//p[starts-with(text(),'Canon')]//following-sibling::p//following-sibling::span[@class='price-tax']")
	private WebElement canonEOSIEXTaxPrice;
	@FindBy (xpath = "//img[@title='HP LP3065']")
	private WebElement hpLP3065Image;
	@FindBy (xpath = "//a[text()='HP LP3065']")
	private WebElement hpLP3065Button;
	@FindBy (xpath = "//p[starts-with(text(),'Stop your')]")
	private WebElement hpLP3065Text;
	@FindBy (xpath = "//p[starts-with(text(),'Stop your')]//following-sibling::p")
	private WebElement hpLP3065Price;
	@FindBy (xpath = "//p[starts-with(text(),'Stop your')]//following-sibling::p//following-sibling::span")
	private WebElement hpLP3065EXTaxPrice;
	@FindBy (xpath = "//img[@title='HTC Touch HD']")
	private WebElement htcImage;
	@FindBy (xpath = "//a[text()='HTC Touch HD']")
	private WebElement htcButton;
	@FindBy (xpath = "//p[starts-with(text(),'HTC Touch')]")
	private WebElement htcText;
	@FindBy (xpath = "//p[starts-with(text(),'HTC Touch')]//following-sibling::p")
	private WebElement htcPrice;
	@FindBy (xpath = "//p[starts-with(text(),'HTC Touch')]//following-sibling::p//child::span")
	private WebElement htcEXTaxPrice;
	@FindBy (xpath = "//img[@title='iPhone']")
	private WebElement iPhoneImage;
	@FindBy (xpath = "//a[text()='iPhone']")
	private WebElement iPhoneButton;
	@FindBy (xpath = "//p[starts-with(text(),'iPhone')]")
	private WebElement iPhoneText;
	@FindBy (xpath = "//p[starts-with(text(),'iPhone')]//following-sibling::p")
	private WebElement iPhonePrice;
	@FindBy (xpath = "//p[starts-with(text(),'iPhone')]//following-sibling::p//child::span")
	private WebElement iPhoneEXTax;
	@FindBy (xpath = "//img[@title='iPod Classic']")
	private WebElement iPodImage;
	@FindBy (xpath = "//a[text()='iPod Classic']")
	private WebElement iPodButton;
	@FindBy (xpath = "//p[starts-with(text(),'More room to move')]")
	private WebElement iPodText;
	@FindBy (xpath = "//p[starts-with(text(),'More room to move')]//following-sibling::p")
	private WebElement iPodPrice;
	@FindBy (xpath = "//p[starts-with(text(),'More room to move')]//following-sibling::p//following-sibling::span")
	private WebElement iPodEXTax;
	@FindBy (xpath = "//img[@title='MacBook']")
	private WebElement macBookImage;
	@FindBy (xpath = "//a[text()='MacBook']")
	private WebElement macBookButton;
	@FindBy (xpath = "//p[starts-with(text(),'Intel Core 2 Duo processor')]")
	private WebElement macBookText;
	@FindBy (xpath = "//p[starts-with(text(),'Intel Core 2 Duo processor')]//following-sibling::p")
	private WebElement macBookPrice;
	@FindBy (xpath = "//p[starts-with(text(),'Intel Core 2 Duo processor')]//following-sibling::p//following-sibling::span")
	private WebElement macBookEXTax;
	@FindBy (xpath = "//img[@title='MacBook Air']")
	private WebElement macBookAirImage;
	@FindBy (xpath = "//a[text()='MacBook Air]")
	private WebElement macBookAirButton;
	@FindBy (xpath = "//p[starts-with(text(),'MacBook Air')]")
	private WebElement macBookAirText;
	@FindBy (xpath = "//p[starts-with(text(),'MacBook Air')]//following-sibling::p")
	private WebElement macBookAirPrice;
	@FindBy (xpath = "//p[starts-with(text(),'MacBook Air')]//following-sibling::p//following-sibling::span")
	private WebElement macBookAirExTax;
	@FindBy (xpath = "//img[@title='Palm Treo Pro']")
	private WebElement palmTreoProImage;
	@FindBy (xpath = "//a[text()='Palm Treo Pro']")
	private WebElement palmTreoProButton;
	@FindBy (xpath = "//p[starts-with(text(),'Redefine your workday')]")
	private WebElement palmTreoProText;
	@FindBy (xpath = "//p[starts-with(text(),'Redefine your workday')]//following-sibling::p")
	private WebElement palmTreoProPrice;
	@FindBy (xpath = "//p[starts-with(text(),'Redefine your workday')]//following-sibling::p//following-sibling::span")
	private WebElement palmTreoProEXTax;
	@FindBy (xpath = "//img[@title='Product 8']")
	private WebElement product8Image;
	@FindBy (xpath = "//a[text()='Product 8']")
	private WebElement product8Button;
	@FindBy (xpath = "//p[text()='Product 8..']")
	private WebElement product8Text;
	@FindBy (xpath = "//p[text()='Product 8..']//following-sibling::p")
	private WebElement product8Price;
	@FindBy (xpath = "//p[text()='Product 8..']//following-sibling::p//following-sibling::span")
	private WebElement product8EXTax;
	@FindBy (xpath = "//img[@title='Samsung SyncMaster 941BW']")
	private WebElement samsungSyncMasterImage;
	@FindBy (xpath = "//a[text()='Samsung SyncMaster 941BW']")
	private WebElement samsungSyncMasterButton;
	@FindBy (xpath = "//p[starts-with(text(),'Imagine the')]")
	private WebElement samsungSyncMasterText;
	@FindBy (xpath = "//p[starts-with(text(),'Imagine the')]//following-sibling::p")
	private WebElement samsungSyncMasterPrice;
	@FindBy (xpath = "//p[starts-with(text(),'Imagine the')]//following-sibling::p//following-sibling::span")
	private WebElement samsungSyncMasterEXTax;
	@FindBy (xpath = "//img[@title='Sony VAIO']")
	private WebElement sonyVAIOImage;
	@FindBy (xpath = "//a[text()='Sony VAIO']")
	private WebElement sonyVAIOButton;
	@FindBy (xpath = "//p[starts-with(text(),'Unprecedented')]")
	private WebElement sonyVAIOText;
	@FindBy (xpath = "//p[starts-with(text(),'Unprecedented')]//following-sibling::p")
	private WebElement sonyVAIOPrice;
	@FindBy (xpath = "//p[starts-with(text(),'Unprecedented')]//following-sibling::p//following-sibling::span")
	private WebElement sonyVAIOEXTax;
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
