
package javaapplication5;
import java.util.Scanner;
public class JavaApplication5 {

    public static void main(String[] args) {
        int valor;
        Scanner entrada  = new Scanner(System.in);
        System.out.print("\n Digite o valor: ");
        valor = entrada.nextInt();
        if(valor % 2 == 0){
            System.out.println("\n È par meu parcero.");
        }else{
            System.out.println("\n È impar meu parcero");
        }
    }
    
}
