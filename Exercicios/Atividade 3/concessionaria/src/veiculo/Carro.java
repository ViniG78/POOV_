
package veiculo;

public class Carro extends Automovel {
    private String tipoDoPortaMalas; 

    public Carro() {
        super();
        this.tipoDoPortaMalas = "sem tipo";
    }

    public String getTipoDoPortaMalas() {
        return tipoDoPortaMalas;
    }

    public void setTipoDoPortaMalas(String tipoDoPortaMalas) {
        this.tipoDoPortaMalas = tipoDoPortaMalas;
    }

    @Override
    public String toString() {
        return (super.toString() + "tipoDoPortaMalas = " + tipoDoPortaMalas );
    }
    
}
