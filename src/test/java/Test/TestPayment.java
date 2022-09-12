package Test;

import Connexion.SetUp;
import Pages.Myaccount;
import Pages.PaymentPage;
import com.xpandit.testng.annotations.Xray;
import org.testng.annotations.Test;

public class TestPayment extends SetUp {
   @Test
   @Xray(requirement = "BACBPI-165", test = "BACBPI-346")
    public void run()
    {
        PaymentPage payment =new PaymentPage(driver);
        payment.cliqueShopPay();
        payment.cliqueUpdateBasket();
        payment.cliqueCheckOut();
        payment.cliqueCheckPayment();
        payment.cliquePaypalExpress();
        payment.cliqueCashOnDelivery();
        payment.cliquePlaceOrder();
        payment.cliqueOrderDetails();
    }
}

