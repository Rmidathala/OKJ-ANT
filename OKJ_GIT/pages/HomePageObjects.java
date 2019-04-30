package pages;

import static pages.ObjectLocator.*;

public enum HomePageObjects implements PageObjects {

	txtCursiveVerbiage("span.homepage-hero__top-text", CSS, "Cursive Verbiage on Hero Image	"),
	txtHeroVerbiage("span.homepage-hero__bottom-text",CSS,"Hero Verbiage on Hero Image"),
	headerLogo("a.header-logo",CSS,"Header Logo"),
	buttonShopSmokersGrill("//a[@class='button']",XPATH,"Shop Smokers & Grill Button"),
	
	//Header navigation links
	lnkNaviSmokerAndGrills("//span[text()='Smokers & Grills']",XPATH,"Smoker & Grill Navigation menu"), 
	txtSmokerAndGrillsPageTitle("//h1[@id='page-title-heading']/span",XPATH,"Smoker & Grill Page Heading"),
	txtSmokerAndGrillsPageTitleDescription("//div[@class='category-description']/p",XPATH,"Smoker & Grills Page Heading- Description"),
	
	
	lnkNaviAccessoriesAndParts("//span[text()='Accessories & Parts']",XPATH,"Accesories & Part Navigation Menu"),
	txtAccessorisAndPartsPageTitle("//h1[@id='page-title-heading']/span",XPATH,"Accessories & Parts Page Heading"),
	txtAccessoriesAndPartsPageTitleDescription("//div[@class='category-description']/p",XPATH,"Accessories & Parts Page Heading- Description"),
	
	lnkNaviTheCraft("//span[text()='The Craft']",XPATH,"The Craft Navigation Menu"),
	txtTheCraftPageTitle("//div[@class='hero__text-container hero__text-container--craft']/h1",XPATH,"The Craft Page Heading"),
	txtTheCraftPageTitleDescription("//span[@class='hero__description']",XPATH,"The Craft Page Heading- Description"),
	
	
	lnkNaviOurStory("//span[text()='Our Story']",XPATH,"Our Story Navigation Menu"),
	txtOurStoryPageTitle("//div[@class='hero__text-container hero__text-container--aboutus']/h1",XPATH,"Our Story Page Heading"),
	txtOurStoryPageTitleDescription("//span[@class='hero__description']",XPATH,"Our Story Page Heading- Description"),
	
	
	// Header - Smoker and Grills Sub-menu links
	lnkSubMenuOffsetSmokers("//span[text()='Offset Smokers']",XPATH,"Offset Smokers - Sub Menu of Smoker & Grills"),
	txtSubMenuOffsetSmokersPageTitle("//h1[@id='page-title-heading']",XPATH,"Sub-menu - Offset Smokers Page Heading title"),
	txtSubMenuOffsetSmokersPageDescription("//div[@class='category-description']/p/span",XPATH,"Sub-Menu - Offset Smokers Page Description"),
	
	
	lnkSubMenuSmokerGrillCombo ("//span[text()='Smoker/Grill Combos']",XPATH,"Smoker/Grill Combos - Sub Menu of Somoker & Grills"),
	txtSubMenuSmokersGrillComboPageTitle("//h1[@id='page-title-heading']/span",XPATH,"Smoker/Grill Combos - Sub Menu Page Heading title"),
	txtSubMenuSmokersGrillComboPageDescription("//div[@class='category-description']/p/span",XPATH,"Smoker/Grill Combos - Sub Menu Page Description"),
	
