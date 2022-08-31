package Pages;

import Utils.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pannier extends Tools {
    public WebElement driver;

    @FindBy(xpath = "//a[contains(@Class,'wpmenucart-contents')]")
    private WebElement panier;
   // @FindBy(xpath = "//h2[contains(text(),'Basket ')]")
   //
    @FindBy(xpath = "//a[text()='Mastering JavaScript']")
    private WebElement Check_Prod;
    @FindBy(xpath = "//a[contains(text(),'Shop')]")
    private  WebElement xpath_Shop;
    @FindBy(xpath = "//h3[contains(text(),'Mastering JavaScript')]")
    private WebElement xpath_Produit;
    @FindBy(xpath = "//a[contains(text(),'Add to basket')and @data-product_id='165']")
    private WebElement xpath_AddToBasket;


    public Pannier(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public void clickShop(){ clickElement(xpath_Shop);}
    public void clickProduit(){ clickElement(xpath_Produit);}
    public void clickAddToBasket(){ clickElement(xpath_AddToBasket);}



    public void clickPanier() {
        clickElement(panier);
    }




    public void verfierPagePannier(String verf) {
        checkElement(Check_Prod,verf);
    }


}
