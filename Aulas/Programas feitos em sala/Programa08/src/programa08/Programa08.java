package programa08;

import java.util.Scanner;

public class Programa08 
{
    public static void main(String[] args) 
    {
        double mat[][], somatorio;
        int i,j;
        mat = new double[3][6];
        Scanner entrada = new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<6;j++)
            {
                 System.out.print("\n Digite o valor ["+i+"]["+j+"]: ");
                 mat[i][j] = entrada.nextDouble();
            }
        }
        somatorio = 0;
        for(j=0;j<6;j++)
        {//Pecorrendo as colunas
            for(i=0;i<3;i++)
            {//Percorrendo as linhas
                if(((j % 2)==1)&&(j != 0))
                {
                   somatorio = somatorio+ mat[i][j];
                }
            }
        }
        System.out.print("\n Somatório das colunas ímpares "+somatorio);
    }
}
