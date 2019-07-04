package pages;

import static pages.ObjectLocator.*;

public enum PartListingPageObjects implements PageObjects  {
	
	lblProductSummryTitle("//span[@class='product-model-summary__title--small']", XPATH, "Part Search Results Summary Title"),
	imgPart("//div[@class='col-md-5 text-center']/img",XPATH,"Part Image - Parts Page"),
	btnRegisterProduct("//a[@class='button button--register-product']",XPATH,"Parts Page - Register this Product Button"),
	txtHelpForPartsModel("//span[@class='product-model-summary__title--small']",XPATH,"Parts Page - Label - HELP AND PARTS FOR MODEL #"),
	lblProductModelSummary("//h1[@class='product-model-summary__title']",XPATH,"Parts Page - Products Model Summary"),
	lblParts("//h2[@class='parts__title parts__title--desktop-only']",XPATH,"Parts Page - Parts Label"),
	lblWarranties("//h2[@class='guide__title guide__title--desktop-only']",XPATH,"Parts Page - Warranties & Guides"),
	
	lblcantfind("//div[@class='support-summary__heading text-center']",XPATH,"Parts Page - label - Can't find what you're looking for?"),
	lnkViewPartDetails("//a[text()='View Details']",XPATH,"Parts Page - Link - View Details under list of products"),
	
	// Part Details Page
	lblPartDetailName("//span[@data-ui-id='page-title-wrapper']",XPATH,"Part Details Page - Part Label"),
	imgPartImage("//div[@class='fotorama__stage__shaft']",XPATH,"Part Details Page - Part Image"),
	lblPartPrice("//span[@class='price__wrapper price__price-inner']",XPATH,"Part Details Page - Part Price"),
	btnPartAddToCartButton("//span[@class='addtocart__add button primary']",XPATH,"Part Details Page - Part's Add to Cart Button"),
	btnPartRegister("//a[text()='Register this product']",XPATH,"Part Details Page - Part's Register This Product button"),
	txtPartDescription("//div[@class='value']",XPATH,"Part Details Page - Part Description"),
	lblIsItCompatible("//h3[@class='part-compatibility-checker__headline']",XPATH,"Part Details Page - Label - IS THIS COMPATIBLE WITH MY GRILL?"),
	txtBoxModel("//input[@class='part-compatibility-checker__input']",XPATH,"Part Details Page - Text Box  Model Number"),
	lblDetails("//h2[@class='product-details__heading text-center text-charcoal bg-white']",XPATH,"Part Details Page - Label - Details"),
	txtProductDescUnderDetail("//div[@class='product-details__content text-charcoal']",XPATH,"Part Details Page - Part Description under Detail label."),
	
	txtItsCompatileMsg("//div[@class='part-compatibility-checker__compatible']",XPATH,"Part Details Page - Compatable Success msg - Yes, you're good to go!"),
	txtItsNotCompatibleMsg("//div[@class='part-compatibility-checker__incompatible']",XPATH,"Part Details Page - Compatale Failure Msg - Unfortunately, we're unable to tell if this part is compatible with your grill or not."),
	txtNoMatchingProduct("//div[@class='part-compatibility-checker__no-results']",XPATH,"Part Details Page - Parts dont match Msg - There are no products matching your search."),
	
	
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

	private PartListingPageObjects(String strPropertyValue, ObjectLocator locatorType, String strObjName) {
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
