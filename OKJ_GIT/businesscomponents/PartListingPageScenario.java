package businesscomponents;

import java.time.LocalTime;
import java.time.ZoneId;

import org.openqa.selenium.WebElement;

import supportlibraries.ReusableLibrary;
import supportlibraries.ScriptHelper;
import com.cognizant.framework.Status;
import com.cognizant.framework.selenium.WebDriverUtil;

import componentgroups.CommonFunctions;
import pages.PartListingPageObjects;
import pages.ProductRegistrationPageObjects;

public class PartListingPageScenario extends ReusableLibrary {



	/**
	 * Constructor to initialize the component library
	 * 
	 * @param scriptHelper
	 *            The {@link ScriptHelper} object passed from the
	 *            {@link DriverScript}
	 */
	public PartListingPageScenario(ScriptHelper scriptHelper) {
		super(scriptHelper);
	}

	CommonFunctions commonFunction = new CommonFunctions(scriptHelper);
	LocalTime liveTime = LocalTime.now(ZoneId.of("America/New_York"));
	WebDriverUtil webdriverutil = new WebDriverUtil(driver);
	private WebElement getPageElement(PartListingPageObjects pageEnum) {
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
			report.updateTestLog("Parts Listing Page- get page element",
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
			report.updateTestLog("Parts Listing Page- get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}
	
	public void validatePartsListingPage() {
		try {
			commonFunction.verifyIfElementIsPresent(getPageElement(PartListingPageObjects.lblProductSummryTitle), PartListingPageObjects.lblProductSummryTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(PartListingPageObjects.imgPart), PartListingPageObjects.imgPart.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(PartListingPageObjects.btnRegisterProduct), PartListingPageObjects.btnRegisterProduct.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(PartListingPageObjects.txtHelpForPartsModel), PartListingPageObjects.txtHelpForPartsModel.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(PartListingPageObjects.lblProductModelSummary), PartListingPageObjects.lblProductModelSummary.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(PartListingPageObjects.lblParts), PartListingPageObjects.lblParts.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(PartListingPageObjects.lblWarranties), PartListingPageObjects.lblWarranties.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(PartListingPageObjects.lblcantfind), PartListingPageObjects.lblcantfind.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("Part Listing Page validation",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void navigateToProductRegistrationPageFromPartsListingPage() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(PartListingPageObjects.btnRegisterProduct), PartListingPageObjects.btnRegisterProduct.getObjectname());
			if(commonFunction.verifyIfElementIsPresent(getPageElement(ProductRegistrationPageObjects.lblProductRegistrationHeading), ProductRegistrationPageObjects.lblProductRegistrationHeading.getObjectname())) {
				report.updateTestLog("Verify user navigated to Product Registration Page from Parts Listing Page", "User is successfully navigated to Product Registration Page from Part Listing Page", Status.PASS);
			}else {
				report.updateTestLog("Verify user navigated to Product Registration Page from Parts Listing Page", "User is NOT Navigated to Product Registration Page from Part Listing Page", Status.FAIL);
			}
			
			driver.navigate().back();
		}catch(Exception e) {
			report.updateTestLog("Navigation to Product Registration from Part Listing Page",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validatePartDetailsPage() {
		try {
			commonFunction.clickIfElementPresent(getPageElement(PartListingPageObjects.lnkViewPartDetails), PartListingPageObjects.lnkViewPartDetails.getObjectname());
			
			commonFunction.verifyIfElementIsPresent(getPageElement(PartListingPageObjects.lblPartDetailName), PartListingPageObjects.lblPartDetailName.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(PartListingPageObjects.imgPartImage), PartListingPageObjects.imgPartImage.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(PartListingPageObjects.lblPartPrice), PartListingPageObjects.lblPartPrice.getObjectname());
			//commonFunction.verifyIfElementIsPresent(getPageElement(PartListingPageObjects.btnPartRegister), PartListingPageObjects.btnPartRegister.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(PartListingPageObjects.txtPartDescription), PartListingPageObjects.txtPartDescription.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(PartListingPageObjects.lblIsItCompatible), PartListingPageObjects.lblIsItCompatible.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(PartListingPageObjects.txtBoxModel), PartListingPageObjects.txtBoxModel.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(PartListingPageObjects.lblDetails), PartListingPageObjects.lblDetails.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(PartListingPageObjects.txtProductDescUnderDetail), PartListingPageObjects.txtProductDescUnderDetail.getObjectname());
		
		}catch(Exception e) {
			report.updateTestLog("Validate Part Details Page",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void validatePartCompatibleFunctionality() {
		try {
			String productModelNumber1 = dataTable.getData("General_Data", "ProductModelNumber");
			String productModelNumber2 = dataTable.getData("General_Data", "ProductModelNumber2");
			String partCompatibleMsg = dataTable.getData("General_Data","CompatibleSuccessMsg");
			String partNotCompatibleMsg = dataTable.getData("General_Data","CompatibleFailMsg");
			String partNotFoundMsg = dataTable.getData("General_Data","PartNotFoundMsg");
			commonFunction.clearAndEnterText(getPageElement(PartListingPageObjects.txtBoxModel), productModelNumber1, PartListingPageObjects.txtBoxModel.getObjectname());
			commonFunction.hitEnterKey(getPageElement(PartListingPageObjects.txtBoxModel), PartListingPageObjects.txtBoxModel.getObjectname());
			commonFunction.isElementPresentContainsText(getPageElement(PartListingPageObjects.txtItsCompatileMsg), PartListingPageObjects.txtItsCompatileMsg.getObjectname(), partCompatibleMsg);
			
			commonFunction.clearAndEnterText(getPageElement(PartListingPageObjects.txtBoxModel),productModelNumber2, PartListingPageObjects.txtBoxModel.getObjectname());
			commonFunction.hitEnterKey(getPageElement(PartListingPageObjects.txtBoxModel), PartListingPageObjects.txtBoxModel.getObjectname());
			commonFunction.isElementPresentContainsText(getPageElement(PartListingPageObjects.txtItsNotCompatibleMsg), PartListingPageObjects.txtItsNotCompatibleMsg.getObjectname(), partNotCompatibleMsg);
			
			commonFunction.clearAndEnterText(getPageElement(PartListingPageObjects.txtBoxModel), PartListingPageObjects.txtBoxModel.getObjectname(), "1234");
			commonFunction.hitEnterKey(getPageElement(PartListingPageObjects.txtBoxModel), PartListingPageObjects.txtBoxModel.getObjectname());
			commonFunction.isElementPresentContainsText(getPageElement(PartListingPageObjects.txtNoMatchingProduct),partNotFoundMsg, PartListingPageObjects.txtNoMatchingProduct.getObjectname());
			commonFunction.isElementPresentContainsText(getPageElement(PartListingPageObjects.txtItsNotCompatibleMsg), PartListingPageObjects.txtItsNotCompatibleMsg.getObjectname(), partNotCompatibleMsg);
			
		}catch(Exception e) {
			report.updateTestLog("Validate Part Compatibility Functionality",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
}
