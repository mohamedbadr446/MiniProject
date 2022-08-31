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

    //Shipping page
    public static final String shippingAdd="//a[text()='shipping and billing addresses']";
    public static final String edit="//h3[text() = 'Shipping Address']//following-sibling::a";

    //MyAccount Page
    public static final String logoHome="//img[contains(@title,'Automation Practice Site')]";
    public static final String verifHome="//h2[contains(text(),'new arrivals')]";

}
