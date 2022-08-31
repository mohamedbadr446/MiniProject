package Pages;

import Constante.Xpaths;
import Utils.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage extends Tools {

        //	MyAccount
        @FindBy(xpath = Xpaths.myAccount)
        private WebElement myAccount;

        @FindBy(xpath = Xpaths.shippingAdd)
        private WebElement ShippingAdd;
        // Edit
        @FindBy(xpath = Xpaths.edit)
        private WebElement edit;

        @FindBy(xpath = "//h3[text() = 'Shipping Address']")
        private WebElement Title;

        public ShippingPage(WebDriver driver) {
            this.driver=driver;
            PageFactory.initElements(driver,this);
        }
        public void clickMyAccount() {
            clickElement(myAccount);
        }
        public void clickShipping() {
            clickElement(ShippingAdd);
        }
        public void clickEdit() {
            clickElement(edit);
        }
        public void checkShippingPage(){checkElement(Title, "Shipping Address");}
}
