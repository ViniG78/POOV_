
package exe4;

import java.util.Scanner;
import java.util.ArrayList;

public class Exe4 {
    
    public static carros addcarro(carros car){
        System.out.println("DIGITE O CHASSI");
        car.chassi = 
        return car;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int opc; 
        ArrayList<carros> listaCarros = new ArrayList();
        carros car;
        do{
            System.out.println("\n MENU");
            System.out.println("1 - ADICIONAR CARRO");
            System.out.println("2 - MOSTRAr CARROS ACIMA DE UM VALOR");
            System.out.println("3 - MOSTRAR CARROS ABAIXO DE UM VALOR");
            System.out.println("4 - MOSTRAR CARROS EM UMA FAIXA DE PREÇO");
            System.out.println("5 - BUSCAR A PARTIR DE UM MODELO");
            System.out.println("6 - MOSTRAR CARROS DE UMA DETERMINADA MARCA");
            System.out.println("7 - MOSTRAR OS CARROS DE  DETERMINADA COR");
            System.out.println("8 - MOSTRAR OS CARROS ACIMA DE UM DETERMINADO ANO");
            opc = entrada.nextInt();
            switch(opc){
                case 1:
                     car = new carros();
                     car = addcarro(car);
                     break;
                case 2: 
                     break;
                case 3: 
                     break;
                case 4: 
                     break;
                case 5: 
                     break;
                case 6: 
                     break;
                 case 7: 
                     break;
                case 8: 
                     break;
                case 9: 
                     System.out.println("ENCERRANDO");
                     break;
                     
             
        }
        }while(opc != 9);
    }
    
}
