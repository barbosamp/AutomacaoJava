package br.com.appName.steps.web;


import br.com.application.name.commons.BaseTest;
import br.com.application.name.web.funcionalidade.InicioFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;

public class InitTestStep extends BaseTest {

    private InicioFuncionalidade inicioFuncionalidade;

    public InitTestStep() {
        this.inicioFuncionalidade = new InicioFuncionalidade();
    }


    @Dado("^que acesso a pagina inicial do sistema$")
    public void queAcessoAPaginaInicialDoSistema() {
            }

    @E("^realizo logout no sistema$")
    public void realizoLogoutNoSistema() {
        this.inicioFuncionalidade.logout();
    }
}
