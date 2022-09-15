package Pages;

import Connexion.SetUp;
import Constante.Xpaths;
import Utils.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends Tools {

    @FindBy (xpath = Xpaths.shopPay)
    WebElement ShopPay;

    @FindBy (xpath = Xpaths.updateBasket)
    WebElement UpdateBasket;

    @FindBy (xpath = Xpaths.checkout)
    WebElement CheckOut;

    @FindBy (xpath = Xpaths.checkPayments)
    WebElement CheckPayment;

    @FindBy (xpath = Xpaths.paypalExpress)
    WebElement PaypalExpress;

    @FindBy (xpath = Xpaths.cashOnDelivery)
    WebElement CashOnDelivery;

    @FindBy (xpath = Xpaths.placeOrder)
    WebElement PlaceOrder;

    @FindBy (xpath = Xpaths.orderDetails)
    WebElement OrderDetails;

    private WebElement logo;

    WebDriver driver;

    int time=30;

    public PaymentPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void cliqueShopPay()
    {
        clickElement(ShopPay);
    }

    public void cliqueUpdateBasket()
    {
        clickElement(UpdateBasket);
    }

    public void cliqueCheckOut()
    {
        clickElement(CheckOut);
    }

    public void cliqueCheckPayment()
    {
        clickElement(CheckPayment);
    }

    public void cliquePaypalExpress()
    {
        clickElement(PaypalExpress);
    }

    public void cliqueCashOnDelivery()
    {
        clickElement(CashOnDelivery);
    }

    public void cliquePlaceOrder()
    {
        clickElement(PlaceOrder);
    }

    public void cliqueOrderDetails()
    {
        clickElement(OrderDetails);
    }


}
