package businesscomponents;

import java.time.LocalTime;
import java.time.ZoneId;

import org.openqa.selenium.WebElement;

import supportlibraries.ReusableLibrary;
import supportlibraries.ScriptHelper;
import com.cognizant.framework.Status;
import com.cognizant.framework.selenium.WebDriverUtil;

import componentgroups.CommonFunctions;
import pages.ProTipsPageObjects;

public class ProTipsPageComponents 	extends ReusableLibrary {



		/**
		 * Constructor to initialize the component library
		 * 
		 * @param scriptHelper
		 *            The {@link ScriptHelper} object passed from the
		 *            {@link DriverScript}
		 */
		public ProTipsPageComponents(ScriptHelper scriptHelper) {
			super(scriptHelper);
		}

		CommonFunctions commonFunction = new CommonFunctions(scriptHelper);
		LocalTime liveTime = LocalTime.now(ZoneId.of("America/New_York"));
		WebDriverUtil webdriverutil = new WebDriverUtil(driver);
		
		private WebElement getPageElement(ProTipsPageObjects pageEnum) {
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
				report.updateTestLog("Pro Tips Page - get page element",
						pageEnum.toString() + " object is not defined or found.", Status.FAIL);
				return null;
			}
		}
		
		public void validateProTipsJumpToCategory() {
			try {
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.lblJumpToCategory), ProTipsPageObjects.lblJumpToCategory.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.lnkJumpToTheSmoke), ProTipsPageObjects.lnkJumpToTheSmoke.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.lnkJumpTotheSetup), ProTipsPageObjects.lnkJumpTotheSetup.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.lnkJumpToTheProcess), ProTipsPageObjects.lnkJumpToTheProcess.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(ProTipsPageObjects.lnkJumpToTheSmoke), ProTipsPageObjects.lnkJumpToTheSmoke.getObjectname());
				if(driver.getCurrentUrl().contains("/pro-tips/?item=take-notes#accordion__The%20Smoke")) {
					report.updateTestLog("Verify user navigated to The Smoke Section", "User is successfully Navigated to The Smoke Section", Status.PASS);
				} else {
					report.updateTestLog("Verify user navigated to The Smoke Section", "User is NOT Navigated to The Smoke Section", Status.FAIL);
				}
				
				commonFunction.clickIfElementPresent(getPageElement(ProTipsPageObjects.lnkJumpTotheSetup), ProTipsPageObjects.lnkJumpTotheSetup.getObjectname());
				if(driver.getCurrentUrl().contains("/pro-tips/?item=take-notes#accordion__The%20Setup")) {
					report.updateTestLog("Verify user navigated to The Setup Section", "User is successfully Navigated to The Setup Section", Status.PASS);
				} else {
					report.updateTestLog("Verify user navigated to The Setup Section", "User is NOT Navigated to The Setup Section", Status.FAIL);
				}
				
				commonFunction.clickIfElementPresent(getPageElement(ProTipsPageObjects.lnkJumpToTheProcess), ProTipsPageObjects.lnkJumpToTheProcess.getObjectname());
				if(driver.getCurrentUrl().contains("/pro-tips/?item=take-notes#accordion__The%20Process")) {
					report.updateTestLog("Verify user navigated to The Process Section", "User is successfully Navigated to The Process Section", Status.PASS);
				} else {
					report.updateTestLog("Verify user navigated to The Process Section", "User is NOT Navigated to The Process Section", Status.FAIL);
				}
			}catch(Exception e) {
				report.updateTestLog("Validate Pro-Tips Page - Jump to Category",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
		}
		
		public void validateProTipsPageSubCategories() {
			try {
				//validate The Smoke Section
				commonFunction.clickIfElementPresent(getPageElement(ProTipsPageObjects.lnkJumpToTheSmoke), ProTipsPageObjects.lnkJumpToTheSmoke.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.lblTheSmoke), ProTipsPageObjects.lblTheSmoke.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.lblWrapAdddedMoisture), ProTipsPageObjects.lblWrapAdddedMoisture.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(ProTipsPageObjects.lblWrapAdddedMoisture), ProTipsPageObjects.lblWrapAdddedMoisture.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.txtparaWrapAddedMoisture), ProTipsPageObjects.txtparaWrapAddedMoisture.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(ProTipsPageObjects.lblExperimentWithDifferentWoods), ProTipsPageObjects.lblExperimentWithDifferentWoods.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.txtParaExperimentWithDifferentWoods), ProTipsPageObjects.txtParaExperimentWithDifferentWoods.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(ProTipsPageObjects.lblTheBarkShouldBeBark), ProTipsPageObjects.lblTheBarkShouldBeBark.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.txtParaTheBarkShouldBeBark), ProTipsPageObjects.txtParaTheBarkShouldBeBark.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(ProTipsPageObjects.lblLetItRest), ProTipsPageObjects.lblLetItRest.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.txtParaLetItRest), ProTipsPageObjects.txtParaLetItRest.getObjectname());
			
				//validate The Process Section
				commonFunction.clickIfElementPresent(getPageElement(ProTipsPageObjects.lnkJumpTotheSetup), ProTipsPageObjects.lnkJumpTotheSetup.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.lblTheSetUp), ProTipsPageObjects.lblTheSetUp.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(ProTipsPageObjects.lblSeasonYourSmoker), ProTipsPageObjects.lblSeasonYourSmoker.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.txtParaSeasonYourSmoker), ProTipsPageObjects.txtParaSeasonYourSmoker.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(ProTipsPageObjects.lblBuildAfireFirefox), ProTipsPageObjects.lblBuildAfireFirefox.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.txtParaBuildAFireFirefox), ProTipsPageObjects.txtParaBuildAFireFirefox.getObjectname());
				
				
				//Validate The Process Section
				commonFunction.clickIfElementPresent(getPageElement(ProTipsPageObjects.lnkJumpToTheProcess), ProTipsPageObjects.lnkJumpToTheProcess.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.lblTheProcess), ProTipsPageObjects.lblTheProcess.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(ProTipsPageObjects.lblNoteTakingPerfectCraft), ProTipsPageObjects.lblNoteTakingPerfectCraft.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.txtParaNoteTakingPerfectCraft), ProTipsPageObjects.txtParaNoteTakingPerfectCraft.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(ProTipsPageObjects.lblDontGiveUp), ProTipsPageObjects.lblDontGiveUp.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.txtParDontGiveUp), ProTipsPageObjects.txtParDontGiveUp.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(ProTipsPageObjects.lblSlowAndLow), ProTipsPageObjects.lblSlowAndLow.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.txtParaSlowAndLow), ProTipsPageObjects.txtParaSlowAndLow.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(ProTipsPageObjects.lblDryRubsSaveTime), ProTipsPageObjects.lblDryRubsSaveTime.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.txtParaDryRubsSaveTime), ProTipsPageObjects.txtParaDryRubsSaveTime.getObjectname());
			}catch(Exception e) {
				report.updateTestLog("Validate Pro-Tips Page - Subcategories",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
		}
		
		public void validateProTipsMoreFromCraftSection() {
			try{
				String craftLink1Title = dataTable.getData("General_Data","MoreFromCraftLink1");
				String craftLink2Title = dataTable.getData("General_Data","MoreFromCraftLink2");
				String craftLink3Title = dataTable.getData("General_Data","MoreFromCraftLink3");
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.subTitleMoreFromTheCraft), ProTipsPageObjects.subTitleMoreFromTheCraft.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(ProTipsPageObjects.lnkSubCategoryLink1), ProTipsPageObjects.lnkSubCategoryLink1.getObjectname());
				if(commonFunction.isElementPresentContainsText(getPageElement(ProTipsPageObjects.headingMoreFromCartLink1Page), ProTipsPageObjects.headingMoreFromCartLink1Page.getObjectname(), craftLink1Title)) {
					report.updateTestLog("Verify user is navigated to More from Craft section Link 1 "+craftLink1Title, "User is successfully Navigated to More From the Craft -  section Link 1 -"+craftLink1Title, Status.PASS);
				} else {
					report.updateTestLog("Verify user is navigated to More from Craft section Link 1 -"+craftLink1Title, "User is NOT Navigated to  More From the Craft -  section Link 1 -"+craftLink1Title, Status.FAIL);
				}
				driver.navigate().back();
				
				commonFunction.clickIfElementPresent(getPageElement(ProTipsPageObjects.lnkSubCategoryLink2), ProTipsPageObjects.lnkSubCategoryLink2.getObjectname());
				if(commonFunction.isElementPresentContainsText(getPageElement(ProTipsPageObjects.headingMoreFromCartLink2Page), ProTipsPageObjects.headingMoreFromCartLink2Page.getObjectname(), craftLink2Title)) {
					report.updateTestLog("Verify user is navigated to More from Craft section Link 2 "+craftLink2Title, "User is successfully Navigated to More From the Craft -  section Link 1 -"+craftLink2Title, Status.PASS);
				} else {
					report.updateTestLog("Verify user is navigated to More from Craft section Link 2 -"+craftLink2Title, "User is NOT Navigated to  More From the Craft -  section Link 1 -"+craftLink2Title, Status.FAIL);
				}
				driver.navigate().back();
				
				commonFunction.clickIfElementPresent(getPageElement(ProTipsPageObjects.lnkSubCategoryLink3), ProTipsPageObjects.lnkSubCategoryLink3.getObjectname());
				if(commonFunction.isElementPresentContainsText(getPageElement(ProTipsPageObjects.headingMoreFromCartLink3Page), ProTipsPageObjects.headingMoreFromCartLink3Page.getObjectname(), craftLink3Title)) {
					report.updateTestLog("Verify user is navigated to More from Craft section Link 3 "+craftLink3Title, "User is successfully Navigated to More From the Craft -  section Link 1 -"+craftLink3Title, Status.PASS);
				} else {
					report.updateTestLog("Verify user is navigated to More from Craft section Link 3 -"+craftLink3Title, "User is NOT Navigated to  More From the Craft -  section Link 1 -"+craftLink3Title, Status.FAIL);
				}
				driver.navigate().back();
				commonFunction.clickIfElementPresent(getPageElement(ProTipsPageObjects.btnViewAllFromTheCraft), ProTipsPageObjects.btnViewAllFromTheCraft.getObjectname());
				if(driver.getCurrentUrl().contains("/the-craft")) {
					report.updateTestLog("Verify user navigated to The Craft Page", "User is successfully Navigated to The Craft Page", Status.PASS);
				} else {
					report.updateTestLog("Verify user navigated to The Craft Page", "User is NOT Navigated to The Craft Page", Status.FAIL);
				}
			}catch(Exception e) {
				report.updateTestLog("Validate Pro Tips More From Craft Section",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
		}
		
		public void validateProTipsPageSignMeUp() {
			try {
				String email = "autoTest"+liveTime.getHour()+liveTime.getMinute()+"@gmail.com";
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.subTitleGetRecipes), ProTipsPageObjects.subTitleGetRecipes.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.txtBoxEmailAddress), ProTipsPageObjects.txtBoxEmailAddress.getObjectname());
				commonFunction.verifyIfElementIsPresent(getPageElement(ProTipsPageObjects.btnSignMeUp), ProTipsPageObjects.btnSignMeUp.getObjectname());
				commonFunction.clearAndEnterText(getPageElement(ProTipsPageObjects.txtBoxEmailAddress), email, ProTipsPageObjects.txtBoxEmailAddress.getObjectname());
				commonFunction.clickIfElementPresent(getPageElement(ProTipsPageObjects.btnSignMeUp), ProTipsPageObjects.btnSignMeUp.getObjectname());
				if(commonFunction.isElementPresentContainsText(getPageElement(ProTipsPageObjects.lblSignUPSuccessful), ProTipsPageObjects.lblSignUPSuccessful.getObjectname(), "You're all signed up!")) {
					report.updateTestLog("Verify user is signed up", "User is successfully Signed up ", Status.PASS);
				} else {
					report.updateTestLog("Verify user is signed up", "User is NOT Signed up", Status.FAIL);
				}
			}catch(Exception e) {
				report.updateTestLog("Validate Pro Tips Sign Me up Section",
						"Something went wrong!" + e.toString(), Status.FAIL);
			}
		}
}
