package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.others.*;
import pages.HomePage;
import pages.LoginPage;
import utils.ExtentReports.ExtentTestManager;

public class NegativeTest extends BaseTest {

    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    //    Homepage homepage = new HomePage(driver,wait);
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.    

    @Test (priority = 1, description="Invalid Login Scenario with empty username and password.")
    public void invalidLoginTest_EmptyUserEmptyPassword () throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Invalid Login Scenario with empty username and password.");

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

        //*************PAGE METHODS********************
        homePage.goToGMail();
        loginPage.loginToGmail ("", "");
    }

}
