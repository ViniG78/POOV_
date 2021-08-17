package programa07;
import java.util.Scanner;
public class Programa07 
{
    public static void main(String[] args) 
    {
        int mat[][], x,y;
        mat = new int[3][3];
        Scanner entrada = new Scanner(System.in);
        for(x = 0; x< 3;x++)
        {
            for(y = 0; y< 3;y++)
            {
                System.out.print("\n Digite o valor["+x+"]["+y+"]: ");
                mat[x][y]= entrada.nextInt();
            }
        }
        for(x = 0; x< 3;x++)
        {
            for(y = 0; y< 3;y++)
            {
                System.out.print("\n Valor ["+x+"]["+y+"]: "+mat[x][y]);
            }
        }
    }
}
