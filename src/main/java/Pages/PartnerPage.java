package Pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PartnerPage extends BasePages {
    String PartnerStatus = "Do you live with a partner?";
    public PartnerPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void getPartnerStatus(String partner) {

        Assertions.assertThat(PartnerStatus.equals(QuestionText.getText()));
        {
            if (partner.equals(LabelYes.getText())) {
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
