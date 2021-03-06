package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MenuPage extends BasePage {
    public MenuPage(WebDriver driver) {
        super(driver);
    }

    Logger logger = LoggerFactory.getLogger("MenuPage");
    @FindBy(css = "a.login")
    private WebElement signInBtn;

    @FindBy(css = "a.account span")
    private WebElement userName;

    @FindBy(css = "#block_top_menu > ul > li:nth-child(1) > a")
    private WebElement woman;
    @FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
    private WebElement dress;
    @FindBy(css = "#block_top_menu > ul > li:nth-child(3) > a")
    private WebElement tshirt;

    public LoginPage openLoginPage() {
        click(signInBtn);
        return new LoginPage(getDriver());
    }

    public String getUserName() {
        return userName.getText();

    }

    public MenuPage mouseHoverWoman() {
        logger.info("Mouse hover on Woman link");
        mouseHover(woman);
        return this;
    }
    public MenuPage mouseHoverDress() {
        logger.info("Mouse hover on dress link");
        mouseHover(dress);
        return this;
    }
    public MenuPage mouseHoverTshirt() {
        logger.info("Mouse hover on tshirt link");
        mouseHover(tshirt);
        return this;
    }
}
