package Pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LocalCouncilPayPage extends BasePages {
    String LocalCouncil = "Do you get help to pay for your care home from your local council?";
    public LocalCouncilPayPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void getLocalCouncilDetails(String localcouncil) {

        Assertions.assertThat(LocalCouncil.equals(QuestionText.getText()));
        {
            if (localcouncil.equals(LabelYes.getText())) {
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
