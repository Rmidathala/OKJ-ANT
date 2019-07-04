package pages;

import static pages.ObjectLocator.*;

public enum CheckOutPageObjects implements PageObjects {

	
	lblChekoutTitle("//h2[@class='checkout__title checkout__title--shipping']",XPATH,"Checkout Page Title: Shipping Information "),
	lblAddress("//h3[@class='checkout__sub-title' and text()='Address']",XPATH,"Checkout Page: Address title"),
	txAddressFieldsRequired("//span[@class='checkout__desc']",XPATH,"Checkout Page: Address Fields are required text"),
	
	lblFirstName("//span[text()='First Name']",XPATH,"Checkout Page: First Name Label"),
	lblLastName("//span[text()='Last Name']",XPATH,"Checkout Page: Last Name Lable"),
	txtBoxFirstName("//input[@name='firstname']",XPATH,"Checkout Page: First Name Text Box"),
	txtBoxLastName("//input[@name='lastname']",XPATH,"Checkout Page: Last Name Text Box"),
	
	lblStreetAddress("//span[text()='Street Address']",XPATH,"Checkout Page: Address Label"),
	txtBoxStreetAddressLine1("//input[@name='street[0]']",XPATH,"Checkout Page: Steet Address line 1"),
	txtBoxStreetAddressLine2("//input[@name='street[1]']",XPATH,"Checkout Page: Street Address Line 2"),
	lblCity("//span[text()='City']",XPATH,"Checkout Page: City Label"),
	txtBoxCity("//input[@name='city']",XPATH,"Checkout Page: City Text Box"),
	
	lblStateProvince("//div[@name='shippingAddress.region_id']/label/span",XPATH,"Checkout Page: State/Province label"),
	drpDownStateProvince("//select[@name='region_id']",XPATH,"Checkout Page: State/province drop down"),
	
	lblZipPostelCode("//span[text()='Zip/Postal Code']",XPATH,"Checkout Page: Zip/Postel Code label"),
	txtBoxZipPostelCode("//input[@name='postcode']",XPATH,"Checkout Page: Zip/Postel Code Text Box"),
	
	lblCountry("//div[@name='shippingAddress.country_id']/label/span",XPATH,"Checkout Page: Country Label"),
	txtBoxCountry("//select[@name='country_id']",XPATH,"Checkout Page: Country Text box"),
	
	lblPhoneNumber("//div[@name='shippingAddress.telephone']/label/span",XPATH,"Checkout Page: Phone Number Label"),
	txtBoxPhoneNumber("//input[@name='telephone']",XPATH,"Checkout Page: Phone Number text Box"),
	tooltipBtnPhoneNumber("//input[@name='telephone']/following::div[1]/span",XPATH,"Checkout Page: Tooltip Button - Phone Number"),
	tooltipTxtPhoneNumber("//input[@name='telephone']/following::div[2]",XPATH,"Checkout Page: Tooltip text - Phone Number"),
	
	lblSignUpMailingList("//div[@name='shippingAddress.subscribe']/label/span",XPATH,"Checkout Page: Label for Sign up Mailing List"),
	checkBoxGetRecipesTips("//span[text()='Get Recipes & Tips Delivered to Your Inbox']",XPATH,"Checkout Page: Check box - Get Recipes and tips Delivered to your inbox"),
	
	lblShippingMethod("//h3[text()='Shipping Method']",XPATH,"Checkout Page: Shipping Method Label"),
	radioBtnShippingMethod1("//label[@id='label_method_fedex_ground_domestic_okjshipping']",XPATH,"Checkout Page: Shipping method Radio Button: FedEx Ground(Domestic)$150.00"),
	
	btnContinueToBilling("//div[@id='shipping-method-buttons-container']/button",XPATH,"Checkout Page: Continue to Billing Button"),
	
	lblBillingInformation("//h2[text()='Billing Information']",XPATH,"Checkout Page: Billing Information Label"),
	lblCartNoOfItems("//h2[@class='checkout__title checkout__title--editable checkout__title--editable-cart']",XPATH,"Checkout Page: Cart # Items label"),
	lnkEditCart("//div[@class='checkout__cart-items']/h2",XPATH,"Checkout Page: Edit Cart Link"),
	
	imgProductImg("//div[@class='cart-item__container row']/span/img",XPATH,"Checkout Page: Cart Item Product Image"),
	lblProductNameInCart("//div[@class='cart-item__info__name']",XPATH,"Checkout Page: Product Name In Cart"),
	lblProductPriceInCart("//div[@class='cart-item__info__price']/span",XPATH,"Checkout Page: Product Price in Cart"),
	lblProductQuantity("//label[@class='cart-item__qty__label']/span[1]",XPATH,"Checkout Page: Product Quantity label"),
	txtProductQuantity("//label[@class='cart-item__qty__label']/span[2]",XPATH,"Checkout Page: Product Quantity #"),
	lblProductTotalPrice("//div[@class='cart-item__info__subtotal']/span",XPATH,"Checkout Page: Product Total Price"),
	
	txtBoxEnterDiscountCode("//input[@id='discount-code']",XPATH,"Checkout Page: Enter the discount Code Text Box"),
	btnApplyDiscountCode("//button[@class='action apply button--secondary button']",XPATH,"Checkout Page: Apply Discount button"),
	
	lblYourOrder("//h2[@class='cart-summary__title']",XPATH,"Checkout Page: Your Order label section"),
	
