package Pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MedicalConditionsPage extends BasePages {
    String MedicalConditions = "To check what help you can get with NHS charges, we need to know if you're affected by any of these conditions";
    public MedicalConditionsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void getMedicalConditionsDetails(String mediconditions) {

        Assertions.assertThat(MedicalConditions.equals(QuestionText.getText()));
        {
            if (mediconditions.equals(LabelYes.getText())) {
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
