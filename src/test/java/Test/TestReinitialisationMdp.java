package Test;

import Connexion.SetUp;
import Constante.JDD;
import Pages.LoginPage;
import com.xpandit.testng.annotations.Xray;
import org.testng.annotations.Test;

public class TestReinitialisationMdp extends SetUp {

    @Test
    @Xray(requirement = "BACBPI-159",test = "BACBPI-378")
    public void runReinitialisationMdp()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.clickMyaccount();
        loginPage.insertLoginEmail(JDD.username);
        loginPage.insertLoginPwd(JDD.pwd);
        loginPage.clickButtonLogin();
        loginPage.verfierPageLogin(JDD.msgPage);
        loginPage.clickAccountDetail();
    }
}