	lblCartSubTotal("//tr[@class='totals sub']/th",XPATH,"Checkout Page: Cart Subtotal label"),
	amtCartSubTotal("//tr[@class='totals sub']/td/span",XPATH,"Checkout Page: Cart Subtotal in $"),
	lblShipping("//tr[@class='totals shipping excl']/th/span[1]",XPATH,"Checkout Page: Shipping lable in Your Order section"),
	lblShippingMethodYourOrderSection("//tr[@class='totals shipping excl']/th/span[2]",XPATH,"Checkout Page: Shipping Method label in Your Order section"),
	amtCartTax("//tr[@class='totals shipping excl']/td/span",XPATH,"Checkout Page : Shipping Tax Price"),
	lblOrderTotal("//tr[@class='grand totals']/th/strong",XPATH,"Checkout Page: Order Total"),
	amtOrderTotal("//tr[@class='grand totals']/td/strong/span",XPATH,"Checkout Page: Order total in $"),
	
	// Help Section
	txtNeedSomethingElse("support-summary-cart__title",CLASSNAME,"'Need Something Else?' lable - Suppport on Shopping Cart Page"),
	lnkShopSmokersGrills("//ul[@class='support-summary-cart__links']/li[1]",XPATH,"Support Section - Link Shop Smokers & Grills"),
	lnkShopAccessories("//ul[@class='support-summary-cart__links']/li[2]",XPATH,"Support Section - Shop Accessories"),
	lnkShippingPolicy("//ul[@class='support-summary-cart__links']/li[3]",XPATH,"Support Section - link Shipping Policy"),
	lnkReturnPolicy("//ul[@class='support-summary-cart__links']/li[4]",XPATH,"Support Section - Link Return Policy"),
	lnkPhoneNumber("//a[@class='support-summary-cart__contact__phone link link--with-carat']",XPATH,"Support Section - link for Phone Number"),
	lnkLiveChat("//a[@class='support-summary-cart__contact__chat link link--with-carat']",XPATH,"Support Section - link for Live Chat"),
	
	
	
	
	//Guest User
	txtSignInOrContinueGuest("//h3[text()='Sign in or continue as guest']",XPATH,"Checkout Page: Sign in or continue as guest text"),
	txtCreateAccountAfterCheckout("//span[text()='You can create an account after checkout.']",XPATH,"Checkout Page: Text- 'You can create account after checkout"),
	lblEmailAddress("//span[text()='Email Address']",XPATH,"Checkout Page: Email Address Label"),
	txtBoxEmailAddress("//div[@class='control _with-tooltip']/input[@type='email']",XPATH,"Checkout Page: Text Box - Email Address"),
	tooltipBtnEmailAddress("//div[@class='control _with-tooltip']/input[@type='email']/following::span[1]",XPATH,"Checkout Page: Tooltip Button for Email Address"),
	tooltipTxtEmailAddress("//div[@class='control _with-tooltip']/input[@type='email']/following::div[2]",XPATH,"Checkout Page: Tooltip Text - Email Address"),
	
	
	lblBillingInformationAfterContinueBilling("//h2[@class='checkout__title']",XPATH,"Checkout Page: Billing Information Label"),
	txtBoxCreditCartNumber("//input[@title='Credit Card Number']",XPATH,"Billing Page: Credit Cart Number Text Box"),
	imgVisa("//img[@alt='Visa']",XPATH,"Billing Page: Visa Image in Credit Card Number Text Box"),
	imgMaster("//img[@alt='MasterCard']",XPATH,"Billing Page: Master Card Image in Credet card Number Text Box"),
	imgDiscover("//img[@alt='Discover']",XPATH,"Billing Page: Discover Card Image in Credit Cart Number Text Box"),
	lblExpirationDate("//div[@id='chcybersource_cc_type_exp_div']/label/span",XPATH,"Billing Page: Expiration Date Label"),
	drpDownExpiryMonth("//select[@id='chcybersource_expiration']",XPATH,"Billing Info Page: Expiration Month"),
	drpDownExpiryYear("//select[@id='chcybersource_expiration_yr']",XPATH,"Billing Info Page: Expiration Year"),
	
	lblCVN("//div[@id='chcybersource_cc_type_cvv_div']/label/span",XPATH,"Billing Page: CVN label"),
	
	txtBoxCVN("//input[@id='chcybersource_cc_cid']",XPATH,"Billing Page: CVN Input text Box"),
	
	btnPlaceOrder("//h2[@class='checkout__title checkout__title--editable checkout__title--editable-cart']/preceding::button[2]",XPATH,"Billing Page: Place Order Button"),
	
	txtPopulatedAddress("//div[@class='shipping-address-item selected-item']",XPATH,"Checkout Page - Populated Address"),
	lnkPopulatedPhoneNumber("//div[@class='shipping-address-item selected-item']/a",XPATH,"Checkout Page - Populated Phone Number"),
	btnNewAddress("//a[@class='button action new-address']",XPATH,"Checkout Page - New Address Button"),
	lblAddNewAddr("//h4[@class='account__section-title text-charcoal text-left']",XPATH,"New Address- Add new address label"),
	btnConfirmAddress("//button[@class='action-primary']",XPATH,"Checkout Page - Confirm Address button"),
	
	//Paypal page
	iconCharbroiIcon("//div[@class='headerWrapper']/img",XPATH,"Pay Pal Page- Charbroil Icon"),
	amtTotalAmount("//format-currency[@class='formatCurrency ng-isolate-scope']/span",XPATH,"Pay Pal Page - Total Amount in $"),
	
	//
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

	private CheckOutPageObjects(String strPropertyValue, ObjectLocator locatorType, String strObjName) {
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
