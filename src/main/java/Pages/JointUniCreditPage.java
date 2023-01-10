package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class JointUniCreditPage extends BasePages {

    String PartnerJointUnvCredit = "As part of your joint Universal Credit, do you have any of these?";
    String UniversalCreditClaim = "As part of your Universal Credit, do you have any of these?";
    public JointUniCreditPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void getJointCreditStatus(String jointunv) {

        if (PartnerJointUnvCredit.equals(QuestionText.getText()) || UniversalCreditClaim.equals(QuestionText.getText())) {
            if (jointunv.equals(LabelYes.getText())) {
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
