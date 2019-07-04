package pages;


import static pages.ObjectLocator.*;

public enum ShoppingCartPageObjects implements PageObjects {

	txtShoppingCartTitle("cart__title", CLASSNAME, "Cart Page - Title"),
	txtNoItems("//*[@id='maincontent']/div/div/div[1]/div[2]/div[1]/p",XPATH,"No Item text on the shipping cart"),
	
	imgAddedProductImage("//img[@class='photo image']",XPATH,"Added Product Image"),
	txtCartItemName("cart-item__info__name",CLASSNAME,"Added Product Name in the Cart Page"),
	lblPrice("cart-item__info__price",CLASSNAME,"Price Lable on the Shopping Cart Page"),
	txtProductPrice("//div[@class='cart-item__info__price']/span/span/span",XPATH,"Product Price on the shopping cart Page"),
	lblQuantity("cart-item__qty__label",CLASSNAME,"Quantity Lable on Shopping Cart Page"),
	drpDownQuantity("//select[@class='cart-item__qty__input']",XPATH,"Quantity Drop down on Shopping Cart Page"),
	lblTotalPrice("cart-item__info__subtotal",CLASSNAME,"Totol Price Lable on the Shopping Cart Page"),
	txtTotalPrice("//div[@class='cart-item__info__subtotal']/span/span/span",XPATH,"Total Price in Doller on Shopping Cart Page"),
	lnkEdit("//a[@class='action action-edit']",XPATH,"Edit Product on Shopping Cart Page"),
	lnkRemoveItem("//a[@class='action action-delete']",XPATH,"Remove Item on Shopping Cart Page"),
	txtBoxPromoCode("//input[@id='coupon_code']",XPATH,"Promo Code Text Box on Shopping Cart Page"),
	btnApply("//button[@class='action apply button--secondary button']",XPATH,"Apply Promo code button on shopping cart page"),
	titleYourOrder("cart-summary__title",CLASSNAME,"Your Order title on Order section on Shopping Cart Page"),
	txtSubTotal("//tr[@class='totals sub']/th",XPATH,"Sub Total label"),
	txtSubTotalPrice("//tr[@class='totals sub']/td/span",XPATH,"Sub total Price"),
	txtShipping("//tr[@class='totals shipping excl']/th",XPATH,"Shipping Title/Label"),
	txShippingPrice("//tr[@class='totals shipping excl']/td/span",XPATH,"Shipping Price on Shopping Cart Page"),
	txtOrderTotal("//tr[@class='grand totals']/th/strong",XPATH,"Order Title on Your Order section on Shopping Cart Page"),
	txtOrderTotalPrice("//tr[@class='grand totals']/td/strong/span",XPATH,"Total Order Price on Shopping Cart Page"),
	btnCheckout("//button[@class='button button--full-width']",XPATH,"Checkout button on Shopping Cart Page"),
	btnPayPal("//ul[@class='cart-summary__methods']/li/div/a",XPATH,"Paypal Button"),
	
	txtUpdateMessageFromPDP("//div[@data-bind='html: message.text']",XPATH,"Message after updating Product from Product Details Page"),
	
	//Empty Shipping cart
	lnkGoBack("//a[text()='Go back.']",XPATH,"Empty Shipping Cart Page - Go Back Link"),
	lblShippingCart0Items("//h1[@class='cart__title']",XPATH,"Empty Shipping Cart Page - Heading - Shipping Cart (0 Items)"),
	// Help Section
	txtNeedSomethingElse("support-summary-cart__title",CLASSNAME,"'Need Something Else?' lable - Suppport on Shopping Cart Page"),
	lnkShopSmokersGrills("//ul[@class='support-summary-cart__links']/li[1]/a",XPATH,"Support Section - Link Shop Smokers & Grills"),
	lnkShopAccessories("//ul[@class='support-summary-cart__links']/li[2]/a",XPATH,"Support Section - Shop Accessories"),
	lnkShippingPolicy("//ul[@class='support-summary-cart__links']/li[3]/a",XPATH,"Support Section - link Shipping Policy"),
	lnkReturnPolicy("//ul[@class='support-summary-cart__links']/li[4]/a",XPATH,"Support Section - Link Return Policy"),
	lnkPhoneNumber("//a[@class='support-summary-cart__contact__phone link link--with-carat']",XPATH,"Support Section - link for Phone Number"),
	lnkLiveChat("//a[@class='support-summary-cart__contact__chat link link--with-carat']",XPATH,"Support Section - link for Live Chat"),
	
	//Paypal page
	iconCharbroiIcon("//div[@class='headerWrapper']/img",XPATH,"Pay Pal Page- Charbroil Icon"),
	amtTotalAmount("//format-currency[@class='formatCurrency ng-isolate-scope']/span",XPATH,"Pay Pal Page - Total Amount in $"),
	
	// Estimate and Shipping Tax section
	titleEstimatedShippingTax("block-shipping-heading",ID,"Estimated Shipping and Tax lable/title"),
	dropDownCountry("country_id",NAME,"Shipping Cart Page - Estimate and Shipping Tax Section - Country drop down"),
	dropDownState("region_id",NAME,"Shipping Cart Page - Estimate and Shipping Tax Section - State Drop Down"),
	txtBoxZipCode("postcode",NAME,"Shipping Cart Page - Estimate and Shipping Tax Section - Zip Code Text Box"),
	
	lblTax("//tr[@class='totals-tax']/th",XPATH,"Shipping Cart Page - Tax Label "),
	taxValue("//tr[@class='totals-tax']/td",XPATH,"Shipping Cart Page - Tax doller"),
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

	private ShoppingCartPageObjects(String strPropertyValue, ObjectLocator locatorType, String strObjName) {
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
