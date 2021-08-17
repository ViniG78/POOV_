
package execercio7;

import java.util.Scanner;

public class Execercio7 {

    public static void main(String[] args) {
      double mat[][];
      int i,j;
      mat  = new double[3][6];
      Scanner entrada = new Scanner(System.in);
      for(i=0;i<3;i++){
          for(j=0;j<6;j++){
              System.out.println("Digite o valor: ");
              mat[i][j] = entrada.nextDouble();
          }
      }
      double soma = 0;
      for(j=0;j<6;j++)
      {
         for(i=0;i<3;i++)
         {
           if(j % 2 == 1 )
           {
            soma = soma + mat[i][j];
           } 
         }
       }
      
        System.out.println(soma);
      
    }
    
}
