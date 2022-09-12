package Utils;

import Connexion.SetUp;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;

public class Tools extends SetUp {


    private final int time=60;

    public Tools(){

    }

    public void clickElement(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
        System.out.println("OK"+element.toString());
    }
    public void insertElement(WebElement element,String text)
    {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
        System.out.println("OK"+element.toString());
    }
    public void checkElement(WebElement element,String text)
    {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOf(element));
        String textvf= element.getText();
        System.out.println(textvf);
        Assert.assertEquals(textvf,text);
        System.out.println("OK"+element.getText());

    }
}