	lnkSubMenuCharCoalGrill("//span[text()='Charcoal Grills']",XPATH,"Charcoal Grills - Sub Menu of Smoker & Grills"),
	txtSubMenuCharCoalGrillPageTitle("//h1[@id='page-title-heading']/span",XPATH,"Charcoal Grill - Sub Menu Page Heading title"),
	txtSubMenuCharCoalGrillPageDescription("//div[@class='category-description']/p/span",XPATH,"CharCoal Grill - Sub Menu Page Description"),
		
	
	lnkSubMenuDrumSmokers("//span[text()='Drum Smokers']",XPATH,"Drum Smokers - Sub Menu of Smoker & Grills"),
	txtSubMenuDrumSmokersPageTitle("//h1[@id='page-title-heading']/span",XPATH,"Drum Smokers - Sub Menu Page Heading title"),
	txtSubMenuDrumSmokersPageDescription("//div[@class='category-description']/p/span",XPATH,"Drum Smokers - Sub Menu Page Description"),
	
	
	//Header - Accessories & Parts Sub Menu links
	lnkSubMenuTools("//span[text()='Tools']",XPATH,"Tools - Sub Menu of Accessories & Parts"),
	txtSubMenuToolsPageTitle("//h1[@id='page-title-heading']/span",XPATH,"Tools - Sub Menu Page Heading title of Menu Accessories & Parts"),
	txtSubMenuToolsPageDescription("//div[@class='category-description']/p",XPATH,"Tools- Sub Menu Page Description of Menu Accessories & Parts"),
	
	lnkSubMenuCovers("//span[text()='Covers']",XPATH,"Covers - Sub Menu of Accessories & Parts"),
	txtSubMenuCoversPageTitle("//h1[@id='page-title-heading']/span",XPATH,"Covers - Sub Menu Page Heading title of Menu Accessories & Parts"),
	txtSubMenuCoversPageDescription("//div[@class='category-description']/p",XPATH,"Covers- Sub Menu Page Description of Menu Accessories & Parts"),
	
	lnkSubMenuWood("//span[text()='Wood']",XPATH,"Wood - Sub Menu of Accessories & Parts"),
	txtSubMenuWoodPageTitle("//h1[@id='page-title-heading']/span",XPATH,"Wood - Sub Menu Page Heading title of Menu Accessories & Parts"),
	txtSubMenuWoodPageDescription("//div[@class='category-description']/p",XPATH,"Wood- Sub Menu Page Description of Menu Accessories & Parts"),
	
	lnkSubMenuMods("//span[text()='Mods']",XPATH,"Mods - Sub Menu of Accessories & Parts"),
	txtSubMenuModsPageTitle("//h1[@id='page-title-heading']/span",XPATH,"Mods - Sub Menu Page Heading title of Menu Accessories & Parts"),
	txtSubMenuModsPageDescription("//div[@class='category-description']/p",XPATH,"Mods- Sub Menu Page Description of Menu Accessories & Parts"),
	
	
	lnkSubMenuApparel("//span[text()='Apparel']",XPATH,"Apparel - Sub Menu of Accessories & Parts"),
	txtSubMenuApparelPageTitle("//h1[@id='page-title-heading']/span",XPATH,"Apparel - Sub Menu Page Heading title of Menu Accessories & Parts"),
	txtSubMenuApparelPageDescription("//div[@class='category-description']/p",XPATH,"Apparel- Sub Menu Page Description of Menu Accessories & Parts"),
	
	
	lnkSubMenuParts("//span[text()='Parts']",XPATH,"Parts - Sub Menu of Accessories & Parts"),
	txtSubMenuPartsPageTitle("//h1[@id='page-title-heading']/span",XPATH,"Parts - Sub Menu Page Heading title of Menu Accessories & Parts"),
	txtSubMenuPartsPageDescription("//div[@class='category-description']/p",XPATH,"Parts- Sub Menu Page Description of Menu Accessories & Parts"),
	
	
	//Header - The Craft Sub Menu Links
	LnkSubMenuRecipes("//span[text()='Recipes']",XPATH,"Recipes - Sub Menu of The Craft"),
	txtSubMenuRecipesPageTitle("//h1[@class='category-title category-title__title']",XPATH,"Recipes - Sub Menu Page Heading title of Menu The Craft"),
	txtSubMenuRecipesPageDescription("//div[@class='category-description']/p",XPATH,"Recipes- Sub Menu Page Description of Menu The Craft"),
	
	
	lnkSubMenuHowsTo("//span[contains(text(),'How-To')]",XPATH,"How-To's - Sub Menu of The Craft"),
	txtSubMenuHowToPageTitle("//h1[@class='category-title category-title__title']",XPATH,"How-To's - Sub Menu Page Heading title of Menu The Craft"),
	txtSubMenuHowToPageDescription("//div[@class='category-description']/p",XPATH,"How-To's- Sub Menu Page Description of Menu The Craft"),
	
