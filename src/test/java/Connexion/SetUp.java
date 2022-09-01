package Connexion;

import Constante.JDD;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class SetUp {
    public static WebDriver driver;
    static ExtentReports report;
    static ExtentTest test;
    @BeforeTest
    public void setup (){
        report = new ExtentReports(System.getProperty("user.dir") + "\\target\\ExtentReport.html");
        test=report.startTest("test1");
        System.setProperty("webdriver.edge.driver",
                System.getProperty("user.dir")+"\\src\\test\\resources\\Driver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get(JDD.url);
        System.out.println("La page est bien affiché");
        driver.manage().window().maximize();
    }
    public void screen() {
        try {
            Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
                    .takeScreenshot(driver);

            ImageIO.write(screenshot.getImage(), "jpg",
                    new File(System.getProperty("user.dir")+"\\target\\ElementScreenshot.jpg"));
            test.log(LogStatus.INFO, test.addScreenCapture(System.getProperty("user.dir")+"\\target\\ElementScreenshot.jpg"));
            report.endTest(test);
            report.flush();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @AfterTest
    public void fermeture()  {
        screen();
        driver.quit();
    }
}