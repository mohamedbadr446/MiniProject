package Pages;

import Constante.Xpaths;
import Utils.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFaildPage extends Tools {

    //	MyAcount

    @FindBy(xpath = Xpaths.myAccount)
    private WebElement myAccount;


    //	Login

    @FindBy(xpath = Xpaths.login_username)
    private WebElement email_Reg;

    @FindBy(xpath = Xpaths.login_pwd)
    private WebElement pwd_Reg;

    @FindBy(xpath = Xpaths.login_button)
    private WebElement button_Reg;

    @FindBy(xpath = Xpaths.msgError)
    private WebElement msgError;

    public LoginFaildPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void clickMyaccount() {
        clickElement(myAccount);
    }
    public void insertEmail(String emailSucc) {
        insertElement(email_Reg,emailSucc);
    }

    public void insertPwd(String pwd) {
        insertElement(pwd_Reg,pwd);
    }

    public void clickButton() {
        clickElement(button_Reg);
    }

    public void verfierMsgError(String msg)
    {
        checkElement(msgError,msg);
    }
}
