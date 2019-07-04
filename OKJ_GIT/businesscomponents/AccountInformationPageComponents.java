package businesscomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import supportlibraries.ReusableLibrary;
import supportlibraries.ScriptHelper;
import com.cognizant.framework.Status;
import com.cognizant.framework.selenium.WebDriverUtil;

import componentgroups.CommonFunctions;
import pages.AccountInformationPageObjects;
import pages.ProductRegistrationPageObjects;

public class AccountInformationPageComponents extends ReusableLibrary {

	/**
	 * Constructor to initialize the component library
	 * 
	 * @param scriptHelper
	 *            The {@link ScriptHelper} object passed from the
	 *            {@link DriverScript}
	 */
	public AccountInformationPageComponents(ScriptHelper scriptHelper) {
		super(scriptHelper);
		// TODO Auto-generated constructor stub
	}

	CommonFunctions commonFunction = new CommonFunctions(scriptHelper);
	WebDriverUtil webdriverutil = new WebDriverUtil(driver);

	private WebElement getPageElement(AccountInformationPageObjects pageEnum) {
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
	
	private WebElement getPageElement(ProductRegistrationPageObjects pageEnum) {
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
			report.updateTestLog("Product Registration Page - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}
	public void validateAccountInformationPage() {
		try {
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.titlMyAccount), AccountInformationPageObjects.titlMyAccount.getObjectname());
			
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.titleAccountInfo), AccountInformationPageObjects.titleAccountInfo.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.txtLoginInfo), AccountInformationPageObjects.txtLoginInfo.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.txtFullNameAndEmail), AccountInformationPageObjects.txtFullNameAndEmail.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.lnkEditLoginInformation), AccountInformationPageObjects.lnkEditLoginInformation.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.lnkChangePassword), AccountInformationPageObjects.lnkChangePassword.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.titleEmailPreferences), AccountInformationPageObjects.titleEmailPreferences.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.msgYouAreNotSubscribed), AccountInformationPageObjects.msgYouAreNotSubscribed.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.msgRecipesPromo), AccountInformationPageObjects.msgRecipesPromo.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.lnkEditEmailPreferences), AccountInformationPageObjects.lnkEditEmailPreferences.getObjectname());

			//Manage Account
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.lnkOrders), AccountInformationPageObjects.lnkOrders.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.lnkAddressBookAccountInfoPage), AccountInformationPageObjects.lnkAddressBookAccountInfoPage.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.lnkRegisteredProducts), AccountInformationPageObjects.lnkRegisteredProducts.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.lnkDisabledMyAccount), AccountInformationPageObjects.lnkDisabledMyAccount.getObjectname());
			// Need Help Section
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.txtNeedSomethingElse), AccountInformationPageObjects.txtNeedSomethingElse.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.lnkShopSmokersGrills), AccountInformationPageObjects.lnkShopSmokersGrills.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.lnkShopAccessories), AccountInformationPageObjects.lnkShopAccessories.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.lnkShippingPolicy), AccountInformationPageObjects.lnkShippingPolicy.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.lnkReturnPolicy), AccountInformationPageObjects.lnkReturnPolicy.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.lnkPhoneNumber), AccountInformationPageObjects.lnkPhoneNumber.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.lnkLiveChat), AccountInformationPageObjects.lnkLiveChat.getObjectname());
						
		}catch(Exception e) {
			report.updateTestLog("Validate Account Information Page ",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void addAddress() {
		try {
		String firstName = dataTable.getData("General_Data","FirstName");
		String lastName = dataTable.getData("General_Data","LastName");
		String company = dataTable.getData("General_Data","Company");
		String phoneNumber = dataTable.getData("General_Data","PhoneNumber");
		String street1 = dataTable.getData("General_Data","StreetAddress");
		String city = dataTable.getData("General_Data","City");
		String state = dataTable.getData("General_Data","State");
		String zip = dataTable.getData("General_Data","ZipCode");
		
		commonFunction.clickIfElementPresent(getPageElement(AccountInformationPageObjects.lnkAddNewAddress), AccountInformationPageObjects.lnkAddNewAddress.getObjectname());
		if(commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.lblAddNewAddress), AccountInformationPageObjects.lblAddNewAddress.getObjectname())) {
			report.updateTestLog("Verify user navigated to Add Address Page", "User is successfully Navigated to Add Address Page", Status.PASS);
		} else {
			report.updateTestLog("Verify user navigated to Add Address Page", "User is NOT Navigated to Add Address Page", Status.FAIL);
		}
		commonFunction.clearAndEnterText(getPageElement(AccountInformationPageObjects.txtBoxFirstName), firstName, AccountInformationPageObjects.txtBoxFirstName.getObjectname());
		commonFunction.clearAndEnterText(getPageElement(AccountInformationPageObjects.txtBoxLastName), lastName, AccountInformationPageObjects.txtBoxLastName.getObjectname());
		commonFunction.clearAndEnterText(getPageElement(AccountInformationPageObjects.txtBoxCompany), company, AccountInformationPageObjects.txtBoxCompany.getObjectname());
		commonFunction.clearAndEnterText(getPageElement(AccountInformationPageObjects.txtBoxPhone), phoneNumber, AccountInformationPageObjects.txtBoxPhone.getObjectname());
		commonFunction.clearAndEnterText(getPageElement(AccountInformationPageObjects.txtBoxAddressLine1), street1, AccountInformationPageObjects.txtBoxAddressLine1.getObjectname());
		commonFunction.clearAndEnterText(getPageElement(AccountInformationPageObjects.txtBoxCity), city, AccountInformationPageObjects.txtBoxCity.getObjectname());
		commonFunction.selectAnyElement(getPageElement(AccountInformationPageObjects.drpDownState), state, AccountInformationPageObjects.drpDownState.getObjectname());
		commonFunction.clearAndEnterText(getPageElement(AccountInformationPageObjects.txtBoxZip), zip, AccountInformationPageObjects.txtBoxZip.getObjectname());
		commonFunction.clickIfElementPresent(getPageElement(AccountInformationPageObjects.btnSaveAddress), AccountInformationPageObjects.btnSaveAddress.getObjectname());
		if(commonFunction.isElementPresentContainsText(getPageElement(AccountInformationPageObjects.msgAddressAdded), AccountInformationPageObjects.msgAddressAdded.getObjectname(), "You saved the address.")) {
			report.updateTestLog("Verify Address Added", "Address is Added successfully", Status.PASS);
		} else {
			report.updateTestLog("Verify Address Added", "Address is not Added", Status.FAIL);
		}
		}catch(Exception e) {
			report.updateTestLog("Add Address",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void deleteAddress() {
		try {
			if(!webdriverutil.objectExists(By.xpath(AccountInformationPageObjects.lnkRemoveAddress.getProperty()))) {
				addAddress();
			}
			commonFunction.clickIfElementPresent(getPageElement(AccountInformationPageObjects.lnkRemoveAddress), AccountInformationPageObjects.lnkRemoveAddress.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.lblremoveAddresspopup), AccountInformationPageObjects.lblremoveAddresspopup.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(AccountInformationPageObjects.btnOk), AccountInformationPageObjects.btnOk.getObjectname());
			if(commonFunction.isElementPresentContainsText(getPageElement(AccountInformationPageObjects.msgAddressDeleted), AccountInformationPageObjects.msgAddressDeleted.getObjectname(), "You deleted the address.")) {
				report.updateTestLog("Verify Delete Address", "Address is Deleted successfully", Status.PASS);
			} else {
				report.updateTestLog("Verify Delete Address", "Address is not Deleted", Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Delete Address",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateManangeAccountSection() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(AccountInformationPageObjects.lnkOrders), AccountInformationPageObjects.lnkOrders.getObjectname());
			if(commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.lblMyOrders), AccountInformationPageObjects.lblMyOrders.getObjectname())) {
				report.updateTestLog("Verify user navigated to My Order Page", "My Order Page is successfully displayed", Status.PASS);
			} else {
				report.updateTestLog("Verify user navigated to My Order Page", "User not navigated to My Order page", Status.FAIL);
			}
			commonFunction.clickIfElementPresent(getPageElement(AccountInformationPageObjects.lnkAddressBookAccountInfoPage), AccountInformationPageObjects.lnkAddressBookAccountInfoPage.getObjectname());
			if(commonFunction.verifyIfElementIsPresent(getPageElement(AccountInformationPageObjects.lnkAddNewAddress), AccountInformationPageObjects.lnkAddNewAddress.getObjectname())){
				report.updateTestLog("Verify user navigated to Address Book Page", "User is successfully Navigated to Address Book Page", Status.PASS);
			} else {
				report.updateTestLog("Verify user navigated to Address Book Page", "User is NOT Navigated to Address Book Page", Status.FAIL);
			}
			commonFunction.clickIfElementPresent(getPageElement(AccountInformationPageObjects.lnkRegisteredProducts), AccountInformationPageObjects.lnkRegisteredProducts.getObjectname());
			if(commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.lnkRegisterProduct), ProductRegistrationPageObjects.lnkRegisterProduct.getObjectname())){
				report.updateTestLog("Verify Navigation to Product Registration", "User is successfully Navigated to Product Registration Page", Status.PASS);
			}else {
				report.updateTestLog("Verify Navigation to Product Registration", "User is Not navigated to Product Registration Page", Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Validate Manage Account Section.",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
}
