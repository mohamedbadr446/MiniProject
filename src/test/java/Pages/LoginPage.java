package Pages;

import Constante.Xpaths;
import Utils.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Tools {

    public WebDriver driver;

    //	MyAcount


    @FindBy(xpath = Xpaths.myAccount)
    private WebElement myAccount;


    //	Login

    @FindBy(xpath = Xpaths.login_username)
    private WebElement username_Login;

    @FindBy(xpath = Xpaths.login_pwd)
    private WebElement pwd_Login;

    @FindBy(xpath = Xpaths.login_button)
    private WebElement button_Login;

    @FindBy(xpath = Xpaths.pageLoginVF)
    private WebElement xpathPageLogin;


    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void clickMyaccount() {
        clickElement(myAccount);
    }
    public void insertLoginEmail(String emailSucc) {
      insertElement(username_Login,emailSucc);
    }

    public void insertLoginPwd(String pwd) {
        insertElement(pwd_Login,pwd);
    }

    public void clickButtonLogin() {
      clickElement(button_Login);
    }

    public void verfierPageLogin(String verf) {

        checkElement(xpathPageLogin,verf);
    }

}
