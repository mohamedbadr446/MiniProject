package Test;

import Connexion.SetUp;
import Constante.JDD;
import Pages.LoginPage;
import Pages.LoginRegisterSucc;
import org.testng.annotations.Test;

public class TestRegister extends SetUp {

    @Test
    public void runRegister() {
        LoginRegisterSucc loginpage=new LoginRegisterSucc(driver);
        loginpage.clickMyaccount();
        loginpage.insertRegisterEmail(JDD.email);
        loginpage.insertRegisterPwd(JDD.pwd);
        loginpage.clickZoneRegister();
        loginpage.clickZoneRegister();
        loginpage.verfierPwdSucc(JDD.verifier_pwd);
        loginpage.clickButtonRegister();
        loginpage.verfierPageReg(JDD.verifier_Reg);

    }
}
