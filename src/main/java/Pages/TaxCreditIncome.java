package Pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TaxCreditIncome extends BasePages {
    String TaxCreditIncomeQ = "Is your household income £15,276 or less?";

    public TaxCreditIncome(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void getTaxCreditIncomeDetails(String taxcredit) {

        Assertions.assertThat(TaxCreditIncomeQ.equals(QuestionText.getText()));
        {
            if (taxcredit.equals(LabelYes.getText())) {
                LabelYes.click();
            } else {
                LabelNo.click();
            }
        }
        if (RadioYes.isSelected() || RadioNo.isSelected()) {
            NextButton.click();
        } else {
            System.out.println(ErrorMsg.getText());
        }
    }
}
