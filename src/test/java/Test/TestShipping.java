package Test;

import Connexion.SetUp;
import Constante.JDD;
import Pages.LoginPage;
import Pages.ShippingPage;
import org.testng.annotations.Test;

public class TestShipping extends SetUp {
    @Test
    public void runShippingTest() {
        LoginPage loginPage=new LoginPage(driver);
        ShippingPage shippingAddress = new ShippingPage(driver);
        loginPage.clickMyaccount();
        loginPage.insertLoginEmail(JDD.email);
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
