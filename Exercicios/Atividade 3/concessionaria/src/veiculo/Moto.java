
package veiculo;


public class Moto extends Automovel {
    private String tipoDoAssento; 

    public Moto() {
        super();
        this.tipoDoAssento = "sem assento";
    }

    public String getTipoDoAssento() {
        return tipoDoAssento;
    }

    public void setTipoDoAssento(String tipoDoAssento) {
        this.tipoDoAssento = tipoDoAssento;
    }
    
     @Override
    public String toString() {
        return (super.toString() + "tipoDoAssento = " + tipoDoAssento );
    }
    
}
