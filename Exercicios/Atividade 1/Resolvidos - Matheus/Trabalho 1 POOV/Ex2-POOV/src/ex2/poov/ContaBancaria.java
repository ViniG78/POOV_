package ex2.poov;


public class ContaBancaria {
    String numero;
    String contadigitada;
    String senha;
    String proprietario;
    double saldo;
    double limitecheque;
    double valorsaque;
    double valordeposito;
    void mostraconta(){
        System.out.println("O proprietário é:"+this.proprietario);
        System.out.println("O número da conta é: "+this.numero);
        System.out.println("O saldo é de R$"+this.saldo);
        System.out.println("O limite de cheque especial é R$"+this.limitecheque);
    }
    
}
