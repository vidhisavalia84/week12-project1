package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public void openBrowser(String baseUrl) {
//Browser setup
        System.setProperty("webdriver.chrome.driver.", "drivers/chromedriver.exe");
         driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximise the window
        //setting the waiting time for programme
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }
    public void closeBrowser(){
        //closing browser
        driver.close();
    }

}
