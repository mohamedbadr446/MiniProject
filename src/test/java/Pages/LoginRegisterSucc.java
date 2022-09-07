package Pages;

import Constante.Xpaths;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginRegisterSucc extends Tools {



	@FindBy(xpath = Xpaths.myAccount)
	private WebElement myAccount;

	@FindBy(xpath = Xpaths.email_reg)
	private WebElement email_reg;

	@FindBy(xpath = Xpaths.pwd_reg)
	private WebElement pwd_reg;

	@FindBy(xpath = Xpaths.button_reg)
	private WebElement button_reg;
	@FindBy(xpath = Xpaths.zone_reg)
	private WebElement zone_reg;
	@FindBy(xpath = Xpaths.verifierpwd)
	private WebElement verifier_pwd;
	@FindBy(xpath = Xpaths.pagereg)
	private WebElement page_reg;
	@FindBy(xpath = Xpaths.logoHome)
	private WebElement logo;


	public LoginRegisterSucc(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void clickMyaccount() {
		clickElement(myAccount);
	}

	public void insertRegisterEmail(String email) {
		insertElement(email_reg,email);
	}

	public void insertRegisterPwd(String pwd) {
		insertElement(pwd_reg,pwd);
	}

	public void clickZoneRegister() {
		clickElement(zone_reg);

	}

	public void clickButtonRegister() {
		clickElement(button_reg);
	}

	public void verfierPwdSucc(String text) {
		checkElement(verifier_pwd,text);
	}

	public void verfierPageReg(String text) {
		checkElement(page_reg,text);
	}
	public void verifierLogo()
	{

		if(logo.isEnabled()){
			System.out.println("OK Logo");
		}else {
			System.out.println("KO Logo");
		}

	}

}
