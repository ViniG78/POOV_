package programa05;
import java.util.Scanner;
public class Programa05 
{
    public static void main(String[] args) 
    {
        int vet[],i, n=2;
        vet = new int[10];
        double media, somatorio;
        Scanner entrada = new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            System.out.print("\n Digite o valor["+(i+1)+"]: ");
            vet[i] = entrada.nextInt();
        }
        media = 0;
        for(i=0;i<10;i++)
        {
            media = media + vet[i];
        }
        media = media / 10;
        System.out.print("\n A média é "+media);
        somatorio = 0;
        for(i=0;i<10;i++)
        {
            somatorio = somatorio + Math.pow((vet[i] - media), 2);
            System.out.println("\n -> "+somatorio);
        }
        System.out.println("Desvio padrão: "+(((((double)1)/9))*Math.sqrt(somatorio)));
        
        
        
        
        
        
        
        
        
        
        
        
         int x = 10;
         double ok = 1.6;
         x = (int) ok;
        
    }
    
}
