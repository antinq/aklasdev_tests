package MyTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    public static WebDriver driver;

    public void openBrowser(){
        driver = new FirefoxDriver();
//        driver.get("https://github.com/");
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    public void deleteCoocies(){
        driver.manage().deleteAllCookies();
    }

    public void closeBrowser(){
        driver.quit();
    }
}
