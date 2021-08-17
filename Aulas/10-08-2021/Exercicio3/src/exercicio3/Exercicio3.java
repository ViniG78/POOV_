
package exercicio3;
import java.util.Scanner;
public class Exercicio3 {

    public static void main(String[] args) {
        double a,b,c,delta, x1,x2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n Digite o valor de a: ");
        a = entrada.nextDouble();
        System.out.println("\n Digite o valor de b: ");
        b = entrada.nextDouble();
        System.out.println("\n Digite o valor de c: ");
        c = entrada.nextDouble();
        delta = Math.pow(b, 2) - (4*a*c);
        if(delta > 0 ){
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("X1 = " + x1+ " X2 = "+ x2);
        }else if (delta == 0 ){
             x1 = (-b + Math.sqrt(delta)) / (2*a);
             System.out.println("X1 = " + x1);
        }else{
            System.out.println("\n Função invalida, delta menor que 0");
        }
        
        
    }
    
}
