
package principal;

public class pessoa {
    private String cpf, name, cityOrigin;
    private int age;
    private float tall, weight;
    private boolean status;
    
    public pessoa (){
        this.cpf = "indefinido";
        this.name = "indefinido";
        this.cityOrigin = "indefinido";
        this.age = 0;
        this.tall = 0;
        this.weight = 0;
        this.status = false;
    }/*
    public pessoa(String cpf, String name, String cityOrigin, int age, float tall, float weight, boolean status) {
        this.cpf = cpf;
        this.name = name;
        this.cityOrigin = cityOrigin;
        this.age = age;
        this.tall = tall;
        this.weight = weight;
        this.status = status;
    }*/


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCityOrigin(String cityOrigin) {
        this.cityOrigin = cityOrigin;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTall(float tall) {
        this.tall = tall;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public String getCityOrigin() {
        return cityOrigin;
    }

    public int getAge() {
        return age;
    }

    public float getTall() {
        return tall;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public String toString() {
         String auxStatus = "morto";
         if(status == true){
             auxStatus = "vivo";
         }
        return "Guerreiro{" + "Cpf = " + cpf + ", nome = " + name + ", Cidade natal= " + cityOrigin + ", idade= " + age + ", altura= " + tall + ", peso= " + weight + ", status = " + auxStatus + '}';
    }
    
    
}
