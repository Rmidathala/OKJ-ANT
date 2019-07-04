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
	btnaccessoriesPartPageviewAccessories("//div[@class='container text-center']/a[@class='button primary']",XPATH,"Accessibility & Parts Page - Button - VIEW ALL ACCESSORIES Button"),
	accessoriesPartPageNeedHelp("//h2[@class='parts-widget__title text-center']",XPATH,"Accessories & Parts Page - Heading - Need to find a part?"),
	accessoriesPartsPageMostPopular("//h2[@class='product-popular__heading']",XPATH,"Accessories & Parts Page - Heading - Most Popular"),
	accessoriesPartsPageMostPopularItems("//ol[@class='product-popular__list']/li/div/a/img",XPATH,"Accessories & Parts Page - Most Popular Items"),
	
	
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
	btnSearch("//button[@id='searchButton']",XPATH,"Search Button on Home Page"),
	
	//Search Textbox
	txtBoxSearch("//input[@id='search']",XPATH,"Search Text box"),
	
	// Search Results
	txtSearchResults("//h1[@class='search__title__container search__title']",XPATH,"Search Text - Results"),
	lblProducts("//span[@class='ctm-search-tabs__link']",XPATH,"Search Results page  - Products section label"),
	lnkRecipes("(//li[@class='ctm-search-tabs__item text-center']/a)[1]",XPATH,"Search Results Page - Recipes link section"),
	lnkHowTo("(//li[@class='ctm-search-tabs__item text-center']/a)[2]",XPATH,"Search Results  Page - How To Link"),
	lblTrySearchAgain("//div[@class='search__tryagain__label']",XPATH,"Search Results page - Try Search Again label"),
	txtBoxImLookingFor("//input[@class='search__tryagain__input']",XPATH,"Search Results Page - Text Box I'm Looking for"),
	// Cart 
	btnCart("//span[@class='right-links__item--text']/i[@class='fal fa-shopping-cart']",XPATH,"Cart Button"),
	
	//User Account
	btnUserAccount("//a[@title='User account']/span[@class='right-links__item--text']/i",XPATH,"User Account button"),
	
	//Sign In Model
	btnSignIn("//a[text()='Sign In']",XPATH,"Sign Button in User Account"),
	btnSignUp("//a[text()='Sign Up']",XPATH,"Sign Up Button"),
	lnkOrders("(//a[text()='Orders'])[1]",XPATH,"Orders link in Your Account Model Overlay"),
	lnkRegisteredProducts("(//a[text()='Registered Products'])[1]",XPATH,"Registered Products Link in your Account Model Overlay"),
	lnkAccountInfo("(//a[text()='Account Information'])[1]",XPATH,"Account Information LInk in your Account Model Overlay"),
	lnkAddressBook("(//a[text()='Address Book'])[1]",XPATH,"Address Book link in your Account Model Overlay"),
	lnkReviews("(//a[text()='Reviews'])[1]",XPATH,"Reviews Link in Your Account Overlay"),
	txtBoxEmailAddr("//input[@id='customer-email']",XPATH,"Email Address text Box in Sign In Model Overlay"),
	txtBoxPassword("//input[@name='password']",XPATH,"Password Text Box in Sign In Overlay"),
	btnSignInModelOverlay("//button[@class='action action-login secondary']",XPATH,"Sign In Button"),
	lnkForgotPassword("//a[@class='action action-forgot']",XPATH,"Forgot Password Link on Sign In Overlay"),
	txtDontHaveAccount("//div[@class='actions-toolbar__additional']/span",XPATH,"Don't have an account yet? text"),
	lnkSighUp("//a[@class='action action-signup']",XPATH,"DON'T HAVE AN ACCOUNT YET? SIGN UP link in Sign In Model."),
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
	msgPartSearchError("footer-partfinder__no-results",ID,"Home Page - Footer - Error messsage for invalid part model#"),
	lblSupport("//h3[@class='footer__headline' and text()='Support']",XPATH,"Footer label: Support"),
	lnkFAQ("//a[text()='FAQ']",XPATH,"Footer - Support - FAQ"),
	lblFAQ("h1",TAG,"FAQ Page - Heading - FAQs"),
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
	
	
	//Accessibility Page Verbiage Section
	accessibilityPageheading1("//span[@data-ui-id='page-title-wrapper']",XPATH,"Accessibility Page - Heading 1 - Oklahoma Joe's Accessibility Statement"),
	accessibilityPageheading2("//h2[text()='REASONABLE ACCOMMODATIONS']",XPATH,"Accessibilty Page - Heading 2 - REASONABLE ACCOMMODATIONS"),
	accessibilityPageheading3("//h2[text()='ONLINE ACCESSIBILITY']",XPATH,"Accessibility Page - Heading 3 - ONLINE ACCESSIBILITY"),
	accessibilityPageheading4("//h2[text()='THIRD-PARTY WEBSITES']",XPATH,"Accessibility Page - Heading 4 - THIRD-PARTY WEBSITES"),
	accessibilityPageheading5("//h2[text()='FEEDBACK']",XPATH,"Accessibilty Page Heading 5 - Feedback"),
	
	//Terms of Use Page Verbiage Section
	termsOfUsePageMainHeading("//span[@data-ui-id='page-title-wrapper']",XPATH,"Terms Of Use Page - Main Heading - 'Terms Of Use'"),
	termsOfUsePageSubHeading("//h3[text()='TERMS OF USE']",XPATH,"Terms of Use Page - Sub Heading - 'Terms Of Use'"),
	termsOfUsePageHeading1("//h3[text()='USE OF SERVICES']",XPATH,"Terms Of Use Page - Heading - USE OF SERVICES"),
	termsOfUsePageHeading2("//h3[text()='USER CONTENT AND CONDUCT']",XPATH,"Terms Of Use Page - Heading - USER CONTENT AND CONDUCT"),
	termsOfUsePageHeading3("//h3[text()='COMPANY CONTENT']",XPATH,"Terms of Use Page - Heading - COMPANY CONTENT"),
	termsOfUsePageHeading4("//h3[text()='PRODUCTS FROM COMPANY']",XPATH,"Terms Of Use Page - Heading -PRODUCTS FROM COMPANY"),
	termsOfUsePageHeading5("//h3[text()='PRIVACY AND SECURITY']",XPATH,"Terms Of Use Page - Heading - PRIVACY AND SECURITY"),
	termsOfUsePageHeading6("//h3[text()='NOTICE OF CLAIMS OF COPYRIGHT INFRINGEMENT']",XPATH,"Terms Of Use Page - Heading -NOTICE OF CLAIMS OF COPYRIGHT INFRINGEMENT"),
	termsOfUsePageHeading7("//h3[text()='THIRD-PARTY WEBSITES AND SERVICES']",XPATH,"Terms Of Use Page - Heading - THIRD-PARTY WEBSITES AND SERVICES"),
	termsOfUsePageHeading8("//h3[text()='INDEMNITY']",XPATH,"Terms Of Use Page - INDEMNITY"),
	termsOfUsePageHeading9("//h3[text()='NO WARRANTY']",XPATH,"Terms Of Use Page - NO WARRANTY"),
	termsOfUsePageHeading10("//h3[text()='LIMITATION OF LIABILITY']",XPATH,"Terms Of Use Page - LIMITATION OF LIABILITY"),
	termsOfUsePageHeading11("//h3[text()='GENERAL']",XPATH,"Terms Of Use Page - GENERAL"),
	
	
	//Supply Chains Act Page Verbiage Section
	supplyChainsActPageMainHeading("//span[@data-ui-id='page-title-wrapper']",XPATH,"Supply Chains Act Page - Main Heading - Supply Chains Act"),
	supplyChainsActPageSubHeading("//div[@class='column main']/h3",XPATH,"Supply Chains Act Sub Heading - CHAR-BROIL, LLC DISCLOSURE PURSUANT TO CALIFORNIA'S TRANSPARENCY IN SUPPLY CHAINS ACT 2010"),
	
	//Shipping Policy Page Verbiage Section
	shippingPolicyPageMainHeading("//span[@data-ui-id='page-title-wrapper']",XPATH,"Shipping Policy Page - Main Heading - Shipping Policy"),
	shippingPolicyPageHeading1("//h2[text()='DELIVERY OPTIONS / SHIPPING & HANDLING']",XPATH,"Shipping Policy Page - Heading - DELIVERY OPTIONS / SHIPPING & HANDLING"),
	shipppingPolicyPageHeading2("//h2[text()='DELIVERY OPTIONS']",XPATH,"Shipping Policy Page - Heading - DELIVERY OPTIONS"),
	shippingPolicyPageHeading3("//h2[text()='SHIPPING & HANDLING RATES*']",XPATH,"Shipping Policy Page - Heading - SHIPPING & HANDLING RATES*"),
	shippingPolicyPageHeading4("//h2[text()='WARRANTY ORDERS']",XPATH,"Shipping Policy Page - Heading - WARRANTY ORDERS"),
	shippingPolicyPageHeading5("//h2[text()='OVERSIZED SHIPPING & TRUCK/FREIGHT DELIVERY']",XPATH,"Shipping Policy Page - Heading - OVERSIZED SHIPPING & TRUCK/FREIGHT DELIVERY"),
	shippingPolicyPageHeading6("//h2[text()='APO/FPO SHIPMENTS']",XPATH,"Shipping Policy Page Heading - APO/FPO SHIPMENTS"),
	shippingPolicyPageHeading7("//h2[text()='INTERNATIONAL SHIPMENTS']",XPATH,"Shipping Policy Page Heading - INTERNATIONAL SHIPMENTS"),
	
	// Privacy Policy Page Verbiage Section
	privacyPolicyPageMainHeading("//span[@data-ui-id='page-title-wrapper']",XPATH,"Privacy Policy Page - Main Heading -'Privacy Policy'"),
	privacyPolicyPageHeading1("//h3[text()='OUR COMMITMENT TO PRIVACY']",XPATH,"Privacy Policy Page Heading - OUR COMMITMENT TO PRIVACY"),
	privacyPolicyPageHeading2("//h3[text()='YOUR PERSONAL INFORMATION']",XPATH,"Privacy Policy Page Heading - YOUR PERSONAL INFORMATION"),
	privacyPolicyPageHeading3("//h3[text()='INFORMATION YOU PROVIDE']",XPATH,"Privacy Policy Page Heading - INFORMATION YOU PROVIDE"),
	privacyPolicyPageHeading4("//h3[text()='INFORMATION WE COLLECT']",XPATH,"Privacy Policy Page Heading - INFORMATION WE COLLECT"),
	privacyPolicyPageHeading5("//strong[text()='Cookies:']",XPATH,"Privacy Policy Page Heading - Cookies:"),
	privacyPolicyPageHeading6("//strong[text()='Web Beacons:']",XPATH,"Privacy Policy Page Heading - Web Beacons:"),
	privacyPolicyPageHeading7("//strong[text()='Disabling Cookies and Beacons:']",XPATH,"Privacy Policy Page Heading - Disabling Cookies and Beacons:"),
	privacyPolicyPageHeading8("//strong[text()='IP Address:']",XPATH,"Privacy Policy Page Heading - IP Address:"),
	privacyPolicyPageHeading9("//strong[text()='Using Your Information']",XPATH,"Privacy Policy Page Heading - Using Your Information"),
	privacyPolicyPageHeading10("//h3[text()='SHARING YOUR INFORMATION']",XPATH,"Privacy Policy Page Heading - SHARING YOUR INFORMATION"),
	privacyPolicyPageHeading11("//h3[text()='PROTECTING YOUR INFORMATION']",XPATH,"Privacy Policy Page Heading - PROTECTING YOUR INFORMATION"),
	privacyPolicyPageHeading12("//h3[text()='COMMUNITIES']",XPATH,"Privacy Policy Page Heading - COMMUNITIES"),
	privacyPolicyPageHeading13("//h3[text()=\"CHILDREN'S PRIVACY\"]",XPATH,"Privacy Policy page Heading - CHILDREN'S PRIVACY"),
	privacyPolicyPageHeading14("//h3[text()='OUTSIDE LINKS']",XPATH,"Privacy Policy Page Heading - OUTSIDE LINKS"),
	privacyPolicyPageHeading15("//h3[text()='KEEPING YOUR INFORMATION ACCURATE']",XPATH,"Privacy Policy Page Heading - KEEPING YOUR INFORMATION ACCURATE"),
	privacyPolicyPageHeading16("//h3[text()='HOW TO REACH US']",XPATH,"Privacy Policy Page Heading - HOW TO REACH US"),
	privacyPolicyPageHeading17("//h3[text()='CHANGES TO THIS PRIVACY NOTICE']",XPATH,"Privacy Policy Page Heading - CHANGES TO THIS PRIVACY NOTICE"),
	
	
	//View all Smokers and Grills
	btnViewAllSmokersGrills("//div[@class='catalog-categories__viewall']/a",XPATH,"view all smokers and grills button"),
	
	lnkLiveChat("//div[@class='footer__live-chat']/div",XPATH,"Live Chat Link in footer"),
	
	//User Account After Logged In
	lnkOrdersAfterLoggedIn("(//a[text()='Orders'])[1]",XPATH,"Orders link in Your Account Model Overlay"),
	lnkRegisteredProductsAfterLoggedIn("(//a[text()='Registered Products'])[1]",XPATH,"Registered Products Link in your Account Model Overlay"),
	lnkAccountInfoAfterLoggedIn("(//a[text()='Account Information'])[1]",XPATH,"Account Information LInk in your Account Model Overlay"),
	lnkAddressBookAfterLoggedIn("(//a[text()='Address Book'])[1]",XPATH,"Address Book link in your Account Model Overlay"),
	lnkReviewsAfterLoggedIn("(//a[text()='Reviews'])[1]",XPATH,"Reviews Link in Your Account Overlay"),
	lnkSignOut("(//a[text()='Sign Out'])[1]",XPATH,"Sign out link in My Account Model"),
	
	
	countItemsInCart("//span[@class='right-links__item--count counter-number']",XPATH,"No of Items in Cart count value"),
	
	//Category Landing Page - Smokers & Grills
	
	txtTitleSmokersGrills("page-title-heading",ID,"Smokers & Grills - Heading"),
	
	
	// Links in Our Story
	
	btnProTips("//a[@id='getSponsored']/following::a[1]",XPATH,"View Pro Tips Button on Our Story Page"),
	titleProTips("//div[@class='hero__text-container']/h1",XPATH,"Title: Pro Tips on Pro Tips Page"),
	
	// Sign Up Page
	headingCreateNewAc("//h2[@class='blank__title']",XPATH,"Sign Up Page - Create New Account Heading"),
	lblPersonalInfo("//fieldset[@class='fieldset create info']/legend[@class='legend']/span",XPATH,"Sign up Page - Personal Information label"),
	txtBoxFirstName("firstname",ID,"Sign Up - Create new a/c page - First Name Text Box"),
	txtBoxLastName("lastname",ID,"Sign Up - Create New a/c Page - Last Name Text Box"),
	chkBoxGetRecipes("//div[@class='choice field']/label",XPATH,"Sign Up - Create New account Page- Checkbox to get new Recipes"),
	lblSignUpMailingList("//div[@class='field choice']/label/span",XPATH,"Sign up - Create New account Page - Label - Sign up for mailing list"),
	lblSignInInformation("//fieldset[@class='fieldset create account']/legend/span",XPATH,"Sign Up - Create new Account Page - Sub Heading - Sign In Information"),
	txtBoxSignUpEmail("email_address",ID,"Sign Up - Create New Account - Text Box Email"),
	txtBoxSignUPPassword("password",ID,"Sign UP - Create New Account - Password Text box"),
	txtBoxSignUpConfirmPassword("password-confirmation",ID,"Sign Up - Create New Account Page - Confirm Password Text Box"),
	lblPwdStrenthMeter("//div[@class='password-strength-meter']",XPATH,"Sign Up - Create New Account - Password Strength meter"),
	btnCreateAccount("//button[@title='Create an Account']",XPATH,"Sign Up - Create New Account - Create New Account Button"),
	
	msgInvalidLoginError("//div[@class='message message-error error']/div",XPATH,"Sign In Model - Invalid login error msg - Invalid login or password."),
	
	//Forgot password Page
	headingForgotPassword("//div[@class='column main']/h2",XPATH,"Forgot Password Page - Label - Forgot Password"),
	txtEnterEmailaddrs("//div[@class='body-copy field note']",XPATH,"Forgot Password page - Text - Please enter your email address below to receive a password reset link."),
	txtBoxForgotPwdEmail("email_address",ID,"Forgot Password Page - Text Box - Email Address"),
	txtBoxCaptcha("captcha_user_forgotpassword",ID,"Forgot Password page - Text Box - Enter the Captcha"),
	imgCaptcha("//div[@id='captcha-container-user_forgotpassword']/div[@class='control captcha-image']/img",XPATH,"Forgot Password Page - Captcha Image"),
	btnReloadCaptcha("//div[@id='captcha-container-user_forgotpassword']/div[@class='control captcha-image']/button",XPATH,"Forgot Password Page - Releoad Captch Button"),
	btnResetMyPassword("//div[@class='primary pl-2']/button",XPATH,"Forgot Password page - Reset Password Button"),
	
	lnkProTips("//a[@class='howto-banner__cta button primary']",XPATH,"Accessories and Part Page - Link Pro Tips"),
	
	// Recipe Listing Page
	lblRecipes("//h1[@class='category-title category-title__title']",XPATH,"Recipes Page - Label Recipes"),
	paraRecipesPage("//div[@class='category-description']/p",XPATH,"Recipes Page - Description - Recipes"),
	btnFilter("//div[@class='toolbar-filter__label']/span",XPATH,"Recipes Page - Filter Button"),
	drpDownRecommended("//div[@class='select-dropdown__title toolbar-sorter__options']",XPATH,"Recipes Page - Recommended Drop Down"),
	RecipesList("//div[@class='container cards__container']/a",XPATH,"Recipes Page - Recipes "),
	RecipesListNames("//div[@class='container cards__container']/a/div[1]/span/span",XPATH,"Recipes Page - Recipes List Names"),
	labelRecipeName("//section[@class='recipe-detail-card']/h1",XPATH,"Recipe Page - Recipe"),
	btnLoadMore("ctm-loadmore-button",ID,"Recipe Page - Load More Button"),
	iconAdditonal("//div[@class='icon--container']",XPATH,"Recipe Listing Page - Additional icon"),
	
	//Recipe Listing page - More from Craft section
	lblMoreFromCraft("//h2[@class='more-craft__title']",XPATH,"Recipe Listing Page - More From Craft Label"),
	imgHowToCleanAndMaintainSmoker("//div[@class='more-craft__left']/a",XPATH,"Recipe Page - More Fromm Craft Section - How to Clean and Maintain Your Somker"),
	imgHowToCleanSmallicon("//div[@class='more-craft__left']/a/div/div",XPATH,"Recipe Page - More from Craft Section - Additional Icon"),
	lblHowtoCleanAndMaintainSmoker("//div[@class='more-craft__left']/a/div/span/span",XPATH,"Recipe Page - More from Craft section - Label - How to Clean And Maintain Your Smoker"),
	videMoreFromCraft("more-from-craft-video",ID,"Recipe Page - More From Craft Section video"),
	lblHowToBuildAndManagePerfectFire("//h3[@class='more-craft-fill__title text-charcoal']",XPATH,"Recipe Page - More From Craft Section Video - How to Build and Maintain Perfect Fire"),
	btnViewHow_To("//a[@class='button primary']",XPATH,"Recipe Page - More from Craft Section - View How-to button"),
	
	// Recipe Listing Page - get recipes to your inbox
	lblGetRecipesTipsDeliveredToInbox("//section[@class='newsletter']/div[1]",XPATH,"Recipe Listing page - Get Recipes & Tips Delivered to Inbox section - label"),
	txtBoxemail("newsletter",ID,"Recipe Listing Page - Get Recipes & Tips Delivered To Inbox Section - Email text box"),
	btnSignMeUp("//button[@title='SIGN ME UP']",XPATH,"Recipe Listing Page - Get Recipes & Tips Delivered To Inbox Section - Sign Me Up Button"),
	sucessSignUp("//div[@class='newsletter__title']/h1",XPATH,"Recipe Listing Page - Get Recipes & Tips Delivered to Inbox Section - Success Overlay"),
	
	// Recipe Details Page
	video("//div[@class='video-product']",XPATH,"Recipe Details Page - Recipe Video"),
	ingridientsSection("//section[@class='recipe-detail-ingredients recipe-detail--left']",XPATH,"Recipe Details Page - Ingridients Page"),
	preparationSection("recipe-detail-directions-section",ID,"Recipe Details Page - Preparation Section"),
	btnSendListEmail("//a[@class='button button--secondary open-modal-form']",XPATH,"Recipe Details Page - Send List Email Button"),
	
	// send List Email pop up
	popUpTextHeader("ingredients-email-header",ID,"Recipe Details Page - Text on pop up -Please enter an email address to send the ingredients list. "),
	txtBoxEmail("email",ID,"Recipe Details page - Email text box"),
	btnSubmit("//button[@class='button my-2']",XPATH,"Recipe Details page - Submit Button"),
	msgEmailSent("recipes-error",ID,"Recipe Details page - Success message - Email has been sent"),
	
	
	// Craft Page
	lblRecipesCraftPage("//h3[text()='Recipes']",XPATH,"The Craft Page - Recipes Label "),
	txtAbtRecipesCraftPage("(//div[@class='howto-banner__content']/p)[1]",XPATH,"The Craft Page - Recipes Description"),
	btnViewAllRecipesCraftPage("(//a[@class='button'])[1]",XPATH,"The Craft Page - View All Recipes Button"),
	videoRecipeCraftPage("(//div[@class='video-product'])[1]",XPATH,"The Craft Page - Recipe Video Page "),
	
	lblHowToCraftPage("//h3[text()=\"How-To's\"]",XPATH,"The Craft page - How to label"),
	txtAbtHowToCraftPage("(//div[@class='howto-banner__content']/p)[2]",XPATH,"The Craft Page -How To Description"),
	btnViewAllHowToCraftPage("(//a[@class='button'])[2]",XPATH,"The Craft Page - View All How To Button"),
	videoHowToCraftPage("(//div[@class='video-product'])[2]",XPATH,"The Craft Page - How To Video Page "),
	
	
	// How To Page
		lbHowTo("//h1[@class='category-title category-title__title']",XPATH,"How To Page - Label How To"),
		paraHowToPage("//div[@class='category-description']/p",XPATH,"How Tp Page - Description - How To"),
		btnFilterHowToPage("//div[@class='toolbar-filter__label']/span",XPATH,"How To Page - Filter Button"),
		drpDownRecommendedHowToPage("//div[@class='select-dropdown__title toolbar-sorter__options']",XPATH,"How to Page - Recommended Drop Down"),
		HowtoList("//div[@class='container cards__container']/a",XPATH,"HowTo Page - Recipes "),
		HowToListNames("//div[@class='container cards__container']/a/div[1]/span/span",XPATH,"HowTo Page - How To List Names"),
		labelHowToName("//section[@class='howto-detail-card howto-detail-card--simple']/h1",XPATH,"Recipe Page - Recipe"),
		btnLoadMoreHowToPage("ctm-loadmore-button",ID,"Recipe Page - Load More Button"),
		iconAdditonalHowToPage("//div[@class='icon--container']",XPATH,"Recipe Listing Page - Additional icon"),
		
		//How To page - More from Craft section
		lblMoreFromCraftHowToPage("//h2[@class='more-craft__title']",XPATH,"How To Page - More From Craft Label"),
		imgBoldAndSpicy("//div[@class='more-craft__left']/a",XPATH,"How to Page - More Fromm Craft Section - Bold and Spicy pulled...."),
		imgBoldAndSpicyicon("//div[@class='more-craft__left']/a/div/div",XPATH,"How To Page - More from Craft Section - Additional Icon"),
		lblBoldAndSpicy("//div[@class='more-craft__left']/a/div/span/span",XPATH,"How to Page - More from Craft section - Label - Bold and spicy..."),
		videoMoreFromCraftHowToPage("more-from-craft-video",ID,"How To Page - More From Craft Section video"),
		lblWholeSmokedChicken("//h3[@class='more-craft-fill__title text-charcoal']",XPATH,"How To Page - More From Craft Section Video -Whole Smoked Chicken"),
		btnViewRecipe("//a[@class='button primary']",XPATH,"How To Page - More from Craft Section - View Recipe button"),
		
		// How To Page - get recipes to your inbox
		lblGetRecipesTipsDeliveredToInboxHowToPage("//section[@class='newsletter']/div[1]",XPATH,"How To page - Get Recipes & Tips Delivered to Inbox section - label"),
		txtBoxemailHowtoPage("newsletter",ID,"How To Page - Get Recipes & Tips Delivered To Inbox Section - Email text box"),
		btnSignMeUpHowToPage("//button[@title='SIGN ME UP']",XPATH,"How To Page - Get Recipes & Tips Delivered To Inbox Section - Sign Me Up Button"),
		sucessSignUpHowToPage("//div[@class='newsletter__title']/h1",XPATH,"How To Page - Get Recipes & Tips Delivered to Inbox Section - Success Overlay"),
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
