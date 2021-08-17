
package exercicio5;
import java.util.Scanner;
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vet[],j;
        vet = new int [10];
        double m = 0, somatorio = 0; 
        for(j=0;j<10;j++){
            System.out.print("\n Para o vetor na posição ["+(j+1)+"]: ");
            vet[j] = entrada.nextInt();
            m = m + vet[j];
        }
        m = m/10;
        System.out.println("\n A media é: "+m);
        for(j=0;j<10;j++){
            somatorio = somatorio + Math.pow(vet[j] - m,2);
        }
 
        somatorio = Math.sqrt(somatorio/9);
        System.out.println("Desvio Padrão: "+somatorio);
                
    }
    
}
