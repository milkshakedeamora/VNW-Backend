programa{
  real saldo = 300
  inteiro userDefault = 123456
  inteiro passDefault = 654321
  //FUNÇÃO DE TROCAR SENHA 
   funcao trocarSenha(){
    inteiro novaSenha
    escreva("Digite sua nova senha: ")
    leia(novaSenha)
    passDefault = novaSenha    
    limpa()
    escreva("Senha atualizada com sucesso!\n")
  }

  //FUNÇÃO PARA SAIR
  funcao sair(){
    limpa()
    escreva("Obrigado por utilizar nossos serviços.")
  }
  //FUNÇÃO PARA VER SALDO
   funcao saldo(){
    //inteiro opcao
    limpa()
    escreva("Saldo disponível: R$"+ saldo )

   
  }

  //FUNÇÃO PARA DEPOSITAR 

  funcao deposito(){
    
    real deposito
    inteiro opcao 
    escreva("Informe a quantia que você gostaria de depositar: \n")
    leia(deposito)
    saldo+=deposito //saldo = saldo - saque
    escreva("Você agora tem R$"+ saldo)

   
  }

  //FUNCAO PARA SACAR
  funcao saque(){
   
    real saque
    inteiro opcao 
    escreva("Informe a quantia que você gostaria de sacar: \n")
    leia(saque)
    se(saque>saldo){
      escreva("Saque Indisponivel. \n")
    }senao{
      saldo -= saque //saldo = saldo - saque
      escreva("Saque com Sucesso. \n")

    }
    
    escreva("Você agora tem R$"+ saldo)
  
  }

 //FUNÇÃO PRINCIPAL DO BANCO 
  funcao mainBanco(){
    inteiro opcao
       
    faca {
      escreva("1. Depósitos\n2. Saque\n3. Saldo\n4. Trocar senha\n5. Sair\n Opção:")
      leia(opcao)
      escolha(opcao){
      caso 1:
      deposito()
            
      pare
      caso 2:
      saque()  
          
      pare
      caso 3:
      saldo()
      
       pare
      caso 4: 
        trocarSenha()
      pare
      caso 5:        
      sair()
      
      pare
      caso contrario:
      limpa()
      escreva("Opção invalida.\n")

      pare
      }
      se(opcao < 5 e opcao >0){
        escreva("\nVoçê gostaria de fazer alguma outra transação?\n1. Sim\n2. Não\n")
      leia(opcao)
  
     se(opcao == 1){
      limpa()
    }senao se (opcao == 2){
      limpa()
      sair()
      opcao = 5
    }senao{
      limpa()
      escreva("Opcao inválida\n")
      
    }

      }
     

    }enquanto(opcao !=5)

    

   
   
  }
  funcao inicio(){
    login()
  }
  
  funcao login(){       
    inteiro usuario
    inteiro senha

    enquanto((usuario != userDefault) ou (senha != passDefault)){
      escreva("Digite sua conta: ")
      leia(usuario)
      escreva("Digite sua senha:")
      leia(senha)
      se(usuario ==  userDefault e senha == passDefault){
        limpa()
        mainBanco()
        retorne
               
      }senao{
        limpa()
         escreva("Credenciais incorretas, tente novamente!\n")
      }
    }
  }
}
   

  
  
 
