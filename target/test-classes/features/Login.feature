#language: pt
#encoding: UTF-8
#author: Marcos Barbosa


  Funcionalidade: Login

    @web @login
    Cenario: Realizar login no sistema com usuário válido

      Dado que acesso a pagina inicial do sistema
      E acesso a tela de login
      Quando insiro credenciais do tipo "valido"
      Entao visualizo a tela de My Account
