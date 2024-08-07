package amazon.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPages {

	WebDriver driver;

	public AmazonPages(WebDriver driver) {

		this.driver = driver;

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "nav-hamburger-menu")
	public WebElement hamburgerMenu;
    @FindBy(xpath = "//span[contains(text(),'Featured')]")
    public WebElement sortByDropDown;
    @FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal']")
    public List<WebElement> itemLink;
    @FindBy(xpath = "//h1[@class='a-size-base-plus a-text-bold']")
    public WebElement aboutThisItem;

    @FindBy(xpath = "//span[contains(text(),'Samsung')]/preceding-sibling::div//input[@type='checkbox']/following-sibling::i")
    public WebElement brand;



}
