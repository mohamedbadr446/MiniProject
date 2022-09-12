package Test;

import Connexion.SetUp;
import Constante.JDD;
import Pages.LoginPage;
import Pages.Pannier;
import com.xpandit.testng.annotations.Xray;
import org.testng.annotations.Test;

public class TestPanier extends SetUp {
    @Test(priority = 1)
    @Xray(requirement = "BACBPI-164", test = "BACBPI-345")
    public void runLogin() {

        //Se connecter
        LoginPage loginPage=new LoginPage(driver);
        loginPage.verifierLogo();
        loginPage.clickMyaccount();
        loginPage.insertLoginEmail(JDD.username);
        loginPage.insertLoginPwd(JDD.pwd);
        loginPage.clickButtonLogin();
        loginPage.verfierPageLogin(JDD.msgPage);

        //Ajouter Produit au pannier
        Pannier pannier=new Pannier(driver);
        pannier.clickShop();
       // pannier.clickProduit();
        pannier.clickAddToBasket();
        pannier.clickPanier();
        pannier.verfierPagePannier(JDD.msgPanne);
    }

    @Test(priority = 2)
    @Xray(requirement = "BACBPI-162", test = "BACBPI-343")
    public void runnAddProductPanier()
    {
        //Se connecter
        LoginPage loginPage=new LoginPage(driver);
        loginPage.verifierLogo();
        loginPage.clickMyaccount();
        loginPage.insertLoginEmail(JDD.username);
        loginPage.insertLoginPwd(JDD.pwd);
        loginPage.clickButtonLogin();
        loginPage.verfierPageLogin(JDD.msgPage);
        //Ajouter Produit au pannier
        Pannier pannier=new Pannier(driver);
        pannier.clickShop();
        // pannier.clickProduit();
        String price= pannier.getPrice();
        pannier.clickAddToBasket();
        pannier.clickViewBasket();
        pannier.verifierPrix(price);
    }
}
