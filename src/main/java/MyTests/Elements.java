package MyTests;

import org.openqa.selenium.By;

public class Elements extends DriverManager {

        public void goToPage(String page){
                driver.get(page);
    }

    public void clickOnButtonByXpath(String elementXpath){
        driver.findElement(By.xpath (elementXpath)).click();
    }

    public void enterTextToFieldByXpath(String elementXpath, String text){
        driver.findElement(By.xpath(elementXpath)).sendKeys(text);
    }

    public String getElementTextByXpath(String elementXpath){
        return driver.findElement(By.xpath(elementXpath)).getText();
    }

    public Object getElementByXpath(String elementXpath){
        return driver.findElement(By.xpath(elementXpath));
    }

    public void clickOnButtonByCSSselector(String cssSelector){
        driver.findElement(By.cssSelector(cssSelector)).click();
    }
}
