package Test;

import Connexion.SetUp;
import Constante.JDD;
import Pages.RegisterPage;
import org.testng.annotations.Test;

public class Register extends SetUp {

    @Test
    public void runLogin() {
        RegisterPage register=new RegisterPage(driver);
        register.clickMyaccount();
        register.insertResgEmail(JDD.email);
        register.insertRegPwd(JDD.pwdfaild);

        register.cliclZone();
        register.clickButtonReg();

        register.verfierMsgError(JDD.msgError);
    }
}