	//Search Button
	btnSearch("//button[@id='searchButton']/i",XPATH,"Search Button on Home Page"),
	
	//Search Textbox
	txtBoxSearch("//input[@id='search']",XPATH,"Search Text box"),
	
	// Search Results
	txtSearchResults("//h1[@class='search__title__container search__title']",XPATH,"Search Text - Results"),
	
	// Cart 
	btnCart("//span[@class='right-links__item--text']/i[@class='fal fa-shopping-cart']",XPATH,"Cart Button"),
	
	//User Account
	btnUserAccount("//a[@title='User account']/span[@class='right-links__item--text']/i",XPATH,"User Account button"),
	
	//Sign In button
	btnSignIn("//a[text()='Sign In']",XPATH,"Sign Button in User Account"),
	btnSignUp("//a[text()='Sign Up']",XPATH,"Sign Up Button"),
	lnkOrders("//ul[@class='visible account-nav__content__links']/li/a[text()='Orders']",XPATH,"Orders link in Your Account Model Overlay"),
	lnkRegisteredProducts("//ul[@class='visible account-nav__content__links']/li/a[text()='Registered Products']",XPATH,"Registered Products Link in your Account Model Overlay"),
	lnkAccountInfo("//ul[@class='visible account-nav__content__links']/li/a[text()='Account Information']",XPATH,"Account Information LInk in your Account Model Overlay"),
	lnkAddressBook("//ul[@class='visible account-nav__content__links']/li/a[text()='Address Book']",XPATH,"Address Book link in your Account Model Overlay"),
	lnkReviews("//ul[@class='visible account-nav__content__links']/li/a[text()='Reviews']",XPATH,"Reviews Link in Your Account Overlay"),
	txtBoxEmailAddr("//input[@id='customer-email']",XPATH,"Email Address text Box in Sign In Model Overlay"),
	txtBoxPassword("//input[@name='password']",XPATH,"Password Text Box in Sign In Overlay"),
	btnSignInModelOverlay("//button[@class='action action-login secondary']",XPATH,"Sign In Button"),
	lnkForgotPassword("//a[@class='action action-forgot']",XPATH,"Forgot Password Link on Sign In Overlay"),
	txtDontHaveAccount("//div[@class='actions-toolbar__additional']/span",XPATH,"Don't have an account yet? text"),
	lnkSighUp("//a[@class='action action-signup']",XPATH,"Sign Up link in Sign In Page."),
	btnClose("//button[@class='action-close']",XPATH,"Close the Sign In Model"),
	txtWelcomeAfterLogin("//span[@class='account-nav__content__welcome']",XPATH,"Welcome Text After Login"),
	//Chat close button
	btnChatClose("//input[@id='tcChat_btnCloseChat_img']",XPATH,"Close the chat window"),
	
	//Close pop up
	btnClosePopUp("digioh_fb_close",CLASSNAME,"Close the pop up"),
	
	//Footer
	lblParts("//h3[@class='footer__headline' and text()='Parts']",XPATH,"Footer label: Parts"),
	txtBoxPartSearch("//input[@class='form__input footer__form-input']",XPATH,"Footer - Part Search text Box"),
	txtPartContactService("//div[@class='form__info footer__form-info']/span",XPATH,"Footer - Parts - Help identifying model"),
	txtSearchSuggestion("//input[@class='form__input footer__form-input']/following::li[1]",XPATH,"Parts Search Suggestion"),
	
	lblSupport("//h3[@class='footer__headline' and text()='Support']",XPATH,"Footer label: Support"),
	lnkFAQ("//a[text()='FAQ']",XPATH,"Footer - Support - FAQ"),
	lnkProductHelp("//a[text()='Product Help']",XPATH,"Footer - Support - Product Help link"),
	lnkSupportCenter("//a[text()='Support Center']",XPATH,"Footer - Support - Support Center link"),
	
