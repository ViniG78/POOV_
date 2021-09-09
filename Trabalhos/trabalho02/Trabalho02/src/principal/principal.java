
package principal;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/*
    Autores: Vinicius Gabriel Ribeiro Barbosa
             Matheus Renê Silva Fischer
    Materia: POOV
    Ultima modificação 30/08/2021
*/

public class principal {

    public static void main(String[] args) {
        int opc = 0;
        Scanner entrada = new Scanner(System.in);
        ArrayList<pessoa> listPerson = new ArrayList();
        pessoa aux ;
        while(opc != 12){
            System.out.println("---- MENU ----");
            System.out.println("1  - Cadastrar");
            System.out.println("2  - Mostrar cadastrados");
            System.out.println("3  - Matar alguem(alterar status)");
            System.out.println("4  - Buscar por cpf");
            System.out.println("5  - Buscar por nome");
            System.out.println("6  - Verificar guerreiros acima de uma certa idade");
            System.out.println("7  - Verificar guerreiros abaixo de uma certa idade");
            System.out.println("8  - Verificar guerreiros acima de uma certa altura");
            System.out.println("9  - Verificar guerreiros abaixo de uma certa altura");
            System.out.println("10 - Remover guerreiros a partir do CPF");
            System.out.println("11 - Editar dados de um guerreiro");
            System.out.println("12 - Sair");
            opc = Integer.parseInt(JOptionPane.showInputDialog("Opção desejada: "));
            switch(opc) {
                case 1 -> {
                    pessoa person = new pessoa();
                    person.setCpf(JOptionPane.showInputDialog("CPF(xxx.xxx.xxx-xx): "));
                    person.setName(JOptionPane.showInputDialog("Nome: "));
                    person.setCityOrigin(JOptionPane.showInputDialog("Cidade natal: "));
                    person.setAge(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
                    person.setTall(Float.parseFloat(JOptionPane.showInputDialog("Altura: ")));
                    person.setWeight(Float.parseFloat(JOptionPane.showInputDialog("Peso: ")));
                    int death = JOptionPane.showConfirmDialog(null,"Status: Guerrilheiro esta vivo?","",JOptionPane.YES_NO_OPTION);
                    // não == 1
                    // sim == 0
                    if(death == 0){
                        person.setStatus(true);
                    }else{
                        person.setStatus(false);
                    }
                    listPerson.add(person);
                    
                }
                case 2 -> {
                    listPerson.forEach(p ->{
                        System.out.println("-----------------");
                        System.out.println(p.toString());
                    });
                }
                case 3 -> {
                    String nome = JOptionPane.showInputDialog("Nome: ");
                     listPerson.forEach(p ->{
                        if( p.getName().equals(nome)){
                            int death = JOptionPane.showConfirmDialog(null,"Status: Guerrilheiro esta vivo?","",JOptionPane.YES_NO_OPTION);
                            if(death == 0){
                                p.setStatus(true);
                            }else{
                                p.setStatus(false);
                            }
                        }
                    });
                    
                }
                case 4 -> {
                    String auxCpf = JOptionPane.showInputDialog("CPF(xxx.xxx.xxx-xx): ");
                    listPerson.forEach(p ->{
                        if(p.getCpf().equals(auxCpf)){
                            System.out.println("-----------------");
                            System.out.println(p.toString());
                        }
                    });
                }
                case 5 -> {
                     String auxName = JOptionPane.showInputDialog("Nome: ");
                     listPerson.forEach(p ->{
                        if( p.getName().equals(auxName)){
                            System.out.println("-----------------");
                            System.out.println(p.toString());
                        }
                    });
                }
                case 6 -> {
                    int auxAge = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
                    listPerson.forEach(p ->{
                        if(p.getAge()> auxAge){
                            System.out.println("-----------------");
                            System.out.println(p.toString());
                        }
                    });
                }
                case 7 -> {
                    int auxAge = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
                    listPerson.forEach(p ->{
                        if(p.getAge()< auxAge){
                            System.out.println("-----------------");
                            System.out.println(p.toString());
                        }
                    });
                }
                case 8 -> {
                    float auxTall = Float.parseFloat(JOptionPane.showInputDialog("Altura: "));
                    listPerson.forEach(p ->{
                        if(p.getTall() > auxTall){
                            System.out.println("-----------------");
                            System.out.println(p.toString());
                        }
                    });
                }
                case 9 -> {
                     float auxTall = Float.parseFloat(JOptionPane.showInputDialog("Altura: "));
                    listPerson.forEach(p ->{
                        if(p.getTall() < auxTall){
                            System.out.println("-----------------");
                            System.out.println(p.toString());
                        }
                    });
                }
                case 10 -> {
                    int j = 0;
                    String auxCpf = JOptionPane.showInputDialog("CPF(xxx.xxx.xxx-xx): ");
                   for(pessoa p : listPerson){
                       if(p.getCpf().equals(auxCpf)){
                           listPerson.remove(j);
                       }
                       j++;
                   }
                        
                   
                }
                case 11 -> {
                    String auxCpf = JOptionPane.showInputDialog("Digite o cpf para fazer alteração: ");
                    for(pessoa p : listPerson){
                       if(p.getCpf().equals(auxCpf)){
                           p.setCpf(JOptionPane.showInputDialog("CPF(xxx.xxx.xxx-xx): "));
                           p.setName(JOptionPane.showInputDialog("Nome: "));
                           p.setCityOrigin(JOptionPane.showInputDialog("Cidade natal: "));
                           p.setAge(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
                           p.setTall(Float.parseFloat(JOptionPane.showInputDialog("Altura: ")));
                           p.setWeight(Float.parseFloat(JOptionPane.showInputDialog("Peso: ")));
                           int death = JOptionPane.showConfirmDialog(null,"Status: Guerrilheiro esta vivo?","",JOptionPane.YES_NO_OPTION);
                                // não == 1
                                // sim == 0
                                if(death == 0){
                                     p.setStatus(true);
                                }else{
                                     p.setStatus(false);
                                }
                           }

                   }


                }
                case 12 -> {
                    System.out.println("Encerrando");
                }
                
            }
        }
    
    }
}
