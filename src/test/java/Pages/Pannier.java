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
    @FindBy(xpath = "//h2[contains(text(),'Basket ')]")
    private WebElement xpath_Basket;

    public Pannier(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void clickPanier() {
        clickElement(panier);
    }




    public void verfierPagePannier(String verf) {
        checkElement(xpath_Basket,verf);
    }

}
