package Pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SavingsPage extends BasePages {
    String Savings = "Do you have more than £23,250 in savings, investments or property?";
    public SavingsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void getSavingsDetails(String savings) {

        Assertions.assertThat(Savings.equals(QuestionText.getText()));
        {
            if (savings.equals(LabelYes.getText())) {
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