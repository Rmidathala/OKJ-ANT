package businesscomponents;

import java.time.LocalTime;
import java.time.ZoneId;

import org.openqa.selenium.WebElement;

import supportlibraries.ReusableLibrary;
import supportlibraries.ScriptHelper;
import com.cognizant.framework.Status;
import com.cognizant.framework.selenium.WebDriverUtil;

import componentgroups.CommonFunctions;
import pages.ProductRegistrationPageObjects;
import pages.SupportPageObjects;


public class SupportPageComponents extends ReusableLibrary {



	/**
	 * Constructor to initialize the component library
	 * 
	 * @param scriptHelper
	 *            The {@link ScriptHelper} object passed from the
	 *            {@link DriverScript}
	 */
	public SupportPageComponents(ScriptHelper scriptHelper) {
		super(scriptHelper);
	}

	CommonFunctions commonFunction = new CommonFunctions(scriptHelper);
	LocalTime liveTime = LocalTime.now(ZoneId.of("America/New_York"));
	WebDriverUtil webdriverutil = new WebDriverUtil(driver);
	
	private WebElement getPageElement(SupportPageObjects pageEnum) {
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
			report.updateTestLog("Product Support Page - get page element",
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
			}
			else {
				System.out.println("Element Not Found: "+pageEnum.getObjectname());
				return null;
			}
		} catch (Exception e) {
			report.updateTestLog("Product Registration Page - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}

	public void validateSupportPageHelpSection() {
		try {
			commonFunction.scrollIntoView(getPageElement(SupportPageObjects.titleCantFindWhatLooking));
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.titleCantFindWhatLooking), SupportPageObjects.titleCantFindWhatLooking.getObjectname());
			//Call Section
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.txtCall), SupportPageObjects.txtCall.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.txtCallTimings), SupportPageObjects.txtCallTimings.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.lnkPhoneNumber), SupportPageObjects.lnkPhoneNumber.getObjectname());
			//Email section
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.txtEmail), SupportPageObjects.txtEmail.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.txtEmaildescription), SupportPageObjects.txtEmaildescription.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.lnkSendEmail), SupportPageObjects.lnkSendEmail.getObjectname());
			//Chat Section
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.txtChat), SupportPageObjects.txtChat.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.txtChatDescription), SupportPageObjects.txtChatDescription.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.lnkStartAChat), SupportPageObjects.lnkStartAChat.getObjectname());
			
		}catch(Exception e) {
			report.updateTestLog("Validate Product Support Page - Cant find what you're looking ? Section",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateSupportPageFormsAndInformationSection() {
		try {
			commonFunction.scrollIntoView(getPageElement(SupportPageObjects.titleFormsNInformation));
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.titleFormsNInformation), SupportPageObjects.titleFormsNInformation.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(SupportPageObjects.lnkPromotionPolicy), SupportPageObjects.lnkPromotionPolicy.getObjectname());
			if(driver.getCurrentUrl().contains("/promotion-policy")) {
				report.updateTestLog("Verify user is navigated to promotion policy page", "User is successfully Navigated to Promotion Policy Page", Status.PASS);
			} else {
				report.updateTestLog("Verify user is navigated to promotion policy page", "User is NOT Navigated to  Promotion Policy Page", Status.FAIL);
			}
			driver.navigate().back();
			commonFunction.scrollIntoView(getPageElement(SupportPageObjects.titleFormsNInformation));
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.descPromotionPolicy), SupportPageObjects.descPromotionPolicy.getObjectname());
			
			commonFunction.clickIfElementPresent(getPageElement(SupportPageObjects.lnkProductRecalls), SupportPageObjects.lnkProductRecalls.getObjectname());
			if(driver.getCurrentUrl().contains("/product-recalls")) {
				report.updateTestLog("Verify user is navigated to product recall page", "User is successfully Navigated to Product recall Page", Status.PASS);
			} else {
				report.updateTestLog("Verify user is navigated to product recall page", "User is NOT Navigated to  Product recall Page", Status.FAIL);
			}
			driver.navigate().back();
			commonFunction.scrollIntoView(getPageElement(SupportPageObjects.titleFormsNInformation));
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.descProductRecalls), SupportPageObjects.descProductRecalls.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("Validate Product Support Page -Forms And Information Section",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateSupportPageOrderHelpSection() {
		try {
			commonFunction.scrollIntoView(getPageElement(SupportPageObjects.titleOrderHelp));
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.titleOrderHelp), SupportPageObjects.titleOrderHelp.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(SupportPageObjects.lnkShipping), SupportPageObjects.lnkShipping.getObjectname());
			if(driver.getCurrentUrl().contains("/shipping-policy")) {
				report.updateTestLog("Verify user is navigated to Shipping policy page", "User is successfully Navigated to Shipping Policy Page", Status.PASS);
			} else {
				report.updateTestLog("Verify user is navigated to Shipping policy page", "User is NOT Navigated to  Shipping Policy Page", Status.FAIL);
			}
			driver.navigate().back();
			commonFunction.scrollIntoView(getPageElement(SupportPageObjects.titleOrderHelp));
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.descForShipping), SupportPageObjects.descForShipping.getObjectname());
			
			commonFunction.clickIfElementPresent(getPageElement(SupportPageObjects.lnkOrderTracking), SupportPageObjects.lnkOrderTracking.getObjectname());
			if(driver.getCurrentUrl().contains("/orderlookup/guest/")) {
				report.updateTestLog("Verify user is navigated to Order Tracking page", "User is successfully Navigated to Order Tracking Page", Status.PASS);
			} else {
				report.updateTestLog("Verify user is navigated to Order Tracking page", "User is NOT Navigated to  Order Tracking Page", Status.FAIL);
			}
			driver.navigate().back();
			commonFunction.scrollIntoView(getPageElement(SupportPageObjects.titleOrderHelp));
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.descForOrderTracking), SupportPageObjects.descForOrderTracking.getObjectname());
			
			commonFunction.clickIfElementPresent(getPageElement(SupportPageObjects.lnkCaseLookup), SupportPageObjects.lnkCaseLookup.getObjectname());
			if(driver.getCurrentUrl().contains("/contact-us/search/index")) {
				report.updateTestLog("Verify user is navigated to Case Look up page", "User is successfully Navigated to Case Look Up Page", Status.PASS);
			} else {
				report.updateTestLog("Verify user is navigated to Case Look Up page", "User is NOT Navigated to  Case Look Up Page", Status.FAIL);
			}
			driver.navigate().back();
			commonFunction.scrollIntoView(getPageElement(SupportPageObjects.titleOrderHelp));
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.descForCaseLookup), SupportPageObjects.descForCaseLookup.getObjectname());
			
			commonFunction.clickIfElementPresent(getPageElement(SupportPageObjects.lnkReturns), SupportPageObjects.lnkReturns.getObjectname());
			if(driver.getCurrentUrl().contains("/return-policy")) {
				report.updateTestLog("Verify user is navigated to Returns Policy page", "User is successfully Navigated to Returns Page", Status.PASS);
			} else {
				report.updateTestLog("Verify user is navigated to Returns page", "User is NOT Navigated to  Returns Page", Status.FAIL);
			}
			driver.navigate().back();
			commonFunction.scrollIntoView(getPageElement(SupportPageObjects.titleOrderHelp));
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.descForReturns), SupportPageObjects.descForReturns.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("Validate Product Support Page -Order Help Section",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateSupportPageFAQSection() {
		try {
			commonFunction.scrollIntoView(getPageElement(SupportPageObjects.titleFAQ));
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.titleFAQ), SupportPageObjects.titleFAQ.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.subtitleHowDoISeasonMySmoker), SupportPageObjects.subtitleHowDoISeasonMySmoker.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.descForHowDoISeasonMySmoker), SupportPageObjects.descForHowDoISeasonMySmoker.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(SupportPageObjects.lnkViewAllFAQs), SupportPageObjects.lnkViewAllFAQs.getObjectname());
			if(driver.getCurrentUrl().contains("/faqs/")) {
				report.updateTestLog("Verify user is navigated to FAQ page", "User is successfully Navigated to FAQ Page", Status.PASS);
			} else {
				report.updateTestLog("Verify user is navigated to FAQ page", "User is NOT Navigated to  FAQ Page", Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Validate Product Support Page -FAQ Section",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateSupportPageProductSearchSection() {
		try {
			String productModel = dataTable.getData("General_Data","ProductModelNumber");
			commonFunction.scrollIntoView(getPageElement(SupportPageObjects.titleProductSearch));
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.titleProductSearch), SupportPageObjects.titleProductSearch.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.descProductSearch), SupportPageObjects.descProductSearch.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.helpTextProductSearch), SupportPageObjects.helpTextProductSearch.getObjectname());
			commonFunction.clearAndEnterText(getPageElement(SupportPageObjects.txtBoxEnterProductModelNumber), productModel, SupportPageObjects.txtBoxEnterProductModelNumber.getObjectname());
			commonFunction.hitEnterKey(getPageElement(SupportPageObjects.txtBoxEnterProductModelNumber), SupportPageObjects.txtBoxEnterProductModelNumber.getObjectname());
			if(driver.getCurrentUrl().contains("/parts/search/results/?model="+productModel)) {
				report.updateTestLog("Verify Part Listing Page from Footer", "User is successfully navigated to Part Listing page", Status.PASS);
			}else {
				report.updateTestLog("Verify Part Listing Page from Footer", "User is NOT navigated to Part Listing page", Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Validate Product Support Page -Product Search Section",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validateSupportPageProductRegistrationSection() {
		try {
			commonFunction.scrollIntoView(getPageElement(SupportPageObjects.titleProductRegistration));
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.titleProductRegistration), SupportPageObjects.titleProductRegistration.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(SupportPageObjects.descProductRegistration), SupportPageObjects.descProductRegistration.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(SupportPageObjects.btnRegisterProduct), SupportPageObjects.btnRegisterProduct.getObjectname());
			if(commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.lblProductRegistrationHeading), ProductRegistrationPageObjects.lblProductRegistrationHeading.getObjectname())){
				report.updateTestLog("Verify Navigation to Product Registration", "User is successfully Navigated to Product Registration Page", Status.PASS);
			}else {
				report.updateTestLog("Verify Navigation to Product Registration", "User is Not navigated to Product Registration Page", Status.FAIL);
			}
		}catch(Exception e) {
			report.updateTestLog("Validate Product Support Page -Product registration Section",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
}
