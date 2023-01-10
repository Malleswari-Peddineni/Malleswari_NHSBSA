package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class UniversalCreditDecision extends BasePages {
    String PartnerUnvCredDecision = "While you and your partner are waiting on a Universal Credit decision";
    String UnvCredDecision = "While you're waiting on your Universal Credit decision";
    public UniversalCreditDecision(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void getUnvCreditDecision() {
        if (PartnerUnvCredDecision.equals(QuestionText.getText()) || UnvCredDecision.equals(QuestionText.getText())) {
            NextButton.click();
        }
    }
}
