package businesscomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import supportlibraries.ReusableLibrary;
import supportlibraries.ScriptHelper;
import com.cognizant.framework.Status;
import com.cognizant.framework.selenium.WebDriverUtil;

import componentgroups.CommonFunctions;
import pages.ProductListingPageObjects;

public class ProductListingPageComponents extends ReusableLibrary {

	/**
	 * Constructor to initialize the component library
	 * 
	 * @param scriptHelper
	 *            The {@link ScriptHelper} object passed from the
	 *            {@link DriverScript}
	 */
	public ProductListingPageComponents(ScriptHelper scriptHelper) {
		super(scriptHelper);
	}

	CommonFunctions commonFunction = new CommonFunctions(scriptHelper);
	WebDriverUtil webdriverutil = new WebDriverUtil(driver);

	private WebElement getPageElement(ProductListingPageObjects pageEnum) {
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
			report.updateTestLog("Product Listing Page - get page element",
					pageEnum.toString() + " object is not defined or found.", Status.FAIL);
			return null;
		}
	}

	public void validateProductListingPage() {
		try {
			
			webdriverutil.waitUntilPageReadyStateComplete(30);
			// Validate the if the elements are displayed in product listing page
			commonFunction.scrollIntoView(getPageElement(ProductListingPageObjects.itmFirstProduct));
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.itmFirstProduct),
					ProductListingPageObjects.itmFirstProduct.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.firstProductTitle),
					ProductListingPageObjects.firstProductTitle.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.firstProductImg),
					ProductListingPageObjects.firstProductImg.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.firstProdcutPrice),
					ProductListingPageObjects.firstProdcutPrice.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.firstProuctStars),
					ProductListingPageObjects.firstProuctStars.getObjectname());

			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.btnLoadMore),
					ProductListingPageObjects.btnLoadMore.getObjectname());

			// Click on the load more until there are no products
			By by = By.xpath(ProductListingPageObjects.btnLoadMore.getProperty());
			while (driver.findElement(by).isDisplayed()) {
				commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.btnLoadMore),
						ProductListingPageObjects.btnLoadMore.getObjectname());
				Thread.sleep(5000);
				webdriverutil.waitUntilPageReadyStateComplete(30);
			}
		} catch (Exception e) {
			report.updateTestLog("Product Listing Page -  Validation", "Something went wrong!" + e.toString(),
					Status.FAIL);
		}
	}

	public void validateProductFilter() {
		try {
			// Scroll to filter and click on filter
			commonFunction.scrollIntoView(getPageElement(ProductListingPageObjects.btnFilter));
			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.btnFilter),
					ProductListingPageObjects.btnFilter.getObjectname());

			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.expandCategory),
					ProductListingPageObjects.expandCategory.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.firstCategoryOption),
					ProductListingPageObjects.firstCategoryOption.getObjectname());
			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.btnApply),
					ProductListingPageObjects.btnApply.getObjectname());

			if (commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.itmFirstProduct),
					ProductListingPageObjects.itmFirstProduct.getObjectname())) {
				report.updateTestLog("Verify Products displayed after applying Color filter",
						"The filtered prodcuts are displayed after the applying the color filter", Status.PASS);
			} else {
				report.updateTestLog("Verify Products displayed after applying Color filter",
						"The filtered products are NOT displayed after the applying the color filter", Status.FAIL);
			}

			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.btnFilter),
					ProductListingPageObjects.btnFilter.getObjectname());

			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.expandPrice),
					ProductListingPageObjects.expandPrice.getObjectname());

			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.firstPriceOption),
					ProductListingPageObjects.firstPriceOption.getObjectname());

			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.btnApply),
					ProductListingPageObjects.btnApply.getObjectname());

			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.itmFirstProduct),
					ProductListingPageObjects.itmFirstProduct.getObjectname());

			if (commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.itmFirstProduct),
					ProductListingPageObjects.itmFirstProduct.getObjectname())) {
				report.updateTestLog("Verify Products displayed after applying Color and Price filter",
						"The filtered prodcuts are displayed after the applying the color and Price filter",
						Status.PASS);
			} else {
				report.updateTestLog("Verify Products displayed after applying Color and Price filter",
						"The filtered products are NOT displayed after the applying the color and Price filter",
						Status.FAIL);
			}
		} catch (Exception e) {
			report.updateTestLog("Product Listing Page - Filter products -  Validation",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
	
	public void selectInStockProduct() {
		try {
			webdriverutil.waitUntilPageReadyStateComplete(30);
			
			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.itmFirstProduct),
					ProductListingPageObjects.itmFirstProduct.getObjectname());
			webdriverutil.waitUntilPageReadyStateComplete(30);
		}catch(Exception e) {
			report.updateTestLog("Product Listing Page - Select a product -  Validation",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}

	public void validateProductFilterSection() {
		try {
			commonFunction.scrollIntoView(getPageElement(ProductListingPageObjects.btnFilter));
			commonFunction.clickIfElementPresent(getPageElement(ProductListingPageObjects.btnFilter),
					ProductListingPageObjects.btnFilter.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.expandCategory),
					ProductListingPageObjects.expandCategory.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.expandColor),
					ProductListingPageObjects.expandColor.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.expandPrice),
					ProductListingPageObjects.expandPrice.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.lnkCancel),
					ProductListingPageObjects.lnkCancel.getObjectname());
			commonFunction.verifyIfElementIsPresent(getPageElement(ProductListingPageObjects.btnApply),
					ProductListingPageObjects.btnApply.getObjectname());
		}catch(Exception e) {
			report.updateTestLog("Product Listing Page - validate Filter Section",
					"Something went wrong!" + e.toString(), Status.FAIL);
		}
	}
}
