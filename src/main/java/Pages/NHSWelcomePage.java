package Pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NHSWelcomePage extends BasePages {
    public String NHSHomePageTitle = "Check what help you could get to pay for NHS costs - NHSBSA";
    public String SessionOutNHSTitle = "Session timeout - Check what help you could get to pay for NHS costs - NHSBSA";
    @FindBy(xpath = "//*[@id='next-button']")
    WebElement clickStartNowButton;
    @FindBy(linkText = "Check if you can get help with health costs")
    WebElement StartAgain;

    public NHSWelcomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void getPageTitle() {

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assertions.assertThat(currentUrl.equals("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start"));
        String NHSTitle = driver.getTitle();
        System.out.println(NHSTitle);

        if (NHSTitle.equalsIgnoreCase(NHSHomePageTitle)) {
            clickStartNowButton.click();
        } else if(NHSTitle.equalsIgnoreCase(SessionOutNHSTitle)){
            StartAgain.click();
        }else {
            System.out.println("Not Valid URL");
        }
    }

}
