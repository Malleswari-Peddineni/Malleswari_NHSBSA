package Pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InjuryillnessPage extends BasePages {

    String InjuryIllness = "Do you have an injury or illness caused by serving in the armed forces?";
    public InjuryillnessPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void getInjuryIllnessDetails(String injill) {

        Assertions.assertThat(InjuryIllness.equals(QuestionText.getText()));
        {
            if (injill.equals(LabelYes.getText())) {
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

