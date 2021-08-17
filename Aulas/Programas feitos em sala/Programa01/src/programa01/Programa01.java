package programa01;

import java.util.Scanner;

public class Programa01 
{
    public static void main(String[] args) 
    {
        int a, b, res;
        float x1, x2;
        double x,y,z;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("\n Olá mundo!"); //printf.
        System.out.print("\n Digite o valor A: ");
        a = entrada.nextInt(); //scanf.
        System.out.print("\n Digite o valor B: ");
        b = entrada.nextInt();
        res = a+b;
        System.out.print("\n A soma é "+res+" - Estou feliz!");
        if((res % 2)==0)
        {
            System.out.print("\n O resultado é par");
        }
        x = Math.sqrt(9);
        System.out.print("\n A raiz quadrada de 9 é "+x);
        y = Math.pow(2, 3);
        System.out.print("\n Dois ao cubo "+y);
    }
}
