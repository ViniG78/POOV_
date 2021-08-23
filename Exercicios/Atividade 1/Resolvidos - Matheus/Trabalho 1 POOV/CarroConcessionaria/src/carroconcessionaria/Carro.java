package carroconcessionaria;

public class Carro{
    int chassi, ano;
    double preco;
    String modelo, cor, fabricante;
    
    public void setFabricante(String fabricanteCarro){
        fabricante = fabricanteCarro; 
    }
    public void setCor(String corCarro){
        cor = corCarro; 
    }
    public void setModelo(String modeloCarro){
        modelo = modeloCarro; 
    }
    public void setPreco(Double precoCarro){
        preco = precoCarro; 
    }
    public void setChassi(int chassiCarro){
        chassi = chassiCarro; 
    }
    public void setAno(int anoCarro){
        ano = anoCarro; 
    }
}