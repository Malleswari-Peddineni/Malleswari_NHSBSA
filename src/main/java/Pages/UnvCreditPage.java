package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class UnvCreditPage extends BasePages {

    @FindBy(xpath = "//input[@id='yes-universal']")
    WebElement YesRadio;
    @FindBy(xpath = "//input[@id='not-yet']")
    WebElement NotYetRadio;
    @FindBy(xpath = "//input[@id='different-benefit']")
    WebElement DiffRadio;

    String PartnerPaidUnvCredit = "Do you or your partner get paid Universal Credit?";
    String PaidUnvCredit = "Do you get paid Universal Credit?";
    String PartnerYesUnvCreditText = "Yes, we receive Universal Credit payments";
    String yesUnvCreditText = "Yes, I receive Universal Credit payments";
    String PartnerNotYetText = "Not yet, but we've applied";
    String NotYetText = "Not yet, but I've applied";
    String PartnerDiffBen = "No, we get a different benefit";
    String DiffBen = "No, I get a different benefit";


    public UnvCreditPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void getPaidUnvCredit(String unvCreditStatus) {
        if (PartnerPaidUnvCredit.equals(QuestionText.getText()) || PaidUnvCredit.equals(QuestionText.getText())) {
            if (unvCreditStatus.equals(PartnerYesUnvCreditText) || unvCreditStatus.equals(yesUnvCreditText)) {
                YesRadio.click();
            } else if (unvCreditStatus.equals(PartnerNotYetText) || unvCreditStatus.equals(NotYetText)) {
                NotYetRadio.click();
            } else {
                DiffRadio.click();
            }
        }

        if (YesRadio.isSelected() || NotYetRadio.isSelected() || DiffRadio.isSelected()) {
            NextButton.click();
        } else {
            System.out.println(ErrorMsg.getText());
        }
    }
}
