package pages;

import static pages.ObjectLocator.*;

public enum FAQPageObjects implements PageObjects {

	titleFAQs("//div[@class='hero__text-container']/h1",XPATH,"FAQ Page - FAQs Title"),
	// Jump to Category
	lblJumpToCategory("//div[@class='accordion__categories__label']",XPATH,"FAQ Page - Label Jump To Category"),
	lnkMostPopular("//a[text()='Most Popular']",XPATH,"FAQ Page - Jump to Category - Most Popular Link"),
	lnkProduct("//a[text()='Product']",XPATH,"FAQ Page - Jump to Category - Product link"),
	lnkSmokingTechnique("//a[text()='Smoking Technique']",XPATH,"FAQ Page - Jumpt To Category - Smoking Technique"),
	// Most Popular
	subTitleMostPopular("//div[@id='accordion__most_popular']/div[1]",XPATH,"FAQ Page - Label - Most Popular"),
	lblHowDoISeasonMySmoker("accordion-title-how-do-i-season-my-smoker",ID,"FAQ Page - Sub Label - How do I Season My Somker"),
	txtHowDoISeasonMySmoker("//div[@id='accordion__most_popular']/div[2]/div[2]",XPATH,"FAQ Page Paragraph for - How Do I Season My Smoker"),
	
	//Product
	subTitleProduct("//div[@id='accordion__product']/div[1]",XPATH,"FAQ Page - Label- Product"),
	lblHowDoICleanGrates("accordion-title-clean-grates",ID,"FAQ Page - Sub Label - How Do I Clean Grates"),
	txtHowDoICleanGrates("//div[@id='accordion__product']/div[2]/div[2]",XPATH,"FAQ Page - Paragraph for - How Do I Clean Grates "),
	
	lblHowDoIMaintainMySmoker("accordion-title-maintain-smoker",ID,"FAQ Page - Sub Label under Product - How Do I Maintain My Smoker"),
	txtHowDoIMaintainMySmoker("//div[@id='accordion__product']/div[3]/div[2]",XPATH,"FAQ Page - Paragrph for Product - How Do I Maintain My Smoker"),
	
	//Smoking Technique
	subTitleSmokingTechnique("//div[@id='accordion__smoking_technique']/div[1]",XPATH,"FAQ  Page - Label - Smoking Technique"),
	lblHowDoIBuildAFireInTheFirefox("accordion-title-build-a-fire-in-the-firebox",ID,"FAQ Page - Sub Label - How Do I Build A Fire in the Firefox"),
	txtHowDoIBuildAFireInTheFirefox("//div[@id='accordion__smoking_technique']/div[2]/div[2]",XPATH,"FAQ Page - Paragraph for Smoking Technique - How Do I Build a Fire in the Firefox"),
	
	// More from the Craft section
	titleMoreFromCraft("//div[@class='cards__heading--craft cards__heading text-center']",XPATH,"FAQ Page - More From the Craft Title"),
	lnkSubCategoryLink1("//div[@class='cards__container container']/a[1]",XPATH,"FAQ Page - More From the Craft - Subcategory 1- image 1"),
	lnkSubCategoryLink2("//div[@class='cards__container container']/a[2]",XPATH,"FAQ Page - More From the Craft - SubCategory 2 - Image 2"),
	lnkSubCategoryLink3("//div[@class='cards__container container']/a[3]",XPATH,"FAQ Page - More From the Craft - SubCategory 3 - Image 3"),
	
	headingMoreFromCartLink1Page("//section[@class='howto-detail-card howto-detail-card--simple']/h1",XPATH,"FAQ- More From Cart Sub Category 1- How to Add Moisture Before And During Cooking"),
	headingMoreFromCartLink2Page("//section[@class='recipe-detail-card']/h1",XPATH,"FAQ Page - More From Cart Sub Category 2 - Reverse Seared Porterhouse with Hasselback Potatoes"),
	headingMoreFromCartLink3Page("//section[@class='howto-detail-card howto-detail-card--simple']/h1",XPATH,"FAQ Page - More From Cart Sub Category 3 - How to Monitor Your Smoke"),
	
	btnViewAllFromTheCraft("//a[@class='button text-center']",XPATH,"FAQ Page - Button - View All From The Craft"),
	
	//help section
	titleCantFindwhatyouLooking("//div[@class='support-summary__heading text-center']",XPATH,"FAQ Page - Help section - Label - Can't Find What you're Looking for?"),
	
	//Call section
	labelCall("//div[@id='support-summary-call']/div[1]",XPATH,"FAQ Page - Help Section - Call Label"),
	callTimings("//div[@id='support-summary-call']/div[2]",XPATH,"FAQ Page - Help section - Call timings"),
	lnkPhoneNumber("//div[@id='support-summary-call']/a",XPATH,"FAQ Page - Help Section - Link - Phone Number"),
	
	//Email section
	labelEmail("//div[@id='support-summary-email']/div[1]",XPATH,"FAQ Page - Help Section - Email Label"),
	txtEmailinfo("//div[@id='support-summary-email']/div[2]",XPATH,"FAQ Page - Help Section - Email Section - Description"),
	lnkSendAnEmail("//div[@id='support-summary-email']/a",XPATH,"FAQ page - Send An Email link"),
	
	//Chat Section
	labelChat("//div[@id='support-summary-chat']/div[1]",XPATH,"FAQ Page - Help Section - Chat Label"),
	chatTimings("//div[@id='support-summary-chat']/div[2]",XPATH,"FAQ Page - Help Section - Chat Timings"),
	lnkStartChat("support-chat-link",ID,"FAQ Page - Help Section - Chat - Start a Chat link"),
	
	
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

	private FAQPageObjects(String strPropertyValue, ObjectLocator locatorType, String strObjName) {
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
