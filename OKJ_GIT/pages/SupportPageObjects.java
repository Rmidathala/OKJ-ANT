package pages;

import static pages.ObjectLocator.*;

public enum SupportPageObjects implements PageObjects {

	headingProductSupport("h1",TAG,"Product Support - Heading - Product Support"),
	productSupportheadingDesc("//span[@class='hero__description']/p",XPATH,"Product Support page - Description to Product Support Page"),
	
	//Product Search
	titleProductSearch("//div[@class='product-help-search__heading']",XPATH,"Product Support Page - Title Product Search"),
	descProductSearch("//div[@class='product-help-search__description']/p",XPATH,"Product Support Page - Description for Prodcut Search"),
	productList("//div[@class='product-help-search__description']/ul/li",XPATH,"Product Support Page - List of Products that can be searched"),
	txtBoxEnterProductModelNumber("model",NAME,"Product Support Page - Enter Product Model Number Text Box"),
	helpTextProductSearch("//div[@class='product-help-search__link']/span",XPATH,"Product Support - Product Search section - Help text for finding product model"),
	
	//Product Registration
	titleProductRegistration("//div[@class='product-registration-summary__heading']",XPATH,"Product Support Page - Product Registration Section - Title- Product Registration"),
	descProductRegistration("//div[@class='product-registration-summary__description']",XPATH,"Product Support Page - Product Registration Section - Description "),
	btnRegisterProduct("//a[@class='button product-registration-summary__register-button']",XPATH,"Product Support page - Product Registration Section - Register Product Button"),
	
	//FAQ
	titleFAQ("//div[@class='accordion__heading']",XPATH,"Product Support Page - FAQ section - Title FAQ "),
	subtitleHowDoISeasonMySmoker("accordion-title-how-do-i-season-my-smoker",ID,"Product Support Page - FAQ Section - Subtitle - How Do I Season My Smoker"),
	descForHowDoISeasonMySmoker("//div[@class='accordion__content']",XPATH,"Product Support Page - FAQ Section - Description for How Do I Season My Smoker"),
	lnkViewAllFAQs("//a[text()='View All FAQs']",XPATH,"Product Support Page - FAQ Section - View All FAQs Link"),
	
	//Order Help
	titleOrderHelp("//div[@class='support-orderhelp-links__heading']",XPATH,"Product Support Page - Order Help Section - Title Order Help"),
	lnkShipping("(//div[@class='support-orderhelp-links__title']/a)[1]",XPATH,"Product Support - Order Help Section - Shipping Link"),
	descForShipping("(//div[@class='support-orderhelp-links__detail'])[1]",XPATH,"Product Support Page - Order Help Section - Shipping Description"),
	lnkOrderTracking("(//div[@class='support-orderhelp-links__title']/a)[2]",XPATH,"Product Support - Order Help Section - Order Tracking Link"),
	descForOrderTracking("(//div[@class='support-orderhelp-links__detail'])[2]",XPATH,"Product Support - Order Help Section - Order Tracking Link Description"),
	lnkCaseLookup("(//div[@class='support-orderhelp-links__title']/a)[3]",XPATH,"Product Support Page - Order Help Section - Case Look up link"),
	descForCaseLookup("(//div[@class='support-orderhelp-links__detail'])[3]",XPATH,"Product Support Page -Order Hep Section - Case Look up link Description "),
	lnkReturns("(//div[@class='support-orderhelp-links__title']/a)[4]",XPATH,"Product Support Page - Order Help Section - Returns link"),
	descForReturns("(//div[@class='support-orderhelp-links__detail'])[4]",XPATH,"Product Support Page - Order Help Section - Returns link description"),
	
	//Forms & Information
	titleFormsNInformation("//div[@class='support-forms__heading']",XPATH,"Product Support Page - Forms And Information Section - Forms and Information Title"),
	lnkPromotionPolicy("(//div[@class='support-forms__title']/a)[1]",XPATH,"Product Support Page - Forms and Information Section - Promotion Policy Link"),
	descPromotionPolicy("(//div[@class='support-forms__detail'])[1]",XPATH,"Product Support Page - Forms and Information Section - Promotion Policy Description"),
	lnkProductRecalls("(//div[@class='support-forms__title']/a)[2]",XPATH,"Product Support Page - Forms and Information Section - Product Recalls link"),
	descProductRecalls("(//div[@class='support-forms__detail'])[2]",XPATH,"Product Support Page - Forms and Information Section - Product Recalls Description"),
	
	//Can't Find What Your're Looking For
	

	titleCantFindWhatLooking("//div[@class='support-summary__heading text-center']",XPATH,"Product Support Page - Can't Find What You're Looking For? section title"),
	//Call 
	txtCall("//div[@id='support-summary-call']/div[1]",XPATH,"Product Support Page - Can't Find What Looking Section - Call subtitle"),
	txtCallTimings("//div[@id='support-summary-call']/div[2]",XPATH,"Product Support Page - Can't Find What Looking Section - Call timings description"),
	lnkPhoneNumber("//div[@id='support-summary-call']/a",XPATH,"Product Support Page - Cant Find What you're Looking Section - Phone Number link"),
	
	//Email
	txtEmail("//div[@id='support-summary-email']/div[1]",XPATH,"Product Support Page - Can't Find What Looking Section - Email subtitle"),
	txtEmaildescription("//div[@id='support-summary-email']/div[2]",XPATH,"Product Support Page - Can't Find What Looking Section - Email description"),
	lnkSendEmail("//div[@id='support-summary-email']/a",XPATH,"Product Support Page - Cant Find What you're Looking Section - Send Us an Email link"),
	
	//Chat
	txtChat("//div[@id='support-summary-chat']/div[1]",XPATH,"Product Support Page - Can't Find What Looking Section - Chat subtitle"),
	txtChatDescription("//div[@id='support-summary-chat']/div[2]",XPATH,"Product Support Page - Can't Find What Looking Section - Chat description"),
	lnkStartAChat("//div[@id='support-summary-chat']/span",XPATH,"Product Support Page - Cant Find What you're Looking Section - Start a Chat link"),
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

	private SupportPageObjects(String strPropertyValue, ObjectLocator locatorType, String strObjName) {
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
