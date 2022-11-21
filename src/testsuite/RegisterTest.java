package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends Utility {
    String baseUrl="https://demo.nopcommerce.com/";
  @Before
    public void set(){
      openBrowser(baseUrl);
  }
  @Test
  public void userShouldNavigateToRegisterPageSuccessfully(){
      clickOnElement(By.xpath("//div[@class='header-links']/ul[1]/li[1]/a"));
      String expectedMessage="Register";
      String actualMessage=getTextFromElement(By.xpath("//div[@class='page-title']/h1"));
      Assert.assertEquals(expectedMessage,actualMessage);
  }
@Test
public void userShouldRegisterAccountSuccessfully(){
    clickOnElement(By.xpath("//div[@class='header-links']/ul[1]/li[1]/a"));
    //select genderradio button
    clickOnElement(By.xpath("//span[@class='female']"));
    //Enter first name
    sendTextToElement(By.id("FirstName"),"Vidhi");
    //Enter last name
    sendTextToElement(By.id("LastName"),"Patel");
    //select date of birth
    sendTextToElement(By.xpath("//select[@name='DateOfBirthDay']"),"20");
    //select month
    sendTextToElement(By.xpath("//select[@name='DateOfBirthMonth']"),"March");
    //select year
    sendTextToElement(By.xpath("//select[@name='DateOfBirthYear']"),"1990");
    //Enter email
    sendTextToElement(By.id("Email"),"Admin1234");
    //enter company name
    sendTextToElement(By.id("Company"),"Prime");
    //Enter password
    sendTextToElement(By.id("Password"),"abc123");
    //conform password
    sendTextToElement(By.id("ConfirmPassword"),"abc123");
    //Click on register
  //  clickOnElement(By.id("register-button"));



}




@After
    public void close(){
      closeBrowser();
}


}
