#language: pt
#encoding: UTF-8
#author: Marcos Barbosa


  Funcionalidade: Cadastro de usuário

    @web @cadastro
    Cenario: Validar cadastro de usuário com sucesso

      Dado que acesso a pagina inicial do sistema
      E acesso a tela de registro
      E preencho os dados validos de cadastro
      Entao visualizo a mensagem "Your Account Has Been Created!"
      E realizo logout no sistema
