package Test;

import Connexion.SetUp;
import Constante.JDD;
import Pages.LoginPage;
import Pages.Myaccount;
import com.xpandit.testng.annotations.Xray;
import org.testng.annotations.Test;

public class TestMyAcc extends SetUp{
    @Test(priority = 1)
    @Xray(requirement = "BACBPI-158", test = "BACBPI-240")
    public void run()
    {
        Myaccount myaccount=new Myaccount(driver);
        myaccount.verifierLogo();
        myaccount.cliqueMyaccount();
        myaccount.cliqueLogo();
        myaccount.verifhome(JDD.msgVerifMyAcount);
    }

    @Test(priority = 2)
    @Xray(requirement = "BACBPI-161", test = "BACBPI-342")
    public void runLogOut()
    {
        //Se connecter
        LoginPage loginPage=new LoginPage(driver);
        loginPage.clickMyaccount();
        loginPage.insertLoginEmail(JDD.username);
        loginPage.insertLoginPwd(JDD.pwd);
        loginPage.clickButtonLogin();
        loginPage.verfierPageLogin(JDD.msgPage);

        //Se deconnecter
        Myaccount myaccount=new Myaccount(driver);
        myaccount.clickLogOut();
    }
}
