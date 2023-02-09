package POM;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
public LoginPage() {
PageFactory.initElements(driver, this);
}
@FindBy(id="sTestEmail")
public WebElement txtBoxMail;
@FindBy(id="sTestPassword")
public WebElement txtBoxPass;
@FindBy(id="sTestLoginBtn")
public WebElement btnLogin;
public WebElement getTxtBoxMail() {
	return txtBoxMail;
}
public void setTxtBoxMail(WebElement txtBoxMail) {
	this.txtBoxMail = txtBoxMail;
}
public WebElement getTxtBoxPass() {
	return txtBoxPass;
}
public void setTxtBoxPass(WebElement txtBoxPass) {
	this.txtBoxPass = txtBoxPass;
}
public WebElement getBtnLogin() {
	return btnLogin;
}
public void setBtnLogin(WebElement btnLogin) {
	this.btnLogin = btnLogin;
}

}
