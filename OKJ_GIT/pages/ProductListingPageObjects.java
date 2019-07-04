package pages;

import static pages.ObjectLocator.*;

public enum ProductListingPageObjects implements PageObjects {

	
	
	itmFirstProduct("//div[@class='product-listing__list slider']/a[1]",XPATH,"First Product on the Product Listing Page"),
	btnFilter("//div[@class='toolbar-filter__label']",XPATH,"Filter button"),
	gridViewEnabled("//strong[@class='toolbar-modes__mode active toolbar-modes--grid']",XPATH,"Grid View Enabled"),
	listViewDisabled("//a[@class='toolbar-modes__mode toolbar-modes--list']",XPATH,"List View Disabled"),
	gridViewDisabled("//a[@class='toolbar-modes__mode toolbar-modes--grid']",XPATH,"Grid View disabled"),
	listviewEnabled("//a[@class='toolbar-modes__mode active toolbar-modes--list']",XPATH,"List View Enabled"),
	
	firstProductTitle("//div[@class='product-listing__list slider']/a[1]/div/div[2]/h4",XPATH,"First Product Title"),
	firstProdcutPrice("//div[@class='product-listing__list slider']/a[1]/div/div[2]/div/span/span",XPATH,"First Product Price"),
	firstProuctStars("(//span[@class='bv_stars_svg_no_wrap'])[1]",XPATH,"First Product star rating"),
	productsOnProuctListingPage("//div[@class='product-listing__list slider']/a",XPATH,"Products on Product listing Page"),
	firstProductImg("//div[@class='product-listing__list slider']/a[1]/div/div[1]/img",XPATH,"First Product Image"),
	btnLoadMore("//a[@class='button button--center']",XPATH,"Load More Button"),
	
	expandColor("//span[@class='toolbar-filter--span' and text()='Color']",XPATH,"Expand Color Filter Options"),
	expandCategory("//span[@class='toolbar-filter--span' and text()='Category']",XPATH,"Expand Category Filter Options"),
	firstCategoryOption("//span[@class='toolbar-filter--span' and text()='Category']/following::span[2]",XPATH,"First Option under the Cateogry Filter"),
	firstColorOption("//span[@class='toolbar-filter--span' and text()='Color']/following::span[2]",XPATH,"First Option under the Color filter"),
	
	expandPrice("//span[@class='toolbar-filter--span' and text()='Price']",XPATH,"Expand Price Filter Options"),
	
	firstPriceOption("//span[@class='toolbar-filter--span' and text()='Price']/following::span[2]",XPATH,"First Option under the Price filter"),
	
	btnApply("//div[@class='toolbar-filter__top--apply']",XPATH,"Apply Button in filter"),
	
	//Filter section
	lnkCancel("//div[@class='toolbar-filter__top--cancel']",XPATH,"Product Filter section: Cancel Link"),
	
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

	private ProductListingPageObjects(String strPropertyValue, ObjectLocator locatorType, String strObjName) {
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
