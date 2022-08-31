package Pages;

import Utils.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage extends Tools {

        //	MyAccount
        @FindBy(xpath = "//a[contains(text(),'My Account')]")
        private WebElement myAccount;

        @FindBy(xpath = "//a[text()='shipping and billing addresses']")
        private WebElement ShippingAdd;
        // Edit
        @FindBy(xpath = "//h3[text() = 'Shipping Address']//following-sibling::a")
        private WebElement Edit;

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
            clickElement(Edit);
        }
        public void checkShippingPage(){checkElement(Title, "Shipping Address");}
}
