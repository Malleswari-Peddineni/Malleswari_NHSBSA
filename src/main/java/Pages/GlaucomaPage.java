package Pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GlaucomaPage extends BasePages {
    String Glaucoma = "Do you have glaucoma?";
    public GlaucomaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void getGlaucomaDetails(String glaucoma) {

        Assertions.assertThat(Glaucoma.equals(QuestionText.getText()));
        {
            if (glaucoma.equals(LabelYes.getText())) {
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

