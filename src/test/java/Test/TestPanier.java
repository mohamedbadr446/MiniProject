package Test;

import Connexion.SetUp;
import Constante.JDD;
import Pages.LoginPage;
import Pages.Pannier;
import org.testng.annotations.Test;

public class TestPanier extends SetUp {
    @Test
    public void runLogin() {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.clickMyaccount();
        loginPage.insertLoginEmail(JDD.username);
        loginPage.insertLoginPwd(JDD.pwd);
        loginPage.clickButtonLogin();
        loginPage.verfierPageLogin(JDD.msgPage);

        Pannier pannier=new Pannier(driver);
        pannier.clickShop();
       // pannier.clickProduit();
        pannier.clickAddToBasket();
        pannier.clickPanier();
        pannier.verfierPagePannier(JDD.msgPanne);
    }
}
