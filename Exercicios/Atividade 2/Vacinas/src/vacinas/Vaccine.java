package vacinas;

public class Vaccine {
    private String serialNumber,lote,manufacturer,destiny;
    private double value;
    private int volume;
    /*
    public Vaccine(){//construtor padrão
        this.serialNumber = "sem numero";
        this.lote = "sem numero";
        this.manufacturer = "sem nome";
        this.destiny = "sem destino";
        this.value = 0;
        this.volume = 0;
    }*/
    public Vaccine (String serialNumber,String lote,String manufacturer,String destiny,double value,int volume ){
        //inicialização
        this.serialNumber = serialNumber;
        this.lote = lote;
        this.manufacturer = manufacturer;
        this.destiny = destiny;
        this.value = value;
        this.volume = volume;
    
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getLote() {
        return lote;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDestiny() {
        return destiny;
    }

    public double getValue() {
        return value;
    }

    public int getVolume() {
        return volume;
    }
    public String toString(){
        String showValue = "Numero: " + this.serialNumber + " Lote: "+ this.lote +" Fabricante: "+this.manufacturer+" Destino: " + this.destiny + " Valor: R$"+this.value+" Volueme: "+this.volume +" ml";
        return showValue;
    }
    
    
}
