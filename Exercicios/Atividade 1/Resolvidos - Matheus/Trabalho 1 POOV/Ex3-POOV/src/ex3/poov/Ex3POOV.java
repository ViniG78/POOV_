package ex3.poov;
import java.util.Scanner;
import java.util.ArrayList;


public class Ex3POOV {

    
    public static void main(String[] args) {
        float salarionovo;
        Scanner ler = new Scanner(System.in);
        ArrayList<Funcionario> listaFun = new ArrayList();
        Funcionario f1;
        
        int opc = 0;
        while (opc!=3){
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Mostrar Funcionários");
            System.out.println("3 - Sair");
            opc = ler.nextInt();
            switch(opc){
                case 1:
                    f1 = new Funcionario();
                    System.out.println("Digite o CPF do funcionário ");
                    f1.cpf = ler.next();
                    while (f1.cpf.length()!= 11){
                        System.out.println("CPF Inválido.");
                        f1.cpf = ler.next();
                        
                    }
                    System.out.println("Digite o nome do funcionário");
                    f1.nome = ler.next();
                    System.out.println("Digite a função do funcionário:");
                    f1.funcao = ler.next();
                    System.out.println("Digite o salário: R$");
                    f1.salario = ler.nextFloat();
                    while (f1.salario < 1100){
                        System.out.println("Salário errado. Pagamos mais.");
                        f1.salario = ler.nextFloat();
                    }
                    if (f1.funcao.equals("Supervisor") || f1.funcao.equals("supervisor")){
                        f1.salario = (f1.salario * 112) / 100;
                       
                    }
                    
                    listaFun.add(f1);
                    break;
                case 2:
                    for (int i = 0; i<listaFun.size(); i++){
                        f1 = listaFun.get(i);
                        f1.mostraFun();
                        
                    }
                    break;
            }
        }
        
    }
}

    