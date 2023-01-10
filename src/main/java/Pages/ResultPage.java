package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends BasePages {
    @FindBy(xpath = "//*[@class='column-two-thirds']")
    public WebElement FinalResult;

    public ResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void getResultDetails() {

        System.out.println("User should get help as per circumstances : " + FinalResult.getText());
    }

}
