programa{
  real saldo = 300
  inteiro userDefault = 123456
  inteiro passDefault = 654321
  //FUN��O DE TROCAR SENHA 
   funcao trocarSenha(){
    inteiro novaSenha
    escreva("Digite sua nova senha: ")
    leia(novaSenha)
    passDefault = novaSenha    
    limpa()
    escreva("Senha atualizada com sucesso!\n")
  }

  //FUN��O PARA SAIR
  funcao sair(){
    limpa()
    escreva("Obrigado por utilizar nossos servi�os.")
  }
  //FUN��O PARA VER SALDO
   funcao saldo(){
    //inteiro opcao
    limpa()
    escreva("Saldo dispon�vel: R$"+ saldo )

   
  }

  //FUN��O PARA DEPOSITAR 

  funcao deposito(){
    
    real deposito
    inteiro opcao 
    escreva("Informe a quantia que voc� gostaria de depositar: \n")
    leia(deposito)
    saldo+=deposito //saldo = saldo - saque
    escreva("Voc� agora tem R$"+ saldo)

   
  }

  //FUNCAO PARA SACAR
  funcao saque(){
   
    real saque
    inteiro opcao 
    escreva("Informe a quantia que voc� gostaria de sacar: \n")
    leia(saque)
    se(saque>saldo){
      escreva("Saque Indisponivel. \n")
    }senao{
      saldo -= saque //saldo = saldo - saque
      escreva("Saque com Sucesso. \n")

    }
    
    escreva("Voc� agora tem R$"+ saldo)
  
  }

 //FUN��O PRINCIPAL DO BANCO 
  funcao mainBanco(){
    inteiro opcao
       
    faca {
      escreva("1. Dep�sitos\n2. Saque\n3. Saldo\n4. Trocar senha\n5. Sair\n Op��o:")
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
      escreva("Op��o invalida.\n")

      pare
      }
      se(opcao < 5 e opcao >0){
        escreva("\nVo�� gostaria de fazer alguma outra transa��o?\n1. Sim\n2. N�o\n")
      leia(opcao)
  
     se(opcao == 1){
      limpa()
    }senao se (opcao == 2){
      limpa()
      sair()
      opcao = 5
    }senao{
      limpa()
      escreva("Opcao inv�lida\n")
      
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
   

  
  
 
