package Util;

import Pages.BasePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class GenericFunctions extends BasePages {
    public GenericFunctions(WebDriver driver) {

        super(driver);
        PageFactory.initElements(driver, this);
    }
    public static void getFinalScreenshot(String scenarioname) throws IOException {
        Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
        ImageIO.write(s.getImage(), "PNG", new File("C:\\Users\\hp\\eclipse-workspace\\NHSBSATest\\test-output\\screenshots\\" + scenarioname + ".png"));
    }

}
