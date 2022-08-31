package Pages;

import BaseTools.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myaccount extends Tools {

    @FindBy(xpath = "//a[contains(.,'My Account')]")
    WebElement myaccount;

    @FindBy(xpath = "//img[contains(@title,'Automation Practice Site')]")
    WebElement logohome;

    @FindBy(xpath = "//img[@alt='Shop Selenium Books']")
    WebElement verifhome;

    WebDriver driver;

    int time=30;

    public Myaccount(WebDriver driver) {
        //this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void cliqueMyaccount()
    {
       clickElement(myaccount);
    }
    public void cliqueLogo()  {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clickElement(logohome);
    }

    public void verifhome(String text)
    {
        checkElement(verifhome,text);
    }
}
