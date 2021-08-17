package banco;
//CLASSE
public class ContaBancaria {
   //ATRIBUTOS
    String numero;
    String contadigitada;
    String senha;
    String proprietario;
    double saldo;
    double limitecheque;
    double iniCheque;
    //METODOS
    boolean sacarDinheiro (double valor){
        boolean validar = false;
        if(valor <= (saldo + limitecheque)){
            if(valor <= saldo){
                saldo = saldo - valor;
            }else{
                valor = valor - saldo;
                saldo = 0;
                limitecheque = limitecheque - valor;
            }
            validar = true;
        }
        return (validar);
    }
    boolean depositar (double valorDeposito){
        boolean validar = false;
        if(limitecheque < iniCheque ){
            if(valorDeposito >= (iniCheque - limitecheque)){
                if(valorDeposito ==(iniCheque - limitecheque)){
                  limitecheque =  iniCheque; 
                }else{
                   limitecheque =  iniCheque; 
                   saldo = valorDeposito - (iniCheque - limitecheque);
                }
             
            }else{
                limitecheque = limitecheque + valorDeposito;
        
            }
             validar = true;
        }else{
            saldo = saldo + valorDeposito;
            validar = true;
        
        }
        return validar;
    }
}
