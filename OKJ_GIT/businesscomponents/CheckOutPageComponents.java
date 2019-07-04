package businesscomponents;

import java.time.LocalTime;
import java.time.ZoneId;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import supportlibraries.ReusableLibrary;
import supportlibraries.ScriptHelper;
import com.cognizant.framework.Status;
import com.cognizant.framework.selenium.WebDriverUtil;

import componentgroups.CommonFunctions;
import pages.CheckOutPageObjects;
import pages.ShoppingCartPageObjects;

public class CheckOutPageComponents extends ReusableLibrary {



	/**
	 * Constructor to initialize the component library
	 * 
	 * @param scriptHelper
	 *            The {@link ScriptHelper} object passed from the
	 *            {@link DriverScript}
	 */
	public CheckOutPageComponents(ScriptHelper scriptHelper) {
		super(scriptHelper);
	}

	CommonFunctions commonFunction = new CommonFunctions(scriptHelper);
	LocalTime liveTime = LocalTime.now(ZoneId.of("America/New_York"));
	WebDriverUtil webdriverutil = new WebDriverUtil(driver);
	private WebElement getPageElement(CheckOutPageObjects pageEnum) {
		WebElement element;
		try {
			element = commonFunction.getElementByProperty(pageEnum.getProperty(), pageEnum.getLocatorType().toString(),
					true);
			if (element != null) {
				System.out.println("Found the element: " + pageEnum.getObjectname());
			return element;
			}
			else {
				System.out.println("Element Not Found: "+pageEnum.getObjectname());
				return null;
			}
		} catch (Exception e) {
			report.updateTestLog("Checkout Page - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}
	
	private WebElement getPageElement(ShoppingCartPageObjects pageEnum) {
		WebElement element;
		try {
			element = commonFunction.getElementByProperty(pageEnum.getProperty(), pageEnum.getLocatorType().toString(),
					true);
			if (element != null) {
				System.out.println("Found the element: " + pageEnum.getObjectname());
			return element;
			}
			else {
				System.out.println("Element Not Found: "+pageEnum.getObjectname());
				return null;
			}
		} catch (Exception e) {
			report.updateTestLog("Shopping Cart - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}
	
	public void validateGuestCheckoutPage() {
		try {
			
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.txtSignInOrContinueGuest), CheckOutPageObjects.txtSignInOrContinueGuest.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.txtCreateAccountAfterCheckout), CheckOutPageObjects.txtCreateAccountAfterCheckout.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblEmailAddress), CheckOutPageObjects.lblEmailAddress.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.txtBoxEmailAddress), CheckOutPageObjects.txtBoxEmailAddress.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.tooltipBtnEmailAddress), CheckOutPageObjects.tooltipBtnEmailAddress.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblChekoutTitle), CheckOutPageObjects.lblChekoutTitle.getObjectname());
			
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblAddress), CheckOutPageObjects.lblAddress.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblFirstName), CheckOutPageObjects.lblFirstName.getObjectname());
			
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblLastName), CheckOutPageObjects.lblLastName.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.txtBoxFirstName), CheckOutPageObjects.txtBoxFirstName.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.txtBoxLastName), CheckOutPageObjects.txtBoxLastName.getObjectname());
		
			
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.txtBoxLastName), CheckOutPageObjects.txtBoxLastName.getObjectname());
			
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblStreetAddress), CheckOutPageObjects.lblStreetAddress.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.txtBoxStreetAddressLine1), CheckOutPageObjects.txtBoxStreetAddressLine1.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.txtBoxStreetAddressLine2), CheckOutPageObjects.txtBoxStreetAddressLine2.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblCity), CheckOutPageObjects.lblCity.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.txtBoxCity), CheckOutPageObjects.txtBoxCity.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblStateProvince), CheckOutPageObjects.lblStateProvince.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.drpDownStateProvince), CheckOutPageObjects.drpDownStateProvince.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblZipPostelCode), CheckOutPageObjects.lblZipPostelCode.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.txtBoxZipPostelCode), CheckOutPageObjects.txtBoxZipPostelCode.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblCountry), CheckOutPageObjects.lblCountry.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.txtBoxCountry), CheckOutPageObjects.txtBoxCountry.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblPhoneNumber), CheckOutPageObjects.lblPhoneNumber.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.txtBoxPhoneNumber), CheckOutPageObjects.txtBoxPhoneNumber.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.tooltipBtnPhoneNumber), CheckOutPageObjects.tooltipBtnPhoneNumber.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblSignUpMailingList), CheckOutPageObjects.lblSignUpMailingList.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.checkBoxGetRecipesTips), CheckOutPageObjects.checkBoxGetRecipesTips.getObjectname());
			
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblShippingMethod), CheckOutPageObjects.lblShippingMethod.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.radioBtnShippingMethod1), CheckOutPageObjects.radioBtnShippingMethod1.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.btnContinueToBilling), CheckOutPageObjects.btnContinueToBilling.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblBillingInformation), CheckOutPageObjects.lblBillingInformation.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblCartNoOfItems), CheckOutPageObjects.lblCartNoOfItems.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.imgProductImg), CheckOutPageObjects.imgProductImg.getObjectname());
			
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblProductNameInCart), CheckOutPageObjects.lblProductNameInCart.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblProductPriceInCart), CheckOutPageObjects.lblProductPriceInCart.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblProductQuantity), CheckOutPageObjects.lblProductQuantity.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.txtProductQuantity), CheckOutPageObjects.txtProductQuantity.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblProductTotalPrice), CheckOutPageObjects.lblProductTotalPrice.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.txtBoxEnterDiscountCode), CheckOutPageObjects.txtBoxEnterDiscountCode.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.btnApplyDiscountCode), CheckOutPageObjects.btnApplyDiscountCode.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblYourOrder), CheckOutPageObjects.lblYourOrder.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblCartSubTotal), CheckOutPageObjects.lblCartSubTotal.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.amtCartSubTotal), CheckOutPageObjects.amtCartSubTotal.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblShipping), CheckOutPageObjects.lblShipping.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblShippingMethodYourOrderSection), CheckOutPageObjects.lblShippingMethodYourOrderSection.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblOrderTotal), CheckOutPageObjects.lblOrderTotal.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.amtOrderTotal), CheckOutPageObjects.amtOrderTotal.getObjectname());
			
			
		}catch(Exception e) {
			report.updateTestLog("Checkout Page -  Need Something Else Validation",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
		
	public void validateNeedSomethingElseSectionInCheckoutPage() {
		try {
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.txtNeedSomethingElse),
					CheckOutPageObjects.txtNeedSomethingElse.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lnkShopSmokersGrills),
					CheckOutPageObjects.lnkShopSmokersGrills.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lnkShopAccessories),
					CheckOutPageObjects.lnkShopAccessories.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lnkShippingPolicy),
					CheckOutPageObjects.lnkShippingPolicy.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lnkReturnPolicy),
					CheckOutPageObjects.lnkReturnPolicy.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lnkPhoneNumber),
					CheckOutPageObjects.lnkPhoneNumber.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lnkLiveChat),
					CheckOutPageObjects.lnkLiveChat.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("CheckOut Page -  Need Something Else Validation",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void enterValidDetailsGuestCheckoutPage() {
		try {
			String eamilAddress = commonFunction.randomAlphaNumeric(8)+"@rmail.com";
			String firstName = commonFunction.randomAlphaNumeric(5);
			String lastName = commonFunction.randomAlphaNumeric(5);
			String streetAddr = dataTable.getData("General_Data", "StreetAddress");
			String city = dataTable.getData("General_Data", "City");
			String state =dataTable.getData("General_Data", "State");
			String zip = dataTable.getData("General_Data","ZipCode");
			String phone = dataTable.getData("General_Data", "PhoneNumber");
			webdriverutil.waitUntilPageReadyStateComplete(20);
			Thread.sleep(3000);
			commonFunction.clearAndEnterText(getPageElement(CheckOutPageObjects.txtBoxEmailAddress), eamilAddress, CheckOutPageObjects.txtBoxEmailAddress.getObjectname());	
			commonFunction.clearAndEnterText(getPageElement(CheckOutPageObjects.txtBoxFirstName), firstName, CheckOutPageObjects.txtBoxFirstName.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(CheckOutPageObjects.txtBoxLastName), lastName, CheckOutPageObjects.txtBoxLastName.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(CheckOutPageObjects.txtBoxStreetAddressLine1), streetAddr, CheckOutPageObjects.txtBoxStreetAddressLine1.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(CheckOutPageObjects.txtBoxCity), city, CheckOutPageObjects.txtBoxCity.getObjectname());
			commonFunction.selectAnyElement(getPageElement(CheckOutPageObjects.drpDownStateProvince), state, CheckOutPageObjects.drpDownStateProvince.getObjectname());
			
			commonFunction.clearAndEnterText(getPageElement(CheckOutPageObjects.txtBoxZipPostelCode), zip, CheckOutPageObjects.txtBoxZipPostelCode.getObjectname());
			commonFunction.clearAndEnterTextTabOut(getPageElement(CheckOutPageObjects.txtBoxPhoneNumber), phone, CheckOutPageObjects.txtBoxPhoneNumber.getObjectname());
		
		}catch(Exception e) {
			report.updateTestLog("CheckOut Page Guest -  Enter valid details",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void enterValidDetailsRegisteredUserCheckoutPage() {
		try {
			
			String streetAddr = dataTable.getData("General_Data", "StreetAddress");
			String city = dataTable.getData("General_Data", "City");
			String state =dataTable.getData("General_Data", "State");
			String zip = dataTable.getData("General_Data","ZipCode");
			String phone = dataTable.getData("General_Data", "PhoneNumber");
			webdriverutil.waitUntilPageReadyStateComplete(20);
			Thread.sleep(3000);
			commonFunction.clearAndEnterText(getPageElement(CheckOutPageObjects.txtBoxStreetAddressLine1), streetAddr, CheckOutPageObjects.txtBoxStreetAddressLine1.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(CheckOutPageObjects.txtBoxCity), city, CheckOutPageObjects.txtBoxCity.getObjectname());
			commonFunction.selectAnyElement(getPageElement(CheckOutPageObjects.drpDownStateProvince), state, CheckOutPageObjects.drpDownStateProvince.getObjectname());
			
			commonFunction.clearAndEnterText(getPageElement(CheckOutPageObjects.txtBoxZipPostelCode), zip, CheckOutPageObjects.txtBoxZipPostelCode.getObjectname());
			commonFunction.clearAndEnterTextTabOut(getPageElement(CheckOutPageObjects.txtBoxPhoneNumber), phone, CheckOutPageObjects.txtBoxPhoneNumber.getObjectname());
		
		}catch(Exception e) {
			report.updateTestLog("CheckOut Page Guest -  Enter valid details",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void navigatetoBillingPage() {
		try {
			//commonFunction.scrollIntoView(getPageElement(CheckOutPageObjects.btnContinueToBilling));
			commonFunction.clickIfElementPresentJavaScript(getPageElement(CheckOutPageObjects.btnContinueToBilling), CheckOutPageObjects.btnContinueToBilling.getObjectname());
			if(webdriverutil.objectExists(By.xpath(CheckOutPageObjects.btnConfirmAddress.getProperty()))) {
				commonFunction.clickIfElementPresentJavaScript(getPageElement(CheckOutPageObjects.btnConfirmAddress), CheckOutPageObjects.btnConfirmAddress.getObjectname());
			}
			if(commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.lblBillingInformationAfterContinueBilling), CheckOutPageObjects.lblBillingInformationAfterContinueBilling.getObjectname())) {
				report.updateTestLog("Verify user navigated to Billing/Payment Page", "User is successfully Navigated to Billing Page", Status.PASS);
			}else {
				report.updateTestLog("Verify user navigated to Billing/Payment Page", "User is NOT Navigated to Billing Page", Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("CheckOut Page Guest -  Navigate to Billing Page",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void enterValidCardDetailsAndPlaceOrder() {
		
		try {
			String cardType = dataTable.getData("General_Data", "CardType");
			String cardNo = dataTable.getData("General_Data", "CardNo");
			
			commonFunction.clearAndEnterText(getPageElement(CheckOutPageObjects.txtBoxCreditCartNumber), cardNo, CheckOutPageObjects.txtBoxCreditCartNumber.getObjectname());
			switch (cardType) {
			case "VISA" :
				commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.imgVisa),
						CheckOutPageObjects.imgVisa.getObjectname());
				break;
			case "MASTER" :
				commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.imgMaster),
						CheckOutPageObjects.imgMaster.getObjectname());
				break;
			case "DISCOVER" :
				commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.imgDiscover),
						CheckOutPageObjects.imgDiscover.getObjectname());
				break;
				
			}
			
			commonFunction.selectAnyElement(getPageElement(CheckOutPageObjects.drpDownExpiryMonth), 5, CheckOutPageObjects.drpDownExpiryMonth.getObjectname());
			
			commonFunction.selectAnyElement(getPageElement(CheckOutPageObjects.drpDownExpiryYear), 5, CheckOutPageObjects.drpDownExpiryYear.getObjectname());
		
			commonFunction.clearAndEnterText(getPageElement(CheckOutPageObjects.txtBoxCVN), "343", CheckOutPageObjects.txtBoxCVN.getObjectname());
			
			commonFunction.verifyIfElementIsPresent(getPageElement(CheckOutPageObjects.btnPlaceOrder), CheckOutPageObjects.btnPlaceOrder.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("CheckOut Page Guest -  Enter valid details and Place Order",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateShippingAndTaxOnQuantityChange() {
		try {
			commonFunction.clickIfElementPresentJavaScript(getPageElement(CheckOutPageObjects.lnkEditCart), CheckOutPageObjects.lnkEditCart.getObjectname());
			if(commonFunction.verifyIfElementIsPresent(getPageElement(ShoppingCartPageObjects.txtShoppingCartTitle), ShoppingCartPageObjects.txtShoppingCartTitle.getObjectname())) {
				report.updateTestLog("Verify user is navigated to Shopping Cart Page", "User is successfully navigated to Shopping Cart Page", Status.PASS);
			}else {
				report.updateTestLog("Verify user is navigated to Shopping Cart Page", "User is NOT navigated to Shopping Cart Page", Status.FAIL);
			}
			ShoppingCartPageComponents shoppingCartpage = new ShoppingCartPageComponents(scriptHelper);
			shoppingCartpage.upateQuantityAndValidateChangeInPrice();
			double cartSubTotal = shoppingCartpage.getCartSubTotal();
			double cartTax = shoppingCartpage.getCartTaxValue();
			double checkoutSubTotal =Double.parseDouble(commonFunction.getTextFromElement(getPageElement(CheckOutPageObjects.amtCartSubTotal)).substring(1).replace(",", ""));
			double checkoutTax = Double.parseDouble(commonFunction.getTextFromElement(getPageElement(CheckOutPageObjects.amtCartTax)).substring(1).replace(",", ""));
			if(cartSubTotal==checkoutSubTotal && cartTax==checkoutTax) {
				report.updateTestLog("Verify Cart Sub Total and Shipping Tax are updated as per the change in Quantity", "Product Sub Total and Shipping Tax are updated as per the Change in quantity", Status.PASS);
			}else {
				report.updateTestLog("Verify Cart Sub Total and Shipping Tax are updated as per the change in Quantity", "Product Sub Total and Shipping Tax are NOT updated as per the Change in quantity", Status.FAIL);
			}
		
		}catch(Exception e) {
			report.updateTestLog("Validate Shipping and Tax on Quantity Change",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateAddressPopulatedRegisteredUser() {
		try {
			String expectedPopulatedAddr = dataTable.getData("General_Data","PopulatedAddress");
			String expectedPhoneNumber = dataTable.getData("General_Data","PopulatedPhoneNumber");
			if(commonFunction.isElementPresentContainsText(getPageElement(CheckOutPageObjects.txtPopulatedAddress), CheckOutPageObjects.txtPopulatedAddress.getObjectname(), expectedPopulatedAddr)) {
				report.updateTestLog("Verify Addresses should be prefilled as per the addresses eneterd by the user during sign up process", "Addresses are prefilled as per the addresses eneterd by the user during sign up process", Status.PASS);
			}else {
				report.updateTestLog("Verify Addresses should be prefilled as per the addresses eneterd by the user during sign up process", "Addresses are NOT prefilled as per the addresses eneterd by the user during sign up process", Status.FAIL);
			}
			commonFunction.isElementPresentContainsText(getPageElement(CheckOutPageObjects.txtPopulatedAddress), CheckOutPageObjects.txtPopulatedAddress.getObjectname(), expectedPhoneNumber);
		}catch(Exception e) {
			report.updateTestLog("Validate Address Populated for Registered User with Address",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateUserNavigationToAddNewAddress() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(CheckOutPageObjects.btnNewAddress), CheckOutPageObjects.btnNewAddress.getObjectname());
			if(commonFunction.isElementPresentContainsText(getPageElement(CheckOutPageObjects.lblAddNewAddr), CheckOutPageObjects.lblAddNewAddr.getObjectname(), "Add New Address")) {
				report.updateTestLog("Verify user is navigated to Add new Address Page", "User is successfully navigated to Add New Address Page", Status.PASS);
			}else {
				report.updateTestLog("Verify user is navigated to Add new Address Page", "User is NOT navigated to Add New Address Page", Status.FAIL);
			}
		}catch(Exception e) {
			
		}
	}
	
	public void validatePaymentDetailsPage() {
		try {
			
		}catch(Exception e) {
			
		}
	}
}
