package Pages;

import Constante.JDD;
import Constante.Xpaths;
import Utils.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountDetailPage extends Tools {

    @FindBy(xpath = Xpaths.currentPwd)
    private WebElement currentPwd;

    @FindBy(xpath = Xpaths.newPwd)
    private WebElement newPwd;

    @FindBy(xpath = Xpaths.conNewPwd)
    private WebElement conNewPwd;

    @FindBy(xpath = Xpaths.saveChange)
    private WebElement saveChange;

    @FindBy(xpath = Xpaths.vrfMsgChangPwd)
    private WebElement msgVrfPwd;

    public AccountDetailPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void insertCurrentPwd(String text)
    {
        insertElement(currentPwd,text);
    }

    public void insertNewPwd(String text)
    {
        insertElement(newPwd,text);
    }
    public void insertConfirmeNewPwd(String text)
    {
        insertElement(conNewPwd,text);
    }
    public void clickButtonSaveChage()
    {
        clickElement(saveChange);
    }

    public void verfifierMsgChangPwd(String text)
    {
        checkElement(msgVrfPwd,text);
    }

}
