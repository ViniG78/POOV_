package principal;
public class Funcionario 
{ // Modificadores de acesso
    private String cpf;
    private String nome;
    private String funcao;
    private double salario;    
    // SET e GET.
    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }
    public String getCpf()
    {//Obter um CPF.
        return(this.cpf);
    }
    public String getNome() 
    {
        return this.nome;
    }
    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    public String getFuncao() 
    {
        return this.funcao;
    }
    public void setFuncao(String funcao) 
    {
        this.funcao = funcao;
    }
    public double getSalario() 
    {
        return this.salario;
    }
    public void setSalario(double salario) 
    {
        this.salario = salario;
    }
    public boolean verificarPadraoCPF()
    {
        boolean validaCPF = false;
        if(this.getCpf().length() == 11)
        {
            validaCPF = true;
        }
        return(validaCPF);
    }
    public boolean verificarSalarioMinimo()
    {
        boolean validaSalario = false;
        if(this.salario >= 1100)
        {
            validaSalario = true;
        }
        return(validaSalario);
    }
    public void aumentarSalarioSup()
    {
        if(this.funcao.equalsIgnoreCase("Supervisor"))
        {
            this.salario = this.salario*1.12;
        }
    }
}
