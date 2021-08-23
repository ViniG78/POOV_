package principal;
public class Funcionario {
    private String cpf;
    private String nome;
    private String funcao;
    private double salario;
    
    public void setCpf(String cpf){
        //Inserir um novo CPF
        this.cpf = cpf;
    }
    public String getCpf(){
        //BUSCAR UM CPF
        return this.cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public double getSalario() {
        return salario;
    }
   public boolean verificaSalario(){
       boolean variavel = false;
       if(this.salario > 1100){
           variavel = true; 
       }
       return variavel;
   }
}
