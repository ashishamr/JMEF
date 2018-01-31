
package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage extends BasePage{

    //*********Constructor*********
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Web Elements*********
    String usenameId = "identifierId";
    String NextButtonUserNameXpath = "//*[@id='identifierNext']/content/span";
    String passwordXpath = "//input[contains(@aria-label,'Enter your password')][@autocomplete='current-password']";
    String NextButtonPWd = "//*[@id='passwordNext']/content/span";
    String actualTitle1ID = "headingText";
    String actualTitle2ID = "headingSubtext";   
    
    //*********Page Methods*********

    public void loginToGmail (String username, String password){
        //Enter Username(Email)  
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        writeText(By.id(usenameId), username); 
       
        //Click on NextButton
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        click(By.xpath(NextButtonUserNameXpath));
        
        //Enter Password
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        writeText(By.xpath(passwordXpath), password); 
      
        //Click Next Button
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        click(By.xpath(NextButtonPWd)); 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);        
    }

    //Verify SignIn Heading Title 1
    public void verifySignInTitle1 (String expectedText) {  
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   	
        Assert.assertEquals(readText(By.id(actualTitle1ID)), expectedText);  
    }

    //Verify SignIn Heading Title 1
    public void verifySignInTitle2 (String expectedText) {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        Assert.assertEquals(readText(By.id(actualTitle2ID)), expectedText);
    }

}
