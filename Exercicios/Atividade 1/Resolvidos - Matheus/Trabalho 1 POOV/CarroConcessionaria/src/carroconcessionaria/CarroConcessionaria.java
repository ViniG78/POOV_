package carroconcessionaria;

import java.util.Scanner;
import java.util.ArrayList;


public class CarroConcessionaria{

    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        Scanner entrada = new Scanner(System.in);
        int opc = 0;
        
        ArrayList <Carro> listaCarros = new ArrayList();
        Carro novoCarro;
        
        while(opc != 10){
            
            System.out.println("1 - Adicionar carro.");
            System.out.println("2 - Buscar todos os carros.");
            System.out.println("3 - Buscar carros acima do valor X.");
            System.out.println("4 - Buscar carros abaixo do valor X.");
            System.out.println("5 - Buscar carros em uma determinada faixa de preço.");
            System.out.println("6 - Buscar carros através do modelo");
            System.out.println("7 - Buscar carros através do fabricante");
            System.out.println("8 - Buscar carros de uma determinada cor");
            System.out.println("9 - Buscar carros acima de um determinado ano");
            System.out.print("10 - Sair");
            opc = entrada.nextInt();            
            switch(opc){
                case 1: 
                    novoCarro = adicionarCarro();
                    listaCarros.add(novoCarro);
                    System.out.println("Carro com o chassi "+novoCarro.chassi+" adicionado ao sistema.\n ENTER para continuar.");
                    aperteENTER();
                
                case 2: 
                    mostrarCarros(listaCarros);
                    System.out.println("Aperte ENTER para continuar");
                    aperteENTER();
                
                case 3:
                    mostrarCarrosAcima(listaCarros);
                    System.out.println("Aperte ENTER para continuar");
                    aperteENTER();
                
                case 4:
                    mostrarCarrosAbaixo(listaCarros);
                    System.out.println("Aperte ENTER para continuar");
                    aperteENTER();
                
                case 5: 
                    mostrarCarrosFaixa(listaCarros);
                    System.out.println("Aperte ENTER para continuar");
                    aperteENTER();
                
                case 6: 
                    mostrarCarrosModelo(listaCarros);
                    System.out.println("Aperte ENTER para continuar");
                    aperteENTER();
                
                case 7: 
                    mostrarCarrosFabricante(listaCarros);
                    System.out.println("Aperte ENTER para continuar");
                    aperteENTER();
                
                case 8: 
                    mostrarCarrosCor(listaCarros);
                    System.out.println("Aperte ENTER para continuar");
                    aperteENTER();
                
                case 9: 
                    mostrarCarrosAno(listaCarros);
                    System.out.println("Aperte ENTER para continuar");
                    aperteENTER();
                
                case 10: 
                    System.out.println("Saindo... Tchau!");
                    entrada.close();
                    
                default:
                    System.out.println("Opção Inválida.");
            }
        }
    }
    
    public static Carro adicionarCarro(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o Fabricante do carro: ");
        String fabricanteCarro = entrada.next();
        System.out.println("Digite o Modelo do carro: ");
        String modeloCarro = entrada.next();
        System.out.println("Digite a Cor do carro: ");
        String corCarro = entrada.next();
        System.out.println("Digite o Ano de fabricação do carro: ");
        int anoCarro = entrada.nextInt();
        System.out.println("Digite o Chassi do carro: ");
        int chassiCarro = entrada.nextInt();
        System.out.println("Digite o Preço do carro: ");
        Double precoCarro = entrada.nextDouble();

        Carro novoCarro = new Carro();
        novoCarro.setFabricante(fabricanteCarro);
        novoCarro.setModelo(modeloCarro);
        novoCarro.setCor(corCarro);
        novoCarro.setAno(anoCarro);
        novoCarro.setChassi(chassiCarro);
        novoCarro.setPreco(precoCarro);
        return novoCarro;
    }
    
    public static void mostrarCarros(ArrayList<Carro> listaCarros){
        for(int i = 0; i < listaCarros.size(); i++){
            Carro carroGet = listaCarros.get(i);
            mostrarInformacoes(i, carroGet);
        }
    }
    
    public static void mostrarCarrosAcima(ArrayList<Carro> listaCarros){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        Double preco = entrada.nextDouble();
        System.out.println("");
        for(int i = 0; i < listaCarros.size(); i++){
            Carro carroGet = listaCarros.get(i);
            if(!(carroGet.preco >= preco)){
                continue;
            }
            mostrarInformacoes(i, carroGet);
        }
    }
    
    public static void mostrarCarrosAbaixo(ArrayList<Carro> listaCarros){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        Double preco = entrada.nextDouble();
        System.out.println("");
        for(int i = 0; i < listaCarros.size(); i++){
            Carro carroGet = listaCarros.get(i);
            if(!(carroGet.preco <= preco)){
                continue;
            }
            mostrarInformacoes(i, carroGet);
        }
    }
        
    public static void mostrarCarrosFaixa(ArrayList<Carro> listaCarros){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nDigite o valor (De): ");
        Double precoDe = entrada.nextDouble();
        System.out.println("\nDigite o valor (Até): ");
        Double precoAte = entrada.nextDouble();
        System.out.println("");
        for(int i = 0; i < listaCarros.size(); i++){
            Carro carroGet = listaCarros.get(i);
            if(!(carroGet.preco >= precoDe && carroGet.preco <= precoAte)){
                continue;
            }
            mostrarInformacoes(i, carroGet);
        }
    }
    
    public static void mostrarCarrosModelo(ArrayList<Carro> listaCarros){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o modelo: ");
        String modelo = entrada.next();
        System.out.println("");
        for(int i = 0; i < listaCarros.size(); i++){
            Carro carroGet = listaCarros.get(i);
            if(!(carroGet.modelo.equals(modelo))){
                continue;
            }
            mostrarInformacoes(i, carroGet);
        }
    }
    public static void mostrarCarrosFabricante(ArrayList<Carro> listaCarros){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o Fabricante: ");
        String fabricante = entrada.next();
        System.out.println("");
        for(int i = 0; i < listaCarros.size(); i++){
            Carro carroGet = listaCarros.get(i);
            if(!(carroGet.fabricante.equals(fabricante))){
                continue;
            }
            mostrarInformacoes(i, carroGet);
        }
    }
    public static void mostrarCarrosCor(ArrayList<Carro> listaCarros){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a cor: ");
        String cor = entrada.next();
        System.out.println("");
        for(int i = 0; i < listaCarros.size(); i++){
            Carro carroGet = listaCarros.get(i);
            if(!(carroGet.cor.equals(cor))){
                continue;
            }
            mostrarInformacoes(i, carroGet);
        }
    }
    public static void mostrarCarrosAno(ArrayList<Carro> listaCarros){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ano: ");
        int ano = entrada.nextInt();
        System.out.println("");
        for(int i = 0; i < listaCarros.size(); i++){
            Carro carroGet = listaCarros.get(i);
            if(!(carroGet.ano > ano)){
                continue;
            }
            
            mostrarInformacoes(i, carroGet);
        }
    }
    public static void aperteENTER(){
        Scanner s = new Scanner(System.in);
        s.nextLine();
    }
    
    public static void mostrarInformacoes(int index, Carro carroGet){
        System.out.println("  CARRO CODIGO["+index+"]  ");
        System.out.println("Fabricante: "+carroGet.fabricante+"");
        System.out.println("Modelo: "+carroGet.modelo+"");
        System.out.println("Cor: "+carroGet.cor+"");
        System.out.println("Ano: "+carroGet.ano+"");
        System.out.println("Chassi: "+carroGet.chassi+"");
        System.out.println("Preço: "+carroGet.preco+"\n\n");
    }
}

    