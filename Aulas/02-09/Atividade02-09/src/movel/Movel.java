package movel;

public class Movel {
    //ATRIBUTOS
    private String codigo;
    private String material;
    private float peso;
    private String cor;

    public Movel(String codigo, String material, float peso, String cor) {
        //CONSTRUTOR DE INICIALIZAÇÂO
        this.codigo = codigo;
        this.material = material;
        this.peso = peso;
        this.cor = cor;
    }
     public Movel() {
        //CONSTRUTOR PADRÂO
        this.codigo = "sem codigo";
        this.material = "sem material";
        this.peso = 0;
        this.cor = "sem cor";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public String toString() {
        return "Movel{" + "codigo=" + codigo + ", material=" + material + ", peso=" + peso + ", cor=" + cor + '}';
    }
    
}
