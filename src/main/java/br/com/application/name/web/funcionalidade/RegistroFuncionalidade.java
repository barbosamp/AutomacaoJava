package br.com.application.name.web.funcionalidade;

import br.com.application.name.commons.BaseTest;
import br.com.application.name.web.pages.RegistroPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistroFuncionalidade extends BaseTest {

    private RegistroPage registroPage;

    public RegistroFuncionalidade() {
        this.registroPage = new RegistroPage(webDriver);
    }

    public void preencheFormulario(int idade){
        wait.until(ExpectedConditions.visibilityOf(this.registroPage.getInputNome()));
        this.registroPage.getInputNome().sendKeys(dataGenerator.getName());
        this.registroPage.getInputEmail().sendKeys(dataGenerator.getEmail());
        this.registroPage.getInputPassword().sendKeys(dataGenerator.getPassword());
        this.registroPage.getInputTelephone().sendKeys(dataGenerator.getTelephone());
        this.registroPage.getInputIdade().sendKeys(String.valueOf(idade));
        super.propertiesManager.setPropertieValue("EMAIL", dataGenerator.getEmail());
        super.propertiesManager.setPropertieValue("PASSWORD", dataGenerator.getPassword());
    }

    public void confirmaRegistro(boolean aceitarPolitica){
        if (aceitarPolitica)
            this.registroPage.getCheckTermos().click();
        this.registroPage.getBtnContinue().click();
    }

    public String retornaMensagemRegistro(){
        return "";
    }
}
