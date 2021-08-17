package programa09;

import java.util.Scanner;

public class Programa09 
{
    public static void main(String[] args) 
    {
        Pessoa seilaquem; //Defini o seilaquem: meu objeto!
        Scanner entrada = new Scanner (System.in);
        seilaquem = new Pessoa(); // Aloquei memória para o seilaquem.
        // Objeto: personificação daquilo que é definido na classe.
        System.out.print("\n Digite o nome: ");
        seilaquem.nome = entrada.next();
        System.out.print("\n Digite a idade: ");
        seilaquem.idade = entrada.nextInt();
        System.out.print("\n O nome do meu objeto é "+seilaquem.nome);
        System.out.print("\n A idade do meu objeto é "+seilaquem.idade);
        seilaquem.correr();
    }
}
