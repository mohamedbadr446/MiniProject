package Test;

import Connexion.SetUp;
import Constante.JDD;
import Pages.AccountDetailPage;
import Pages.LoginPage;
import Pages.LoginRegisterSucc;
import com.xpandit.testng.annotations.Xray;
import org.testng.annotations.Test;

public class TestReinitialisationMdp extends SetUp {

    @Test
    @Xray(requirement = "BACBPI-160",test = "BACBPI-339")
    public void runReinitialisationMdp()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.clickMyaccount();
        loginPage.insertLoginEmail(JDD.username);
        loginPage.insertLoginPwd(JDD.pwd);
        loginPage.clickButtonLogin();
        loginPage.verfierPageLogin(JDD.msgPage);
        loginPage.clickAccountDetail();
        AccountDetailPage detailPage=new AccountDetailPage(driver);
        detailPage.insertCurrentPwd(JDD.pwd);
        detailPage.insertNewPwd(JDD.newPwd);
        LoginRegisterSucc registerSucc=new LoginRegisterSucc(driver);
        registerSucc.verfierPwdSucc(JDD.verifier_pwd);
        detailPage.insertConfirmeNewPwd(JDD.conNewPwd);
        detailPage.clickButtonSaveChage();
    }
}
