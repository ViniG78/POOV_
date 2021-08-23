package banco;

import java.util.Scanner;

public class BAnco {

    public static void main(String[] args) {
       ContaBancaria conta[] = null;
       Scanner entrada = new Scanner (System.in);
       double saque = 0; 
       int opc =0;
       while(opc != 5){
           System.out.println("1 - Cadastrar Conta");
           System.out.println("2 - Realizar saque:");
           System.out.println("3 - Realizar deposito");
           System.out.println("4 - Mostrar conta");
           System.out.println("5 - Sair");
           opc = entrada.nextInt();
           switch(opc){
               case 1:
                   if(conta == null){
                       conta = new ContaBancaria[4];
                       for (int x = 0 ; x<4; x++){
                            conta[x] = new ContaBancaria();
                            System.out.println("["+x+"} Numero: ");
                            conta[x].numero = entrada.next();
                            System.out.println("["+x+"}Senha: ");
                            conta[x].senha = entrada.next();
                            System.out.println("["+x+"}Proprietario");
                            conta[x].proprietario = entrada.next();
                            System.out.println("["+x+"}Saldo");
                            conta[x].saldo = entrada.nextDouble();
                            System.out.println("["+x+"}Cheque especial");
                            conta[x].limitecheque = entrada.nextDouble();
                            conta[x].iniCheque = conta[x].limitecheque;
                       }
                       
                   }else{ 
                       System.out.println("Conta ja criada.");
                   }
                   break;
               case 2:
                   System.out.println("Fazendo saque");
                   System.out.println("Digite o valor: ");
                   saque = entrada.nextDouble();
                   if(conta.sacarDinheiro(saque)){
                       System.out.println("Saque realizado com sucesso!");
                    }else{
                       System.out.println("saldo insuficiente!");
                    }
                   break;
               case 3:
                   System.out.println("Fazendo deposito!");
                   System.out.println("Digite o valor");
                   saque = entrada.nextDouble();
                   if(conta.depositar(saque)){
                       System.out.println("Deposito realizado");
                   }else{
                       System.out.println("Não realizado");
                   }
                   break;
               case 4 : 
                   for (int x = 0 ; x<4; x++){
                        System.out.println(conta[x].saldo);
                        System.out.println(conta[x].limitecheque);
                        System.out.println("Conta mostrada");
                   }
                   
           
           }
          
       }
    }
    
}
