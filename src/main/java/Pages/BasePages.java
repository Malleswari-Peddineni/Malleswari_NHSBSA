package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BasePages {

    public static WebDriver driver;

    @FindBy(id = "next-button")
    public WebElement NextButton;
    @FindBy(xpath = "//*[@id='question-heading']")
    public WebElement QuestionText;
    @FindBy(xpath = "//*[@id='result-heading']")
    public WebElement ResultHeading;
    @FindBy(xpath = "//*[@id='nhsuk-cookie-banner__link_accept_analytics']")
    public WebElement Cookies;
    @FindBy(xpath = "//*[@id='radio-yes']")
    public WebElement RadioYes;
    @FindBy(xpath = "//*[@id='radio-no']")
    public WebElement RadioNo;
    @FindBy(xpath = "//*[@id='label-yes']")
    public WebElement LabelYes;
    @FindBy(xpath = "//*[@id='label-no']")
    public WebElement LabelNo;
    @FindBy(xpath = "//li[@class='error-message']")
    WebElement ErrorMsg;

    public BasePages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void acceptCookies() {
        if (Cookies.isDisplayed()) {
            Cookies.click();
        } else {
            System.out.println("Cookies accept is not visible");
        }
    }

    public enum getBenefitsOptions {taxcredits, incomesupport, esa, jsa, pensioncredit}


}
