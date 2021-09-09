
package movel;

public class Estante extends Movel {
    private float altura;
    private int qtdCompartimentos;

    public Estante(float altura, int qtdCompartimentos, String codigo, String material, float peso, String cor) {
        super(codigo, material, peso, cor);
        this.altura = altura;
        this.qtdCompartimentos = qtdCompartimentos;
    }

    public Estante() {
        super();
        this.altura = 0;
        this.qtdCompartimentos = 0;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getQtdCompartimentos() {
        return qtdCompartimentos;
    }

    public void setQtdCompartimentos(int qtdCompartimentos) {
        this.qtdCompartimentos = qtdCompartimentos;
    }
     public String toString(){
       return (super.toString()+", Altura: "+this.altura+", Qrd Compartimentos: "+this.qtdCompartimentos);
   }
    
}
