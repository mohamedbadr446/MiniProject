package Test;

import Connexion.SetUp;
import Constante.JDD;
import Pages.LoginPage;
import Pages.Myaccount;
import Pages.Pannier;
import Pages.PaymentPage;
import com.xpandit.testng.annotations.Xray;
import org.testng.annotations.Test;

public class TestPayment extends SetUp {
   @Test
   @Xray(requirement = "BACBPI-165", test = "BACBPI-346")
    public void run()
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.clickMyaccount();
        loginPage.verifierLogo();
        loginPage.insertLoginEmail(JDD.username);
        loginPage.insertLoginPwd(JDD.pwd);
        loginPage.clickButtonLogin();
        loginPage.verfierPageLogin(JDD.msgPage);


        PaymentPage payment =new PaymentPage(driver);
        //Ajouter Produit au pannier
        Pannier pannier=new Pannier(driver);
        pannier.clickShop();
        // pannier.clickProduit();
        String price= pannier.getPrice();
        pannier.clickAddToBasket();
        pannier.clickViewBasket();
        pannier.verifierPrix(price);
        payment.cliqueCheckOut();
        payment.cliqueCashOnDelivery();
        payment.cliquePlaceOrder();
        payment.cliqueOrderDetails();
    }
}

