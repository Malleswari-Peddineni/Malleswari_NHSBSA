package Pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class GPPracticePage extends BasePages {
    String GPPracticeEngland = "Is your GP practice in Scotland or Wales?";
    String GPPracticeScotland = "Do you live in the Highlands and Islands?";
    String GPPracticeWales = "Is your GP practice in Scotland or Wales?";
    String GPNorthenIreland = "You cannot use this service because you live in Northern Ireland";


    public GPPracticePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void getGPPractice(String country, String GPPractice) {

        switch (country) {

            case "England":
                Assertions.assertThat(GPPracticeEngland.equals(QuestionText.getText()));
                if (GPPractice.equalsIgnoreCase(LabelYes.getText())) {
                    LabelYes.click();
                } else {
                    LabelNo.click();
                }
                break;

            case "Scotland":
                Assertions.assertThat(GPPracticeScotland.equals(QuestionText.getText()));
                if (GPPractice.equalsIgnoreCase(LabelYes.getText())) {
                    LabelYes.click();
                } else {
                    LabelNo.click();
                }
                break;
            case "Wales":
                Assertions.assertThat(GPPracticeWales.equals(QuestionText.getText()));
                if (GPPractice.equalsIgnoreCase(LabelYes.getText())) {
                    LabelYes.click();
                } else {
                    LabelNo.click();
                }
                break;

            case "Northen Ireland":
                String ResultHeadingText = ResultHeading.getText();
                if (ResultHeadingText.equals(GPNorthenIreland)) {
                    System.out.println(ResultHeadingText);
                }
                break;

            default:
                System.out.println("Select the country you live in");
                break;

        }

        if (RadioYes.isSelected() || RadioNo.isSelected()) {
            NextButton.click();
        } else {
            System.out.println(ErrorMsg.getText());
        }
    }
}
