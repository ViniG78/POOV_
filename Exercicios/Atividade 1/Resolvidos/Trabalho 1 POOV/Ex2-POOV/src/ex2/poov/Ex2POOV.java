package ex2.poov;
import java.util.Scanner;


public class Ex2POOV {

    
    public static void main(String[] args) {
        String valorconta;
        String conta2;
        ContaBancaria cnova2 = new ContaBancaria();
        String senha1;
        double valortransferencia;
        ContaBancaria cnova = new ContaBancaria();
        Scanner ler = new Scanner(System.in);
        ContaBancaria c1[] = new ContaBancaria[4];
        for (int i = 0; i<4;i++){
            c1[i] = new ContaBancaria();
        
        }
       
        int opc = 0;   
        while (opc != 6){
            System.out.println("1 - Abrir conta");
            System.out.println("2 - Realizar Saque");
            System.out.println("3 - Realizar Depósito");
            System.out.println("4 - Mostrar Conta");
            System.out.println("5 - Transferência Entre Contas");
            System.out.println("6 - Sair");
            opc = ler.nextInt();
            switch (opc){
                case 1:
                    for (int i = 0; i<4; i++){
                    System.out.println("Qual o nome de quem vai abrir a conta?");
                    c1[i].proprietario = ler.next();
                    System.out.println("Digite o numero que deseja ser de sua conta:");
                    c1[i].numero = ler.next();
                    System.out.println("Digite uma senha para sua conta:");
                    c1[i].senha = ler.next();
                    System.out.println("Digite o saldo:");
                    c1[i].saldo = ler.nextDouble();
                    System.out.println("Digite o limite do cheque especial:");
                    c1[i].limitecheque = ler.nextDouble();
                    }
                    break;
                case 2:
                    System.out.println("Digite a conta que quer realizar o saque:");
                    valorconta = ler.next();
                    cnova = pegaconta(c1,valorconta);
                    if(cnova==null){
                        System.out.println("Conta Errada.");
                        break;     
                    }
                    System.out.println("Digite a senha de sua conta:");
                    senha1 = ler.next();
                    if(!cnova.senha.equals(senha1)){
                        System.out.println("SENHA ERRADA!");
                        break;
                    }
                    System.out.println("Digite o valor que quer sacar:");
                    cnova.valorsaque = ler.nextDouble();
                    cnova.saldo = cnova.saldo - cnova.valorsaque;
                    System.out.println("Seu saldo agora é de R$"+cnova.saldo);
                    break;
                case 3:
                    System.out.println("Digite a conta que deseja depositar:");
                    valorconta = ler.next();
                    cnova = pegaconta(c1,valorconta);
                    if (cnova == null){
                        System.out.println("Conta errada");
                        break;
                    }
                    System.out.println("Digite o valor que quer depositar em sua conta:");
                    cnova.valordeposito = ler.nextDouble();
                    cnova.saldo = cnova.saldo + cnova.valordeposito;
                    System.out.println("Seu saldo agora é de R$"+cnova.saldo);
                case 4:
                    for (int i = 0; i<4; i++){
                    c1[i].mostraconta();
                    }
                    break;
                case 5:
                    System.out.println("Digite a conta que vai enviar a transferência:");
                    valorconta = ler.next();
                    cnova = pegaconta(c1,valorconta);
                    if(cnova==null){
                        System.out.println("Conta Errada.");
                        break;     
                    } System.out.println("Digite a senha de sua conta:");
                    senha1 = ler.next();
                    if(!cnova.senha.equals(senha1)){
                        System.out.println("SENHA ERRADA!");
                        break;
                    }
                    System.out.println("Digite a conta que vai receber a transferência:");
                    conta2 = ler.next();
                    cnova2 = pegaconta(c1,conta2);
                    if (cnova2 == null){
                        System.out.println("Conta errada.");
                        break;
                    }
                    System.out.println("Quanto quer transferir ?");
                    valortransferencia = ler.nextDouble();
                    cnova.saldo = cnova.saldo - valortransferencia;
                    cnova2.saldo = cnova2.saldo + valortransferencia;
                    System.out.println("Transferência Realizada com sucesso!");
                    break;
                    
                    
                    
                    
                
            }
        }
        }
 public static ContaBancaria pegaconta(ContaBancaria c1[],String numero){
     for (int i = 0; i<4;i++){
         if (c1[i].numero.equals(numero)){
             return c1[i];
         }else if (i == 4){
             return null;
             
         }
     }return null;
     
 }   
}
