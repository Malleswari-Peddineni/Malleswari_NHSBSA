package Pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DiabetesPage extends BasePages {
    String Diabetes = "Do you have diabetes?";

    public DiabetesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void getDiabetesDetails(String diabetes) {

        Assertions.assertThat(Diabetes.equals(QuestionText.getText()));
        {
            if (diabetes.equals(LabelYes.getText())) {
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
