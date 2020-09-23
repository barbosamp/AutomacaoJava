package br.com.application.name.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistroPage {


    public RegistroPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "signup-form-input-name")
    private WebElement inputNome;

    @FindBy(id = "signup-form-input-email")
    private WebElement inputEmail;

    @FindBy(id = "signup-form-input-phone")
    private WebElement inputTelephone;

    @FindBy(id = "signup-form-input-password")
    private WebElement inputPassword;

    @FindBy(id = "signup-form-input-document")
    private WebElement inputCpf;

    @FindBy(id = "signup-form-input-age")
    private WebElement inputIdade;

    @FindBy(id = "sign-up-form-input-terms")
    private WebElement checkTermos;

    @FindBy(id = "signup-form-button-signup")
    private WebElement btnCriar;


    public WebElement getInputNome() {
        return inputNome;
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getInputTelephone() {
        return inputTelephone;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public WebElement getInputCpf() {
        return inputCpf;
    }

    public WebElement getInputIdade() {
        return inputIdade;
    }

    public WebElement getCheckTermos() {
        return checkTermos;
    }

    public WebElement getBtnContinue() {
        return btnCriar;
    }

    public WebElement getBtnCriar() {
        return btnCriar;
    }
}
