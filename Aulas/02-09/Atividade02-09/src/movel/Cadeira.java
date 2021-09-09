
package movel;

//CADEIRA ESTA HERDANDO CARACTERISTICAS DA CLASSE MOVEL
public class Cadeira extends Movel {
    private int qtdePernas;
    private boolean encosto;

    public Cadeira() {
        super();
        this.qtdePernas = 0;
        this.encosto = false;
    }
    
    public Cadeira(int qtdePernas, boolean encosto, String codigo, String material, float peso, String cor) {
        super(codigo, material, peso, cor);//MEIO PARA ACESSAR INformações da classe mãe
        this.qtdePernas = qtdePernas;
        this.encosto = encosto;
    }

    public int getQtdePernas() {
        return qtdePernas;
    }

    public void setQtdePernas(int qtdePernas) {
        this.qtdePernas = qtdePernas;
    }

    public boolean isEncosto() {
        return encosto;
    }

    public void setEncosto(boolean encosto) {
        this.encosto = encosto;
    }

   public String toString(){
       return (super.toString()+", QtdePernas: "+this.qtdePernas+", Encosto: "+this.qtdePernas);
   }
    
    
}
