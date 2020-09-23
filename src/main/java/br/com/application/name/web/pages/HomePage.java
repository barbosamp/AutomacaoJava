package br.com.application.name.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "welcome-button-sign-in")
    private WebElement btnEntrar;

    public WebElement getBtnEntrar() {
        return btnEntrar;
    }
}
