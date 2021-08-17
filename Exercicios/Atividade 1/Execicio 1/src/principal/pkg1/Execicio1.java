package principal.pkg1;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Execicio1 {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner entrada = new Scanner(System.in);
       // System.out.println("Digite o RA");
        aluno.ra = JOptionPane.showInputDialog("RA: ");
        //aluno.ra = entrada.next();
       // System.out.println("Digite o nome");
        aluno.nome = JOptionPane.showInputDialog("Nome: ");
        //aluno.nome = entrada.next();
       // System.out.println("Digite a idade");
         aluno.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));//TEM QUE CONVERTER PARA INTEIRO
       // aluno.idade = entrada.nextInt();
        //System.out.println("Digite o curso");
        aluno.curso = JOptionPane.showInputDialog("Curso: ");
        //aluno.curso = entrada.next();
        //System.out.println("Digite a area: ");
         aluno.area = JOptionPane.showInputDialog("Area: ");
        //aluno.area = entrada.next();
        System.out.println("RA: "+ aluno.ra);
        System.out.println("Nome: "+ aluno.nome);
        System.out.println("Idade: "+ aluno.idade);
        System.out.println("Curso: "+ aluno.idade);
        System.out.println("Area: "+ aluno.area);
        
    }
    
}
