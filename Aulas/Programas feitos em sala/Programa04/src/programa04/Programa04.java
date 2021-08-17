package programa04;

import java.util.Scanner;

public class Programa04 
{
    public static void main(String[] args) 
    {
        int vet[], j, soma; //Eu digo que será um vetor
        vet = new int[5]; //Digo quantas posições teremos.
        Scanner entrada = new Scanner(System.in);
        for(int i=0; i<5 ; i++)
        {
            System.out.print("\n Vet["+i+"]: ");
            vet[i] = entrada.nextInt();
        }
        j = soma = 0;
        while(j<5)
        {
            soma = soma+ vet[j];
            j++;
        }
        System.out.println("\n A soma é "+soma);
    }
    
}
