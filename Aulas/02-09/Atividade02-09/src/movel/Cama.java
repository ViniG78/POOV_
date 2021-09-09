package movel;

public class Cama extends Movel {
    private String tamanho;
    private float pesoSuportado;

    public Cama(String tamanho, float pesoSuportado, String codigo, String material, float peso, String cor) {
        super(codigo, material, peso, cor);
        this.tamanho = tamanho;
        this.pesoSuportado = pesoSuportado;
    }

    public Cama() {
        super();
        this.tamanho = "Sem tamanho";
        this.pesoSuportado = 0;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public float getPesoSuportado() {
        return pesoSuportado;
    }

    public void setPesoSuportado(float pesoSuportado) {
        this.pesoSuportado = pesoSuportado;
    }
    public String toString(){
       return (super.toString()+", Tamanho: "+this.tamanho+", Peso Suportado: "+this.pesoSuportado);
   }
            
}
