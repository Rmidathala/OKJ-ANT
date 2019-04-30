package pages;

import static pages.ObjectLocator.*;

public enum PartListingPageObjects implements PageObjects  {
	
	lblProductSummryTitle("//span[@class='product-model-summary__title--small']", XPATH, "Part Search Results Summary Title"),
	
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
