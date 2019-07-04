package businesscomponents;

import org.openqa.selenium.WebElement;

import supportlibraries.ReusableLibrary;
import supportlibraries.ScriptHelper;
import com.cognizant.framework.Status;
import com.cognizant.framework.selenium.WebDriverUtil;

import componentgroups.CommonFunctions;
import pages.ProductDetailsPageObjects;
import pages.ShoppingCartPageObjects;
public class ShoppingCartPageComponents extends ReusableLibrary {

	/**
	 * Constructor to initialize the component library
	 * 
	 * @param scriptHelper
	 *            The {@link ScriptHelper} object passed from the
	 *            {@link DriverScript}
	 */
	public ShoppingCartPageComponents(ScriptHelper scriptHelper) {
		super(scriptHelper);
	}

	CommonFunctions commonFunction = new CommonFunctions(scriptHelper);
	WebDriverUtil webdriverutil = new WebDriverUtil(driver);

	private WebElement getPageElement(ShoppingCartPageObjects pageEnum) {
		WebElement element;
		try {
			element = commonFunction.getElementByProperty(pageEnum.getProperty(), pageEnum.getLocatorType().toString(),
					true);
			if (element != null) {
				System.out.println("Found the element: " + pageEnum.getObjectname());
				return element;
			} else {
				System.out.println("Element Not Found: " + pageEnum.getObjectname());
				return null;
			}
		} catch (Exception e) {
			report.updateTestLog("Shopping Cart - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}
	
	private WebElement getPageElement(ProductDetailsPageObjects pageEnum) {
		WebElement element;
		try {
			element = commonFunction.getElementByProperty(pageEnum.getProperty(), pageEnum.getLocatorType().toString(),
					true);
			if (element != null) {
				System.out.println("Found the element: " + pageEnum.getObjectname());
				return element;
			} else {
				System.out.println("Element Not Found: " + pageEnum.getObjectname());
				return null;
			}
		} catch (Exception e) {
			report.updateTestLog("Product Details Page - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}
	
	public void validateShoppingCartPage() {
		try {
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtShoppingCartTitle),
					ShoppingCartPageObjects.txtShoppingCartTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.imgAddedProductImage),
					ShoppingCartPageObjects.imgAddedProductImage.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtCartItemName),
					ShoppingCartPageObjects.txtCartItemName.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.lblPrice),
					ShoppingCartPageObjects.lblPrice.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtProductPrice),
					ShoppingCartPageObjects.txtProductPrice.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.lblQuantity),
					ShoppingCartPageObjects.lblQuantity.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.drpDownQuantity),
					ShoppingCartPageObjects.drpDownQuantity.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.lblTotalPrice),
					ShoppingCartPageObjects.lblTotalPrice.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.lnkEdit),
					ShoppingCartPageObjects.lnkEdit.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.lnkRemoveItem),
					ShoppingCartPageObjects.lnkRemoveItem.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtBoxPromoCode),
					ShoppingCartPageObjects.txtBoxPromoCode.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.btnApply),
					ShoppingCartPageObjects.btnApply.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.titleYourOrder),
					ShoppingCartPageObjects.titleYourOrder.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.titleEstimatedShippingTax),
					ShoppingCartPageObjects.titleEstimatedShippingTax.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtSubTotal),
					ShoppingCartPageObjects.txtSubTotal.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtSubTotalPrice),
					ShoppingCartPageObjects.txtSubTotalPrice.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtShipping),
					ShoppingCartPageObjects.txtShipping.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txShippingPrice),
					ShoppingCartPageObjects.txShippingPrice.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtOrderTotal),
					ShoppingCartPageObjects.txtOrderTotal.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtOrderTotalPrice),
					ShoppingCartPageObjects.txtOrderTotalPrice.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.btnCheckout),
					ShoppingCartPageObjects.btnCheckout.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.btnPayPal),
					ShoppingCartPageObjects.btnPayPal.getObjectname());
			
		}catch(Exception e) {
			report.updateTestLog("Shipping Cart -  Validation",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateNeedSomethingElseSection() {
		try {
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtNeedSomethingElse),
					ShoppingCartPageObjects.txtNeedSomethingElse.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.lnkShopSmokersGrills),
					ShoppingCartPageObjects.lnkShopSmokersGrills.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.lnkShopAccessories),
					ShoppingCartPageObjects.lnkShopAccessories.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.lnkShippingPolicy),
					ShoppingCartPageObjects.lnkShippingPolicy.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.lnkReturnPolicy),
					ShoppingCartPageObjects.lnkReturnPolicy.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.lnkPhoneNumber),
					ShoppingCartPageObjects.lnkPhoneNumber.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.lnkLiveChat),
					ShoppingCartPageObjects.lnkLiveChat.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("Shipping Cart -  Need Something Else Validation",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void upateQuantityAndValidateChangeInPrice() {
		try {
			commonFunction.selectAnyElement(getPageElement(ShoppingCartPageObjects.drpDownQuantity), "1", ShoppingCartPageObjects.drpDownQuantity.getObjectname());
			Double totalValueBeforeQuantityChange = Double.parseDouble(commonFunction.getTextFromElement(getPageElement(ShoppingCartPageObjects.txtTotalPrice)).substring(1).replace(",", ""));
			Double subTotalValueBeforeQuantityChange = Double.parseDouble(commonFunction.getTextFromElement(getPageElement(ShoppingCartPageObjects.txtSubTotalPrice)).substring(1).replace(",", ""));
			commonFunction.selectAnyElement(getPageElement(ShoppingCartPageObjects.drpDownQuantity), "2", ShoppingCartPageObjects.drpDownQuantity.getObjectname());
			Double totalValueAfterQuantityChange = Double.parseDouble(commonFunction.getTextFromElement(getPageElement(ShoppingCartPageObjects.txtTotalPrice)).substring(1).replace(",", ""));
			Double subTotalValueAfterQuantityChange = Double.parseDouble(commonFunction.getTextFromElement(getPageElement(ShoppingCartPageObjects.txtSubTotalPrice)).substring(1).replace(",", ""));
			if(totalValueAfterQuantityChange==(totalValueBeforeQuantityChange*2) && subTotalValueAfterQuantityChange==(subTotalValueBeforeQuantityChange*2)) {
				report.updateTestLog("Verify Quantity Dropdown on Shopping Cart Page",
						"The Quantity drop down is working fine and the total value is updated as per the selected quantity",
						Status.PASS);
			} else {
				report.updateTestLog("Verify Quantity Dropdown on Shopping Cart Page",
						"The Quantity drop down is NOT working  and the total value is NOT updated as per the selected quantity",
						Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Shipping Cart -  Validation of Quantity drop down",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public double getCartSubTotal() {
		try {
			Double cartSubTotal= Double.parseDouble(commonFunction.getTextFromElement(getPageElement(ShoppingCartPageObjects.txtSubTotalPrice)).substring(1).replace(",", ""));
			return cartSubTotal;
		}catch(Exception e) {
			report.updateTestLog("Shipping Cart - get Cart Sub total",
					"Something went wrong!" + e.toString(), Status.FAIL);
			return 0;
		}
	}
	
	public double getCartTaxValue() {
		try {
			Double cartTax= Double.parseDouble(commonFunction.getTextFromElement(getPageElement(ShoppingCartPageObjects.txShippingPrice)).substring(1).replace(",", ""));
			return cartTax;
		}catch(Exception e) {
			report.updateTestLog("Shipping Cart - get Cart Tax",
					"Something went wrong!" + e.toString(), Status.FAIL);
			return 0;
		}
	}
	
	public void validateEditLink() {
		try {
			Double totalValueBeforeQuantityChange = Double.parseDouble(commonFunction.getTextFromElement(getPageElement(ShoppingCartPageObjects.txtTotalPrice)).substring(1).replace(",", ""));
			int quantityBeforeEdit = Integer.parseInt(commonFunction.getSelectedTextFromDropDown(getPageElement(ShoppingCartPageObjects.drpDownQuantity)));
			commonFunction.clickIfElementPresent(getPageElement(ShoppingCartPageObjects.lnkEdit),
					ShoppingCartPageObjects.lnkEdit.getObjectname());
			
			ProductDetailsPageComponents pdp = new ProductDetailsPageComponents(scriptHelper);
			pdp.updateQuantityInProductDetailsPage();
			Thread.sleep(2000);
			commonFunction.isElementPresentContainsText(getPageElement(ShoppingCartPageObjects.txtUpdateMessageFromPDP), ShoppingCartPageObjects.txtUpdateMessageFromPDP.getObjectname(), "was updated in your shopping cart.");
			Double totalValueAfterQuantityChange = Double.parseDouble(commonFunction.getTextFromElement(getPageElement(ShoppingCartPageObjects.txtTotalPrice)).substring(1).replace(",", ""));
			int quantityAfterEdit = Integer.parseInt(commonFunction.getSelectedTextFromDropDown(getPageElement(ShoppingCartPageObjects.drpDownQuantity)));
			if(totalValueBeforeQuantityChange<totalValueAfterQuantityChange && quantityBeforeEdit < quantityAfterEdit){
				report.updateTestLog("Verify Edit Link on Shopping Cart Page",
						"The Edit link is working and user is able to update the quantity on Product Details page",
						Status.PASS);
			} else {
				report.updateTestLog("Verify Edit link on Shopping Cart Page",
						"The Edit link is not working.",
						Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Shipping Cart -  Validation of Edit Link",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateRemoveLink() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(ShoppingCartPageObjects.lnkRemoveItem),
					ShoppingCartPageObjects.lnkRemoveItem.getObjectname());
			if(commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtNoItems),
					ShoppingCartPageObjects.txtNoItems.getObjectname()) && commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.lnkGoBack),
							ShoppingCartPageObjects.lnkGoBack.getObjectname())) {
				report.updateTestLog("Verify Remove Link on Shopping Cart Page",
						"The Remove link is Working fine and the product is removed after clicking on Remove link",
						Status.PASS);
			} else {
				report.updateTestLog("Verify Remove link on Shopping Cart Page",
						"The Remove link is not working.",
						Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Shipping Cart -  Validation of Remove Link",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void emptycart() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(ShoppingCartPageObjects.lnkRemoveItem),
					ShoppingCartPageObjects.lnkRemoveItem.getObjectname());
			if(commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtNoItems),
					ShoppingCartPageObjects.txtNoItems.getObjectname())) {
				report.updateTestLog("Verify if the Cart if empty",
						"The cart is empty",
						Status.PASS);
			} else {
				report.updateTestLog("Verify if the cart is empty",
						"The cart is not empty.",
						Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Shipping Cart -  Empty the shopping cart",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void navigateToPayPalPage() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(ShoppingCartPageObjects.btnPayPal),
					ShoppingCartPageObjects.btnPayPal.getObjectname());
			if(driver.getCurrentUrl().contains("https://www.paypal.com/")) {
				report.updateTestLog("Verify user is navigated to Paypal page",
						"The user is successfully navigated to Paypal Payment page",
						Status.PASS);
			} else {
				report.updateTestLog("Verify user is navigated to Paypal Page",
						"The user is not navigated to Paypal Page.",
						Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Shipping Cart -  Navigate to Paypal",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void navigateToCheckoutPage() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(ShoppingCartPageObjects.btnCheckout),
					ShoppingCartPageObjects.btnCheckout.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("Shipping Cart -  Navigate to Checkout Page",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validatePaypalPageAmount() {
		try {
			double totalAmountOnCharbroil =Double.parseDouble(commonFunction.getTextFromElement(getPageElement(ShoppingCartPageObjects.txtTotalPrice)).substring(1).replace(",", ""));
			navigateToPayPalPage();
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.iconCharbroiIcon),
					ShoppingCartPageObjects.iconCharbroiIcon.getObjectname());
			String paypalamt =commonFunction.getTextFromElement(getPageElement(ShoppingCartPageObjects.amtTotalAmount));
			double totalAmountOnPaypal = Double.parseDouble(paypalamt.substring(1,paypalamt.length()-3).replace(",", ""));
			System.out.println("Charbroil amt: "+totalAmountOnCharbroil);
			System.out.println("Paypal amt: "+totalAmountOnPaypal);
			if(Double.compare(totalAmountOnCharbroil, totalAmountOnPaypal)==0) {
				report.updateTestLog("Verify correct Amount is displayed on Paypal Page",
						"Correct Amount is displayed on PayPal page",
						Status.PASS);
			} else {
				report.updateTestLog("Verify correct Amount is displayed on Paypal Page",
						"Correct Amount is NOT displayed on the Paypal Page",
						Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Shipping Cart -  validate Paypal",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateEmptyShippingCartPage() {
		try {
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.lblShippingCart0Items),
					ShoppingCartPageObjects.lblShippingCart0Items.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.lblShippingCart0Items),
					ShoppingCartPageObjects.lblShippingCart0Items.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtNoItems),
					ShoppingCartPageObjects.txtNoItems.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.lnkGoBack),
					ShoppingCartPageObjects.lnkGoBack.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("Shipping Cart -  validate Empty Cart Page",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateEmptyShippingCartGoBackLink() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(ShoppingCartPageObjects.lnkGoBack),
					ShoppingCartPageObjects.lnkGoBack.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ShoppingCartPageObjects.lnkGoBack),
					ShoppingCartPageObjects.lnkGoBack.getObjectname());
			if(commonFunction.verifyIfElementIsPresent(getPageElement(ProductDetailsPageObjects.btnAddToCart), ProductDetailsPageObjects.btnAddToCart.getObjectname())) {
				report.updateTestLog("Verify user navigated back to product details page on clicking Go back link in Empty Shipping Page",
						"User is successfully navigated back to product details page",
						Status.PASS);
			} else {
				report.updateTestLog("Verify user navigated back to product details page on clicking Go back link in Empty Shipping Page",
						"User is NOT navigated back to product details page",
						Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Shipping Cart -  validate Empty Cart Page - Go Back link",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateShippingCartOrderSection() {
		try {
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.titleYourOrder),
					ShoppingCartPageObjects.titleYourOrder.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.titleEstimatedShippingTax),
					ShoppingCartPageObjects.titleEstimatedShippingTax.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtSubTotal),
					ShoppingCartPageObjects.txtSubTotal.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtSubTotalPrice),
					ShoppingCartPageObjects.txtSubTotalPrice.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtShipping),
					ShoppingCartPageObjects.txtShipping.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txShippingPrice),
					ShoppingCartPageObjects.txShippingPrice.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtOrderTotal),
					ShoppingCartPageObjects.txtOrderTotal.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtOrderTotalPrice),
					ShoppingCartPageObjects.txtOrderTotalPrice.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("Shipping Cart -  validate Order section",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateNeedSomethingElseSectionLinks() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(ShoppingCartPageObjects.lnkShopSmokersGrills),
					ShoppingCartPageObjects.lnkShopSmokersGrills.getObjectname());
			webdriverutil.waitUntilPageReadyStateComplete(10);
			if (driver.getCurrentUrl().contains("/smokers-and-grills")) {
				report.updateTestLog("Verify Navigation Menu link - Smokers & Grills",
						"User is successfully Navigated to Smokers & Grill Page", Status.PASS);
			} else {
				report.updateTestLog("Verify Navigation Menu link - Smokers & Grills",
						"User is NOT Navigated to Smokers & Grill Page", Status.FAIL);
			}
			driver.navigate().back();
			webdriverutil.waitUntilPageReadyStateComplete(10);
			commonFunction.clickIfElementPresent(getPageElement(ShoppingCartPageObjects.lnkShopAccessories),
					ShoppingCartPageObjects.lnkShopAccessories.getObjectname());
			webdriverutil.waitUntilPageReadyStateComplete(10);
			if (driver.getCurrentUrl().contains("/accessories-and-parts")) {
				report.updateTestLog("Verify Navigation Menu link - Accessories & Parts",
						"User is successfully Navigated to Accessories & Parts Page", Status.PASS);
			} else {
				report.updateTestLog("Verify Navigation Menu link - Accessories & Parts",
						"User is NOT Navigated to Accessories & Parts Page", Status.FAIL);
			}
			driver.navigate().back();
			webdriverutil.waitUntilPageReadyStateComplete(10);
			commonFunction.clickIfElementPresent(getPageElement(ShoppingCartPageObjects.lnkShippingPolicy),
					ShoppingCartPageObjects.lnkShippingPolicy.getObjectname());
			webdriverutil.waitUntilPageReadyStateComplete(10);
			if(driver.getCurrentUrl().contains("/shipping-policy")) {
				report.updateTestLog("Verify user is navigated to Shipping policy page", "User is successfully Navigated to Shipping Policy Page", Status.PASS);
			} else {
				report.updateTestLog("Verify user is navigated to Shipping policy page", "User is NOT Navigated to  Shipping Policy Page", Status.FAIL);
			}
			driver.navigate().back();
			webdriverutil.waitUntilPageReadyStateComplete(10);
			commonFunction.clickIfElementPresent(getPageElement(ShoppingCartPageObjects.lnkReturnPolicy),
					ShoppingCartPageObjects.lnkReturnPolicy.getObjectname());
			webdriverutil.waitUntilPageReadyStateComplete(10);
			if(driver.getCurrentUrl().contains("/return-policy")) {
				report.updateTestLog("Verify user is navigated to Return policy page", "User is successfully Navigated to Return Policy Page", Status.PASS);
			} else {
				report.updateTestLog("Verify user is navigated to Return policy page", "User is NOT Navigated to  Shipping Return Page", Status.FAIL);
			}
			driver.navigate().back();
			webdriverutil.waitUntilPageReadyStateComplete(10);
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.lnkPhoneNumber),
					ShoppingCartPageObjects.lnkPhoneNumber.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.lnkLiveChat),
					ShoppingCartPageObjects.lnkLiveChat.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("Shipping Cart -  validate Need Something Else Section links",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateShippingTaxEstimateCalculation() {
		try {
			String state = dataTable.getData("General_Data","State");
			String zipCode = dataTable.getData("General_Data","ZipCode");
			commonFunction.clickIfElementPresent(getPageElement(ShoppingCartPageObjects.titleEstimatedShippingTax),
					ShoppingCartPageObjects.titleEstimatedShippingTax.getObjectname());
			commonFunction.selectAnyElement(getPageElement(ShoppingCartPageObjects.dropDownState), state, ShoppingCartPageObjects.dropDownState.getObjectname());
			commonFunction.clearAndEnterTextTabOut(getPageElement(ShoppingCartPageObjects.txtBoxZipCode), zipCode, ShoppingCartPageObjects.txtBoxZipCode.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.lblTax),
					ShoppingCartPageObjects.lblTax.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.taxValue),
					ShoppingCartPageObjects.taxValue.getObjectname());
			
		}catch(Exception e) {
			report.updateTestLog("Shipping Cart -  validate Shipping Tax Estimate ",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
}
