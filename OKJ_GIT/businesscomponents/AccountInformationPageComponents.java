package businesscomponents;

import org.openqa.selenium.WebElement;

import supportlibraries.ReusableLibrary;
import supportlibraries.ScriptHelper;
import com.cognizant.framework.Status;
import com.cognizant.framework.selenium.WebDriverUtil;

import componentgroups.CommonFunctions;
import pages.AccountInformationPageObjects;

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
}
