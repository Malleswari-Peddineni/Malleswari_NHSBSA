package Pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DOBPage extends BasePages {
    @FindBy(name = "dateOfBirth.day")
    WebElement dobDayText;
    @FindBy(name = "dateOfBirth.month")
    WebElement dobMonthText;
    @FindBy(name = "dateOfBirth.year")
    WebElement dobYearText;

    String DOBtext = "What is your date of birth?";
    public DOBPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterDOB(String Date, String Month, String Year) {
        Assertions.assertThat(DOBtext.equals(QuestionText.getText()));

        Assertions.assertThat(dobDayText.isEnabled());
        {
            if (!dobDayText.equals("")) {
                dobDayText.sendKeys(Date);
            } else {
                System.out.println(ErrorMsg.getText());
            }
        }
        Assertions.assertThat(dobMonthText.isEnabled());
        {
            if (!dobMonthText.equals("")) {
                dobMonthText.sendKeys(Month);
            } else {
                System.out.println(ErrorMsg.getText());
            }
        }
        Assertions.assertThat(dobYearText.isEnabled());
        {
            if (!dobYearText.equals("")) {
                dobYearText.sendKeys(Year);
            } else {
                System.out.println(ErrorMsg.getText());
            }
        }

        NextButton.click();
    }

}
