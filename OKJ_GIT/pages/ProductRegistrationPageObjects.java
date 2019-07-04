package pages;

import static pages.ObjectLocator.*;

public enum ProductRegistrationPageObjects implements PageObjects {

	lblProductRegistrationHeading("//h2[@class='blank__title']",XPATH,"Product Registration Page - Product Registration Main Heading"),
	lnkRegisterProduct("//a[@title='Register a Product']",XPATH,"Product Registration Page - Register a product link"),
	
	// Text fields
	
	txtBoxFirstName("first_name",ID,"Product Registration Page - Text Box - First Name"),
	txtBoxLastName("last_name",ID,"Product Registration Page - Text Box - Last Name"),
	txtBoxEmailAddr("email",ID,"Product Registration Page - Text Box - Email"),
	txtBoxStreetAddr("street_address",ID,"Product Registration Page - Text BOx - Steet Address"),
	txtBoxAparment("apartment",ID,"Product Registration Page - Text Box - Apartment/suite"),
	txtBoxPostalCode("postal_code",ID,"Product Registration Page - Text Box - Postal Code"),
	txtBoxCity("city",ID,"Product Registration Page - Text Box City"),
	lnkState("//div[@class='select-dropdown__title required-entry validate-state select-dropdown--product-registration']",XPATH,"Product Registration Page - State drop down- click to show options"),
	drpDownState("//ul[@class='select-dropdown__list required-entry validate-state select-dropdown--product-registration select-dropdown--open']/li[text()='",XPATH,"Product Registration Page - Drop Down - State"),
	lnkCountry("//div[@class='select-dropdown__title select-dropdown--product-registration']",XPATH,"Product Registration - Country Drop down - Click to show Options"),
	drpDownCountry("//ul[@class='select-dropdown__list required-entry validate-state select-dropdown--product-registration select-dropdown--open']/li[text()='",XPATH,"Product Registration Page - Drop Down - Country"),
	txtBoxPhoneNumber("phone_number",ID,"Product Registration Page - Phone Number Text Box"),
	txtBoxModelNumber("model_number",ID,"Product Registration Page - Model Number Text Box"),
	lnkHelpIdentifyModel("//a[@class='model-link']",XPATH,"Product Registration Page - Help Identify Model link"),
	txtBoxPurchaseAmt("purchase_amount",ID,"Product Registration Page - Purchase Amount Text Box"),
	txtBoxPurchaseDate("purchase_date",ID,"Product Registration Page - Purchase Date Text Box"),
	txtBoxSerialNumber("serial_number",ID,"Product Registration Page - Serial Number Text Box"),
	txtSerialNumberLocation("//p[@class='serial_info']",XPATH,"Product Registration Page - Serial Number location text"),
	lnkPurchaseLocation("//div[@class='select-dropdown__title form--tan required-entry select-dropdown--product-registration']",XPATH,"Product Registration Page - Purchase Location - Click to show Options"),
	drpDownPurchaseLocation("//ul[@class='select-dropdown__list form--tan required-entry select-dropdown--product-registration select-dropdown--open']/li[text()='",XPATH,"Product Registration Page - Purchase Location Dropdown Location"),
	checkBoxGetRecipes("//div[@class='choice field']/label",XPATH,"Product Registration Page - Get Recipes & Tips checkbox"),
	lnkViewPrivacyPolicy("//a[@class='policy-link']",XPATH,"Product Registration Page - View Privacy Policy link"),
	btnRegisterProduct("//button[@title='Register Your Product']",XPATH,"Product Registration Page - Register Product button"),
	msgThankYou("//div[@class='messages']/div/div",XPATH,"Product Registration - Successful Registration - Thank you message"),
	
	//Error Messages
	errorMsgFirstName("first_name-error",ID,"Product Registration - First Name Error Message"),
	errorMsgLastName("last_name-error",ID,"Product Registration - Last Name Error Message"),
	errorMsgEmail("email-error",ID,"Product Registration - Email Address Error Message"),
	errorMsgStreetAddr("street_address-error",ID,"Product Registration - Street Address Error Message"),
	errorMsgzip("postal_code-error",ID,"Product Registration - Postal Code Error Message"),
	errorMsgCity("city-error",ID,"Product Registration - City Error Message"),
	errorMsgPhone("phone_number-error",ID,"Product Registration - Phone Number Error Message"),
	errorMsgModel("model_number-error",ID,"Product Registration - Model Number Error Message"),
	errorMsgSerialNbr("serial_number-error",ID,"Product Registration - Serial Number Error Message"),
	errorMsgPurchaseAmt("purchase_amount-error",ID,"Product Registration - Purchase Amount Error"),
	
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

	private ProductRegistrationPageObjects(String strPropertyValue, ObjectLocator locatorType, String strObjName) {
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
