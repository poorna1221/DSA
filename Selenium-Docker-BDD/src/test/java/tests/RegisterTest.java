package tests;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.RegistrationConfirmationPage;
import pages.Registrationpage;

import java.net.MalformedURLException;
import java.net.URL;

public class RegisterTest {
    public WebDriver driver;
    Registrationpage rp=new Registrationpage(driver);
    RegistrationConfirmationPage rcp= new RegistrationConfirmationPage(driver);


    @Given("launch website")
    public void user_logged_into_application(){
        rp.goTo();
    }

    public void registerForNewToursSite()
    {

        rp.goTo();
        rp.enterUserDetails("Chandra","lastName");
        rp.enterUserCredentailsDetails("poorna948","12345","12345");
        rp.clickSubmitButton();
        rcp.waitForConfirmaitonPage();
        rcp.clickContinueButton();
        rcp.clickReserveFlightsButton();
        String actualText=rcp.getText();
        Assert.assertEquals(actualText, "Flight Itinerary Page");

    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }

    @BeforeTest
    public void setupDriver() throws MalformedURLException {

        DesiredCapabilities dc;
        //System.setProperty("webdriver.chrome.driver","D:\\LearningTools\\ClipboardHealth\\Docker\\src\\resources\\chromedriver.exe");
        //this.driver=new ChromeDriver();
        String host="localhost";

        if((System.getProperty("BROWSER")!=null) && System.getProperty("BROWSER").equalsIgnoreCase("firefox")){
            dc = DesiredCapabilities.firefox();
        }else
        {
            dc=DesiredCapabilities.chrome();
        }
        if((System.getProperty("HUB_HOST")!=null)){
            host=System.getProperty("HUB_HOST");
        }

        String url="http://"+host+":4444/wd/hub";

        this.driver=new RemoteWebDriver(new URL(url),dc);
        driver.manage().window().maximize();
    }
}
