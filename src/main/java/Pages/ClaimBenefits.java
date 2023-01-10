package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClaimBenefits extends BasePages {

    @FindBy(xpath = "//*[contains(text(),'Tax credits')]")
    WebElement TaxCredits;
    @FindBy(xpath = "//*[contains(text(),'Income Support')]")
    WebElement IncomeSupport;
    @FindBy(xpath = "//*[contains(text(),'Employment and Support Allowance (ESA)')]")
    WebElement ESA;
    @FindBy(xpath = "//*[contains(text(),\"Jobseeker's Allowance (JSA)\")]")
    WebElement JSA;
    @FindBy(xpath = "//*[contains(text(),'Pension Credit')]")
    WebElement PensionCredit;
    @FindBy(xpath = "//*[contains(text(),\"No, we don't get any of these\")]")
    WebElement NoOptions;
    String PartnerClaimBenefitsText = "Do you or your partner get any of these benefits?";
    String ClaimBenefitsText = "Do you get any of these benefits?";
    String TaxCreditsText = "Tax credits";
    String IncomeSupportText = "Income Support";
    String ESAText = "Employment and Support Allowance (ESA)";
    String JSAText = "Jobseeker's Allowance (JSA)";
    String PensionCreditText = "Pension Credit";
    String NoOptionText = "No, I don't get any of these";
    String errorMessage = "ESA and JSA cannot be claimed together. Select which benefit you get or select ''no''";

    public ClaimBenefits(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void getClaimBenefitsOptions(String taxcredits, String incomesupport, String esa, String jsa, String pensioncredit) {

        if (PartnerClaimBenefitsText.equals(QuestionText.getText()) || ClaimBenefitsText.equals(QuestionText.getText())) {
            getBenefitsOptions[] benefitsOptions = getBenefitsOptions.values();
            for (getBenefitsOptions benefits : benefitsOptions) {
                switch (benefits) {
                    case taxcredits:
                        if (taxcredits.equals(TaxCreditsText)) {
                            TaxCredits.click();
                        }
                        break;
                    case incomesupport:
                        if (incomesupport.equals(IncomeSupportText)) {
                            IncomeSupport.click();
                        }
                        break;
                    case esa:
                        if (esa.equals(ESAText)) {
                            ESA.click();
                        }
                        break;
                    case jsa:
                        if (jsa.equals(JSAText)) {
                            JSA.click();
                        }
                        break;
                    case pensioncredit:
                        if (pensioncredit.equals(PensionCreditText)) {
                            PensionCredit.click();
                        }
                        break;
                    default:
                        NoOptions.click();
                        break;
                }


            }
            NextButton.click();
        }
    }
}
