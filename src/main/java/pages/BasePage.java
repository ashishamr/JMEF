package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    //Constructor
    public BasePage (WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    //Click Method
    public void click (By elementLocation) {
        //driver.findElement(elementLocation).click();
        
        while(true){
            try{
            	driver.findElement(elementLocation).click();
                break;
            }catch (Throwable e){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        }
        
    }

    //Write Text
    public void writeText (By elementLocation, String text) {
        driver.findElement(elementLocation).sendKeys(text);
    }

    //Read Text
    public String readText (By elementLocation) {
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocation)).getText();
        //return driver.findElement(elementLocation).getText();
    }
}
