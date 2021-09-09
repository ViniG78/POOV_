package principal;

import java.util.ArrayList;
import java.util.Scanner;
import movel.Cadeira;
import movel.Cama;
import movel.Estante;
import movel.Movel;

public class Principal {

  
    public static void main(String[] args) {
      ArrayList<Movel> listaMoveis;
      listaMoveis = new ArrayList();
      int opc = 0, qtdPernas, qtdCompartimentos;
      boolean encosto;
      String codigo, material, cor, tamanho;
      float peso, pesoSuportado, altura;
      Scanner entrada = new Scanner(System.in);
      while(opc != 7){
          System.out.println("---- MENU ----");
          System.out.println("1 - INSERIR");
          System.out.println("2 - Mostrar");
          System.out.println("3 - Buscar pelo codigo");
          System.out.println("4 - Remover pelo codigo");
          System.out.println("5 - Limpar arrayList");
          System.out.println("6 - Verificar se o arrayList");
          System.out.println("7 - Sair");
          opc = entrada.nextInt();
          switch(opc){
              case 1 -> {
                  System.out.println(" 1 - Cadeira");
                  System.out.println(" 2 - Cama");
                  System.out.println(" 3 - Estante");
                  int opc2 = entrada.nextInt();
                  System.out.println("Codigo: ");
                  codigo =entrada.next();
                  System.out.println("Material: ");
                  material =entrada.next();
                  System.out.println("Peso: ");
                  peso =entrada.nextFloat();
                  System.out.println("Cor: ");
                  cor =entrada.next();
                  if(opc2 == 1){
                      //CADEIRA
                      System.out.println("QtdPernas: ");
                      qtdPernas = entrada.nextInt();
                      System.out.println("Encosto");
                      encosto = entrada.nextBoolean();
                      listaMoveis.add(new Cadeira(qtdPernas,encosto,codigo,material,peso,cor));
                  }
                  if(opc2 == 2){
                      //CAMA
                      System.out.println("Tamanho:");
                      tamanho = entrada.next();
                      System.out.println("Peso Suportado");
                      pesoSuportado = entrada.nextInt();
                      listaMoveis.add(new Cama(tamanho,pesoSuportado,codigo,material,peso,cor));
                  }
                  if(opc == 3){
                      //ESTANTE
                      System.out.println("Altura:");
                      altura = entrada.nextFloat();
                      System.out.println("Quantida de comparimentos");
                      qtdCompartimentos = entrada.nextInt();
                      listaMoveis.add(new Estante(altura,qtdCompartimentos,codigo,material,peso,cor));
                  }
                  
                  
              }
              case 2 -> {
                  for(int x=0; x < listaMoveis.size(); x++){
                      if(listaMoveis.get(x) instanceof Cadeira){
                          System.out.println("Cadeira: "+ listaMoveis.get(x).toString());
                      }
                      if(listaMoveis.get(x) instanceof Estante){
                          System.out.println("Estante: "+ listaMoveis.get(x).toString());
                      }
                      if(listaMoveis.get(x) instanceof Cama){
                          System.out.println("Cama: "+ listaMoveis.get(x).toString());
                      }
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
          
          }
      }
             
    }
    
}
