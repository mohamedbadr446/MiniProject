package Test;

import Connexion.Connexion;
import Constante.JDD;
import Pages.LoginPage;
import Pages.RegisterPage;
import org.testng.annotations.Test;

public class Register extends Connexion {

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
