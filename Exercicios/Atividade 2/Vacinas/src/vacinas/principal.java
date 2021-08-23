
package vacinas;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;

public class principal {

    public static void main(String[] args) {
     int opc = 0;
     ArrayList<Vaccine> listVaccine = new ArrayList();
     Scanner enter = new Scanner(System.in);
     while(opc != 7){
         System.out.println("---- MENU ----");
         System.out.println("1 - Receber vacinas");
         System.out.println("2 - Mostrar vacinas");
         System.out.println("3 - Agrupar por lote");
         System.out.println("4 - Agrupar por destino");
         System.out.println("5 - Mostrar por fabricante");
         System.out.println("6 - Mostrar abaixo de um valor");
         System.out.println("7 - Sair");
         opc = enter.nextInt();
         switch(opc){
             case 1 -> { 
                 
                 Vaccine newVaccine = new Vaccine();
                 newVaccine.setSerialNumber(JOptionPane.showInputDialog("Numero de seire: "));
                 newVaccine.setLote(JOptionPane.showInputDialog("Numero do lote: "));
                 newVaccine.setManufacturer(JOptionPane.showInputDialog("Fabricante: "));
                 newVaccine.setValue(Double.parseDouble(JOptionPane.showInputDialog("valor: ")));
                 newVaccine.setDestiny(JOptionPane.showInputDialog("Destino: "));
                 newVaccine.setVolume(Integer.parseInt(JOptionPane.showInputDialog("Volume: ")));
                 listVaccine.add(newVaccine);
                 
             }
             
             case 2 -> {
                 for(int i = 0; i<listVaccine.size();i++){
                     Vaccine show;
                     show = listVaccine.get(i);
                     System.out.println(" =================== ");
                     System.out.println("Numero de serie: "+show.getSerialNumber());
                     System.out.println("Lote: " + show.getLote());
                     System.out.println("Fabricante: " + show.getManufacturer());
                     System.out.println("Valor: R$" + show.getValue());
                     System.out.println("Destino: " + show.getDestiny());
                     System.out.println("Volume: " + show.getVolume()+" ml");
                 }
             }
             
             case 3 -> {
             }
             
             case 4 -> {
             }
             
             case 5 -> {
             }
             
             case 6 -> {
             }
             
             case 7 -> System.out.println("ENCERRANDO");
         
         }
     }
    
    }
    
}
