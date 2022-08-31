package Pages;

import Utils.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Tools {

    public WebDriver driver;

    //	MyAcount


    @FindBy(xpath = "//a[contains(text(),'My Account')]")
    private WebElement myAccount;


    //	Login

    @FindBy(xpath = "//input[@name='username']")
    private WebElement username_Login;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement pwd_Login;

    @FindBy(xpath = "//input[@name='login']")
    private WebElement button_Login;

    @FindBy(xpath = "//p[contains(text(),'Hello')]")
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
