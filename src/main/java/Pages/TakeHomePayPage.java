package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TakeHomePayPage extends BasePages {
    String PartnerTakeHomePay = "Did you and your partner have a combined take-home pay of £935 or less in your last Universal Credit period?";
    String TakeHomePay = "Was your take-home pay for your last Universal Credit period £935 or less?";

    public TakeHomePayPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void getTakeHomePay(String takehomepay) {

        if (PartnerTakeHomePay.equals(QuestionText.getText()) || TakeHomePay.equals(QuestionText.getText())) {
            if (takehomepay.equals(LabelYes.getText())) {
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
