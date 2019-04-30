package pages;

import static pages.ObjectLocator.*;

public enum AccountInformationPageObjects implements PageObjects{

	titlMyAccount("//h3[@class='account__account-title text-charcoal']",XPATH,"My Account Title on Account Information Page"),
	titleAccountInfo("//h4[@class='account__section-title text-charcoal text-left']",XPATH,"Account Infomation title on Account Information page"),
	txtLoginInfo("//h5[text()='Login Information']",XPATH,"Login Information sub Title on Account Information Page"),
	txtFullNameAndEmail("//h5[text()='Login Information']/following::address[1]",XPATH,"Full Name and Emil id under Login Information"),
	lnkEditLoginInformation("//a[@class='mr-3']",XPATH,"Edit Link to edit Login Information"),
	lnkChangePassword("//a[contains(text(),'Change')]",XPATH,"Change Password link under Login Information in Account Information Page"),
	titleEmailPreferences("//h5[text()='Email Preferences']",XPATH,"Email Preferences sub title in Account Summary Page"),
	msgYouAreNotSubscribed("//div[@class='dashboard-info__column']/p[1]",XPATH,"Subcription to newletter message - Not subscribed"),
	msgRecipesPromo("//div[@class='dashboard-info__column']/p[2]",XPATH,"Get Recipes and prmotion... message"),
	lnkEditEmailPreferences("//a[@class='action edit']",XPATH,"Edit email preferences link in Account Information Page"),
	titlManageAccount("//h4[@class='text-left block-collapsible-nav account-customer-nav__title select-dropdown__title']",XPATH,"Manage Account Title on Account Information Page"),
	
	//Manage Account
	
	lnkOrders("//li[@class='nav item']/a[text()='Orders']",XPATH,"Orders Link under Manage Account in Account Information Page"),
	lnkAddressBookAccountInfoPage("//li[@class='nav item']/a[text()='Address Book']",XPATH,"Address book link under Manage Account in Account Information Page"),
	lnkRegisteredProducts("//li[@class='nav item']/a[text()='Registered Products']",XPATH,"Registered Products link under Manage Account in Account Information Page"),
	lnkDisabledMyAccount("//li[@class='nav item current']/strong",XPATH,"My Account Link - disabled state - in Account Informmation Page"),
	
	

	// Help Section
	txtNeedSomethingElse("support-summary-cart__title",CLASSNAME,"'Need Something Else?' lable - Suppport on Shopping Cart Page"),
	lnkShopSmokersGrills("//ul[@class='support-summary-cart__links']/li[1]",XPATH,"Support Section - Link Shop Smokers & Grills"),
	lnkShopAccessories("//ul[@class='support-summary-cart__links']/li[2]",XPATH,"Support Section - Shop Accessories"),
	lnkShippingPolicy("//ul[@class='support-summary-cart__links']/li[3]",XPATH,"Support Section - link Shipping Policy"),
	lnkReturnPolicy("//ul[@class='support-summary-cart__links']/li[4]",XPATH,"Support Section - Link Return Policy"),
	lnkPhoneNumber("//a[@class='support-summary-cart__contact__phone link link--with-carat']",XPATH,"Support Section - link for Phone Number"),
	lnkLiveChat("//a[@class='support-summary-cart__contact__chat link link--with-carat']",XPATH,"Support Section - link for Live Chat"),
	
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

	private AccountInformationPageObjects(String strPropertyValue, ObjectLocator locatorType, String strObjName) {
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
