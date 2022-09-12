package Constante;

public class Xpaths {

    //MyAccount
    public static final String myAccount="//a[contains(text(),'My Account')]";
    public static final String logOut="//a[contains(text(),'Logout')]";

    //Login Page
    public static final String login_username="//input[@name='username']";
    public static final String login_pwd="//input[@name='password']";
    public static final String login_button="//input[@name='login']";
    public static final String pageLoginVF="//a[contains(text(),'Dashboard')]";
    public static final String msgError="//li[contains(text(),': the password you entered for the username ')]";
    public static final String accountDetail="//a[contains(text(),'Account Details')]";

    //Register Page
    public static final String email_reg="//input[@id='reg_email']";
    public static final String pwd_reg="//input[@id='reg_password']";
    public static final String button_reg="//input[@name='register']";
    public static final String zone_reg="//p[@class='woocomerce-FormRow form-row']";
    public static final String verifierpwd="//div[contains(text(),'Strong')]";
    public static final String pagereg="//p[contains(text(),'Hello')]";

    //Shipping page
    public static final String shippingAdd="//a[text()='shipping and billing addresses']";
    public static final String edit="//h3[text() = 'Shipping Address']//following-sibling::a";

    //MyAccount Page
    public static final String logoHome="//img[contains(@title,'Automation Practice Site')]";
    public static final String verifHome="//h2[contains(text(),'new arrivals')]";

    //Pannier Page
    public static final String Pannier="//a[contains(@Class,'wpmenucart-contents')]";
    public static final String check_prod="//a[text()='Mastering JavaScript']";
    public static final String shop="//a[contains(text(),'Shop')]";
    public static final String produit="//h3[contains(text(),'"+JDD.produit+"')]";
    public static final String addToBasket="//a[contains(text(),'Add to basket')and @data-product_id='165']";
    public static final String viewBasket="//a[contains(text(),'View Basket')]";
    public static final String price="//h3[contains(.,'"+JDD.produit+"')]/following-sibling::span[contains(@class,'price')]";
    public static final String pricePannie="//td[contains(@data-title,'Price')]//child::span[contains(@class,'woocommerce-Price-amount amount')]";

    //Payment Page
   public static final String shopPay="//li[@id='wpmenucartli']";
   public static final String updateBasket="//input[@name='update_cart']";
   public static final String checkout="//a[@class='checkout-button button alt wc-forward']";
   public static final String checkPayments="//input[@id='payment_method_cheque']";
   public static final String cashOnDelivery="//input[@id='payment_method_cod']";
   public static final String paypalExpress="//input[@id='payment_method_ppec_paypal']";
   public static final String placeOrder="//input[@id='place_order']";
   public static final String orderDetails="//h2[contains(text(),'Order Details')]";

    //AccountDetail
    public static final String currentPwd="//input[contains(@id,'password_current')]";
    public static final String newPwd="//input[contains(@id,'password_1')]";
    public static final String conNewPwd="//input[contains(@id,'password_2')]";
    public static final String saveChange="//input[contains(@value,'Save changes')]";
    public static final String vrfMsgChangPwd="//div[contains(text(),'Account details changed successfully.')]";




}
