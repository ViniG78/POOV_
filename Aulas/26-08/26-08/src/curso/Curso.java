
package curso;

public class Curso {
    //PRIVATE: SO PODE ACESSAR DENTRO DA CLASSE
    private String codCurso, nome;
    private int numAlunos;
    private float notaMec;
    public Curso() {
        //CONSTRUTOR PADRÂO
        this.codCurso = "sem nome";
        this.nome = "sem nome";
        this.numAlunos = 0;
        this.notaMec = 0;
    }
    public Curso(String codCurso, String nome, int numAlunos, float notaMec) {
        //CONSTRUTOR DE INICIALIZAÇÂO
        this.codCurso = codCurso;
        this.nome = nome;
        this.numAlunos = numAlunos;
        this.notaMec = notaMec;
    }

    public String getCodCurso() {
        return codCurso;
    }

    public String getNome() {
        return nome;
    }

    public int getNumAlunos() {
        return numAlunos;
    }

    public float getNotaMec() {
        return notaMec;
    }

    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumAlunos(int numAlunos) {
        this.numAlunos = numAlunos;
    }

    public void setNotaMec(float notaMec) {
        this.notaMec = notaMec;
    }

    @Override
    public String toString() {
        return "Curso{" + "codCurso=" + codCurso + ", nome=" + nome + ", numAlunos=" + numAlunos + ", notaMec=" + notaMec + '}';
    }
    
    
}
//JAVA BEAN.