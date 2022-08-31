package Pages;


import Constante.Xpaths;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myaccount extends Tools {

    @FindBy(xpath = Xpaths.myAccount)
    WebElement myaccount;

    @FindBy(xpath = Xpaths.logoHome)
    WebElement logohome;

    @FindBy(xpath = Xpaths.verifHome)
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

        clickElement(logohome);

    }

    public void verifhome(String text)
    {
        checkElement(verifhome,text);
    }
}
