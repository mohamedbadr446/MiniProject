package Test;

import Connexion.SetUp;
import Constante.JDD;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class TestLogin extends SetUp {

    @Test
    public void runLogin() {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.clickMyaccount();
        loginPage.verifierLogo();
        loginPage.insertLoginEmail(JDD.username);
        loginPage.insertLoginPwd(JDD.pwd);
        loginPage.clickButtonLogin();
        loginPage.verfierPageLogin(JDD.msgPage);

    }
}
