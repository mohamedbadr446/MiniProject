package Pages;

import Utils.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Tools {
    //	MyAcount


    @FindBy(xpath = "//a[contains(text(),'My Account')]")
    private WebElement myAccount;


    //	Login

    @FindBy(xpath = "//input[@id='reg_email']")
    private WebElement email_Reg;

    @FindBy(xpath = "//input[@id='reg_password']")
    private WebElement pwd_Reg;

    @FindBy(xpath = "//input[@name='register']")
    private WebElement button_Reg;

    @FindBy(xpath = "//small[contains(text(),'he password should')]")
    private WebElement msgError;

    public RegisterPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void clickMyaccount() {
        clickElement(myAccount);
    }
    public void insertResgEmail(String emailSucc) {
        insertElement(email_Reg,emailSucc);
    }

    public void insertRegPwd(String pwd) {
        insertElement(pwd_Reg,pwd);
    }

    public void clickButtonReg() {
        clickElement(button_Reg);
    }
    public void cliclZone()
    {
        clickElement(email_Reg);
        clickElement(pwd_Reg);
    }
    public void verfierMsgError(String msg)
    {
        checkElement(msgError,msg);
    }
}
