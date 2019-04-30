package businesscomponents;

import org.openqa.selenium.WebElement;

import supportlibraries.ReusableLibrary;
import supportlibraries.ScriptHelper;
import com.cognizant.framework.Status;
import com.cognizant.framework.selenium.WebDriverUtil;

import componentgroups.CommonFunctions;
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
			Double totalValueBeforeQuantityChange = Double.parseDouble(commonFunction.getTextFromElement(getPageElement(ShoppingCartPageObjects.txtTotalPrice)).substring(1).replace(",", ""));
			System.out.println("totalValueBeforeQuantityChange"+totalValueBeforeQuantityChange);
			Double subTotalValueBeforeQuantityChange = Double.parseDouble(commonFunction.getTextFromElement(getPageElement(ShoppingCartPageObjects.txtSubTotalPrice)).substring(1).replace(",", ""));
			System.out.println("subTotalValueBeforeQuantityChange" +subTotalValueBeforeQuantityChange);
			commonFunction.selectAnyElement(getPageElement(ShoppingCartPageObjects.drpDownQuantity), "2", ShoppingCartPageObjects.drpDownQuantity.getObjectname());
			Double totalValueAfterQuantityChange = Double.parseDouble(commonFunction.getTextFromElement(getPageElement(ShoppingCartPageObjects.txtTotalPrice)).substring(1).replace(",", ""));
			System.out.println("totalValueAfterQuantityChange"+totalValueAfterQuantityChange);
			Double subTotalValueAfterQuantityChange = Double.parseDouble(commonFunction.getTextFromElement(getPageElement(ShoppingCartPageObjects.txtSubTotalPrice)).substring(1).replace(",", ""));
			System.out.println("subTotalValueAfterQuantityChange"+subTotalValueAfterQuantityChange);
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
	
	public void validateEditLink() {
		try {
			Double totalValueBeforeQuantityChange = Double.parseDouble(commonFunction.getTextFromElement(getPageElement(ShoppingCartPageObjects.txtTotalPrice)).substring(1).replace(",", ""));
			int quantityBeforeEdit = Integer.parseInt(commonFunction.getSelectedTextFromDropDown(getPageElement(ShoppingCartPageObjects.drpDownQuantity)));
			commonFunction.clickIfElementPresent(getPageElement(ShoppingCartPageObjects.lnkEdit),
					ShoppingCartPageObjects.lnkEdit.getObjectname());
			
			ProductDetailsPageComponents pdp = new ProductDetailsPageComponents(scriptHelper);
			pdp.updateQuantityInProductDetailsPage();
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
					ShoppingCartPageObjects.txtNoItems.getObjectname())) {
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
}