	lblContactUs("//h3[@class='footer__headline' and text()='Contact us']",XPATH,"Footer label: Contact Us"),
	lnkTelePhone("//h3[@class='footer__headline' and text()='Contact us']/following::a[1]",XPATH,"Footer label: Contact Us - Telephone number link"),
	lblMonToFri("//h3[@class='footer__headline' and text()='Contact us']/following::span[1]",XPATH,"Footer lable: Contact US - Mon to Fri timings"),
	lnkSendEmail("//h3[@class='footer__headline' and text()='Contact us']/following::a[2]",XPATH,"Footer label: Contact US - Send an email link"),
	lblChatBusinessHour("//div[@class='footer__live-chat']/div",XPATH,"Chat During business hours"),
	
	//Social Media links
	facebookIcon("//a[@class='footer__social-media-link']/i[@class='fab fa-facebook']",XPATH,"Facebook icon in footer"),
	twitterIcon("//a[@class='footer__social-media-link']/i[@class='fab fa-twitter']",XPATH,"Twitter icon in Footer"),
	pinterestIcon("//a[@class='footer__social-media-link']/i[@class='fab fa-pinterest-square']",XPATH,"Pinterest icon in footer"),
	instagramIcon("//a[@class='footer__social-media-link']/i[@class='fab fa-instagram']",XPATH,"Instagram icon in footer"),
	youtubeIcon("//a[@class='footer__social-media-link']/i[@class='fab fa-youtube-square']",XPATH,"Youtube icon in footer"),
	
	//Body and copy link
	lnkPrivacyPolicy("//a[text()='Privacy Policy']",XPATH,"Privacy Policy link"),
	lnkTermsOfUse("//a[text()='Terms of Use']",XPATH,"Terms of use"),
	lnkCaTransparency("//a[text()='CA Transparency Supply Chains Act']",XPATH,"CA Transparency Supply Chains Act"),
	lnkAccessibilityStmt("//a[text()='Accessibility Statement']",XPATH,"Accessibility Statement link"),
	lblCopyRight("//address",XPATH,"Charbroil copyright"),
	
	//View all Smokers and Grills
	btnViewAllSmokersGrills("//div[@class='catalog-categories__viewall']/a",XPATH,"view all smokers and grills button"),
	
	lnkLiveChat("//div[@class='footer__live-chat']/div",XPATH,"Live Chat Link in footer"),
	
	//User Account After Logged In
	lnkOrdersAfterLoggedIn("//ul[@class='account-nav__content__links visible']/li/a[text()='Orders']",XPATH,"Orders link in Your Account Model Overlay"),
	lnkRegisteredProductsAfterLoggedIn("//ul[@class='account-nav__content__links visible']/li/a[text()='Registered Products']",XPATH,"Registered Products Link in your Account Model Overlay"),
	lnkAccountInfoAfterLoggedIn("//ul[@class='account-nav__content__links visible']/li/a[text()='Account Information']",XPATH,"Account Information LInk in your Account Model Overlay"),
	lnkAddressBookAfterLoggedIn("//ul[@class='account-nav__content__links visible']/li/a[text()='Address Book']",XPATH,"Address Book link in your Account Model Overlay"),
	lnkReviewsAfterLoggedIn("//ul[@class='account-nav__content__links visible']/li/a[text()='Reviews']",XPATH,"Reviews Link in Your Account Overlay"),
	lnkSignOut("//ul[@class='account-nav__content__links visible']/li/a[text()='Sign Out']",XPATH,"Sign out link in My Account Model"),
	
	
	countItemsInCart("//span[@class='right-links__item--count counter-number']",XPATH,"No of Items in Cart count value"),
	;

	String strProperty = "";
	ObjectLocator locatorType = null;
	String strObjName = "";

	public String getProperty() {
		return strProperty;
	}

	public ObjectLocator getLocatorType() {
		return locatorType;
	}

	private HomePageObjects(String strPropertyValue, ObjectLocator locatorType, String strObjName) {
		this.strProperty = strPropertyValue;
		this.locatorType = locatorType;
		this.strObjName = strObjName;
	}

	@Override
	public String getObjectname() {
		// TODO Auto-generated method stub
		return strObjName;
	}

}
