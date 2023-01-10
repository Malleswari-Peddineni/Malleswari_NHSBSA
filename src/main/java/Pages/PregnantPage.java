package Pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PregnantPage extends BasePages {
    String PregnantStatus = "Are you pregnant or have you given birth in the last 12 months?";
    public PregnantPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void getPregnantDetails(String pregbirth) {

        Assertions.assertThat(PregnantStatus.equals(QuestionText.getText()));
        {
            if (pregbirth.equals(LabelYes.getText())) {
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
