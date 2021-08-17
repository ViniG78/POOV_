package programa03;
import java.util.Scanner;
public class Programa03 
{
    public static void main(String[] args) 
    {
        double a, b, c, delta, x1, x2;
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n Digite o valor A: ");
        a = entrada.nextDouble();
        System.out.print("\n Digite o valor B: ");
        b = entrada.nextDouble();
        System.out.print("\n Digite o valor C: ");
        c = entrada.nextDouble();
        delta = Math.pow(b, 2) - (4*a*c);
        if(delta > 0) // Duas raizes reais diferentes
        {
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.print("\n X1= "+x1+" X2= "+x2);
        }
        if(delta == 0) // Duas raizes reais iguais
        {
            x1 = (-b + Math.sqrt(delta))/(2*a);
            System.out.print("\n X1 = X2 = "+x1);
        }
        if(delta < 0) // Não há raízes reais
        {
            System.out.print("\n Não há raízes reais");
        }
    }
}
