package Test;

import Connexion.SetUp;
import Constante.JDD;
import Pages.LoginFaildPage;
import com.xpandit.testng.annotations.Xray;
import org.testng.annotations.Test;

public class TestLoginFaild extends SetUp {

    @Test
    @Xray(requirement = "BACBPI-157",test = "BACBPI-236")
    public void runLogin() {
        LoginFaildPage login=new LoginFaildPage(driver);
        login.clickMyaccount();
        login.insertEmail(JDD.username);
        login.insertPwd(JDD.pwdfaild);
        login.clickButton();
        login.verfierMsgError(JDD.msgError);
    }
}
