package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void set() {

        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        clickOnElement(By.linkText("Log in"));
        //driver.findElement(By.linkText("Log in")).click();
        String expectedTextMessage = "Welcome, Please Sign In!";
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));
        String actualGetMessage = actualMessage.getText();
//validate expected and actual message
       Assert.assertEquals(expectedTextMessage, actualGetMessage);
    }
@Test
public void userShouldLoginSuccessfullyWithValidCredential(){
    clickOnElement(By.linkText("Log in"));
        sendTextToElement(By.id("Email"),"Vibhavala@gmail.com");
    //driver.findElement(By.linkText("Log in")).click();
    //driver.findElement(By.id("Email")).sendKeys("Admin123@gmail.com");
   // driver.findElement(By.id("Password")).sendKeys("abc123");
    //driver.findElement(By.xpath("//button[@type='submit'and@class='button-1 login-button']")).click();
sendTextToElement(By.id("Password"),"vibha123");
clickOnElement(By.xpath("//button[@type='submit'and@class='button-1 login-button']"));
//WebElement expectedLogoutButton=driver.findElement(B)
String expectedMessage="Log out";
String actualMessage=getTextFromElement(By.xpath("//a[@class=\"ico-logout\"]"));
Assert.assertEquals(actualMessage,expectedMessage);
}
@Test
      public void verifyTheErrorMessage() {
    clickOnElement(By.linkText("Log in"));
    sendTextToElement(By.id("Email"), "Admin123@gmail.com");
    sendTextToElement(By.id("Password"), "abc123");
    clickOnElement(By.xpath("//button[@type='submit'and@class='button-1 login-button']"));

    String expectedMessage="Login was unsuccessful. Please correct the errors and try again.\n" +
            "No customer account found";
    WebElement actualGetMessage=driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
    String actualMessage=actualGetMessage.getText();
    Assert.assertEquals("Not navigate",expectedMessage,actualMessage);
}


    @After
    public void close(){
        //closeBrowser();
    }


}