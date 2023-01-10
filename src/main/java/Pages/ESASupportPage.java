package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ESASupportPage extends BasePages {
    @FindBy(xpath = "//*[@id='income-esa']")
    WebElement incomeESA;
    @FindBy(xpath = "//*[@id='contribution-esa']")
    WebElement contriESA;
    String PartnerESASupport = "Which type of Employment and Support Allowance (ESA) do you or your partner get?";
    String ESASupportQues = "Which type of Employment and Support Allowance (ESA) do you get?";
    String IncomeESA = "Income-related ESA";
    String ContriESA = "Contribution-based ESA";

    public ESASupportPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void getESASupportDetails(String esasupport) {
        if (PartnerESASupport.equals(QuestionText.getText()) || ESASupportQues.equals(QuestionText.getText())) {
            if (esasupport.equals(IncomeESA)) {
                incomeESA.click();
            } else {
                contriESA.click();
            }
        }
        if (incomeESA.isSelected() || contriESA.isSelected()) {
            NextButton.click();
        } else {
            System.out.println(ErrorMsg.getText());
        }
    }
}
