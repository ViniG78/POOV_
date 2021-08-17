
package exercicio4;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        int vet[],j, soma;
        vet = new int [5];
        Scanner entrada = new Scanner(System.in);
        for(int i =0; i<5;i++){
            System.out.println("\n Vet ("+i+"): ");
            vet[i] = entrada.nextInt();
        }
         j = soma  = 0;
        while(j <5){
            soma = soma + vet[j];
            j++;
            System.out.println(soma);
        }
    }
    
}
