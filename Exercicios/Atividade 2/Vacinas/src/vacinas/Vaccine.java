package vacinas;

public class Vaccine {
    private String serialNumber,lote,manufacturer,destiny;
    private double value;
    private int volume;

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
    
    
}
