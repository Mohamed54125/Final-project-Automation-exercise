// pages/ProductDetailsPage.java
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage  {

    @FindBy(css = ".product-information h2")
    public WebElement productName;

    @FindBy(xpath = "//p[normalize-space()='Category:']")
    public WebElement productCategory;

    @FindBy(css = ".product-information span span")
    public WebElement productPrice;

    @FindBy(xpath = "//b[normalize-space()='Availability:']")
    public WebElement productAvailability;

    @FindBy(xpath = "//b[normalize-space()='Condition:']")
    public WebElement productCondition;

    @FindBy(xpath = "//b[normalize-space()='Brand:']")
    public WebElement productBrand;

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductDetailsVisible() {
        return productName.isDisplayed() &&
               productCategory.isDisplayed() &&
               productPrice.isDisplayed() &&
               productAvailability.isDisplayed() &&
               productCondition.isDisplayed() &&
               productBrand.isDisplayed();
    }

	public boolean isProductNameVisible() {
		// TODO Auto-generated method stub
		return false;
	}
}