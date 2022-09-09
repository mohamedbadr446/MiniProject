package Pages;

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
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        insertElement(currentPwd,text);
    }
    public void clickButtonSaveChage()
    {
        clickElement(saveChange);
    }
}
