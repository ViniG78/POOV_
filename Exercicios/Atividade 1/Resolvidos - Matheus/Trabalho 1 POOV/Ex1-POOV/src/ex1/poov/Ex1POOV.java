package ex1.poov;
import java.util.Scanner;

public class Ex1POOV {

    
    public static void main(String[] args) {
        
        Scanner receber = new Scanner(System.in);
        Aluno a1 = new Aluno();
        System.out.println("Digite o RA do aluno :");
        a1.ra = receber.next();
        System.out.println("Digite o nome do aluno:");
        a1.nome = receber.next();
        System.out.println("Qual a idade do aluno ?");
        a1.idade = receber.nextInt();
        System.out.println("Qual o curso do aluno?");
        a1.curso = receber.next();
        System.out.println("Qual a área ?");
        a1.area = receber.next();
        
        a1.status();
        
        
        
    }
    
}
