package programa09;
import java.util.ArrayList;
import java.util.Scanner;
public class Principal 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner (System.in);
        /*Pessoa seilaquem; //Defini o seilaquem: meu objeto!
        seilaquem = new Pessoa(); // Aloquei memória para o seilaquem.
        // Objeto: personificação daquilo que é definido na classe.
        System.out.print("\n Digite o nome: ");
        seilaquem.nome = entrada.next();
        System.out.print("\n Digite a idade: ");
        seilaquem.idade = entrada.nextInt();
        System.out.print("\n O nome do meu objeto é "+seilaquem.nome);
        System.out.print("\n A idade do meu objeto é "+seilaquem.idade);
        seilaquem.correr();*/
        
        Pessoa listaPessoas[];          //1- Declarar.
        listaPessoas = new Pessoa[3];   //2- Definir quantas posições teremos
        for(int i=0; i<3;i++)
        {
            listaPessoas[i] = new Pessoa(); //3- Instanciar cada posição.
        }
        for(int i=0; i<3;i++)
        {
            System.out.print("\n --- ["+i+"] --- ");
            System.out.print("\n Digite o nome: ");
            //entrada.skip("\n");
            listaPessoas[i].nome = entrada.next();
            System.out.print("\n Digite a idade: ");
            listaPessoas[i].idade = entrada.nextInt();
        }
        for(int i=0; i<3;i++)
        {
            System.out.print("\n --- ["+i+"] --- ");
            System.out.print("\n Nome: "+listaPessoas[i].nome);
            System.out.print("\n Idade: "+listaPessoas[i].idade);
        }
        
        //Vetor dinâmico.
        ArrayList <Pessoa> listaDinamicaPessoas = new ArrayList();
        Pessoa p;
        int opc = 0;
        while(opc != 3)
        {
            System.out.print("\n MENU (Vetor dinâmico) ");
            System.out.print("\n 1- Inserir ");
            System.out.print("\n 2- Mostrar ");
            System.out.print("\n 3- Sair \n ->");
            opc = entrada.nextInt();
            switch(opc)
            {
                case 1:
                    p = new Pessoa();//Instanciar!
                    System.out.print("\n Digite o nome: ");
                    p.nome = entrada.next();
                    System.out.print("\n Digite a idade: ");
                    p.idade = entrada.nextInt();
                    listaDinamicaPessoas.add(p);
                break;
                case 2:
                    for(int i =0; i< listaDinamicaPessoas.size();i=i+1)
                    {
                        p = listaDinamicaPessoas.get(i);
                        System.out.print("\n "+p.nome);
                        System.out.print("\n "+p.idade);
                        if(p.nome.length()==11)
                        {
                            
                        }
                    }
                break;    
            }
            
        }
    }
}
