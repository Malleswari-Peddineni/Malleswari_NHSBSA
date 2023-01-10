package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JSASupportPage extends BasePages {
    @FindBy(xpath = "//*[@id='income-jsa']")
    WebElement incomeJSA;
    @FindBy(xpath = "//*[@id='contribution-jsa']")
    WebElement contriJSA;

    String PartnerJSASupport = "Which type of Jobseeker's Allowance (JSA) do you or your partner get?";
    String JSASupportQues = "Which type of Jobseeker's Allowance (JSA) do you get?";
    String IncomeJSA = "Income-based JSA";
    String ContriJSA = "Contribution-based JSA";

    public JSASupportPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void getJSASupportDetails(String jsasupport) {
        if (PartnerJSASupport.equals(QuestionText.getText()) || JSASupportQues.equals(QuestionText.getText())) {
            if (jsasupport.equals(IncomeJSA)) {
                incomeJSA.click();
            } else {
                contriJSA.click();
            }
        }
        if (incomeJSA.isSelected() || contriJSA.isSelected()) {
            NextButton.click();
        } else {
            System.out.println(ErrorMsg.getText());
        }
    }
}
