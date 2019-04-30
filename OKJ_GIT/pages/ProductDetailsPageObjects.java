package pages;

import static pages.ObjectLocator.*;

public enum ProductDetailsPageObjects implements PageObjects {
	
	
	lblProductTitle("//h1[@class='page-title']/span", XPATH, "Product Title"),
	imgProductImage("//div[@class='fotorama__stage__frame fotorama__active fotorama_vertical_ratio fotorama__loaded fotorama__loaded--img']/img",XPATH,"Product Image"),
	lblProductPrice("//div[@class='price__container']/div[@class='price-box price__price-box price-final_price']/span[@class='price price__price-box price-final_price tax weee']/span[1]",XPATH,"Product Price"),
	btnProductStarRating("//button[@class='bv_stars_button_container ']",XPATH,"Product Start Rating"),
	overlayStarReviews("//div[@class='bv_modal_outer_content']",XPATH,"Details of the rating stars overlay"),
	btnReadReviews("//button[@class='bv_button_buttonFull ']",XPATH,"Read Reviews button in stars details overlay"),
	
	lblAvgRatingNumber("//button[@class='bv_avgRating ']",XPATH,"Average rating in number"),
	lblTotalReviews("//button[@class='bv_numReviews_text ']",XPATH,"Total number of reviews"),
	lnkWriteAReview("//button[@class='bv_button_buttonMinimalist ' and @id='WAR']",XPATH,"Write a review link"),
	lnkAskAQuestion("//button[@class='bv_button_buttonMinimalist ' and @id='AAQ']",XPATH,"Ask a Question link"),
	
	btnAddToCart("//button[@id='product-addtocart-button']",XPATH,"Add to cart button"),
	btnWhereToBuy("//div[@class='price-spider']/div",XPATH,"Where To Buy button"),
	txtProductInfoOverview("//div[@class='body-copy product-info__overview']/div/p",XPATH,"Product Info Overview"),
	
	videoProduct("//div[@class='video-product']",XPATH,"Product video"),
	imgCloserLook("//div[@class='closer-look__button slick-slide slick-current slick-active']/img",XPATH,"Closer Look image of the product"),
	slidRightCloserLook("//div[@class='closer-look__nav-arrow closer-look__arrow-next slick-arrow']",XPATH,"Slide images right - Closer Look images"),
	
	imgDimensions("//div[@class='dimensions--left']",XPATH,"Dimensions details of the product"),
	imgCookingArea("//div[@class='dimensions--right']",XPATH,"Cooking Area Details of the Product"),
	
	lblFeaturesAndSpecifications("//h2[@class='product-features__heading text-center text-charcoal bg-white']",XPATH,"Fetuares and Specifiations label"),
	lblFeatures("//a[@class='product-features__title']/h4[@id='tab-label-features']",XPATH,"Features heading"),
	lblSpecifiations("//a[@class='product-features__title']/h4[@id='tab-label-additional']",XPATH,"Specifications Heading"),
	
	// Item Added to your cart overlay
	lblItemAddedToYourCartTitle("//div[@class='minicart__block-title']/span",XPATH,"Item Added to Your Cart Title on the model overlay"),
	imgProductImageOnOverlay("//div[@class='minicart__block-title']/following::a[1]",XPATH,"Product Image on the 'Item added to your cart' model overlay"),
	lblProductNameOnOverlay("//div[@class='minicart__product-item-details']/a",XPATH,"Product Name on the 'Item added to your cart' model overlay"),
	lblProductPriceOnOverlay("//div[@class='minicart__block-title']/following::span[2]",XPATH,"Product Price on the Overlay"),
	btnContinuShoppingOnOverlay("//button[@id='btn-minicart-continue']",XPATH,"Continue Shopping button on the 'Item added to your cart' model overlay"),
	btnCheckOutOnOverlay("top-cart-btn-checkout",ID,"Checkout button on the 'Item added to your cart' Model Overlay"),
	lblCartItemCount("//span[@class='counter qty']/span",XPATH,"Cart Item Count next to Cart Icon."),
	
	//Where to Buy Model Overlay
	
	imgBrandIcon("//div[@class='ps-company-logo']/img",XPATH,"OKJ brand Icon on the Where to Buy Model Overlay"),
	lblProductTitleOnWhereToBuyOverlay("//div[@class='ps-product-details-title ps-float-box']",XPATH,"Product title on the Where to Buy Overlay"),
	txtBoxLocationAddress("//div[@class='ps-input-holder ps-float-box']",XPATH,"Location Address Text Box"),
	imgMapOnWhereToBuy("//div[@class='ps-map leaflet-container leaflet-fade-anim']",XPATH,"Map on the Where to Buy Model Overlay"),
	lblOnlineSeller("//div[@class='ps-online-seller-listings ps-float-box']/div[1]",XPATH,"Online Seller list- First Online Store"),
	btnCloseWhereToBuyOverlay("//div[@class='ps-header-container ps-float-box']/div[@class='ps-lightbox-close']",XPATH,"Close the where to buy Overlay Button"),
	
	txtBoxQuantity("//input[@id='qty']",XPATH,"Quantity on Product Details Page"),
	btnUpdateCart("//button[@title='Update Cart']/span",XPATH,"Update Cart Button on Product Details"),
	
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

	private ProductDetailsPageObjects(String strPropertyValue, ObjectLocator locatorType, String strObjName) {
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
