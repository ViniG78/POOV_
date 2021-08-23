package principal;
import java.util.ArrayList;
import java.util.Scanner;
public class Principal 
{
    public static void main(String[] args) 
    {
        /*Funcionario f = new Funcionario();
        f.setCpf("072");
        System.out.print("CPF: "+f.getCpf());*/
        int opc = 0;
        ArrayList <Funcionario> listaFuncionarios = new ArrayList();
        Scanner entrada = new Scanner (System.in);
        while(opc != 6)
        {
            System.out.print("\n --- MENU --- ");
            System.out.print("\n 1- Inserir funcionários");
            System.out.print("\n 2- Mostrar funcionários");
            System.out.print("\n 3- Verificação do CPF");
            System.out.print("\n 4- Verificação do salário mínimo");
            System.out.print("\n 5- Aumento de 12% para todos supervisores");
            System.out.print("\n 6- Sair \n -> ");
            opc = entrada.nextInt();
            switch(opc)
            {
                case 1:
                    Funcionario novoFunc = new Funcionario(); //Instanciar.
                    System.out.print("\n CPF: ");
                    // String cpf = entrada.next();
                    // novoFunc.setCpf(cpf);
                    novoFunc.setCpf(entrada.next());
                    System.out.print(" Nome: ");
                    novoFunc.setNome(entrada.next());
                    System.out.print(" Função: ");
                    novoFunc.setFuncao(entrada.next());
                    System.out.print(" Salário: ");
                    novoFunc.setSalario(entrada.nextDouble());
                    listaFuncionarios.add(novoFunc);
                break;
                case 2:
                    for(int i=0; i< listaFuncionarios.size();i++)    
                    {
                        Funcionario fMostra;
                        fMostra = listaFuncionarios.get(i);
                        System.out.print("\n Cpf: "+fMostra.getCpf());
                        System.out.print("\n Nome: "+fMostra.getNome());
                        System.out.print("\n Função: "+fMostra.getFuncao());
                        System.out.print("\n Salário: "+fMostra.getSalario());
                        System.out.print("\n --- ");
                    }
                break;
                case 3:
                    /*for(int i=0; i< listaFuncionarios.size();i++)    
                    {
                        if(listaFuncionarios.get(i).getCpf().length() != 11)
                        {
                            System.out.print("\n O funcionário "+listaFuncionarios.get(i).getNome()+" não possui CPF com 11 dígitos.");
                        }else{
                             System.out.print("\n O funcionário "+listaFuncionarios.get(i).getNome()+" possui CPF com 11 dígitos.");
                        }
                    }*/
                    for(int i=0; i< listaFuncionarios.size();i++)    
                    {
                        if(listaFuncionarios.get(i).verificarPadraoCPF())
                        {
                            System.out.print("\n O funcionário "+listaFuncionarios.get(i).getNome()+" não possui CPF com 11 dígitos.");
                        }else{
                            System.out.print("\n O funcionário "+listaFuncionarios.get(i).getNome()+" possui CPF com 11 dígitos.");
                        }
                    }
                break;
                case 4:
                    for(int i=0; i< listaFuncionarios.size();i++)    
                    {
                        if(listaFuncionarios.get(i).verificarSalarioMinimo())
                        {
                            System.out.print("\n O salário do funcionário "+listaFuncionarios.get(i).getNome()+" está conforme a legislação.");
                        }else{
                            System.out.print("\n O salário do funcionário "+listaFuncionarios.get(i).getNome()+" não está conforme a legislação.");
                        }
                    }
                break;
                case 5:
                    for(int i=0; i< listaFuncionarios.size();i++)    
                    {
                        listaFuncionarios.get(i).aumentarSalarioSup();
                    }
                break;
            }
        }
    }
}
