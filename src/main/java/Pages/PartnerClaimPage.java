package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PartnerClaimPage extends BasePages {
    String PartnerClaimBenifitsText = "Do you or your partner claim any benefits or tax credits?";
    String ClaimBenifitsText = "Do you claim any benefits or tax credits?";
    public PartnerClaimPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void getClaimBenifitsStatus(String claimbenifits) {

        if (PartnerClaimBenifitsText.equals(QuestionText.getText()) || ClaimBenifitsText.equals(QuestionText.getText())) {

            if (claimbenifits.equals(LabelYes.getText())) {
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
