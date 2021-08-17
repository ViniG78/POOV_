package programa06;
import java.util.Scanner;
public class Programa06 
{
    public static void main(String[] args) 
    {
        int vet[],i, n, dedoDuro;
        vet = new int[4];
        Scanner entrada = new Scanner(System.in);
        i=0;
        while(i<4)
        {
            System.out.print("\n Digite o valor ["+(i+1)+"]: ");
            vet[i] = entrada.nextInt();
            i++;
        }
        for(i=0;i<4;i++)
        {
            dedoDuro = 0;
            n = 1;
            while (n <= vet[i])
            {
                if((vet[i] % n)==0)
                {
                    dedoDuro++;
                }
                n++;
            }
            if (dedoDuro == 2)
            {
                System.out.print("\n O valor "+vet[i]+" é primo");
            }else{
                System.out.print("\n O valor "+vet[i]+" não é primo");
            }
            
        }
        
    } 
}
