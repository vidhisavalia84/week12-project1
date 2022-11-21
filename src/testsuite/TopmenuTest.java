package testsuite;

import browserfactory.BaseTest;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class TopmenuTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";
    public static WebDriver driver;

    @Before
    public void set() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        clickOnElement(By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a"));
        String expectedMessage = "Computers";
        // Find the welcome text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//a[@href='/computers']"));
        // Validate actual and expected message
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfullly() {
        clickOnElement(By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a"));
        String expectedMessage = "Electronics";
        String actualMessage = getTextFromElement(By.xpath("//div[@class='page-title']/h1"));
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToApparealPageSuccessfully() {
        clickOnElement(By.xpath("//div[@class='header-menu']/ul/li[3]/a"));
        String expectedMessage = "Apparel";
        String actualMessage = getTextFromElement(By.xpath("//div[@class='page-title']/h1"));
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        clickOnElement(By.xpath("//div[@class='header-menu']/ul/li[4]/a"));
        String expectedMessage = "Digital downloads";
        String actualMessage = getTextFromElement(By.xpath("//div[@class='page-title']/h1"));
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']/li[5]/a"));
        String expectedMessage = "Books";
        String actualMessage = getTextFromElement(By.xpath("//div[@class='page-title']/h1"));
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToJewelaryPAgeSuccessfully() {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]/a"));
        String expectedMessage = "Jewelry";
        String actualMessage = getTextFromElement(By.xpath("//div[@class='page-title']/h1"));
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void userShouldNavigateToGiftcardsSuccessfully() {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]/a"));
        String expectedMessage = "Gift Cards";
        String actualMessage = getTextFromElement(By.xpath("//div[@class='page-title']/h1"));
        Assert.assertEquals(actualMessage, expectedMessage);
    }
    @After
    public void close(){
        closeBrowser();
    }
}