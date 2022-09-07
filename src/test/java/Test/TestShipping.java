package Test;

import Connexion.SetUp;
import Constante.JDD;
import Pages.LoginPage;
import Pages.ShippingPage;
import com.xpandit.testng.annotations.Xray;
import org.testng.annotations.Test;

public class TestShipping extends SetUp {
    @Test
    @Xray(requirement = "BACBPI-154", test = "BACBPI-235")
    public void runShippingTest() {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.verifierLogo();
        ShippingPage shippingAddress = new ShippingPage(driver);
        loginPage.clickMyaccount();
        loginPage.insertLoginEmail(JDD.username);
        loginPage.insertLoginPwd(JDD.pwd);
        loginPage.clickButtonLogin();
        loginPage.verfierPageLogin(JDD.msgPage);
        System.out.println("login succeded");
        shippingAddress.clickMyAccount();
        shippingAddress.clickShipping();
        shippingAddress.clickEdit();
        shippingAddress.checkShippingPage();
    }
}
