package Pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MedicationPage extends BasePages {
    String Medication = "Do you need to take medication to keep your blood sugar levels stable?";

    public MedicationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void getMedicationDetails(String medication) {

        Assertions.assertThat(Medication.equals(QuestionText.getText()));
        {
            if (medication.equals(LabelYes.getText())) {
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
