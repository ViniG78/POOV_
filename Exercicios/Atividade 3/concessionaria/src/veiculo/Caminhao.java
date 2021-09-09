package veiculo;

public class Caminhao extends Automovel {
    private float volumeDaCacamba;

    public Caminhao() {
        super();
        this.volumeDaCacamba = 0;
    }

    public float getVolumeDaCacamba() {
        return volumeDaCacamba;
    }

    public void setVolumeDaCacamba(float volumeDaCacamba) {
        this.volumeDaCacamba = volumeDaCacamba;
    }

    @Override
    public String toString() {
        return (super.toString() + "volumeDaCacamba=" + volumeDaCacamba + '}');
    }
    
    
    
}
