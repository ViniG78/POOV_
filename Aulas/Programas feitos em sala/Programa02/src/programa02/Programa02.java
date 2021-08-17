package programa02;
import java.util.Scanner;
public class Programa02 
{
    public static void main(String[] args) 
    {
        int valor;
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n Digite o valor: ");
        valor = entrada.nextInt();
        if((valor % 2)==0)
        {
            System.out.print(" É par");
        }else{
            System.out.print(" É ímpar");
        }
    }  
}
