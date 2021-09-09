package veiculo;
public class Automovel {
    private String chassi; 
    private float potencia; 
    private String cor;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Automovel() {
        this.chassi = "sem Chassi";
        this.potencia = 0;
        this.cor = "sem cor";
    }

    @Override
    public String toString() {
        return "Automovel{" + "chassi = " + chassi + ", potencia = " + potencia + ", cor = " + cor + '}';
    }
    
}
