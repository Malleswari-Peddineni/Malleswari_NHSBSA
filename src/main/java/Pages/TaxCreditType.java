package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaxCreditType extends BasePages {
    @FindBy(xpath = "//*[@id='workingChildTaxCredit']")
    WebElement WokringChild;
    @FindBy(xpath = "//*[@id='workingDisabilityTaxCredit']")
    WebElement WorkingDisability;
    @FindBy(xpath = "//*[@id='childTaxCredit']")
    WebElement ChildTax;
    @FindBy(xpath = "//*[@id='workingTaxCredit']")
    WebElement WorkingTax;

    String WorkingChildText = "Working Tax Credit and Child Tax Credit together";
    String WorkingDisabilityText = "Working Tax Credit on its own, including a disability element";
    String ChildTaxText = "Child Tax Credit on its own";
    String WorkingTaxText = "Working Tax Credit on its own";

    String PartnerTaxCreditType = "Which type of tax credits do you or your partner get?";
    String TaxCreditTypeQ = "Which type of tax credits do you get?";
    public TaxCreditType(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void getTaxCreditTypeDetails(String taxtype) {

        if (PartnerTaxCreditType.equals(QuestionText.getText()) || TaxCreditTypeQ.equals(QuestionText.getText())) {
            if (taxtype.equals(WorkingChildText)) {
                WokringChild.click();
            } else if (taxtype.equals(WorkingDisabilityText)) {
                WorkingDisability.click();
            } else if (taxtype.equals(ChildTaxText)) {
                ChildTax.click();
            } else {
                WorkingTax.click();
            }
        }
        NextButton.click();
    }
}
