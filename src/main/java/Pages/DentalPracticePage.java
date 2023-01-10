package Pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DentalPracticePage extends BasePages {

    @FindBy(xpath = "//label[@id='label-england']")
    WebElement DentalEngland;
    @FindBy(xpath = "//label[@id='label-scotland']")
    WebElement DentalScotland;
    @FindBy(xpath = "//label[@id='label-wales']")
    WebElement DentalWales;
    @FindBy(xpath = "//label[@id='label-ni']")
    WebElement DentalNI;
    @FindBy(xpath = "//label[@id='label-not-registered']")
    WebElement DentalNotRegistered;

    String DentalPracticeQuestion = "Which country is your dental practice in?";
    public DentalPracticePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void getDentalPractice(String country) {

        Assertions.assertThat(DentalPracticeQuestion.equals(QuestionText.getText()));

        {
            if (country.equals(DentalEngland.getText())) {
                DentalEngland.click();
            } else if (country.equalsIgnoreCase(DentalScotland.getText())) {
                DentalScotland.click();
            } else if (country.equalsIgnoreCase(DentalWales.getText())) {
                DentalWales.click();
            } else if (country.equalsIgnoreCase(DentalNI.getText())) {
                DentalNI.click();
            } else {
                DentalNotRegistered.click();
            }
        }
        NextButton.click();
    }

}
