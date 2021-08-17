
package ex3.poov;


public class Funcionario {
    String cpf;
    String nome;
    String funcao;
    float salario;
    public void mostraFun(){
            System.out.println("Funcionário de nome: "+this.nome);
            System.out.println("CPF:"+this.cpf);
            System.out.println("Função: "+this.funcao);
            System.out.println("Seu salário é de R$ "+this.salario);
}
    
}
