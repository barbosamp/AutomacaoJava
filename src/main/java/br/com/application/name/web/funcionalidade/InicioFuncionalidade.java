package br.com.application.name.web.funcionalidade;

import br.com.application.name.commons.BaseTest;
import br.com.application.name.web.pages.HomePage;
import br.com.application.name.web.pages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InicioFuncionalidade extends BaseTest {

    private HomePage homePage;
    private LoginPage loginPage;

    public InicioFuncionalidade(){
        this.homePage = new HomePage(webDriver);
        this.loginPage = new LoginPage(webDriver);
    }

    public void acessaRegistroNovoUsuario(){
        this.homePage.getBtnEntrar().click();
        wait.until(ExpectedConditions.visibilityOf(this.loginPage.getLnkCadastreSe()));
        this.loginPage.getLnkCadastreSe().click();
    }

    public void acessaLoginUsuario(){
//        this.homePage.getBtMyAccount().click();
//        addEvidenciaWeb("Acessando tela de login.");
//        this.homePage.getBtLogin().click();
//        wait.until(ExpectedConditions.visibilityOf(this.loginPage.getEmailAddress()));
//        addEvidenciaWeb("Tela de login.");
    }

    public void logout(){
//        wait.until(ExpectedConditions.visibilityOf(this.homePage.getLblLogoInicial()));
//        this.homePage.getBtMyAccount().click();
//        addEvidenciaWeb("Realizar Logout!");
//        this.homePage.getBtLogout().click();
//        addEvidenciaWeb("Logout Realizado!");
    }


}
