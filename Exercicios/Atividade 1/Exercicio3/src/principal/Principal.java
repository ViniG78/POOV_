
package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
       int opc = 0;
       ArrayList<Funcionario> listaFuncionario = new ArrayList();
       Scanner entrada = new Scanner (System.in);
       while(opc != 6){
           System.out.println("Menu"); 
           System.out.println("1 - Inserir funcionario");
           System.out.println("2 - Mostrar funcionarios");
           System.out.println("3 - Verificar CPF");
           System.out.println("4 - Verificação do salario minimo");
           System.out.println("5 - Aumento de 12% dos supervisores");
           System.out.println("6 - Inserir sair");
           opc = entrada.nextInt();
           switch(opc){
               case 1: 
                   Funcionario novoFunc = new Funcionario();//Instanciar dentro do laço, caso seja instanciado fora ira sobreescrever os anteriores
                   System.out.println("Cpf: ");
                   novoFunc.setCpf(entrada.next());
                   System.out.println("Nome: ");
                   novoFunc.setNome(entrada.next());
                   System.out.println("Função: ");
                   novoFunc.setFuncao(entrada.next());
                   System.out.println("Salario: ");
                   novoFunc.setSalario(entrada.nextDouble());
                   listaFuncionario.add(novoFunc);
                   break;
               case 2:
                   for(int i=0; i < listaFuncionario.size(); i++){
                       Funcionario fMostra;
                       fMostra = listaFuncionario.get(i);
                       System.out.println("Nome: " + fMostra.getNome());
                       System.out.println("Cpf: " + fMostra.getCpf());
                       System.out.println("Função: " + fMostra.getFuncao());
                       System.out.println("Salario: " + fMostra.getSalario());
                       System.out.println("================");
                   }
                   break;
               case 3:
                   for (int i=0; i < listaFuncionario.size(); i++){
                       if(listaFuncionario.get(i).getCpf().length() != 11){
                           System.out.println("O funcioraio "+ listaFuncionario.get(i).getNome()+ " esta com o Cpf errado");
                       }else{
                           System.out.println("O funcioraio "+ listaFuncionario.get(i).getNome()+ " esta com o Cpf certo");
                       }
                   }
                   break;
               case 4: 
                   break;
           }
       }
    }
    
}
