package amazon;

import amazon.config.EnvFactory;
import amazon.pages.AmazonPages;
import amazon.supportlibraries.ReusableLibraries;
import com.typesafe.config.Config;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Slf4j
public class AmazonWebTest extends ReusableLibraries {
    private static Config config = EnvFactory.getInstance().getConfig();
    private static final String HOME_PAGE_URL = config.getString("HOME_PAGE_URL");
    AmazonPages amazonPageObjects = new AmazonPages(driver);

    @Tag("assignment")
    @DisplayName("Asserting the About this item text for a Television")
    @Test
    void assertAboutThisItemText_Amazon() throws InterruptedException {

        driver.get(HOME_PAGE_URL);

        driver.manage().window().maximize();

        clickOnWebElement(amazonPageObjects.hamburgerMenu);

        clickOnWebElement(findDepartmentNameLink(config.getString("DEPARTMENT_NAME")));

        clickOnWebElement(findDepartmentLink(config.getString("DEPARTMENT")));

        clickOnWebElement(amazonPageObjects.brand);

        clickOnWebElement(amazonPageObjects.sortByDropDown);

        clickOnWebElement(findSortByType(config.getString("SORTBY")));

        String parentWindowName=driver.getWindowHandle();

        clickOnWebElement(amazonPageObjects.itemLink.get(1));

        switchToChildWindow(driver,parentWindowName);

        consoleLog(amazonPageObjects.aboutThisItem,"Text present in the expected about this item location is ");

        String actualMessage=amazonPageObjects.aboutThisItem.getText();

        verifyExpectedAndActualValues("About this item",actualMessage);

        driver.close();

        driver.switchTo().window(parentWindowName);

        driver.close();

        driver.quit();


    }

}
