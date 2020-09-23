package br.com.application.name.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "login-mail-input-email")
    private WebElement emailAddress;

    @FindBy(xpath = "//div[@class='css-f3p41-container']/following-sibling::div[1]")
    private WebElement password;

    @FindBy(id = "login-mail-button-sign-in")
    private WebElement btLogin;

    @FindBy(id = "create-account-link")
    private WebElement lnkCadastreSe;

    public WebElement getEmailAddress() {
        return emailAddress;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getBtLogin() {
        return btLogin;
    }

    public WebElement getLnkCadastreSe() {
        return lnkCadastreSe;
    }
}
