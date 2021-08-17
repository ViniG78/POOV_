package exercicio6;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int vet[],j;
       vet = new int[10];
       for(j=0;j<10;j++){
           System.out.println("\nDigite um numero para posição ["+(j+1)+"]:");
           vet[j] = entrada.nextInt();
           int flag =0;
           flag = 0;
           for(int i = 0; i<vet[j];i++){
               if(i>1){
                 if(vet[j] % i == 0){
                  flag++;
                }
               } 
           }
           if(flag == 0){
               System.out.println("O veto {"+vet[j]+"] na posição{"+(j+1)+"} é primo");
           }else{
               System.out.println("\n Não é primo");
           }
           
       }
       
    }
    
}
