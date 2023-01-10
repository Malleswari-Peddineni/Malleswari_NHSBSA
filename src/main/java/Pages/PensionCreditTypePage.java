package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PensionCreditTypePage extends BasePages {

    @FindBy(xpath = "//*[@id='guaranteecreditonly']")
    WebElement guaranteeC;
    @FindBy(xpath = "//*[@id='guaranteecreditwithsavingcredit']")
    WebElement guaSavings;
    @FindBy(xpath = "//*[@id='savingcredit']")
    WebElement savings;

    String PartnerPensionCredit = "What type of Pension Credit do you or your partner get?";
    String PensionCredit = "What type of Pension Credit do you get?";
    String GuaranteeC = "Guarantee Credit only";
    String GuaSavings = "Guarantee Credit with Savings Credit";
    String SavingsCred = "Savings Credit The maximum you can get per week is £14.48";

    public PensionCreditTypePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void getPensionCreditTypeDetails(String pensioncredit) {

        if (PartnerPensionCredit.equals(QuestionText.getText()) || PensionCredit.equals(QuestionText.getText())) {
            if (pensioncredit.equals(GuaranteeC)) {
                guaranteeC.click();
            } else if (pensioncredit.equals(GuaSavings)) {
                guaSavings.click();
            } else {
                savings.click();
            }
        }
        if (guaranteeC.isSelected() || guaSavings.isSelected() || savings.isSelected()) {
            NextButton.click();
        } else {
            System.out.println(ErrorMsg.getText());
        }
    }
}
