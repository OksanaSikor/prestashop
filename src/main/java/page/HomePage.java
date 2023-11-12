package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Waiter;


public class HomePage extends Page {

    @FindBy(xpath = "//a[@title='Women']")
    private WebElement nameOfMainPage;

    @FindBy(xpath = "//h1[@class='page-heading product-listing']")
    private WebElement nameOfPage;

    @FindBy(xpath = "//li[@class='item']//a[@title='Specials']")
    private WebElement priceDrop;

    @FindBy(xpath = "//li[@class='item']//a[@title='New products']")
    private WebElement newProducts;

    @FindBy(xpath = "//li[@class='item']//a[@title='Best sellers']")
    private WebElement popularProducts;

    @FindBy(xpath = "//li[@class='item']//a[@title='Our stores']")
    private WebElement ourStores;

    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement nameOfPageOurStories;

    @FindBy(xpath = "//li[@class='item']//a[@title='Contact us']")
    private WebElement contactUs;

    @FindBy(xpath = "//h1[@class='page-heading bottom-indent']")
    private WebElement nameOfPageContactUs;

    @FindBy(xpath = "//li[@class='item']//a[@title='Sitemap']")
    private WebElement siteMap;

    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement nameOfPageSiteMap;

    @FindBy(xpath = "//input[@name='search_query']")
    private WebElement searchField;

    @FindBy(xpath = "//button[@name='submit_search']")
    private WebElement searchButton;

    @FindBy(xpath = "//span[@class='lighter']")
    private WebElement nameOfPageSearch;

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    private WebElement cardButton;

    public HomePage openPage(String url) {
        driver.get(url);
        return this;
    }

    public String getTextOfMainPageSection() {
        return nameOfMainPage.getText();
    }

    public void clickOnTheLinkDiscounts() {
        Waiter.waitElementToBeClickable(priceDrop).click();
    }

    public void clickOnTheLinkNewProducts() {
        Waiter.waitElementToBeClickable(newProducts).click();
    }

    public String getTextOfPageSection() {
        return nameOfPage.getText();
    }

    public void clickOnTheLinkPopularProducts() {
        Waiter.waitElementToBeClickable(popularProducts).click();
    }

    public void clickOnTheLinkOurStores() {
        Waiter.waitElementToBeClickable(ourStores).click();
    }

    public String getTextOfPageOurStoresSection() {
        return nameOfPageOurStories.getText();
    }

    public void clickOnTheLinkContactUs() {
        Waiter.waitElementToBeClickable(contactUs).click();
    }

    public String getTextOfPageContactUsSection() {
        return nameOfPageContactUs.getText();
    }

    public void clickOnTheLinkSiteMapSection() {
        Waiter.waitElementToBeClickable(siteMap).click();
    }

    public String getTextOfPageSiteMapSection() {
        return nameOfPageSiteMap.getText();
    }

    public HomePage searchField(String name) {
        searchField.sendKeys(name);
        return this;
    }

    public void clickSearch() {
        Waiter.waitElementToBeClickable(searchButton).click();
    }

    public String getTextOfSearchPageSection() {
        return nameOfPageSearch.getText();
    }

    public void clickCard() {
        Waiter.waitElementToBeClickable(cardButton).click();
    }
}
