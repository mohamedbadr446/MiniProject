package Test;

import Connexion.SetUp;
import Constante.JDD;
import Pages.AccountDetailPage;
import Pages.LoginPage;
import Pages.LoginRegisterSucc;
import Pages.Myaccount;
import com.xpandit.testng.annotations.Xray;
import org.testng.annotations.Test;

public class TestReinitialisationMdp extends SetUp {

    @Test
    @Xray(requirement = "BACBPI-160",test = "BACBPI-339")
    public void runReinitialisationMdp()
    {
        //Se connecter
        LoginPage loginPage=new LoginPage(driver);
        loginPage.clickMyaccount();
        loginPage.insertLoginEmail(JDD.username);
        loginPage.insertLoginPwd(JDD.pwd);
        loginPage.clickButtonLogin();
        loginPage.verfierPageLogin(JDD.msgPage);

        //Accèder à la page "AccountDetail"
        loginPage.clickAccountDetail();

        //Veriffier logo
        Myaccount myaccount=new Myaccount(driver);
        myaccount.verifierLogo();

        //Changer mot de passe
        AccountDetailPage detailPage=new AccountDetailPage(driver);
        detailPage.insertCurrentPwd(JDD.pwd);
        detailPage.insertNewPwd(JDD.newPwd);
        LoginRegisterSucc registerSucc=new LoginRegisterSucc(driver);
        registerSucc.verfierPwdSucc(JDD.verifier_pwd);
        detailPage.insertConfirmeNewPwd(JDD.newPwd);
        detailPage.clickButtonSaveChage();
        detailPage.verfifierMsgChangPwd(JDD.msgVrfPwd);

        //Revenir au premier mot de passe

        loginPage.clickAccountDetail();
        detailPage.insertCurrentPwd(JDD.newPwd);
        detailPage.insertNewPwd(JDD.pwd);
        registerSucc.verfierPwdSucc(JDD.verifier_pwd);
        detailPage.insertConfirmeNewPwd(JDD.pwd);
        detailPage.clickButtonSaveChage();
        detailPage.verfifierMsgChangPwd(JDD.msgVrfPwd);

    }
}
