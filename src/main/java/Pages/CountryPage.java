package Pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CountryPage extends BasePages {
    @FindBy(xpath = "//*[@id='radio-england']")
    WebElement EnglandRadio;
    @FindBy(xpath = "//label[@id='label-england']")
    WebElement EnglandLabel;
    @FindBy(xpath = "//*[@id='radio-scotland']")
    WebElement ScotlandRadio;
    @FindBy(xpath = "//*[@id='label-scotland']")
    WebElement ScotlandLabel;
    @FindBy(xpath = "//*[@id='radio-wales']")
    WebElement WalesRadio;
    @FindBy(xpath = "//*[@id='label-wales']")
    WebElement WalesLabel;
    @FindBy(xpath = "//*[@id='radio-nire']")
    WebElement NorternIrelandRadio;

    String CountryText = "Which country do you live in?";
    public CountryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void getCountriesList(String country) {


        Assertions.assertThat(CountryText.equals(QuestionText.getText()));
        {
            if (country.equalsIgnoreCase(EnglandLabel.getText())) {
                EnglandLabel.click();
            } else if (country.equalsIgnoreCase(ScotlandLabel.getText())) {
                ScotlandLabel.click();
            } else if (country.equalsIgnoreCase(WalesLabel.getText())) {
                WalesLabel.click();
            } else
                NorternIrelandRadio.click();
        }
        if (EnglandRadio.isSelected() || ScotlandRadio.isSelected() || WalesRadio.isSelected() || NorternIrelandRadio.isSelected()) {
            NextButton.click();
        } else {
            System.out.println(ErrorMsg.getText());
        }

    }
}
