package Constante;

public class Xpaths {

    //MyAccount
    public static final String myAccount="//a[contains(text(),'My Account')]";

    //Login Page
    public static final String login_username="//input[@name='username']";
    public static final String login_pwd="//input[@name='password']";
    public static final String login_button="//input[@name='login']";
    public static final String pageLoginVF="//a[contains(text(),'Dashboard')]";
    public static final String msgError="//li[contains(text(),': the password you entered for the username ')]";

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

    //Payment Page
   public static final String shopPay="//li[@id='wpmenucartli']";
   public static final String updateBasket="//input[@name='update_cart']";
   public static final String checkout="//a[@class='checkout-button button alt wc-forward']";

}
