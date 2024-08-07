package amazon.supportlibraries;


import amazon.factories.DriverFactory;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Iterator;
import java.util.Set;
@Slf4j
public class ReusableLibraries{


    public WebDriver driver = DriverFactory.getDriver();

	/**
	 * This function is for smart waiting for an object
	 */
	public boolean waitForObject(WebDriver driver, int timeLimitInSeconds, WebElement element) {

		boolean isElementPresent;

		try {
			WebElement webElement;

			WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
			webElement = (WebElement) wait.until(ExpectedConditions.visibilityOf(element));
			isElementPresent = webElement.isDisplayed();
			return isElementPresent;
		} catch (Exception e) {
			isElementPresent = false;
			System.out.println(e.getMessage());
			return isElementPresent;

		}
	}
    public void switchToChildWindow(WebDriver driver,String parentWindow)
    {

        Set<String> windowHanldesSet=driver.getWindowHandles();

        Iterator<String> listOfWindows= windowHanldesSet.iterator();

        while(listOfWindows.hasNext())
        {
            String childWindow=listOfWindows.next();
            if(!parentWindow.equals(childWindow)) {
                driver.switchTo().window(childWindow);
            }
        }
    }

    public void clickOnWebElement(WebElement ele)
    {
        waitForObject(driver, 120, ele);
        ele.click();
    }

    //To print the message in log
    public void consoleLog(WebElement ele,String message)
    {
        System.out.println(message +ele.getText());

        log.info(message +ele.getText());
    }
    //Asserting function to compare expected and actual values
    public void verifyExpectedAndActualValues(String expected,String actual)
    {
        assertEquals(expected,actual);
    }

    public WebElement findDepartmentNameLink(String elementText)
    {
        WebElement ele=driver.findElement(By.xpath("//div[contains(text(),'"+elementText+"')]"));
        waitForObject(driver, 120, ele);
        return ele;
    }

    public WebElement findDepartmentLink(String elementText)
    {
        WebElement ele=driver.findElement(By.xpath("//li/a[contains(text(),'"+elementText+"')]"));
        waitForObject(driver, 120, ele);
        return ele ;
    }

    public WebElement findBrandCheckBox(String elementText)
    {
        WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'"+elementText+"')]/preceding-sibling::div//input[@type='checkbox']/following-sibling::i"));
        waitForObject(driver, 120, ele);
        return ele;
    }
    public WebElement findSortByType(String elementText)
    {
        WebElement ele =driver.findElement(By.xpath("//div[@class='a-popover-inner']//li/a[contains(text(),'"+elementText+"')]"));
        waitForObject(driver, 120, ele);
        return ele;
    }
}
