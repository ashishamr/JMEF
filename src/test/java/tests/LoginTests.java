package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.others.*;
import pages.HomePage;
import pages.LoginPage;
import utils.ExtentReports.ExtentTestManager;

public class LoginTests extends BaseTest {

    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    //    Homepage homepage = new HomePage(driver,wait);
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.

    @Test (priority = 0, description="Valid Login Scenario with Valid username and password.")
    @Parameters({ "userName", "Password" })
    public void validLoginTest_ValidUserName_ValidPassword (String userName, String Password) throws InterruptedException {

        //ExtentReports Description
        //ExtentTestManager.getTest().setDescription("Invalid Login Scenario with wrong username and password.");
        ExtentTestManager.getTest().setDescription("Valid Login Scenario with Valid username and password.");
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver, wait);
        LoginPage loginPage = new LoginPage(driver, wait);        

        //*************PAGE METHODS********************
        //Open Gmail HomePage
        homePage.goToGMail();
        
        //*************ASSERTIONS***********************
        loginPage.verifySignInTitle1("Sign in");
        loginPage.verifySignInTitle2("with your Google Account");    
        System.out.println("Passed Asserssions");
        
        //Go to LoginPage
        //homePage.goToLoginPage();
        
        String key = "lockUnlock";
        String decodedUser = StringEncrypt.decryptXOR(userName, key);
        String decodedPwd = StringEncrypt.decryptXOR(Password, key);  
        
        //Login to Gmail
        loginPage.loginToGmail (decodedUser, decodedPwd); 
    }    

}
