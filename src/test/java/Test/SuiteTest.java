package Test;

import Connexion.Connexion;
import Constante.JDD;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class SuiteTest extends Connexion {

    @Test
    public void runLogin() {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.clickMyaccount();
        loginPage.insertLoginEmail(JDD.email);
        loginPage.insertLoginPwd(JDD.pwd);
        loginPage.clickButtonLogin();
        loginPage.verfierPageLogin(JDD.msgPage);
    }
}
