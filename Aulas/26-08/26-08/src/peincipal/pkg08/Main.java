package peincipal.pkg08;

import curso.Curso;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        int opc =0;
        Scanner entrada = new Scanner(System.in);
        ArrayList<Curso> listaCursos = new ArrayList();
        while(opc != 12){
            System.out.println("----MENU-----");
            System.out.println("1-Inserir");
            System.out.println("2-Inserir posição");
            System.out.println("3-Mostrar");
            System.out.println("12-SAIR");
            opc = entrada.nextInt();
            switch(opc){
                case 1:
                    Curso curso = new Curso();
                    System.out.println("Codigo do curso: ");
                    curso.setCodCurso(entrada.next());
                    System.out.println("Nome: ");
                    curso.setNome(entrada.next());
                    System.out.println("Numero de alunos: ");
                    curso.setNumAlunos(entrada.nextInt());
                    System.out.println("Nota no Mec: ");
                    curso.setNotaMec(entrada.nextFloat());
                    listaCursos.add(curso);
                break;
                case 2:
                    int pos = 0;
                    System.out.println("Digite a posição");
                    pos = entrada.nextInt();
                    Curso curso2 = new Curso();
                    System.out.println("Codigo do curso: ");
                    curso2.setCodCurso(entrada.next());
                    System.out.println("Nome: ");
                    curso2.setNome(entrada.next());
                    System.out.println("Numero de alunos: ");
                    curso2.setNumAlunos(entrada.nextInt());
                    System.out.println("Nota no Mec: ");
                    curso2.setNotaMec(entrada.nextFloat());
                    listaCursos.add(pos, curso2);
                    
                   break;
                case 3:
                    /*
                    for(int i =0; i<listaCursos.size();i++){
                    
                        System.out.println(listaCursos.get(i).toString());
                    }*/
                    /*
                    for(Curso c : listaCursos){
                    
                        System.out.println(c.toString());
                    }*/
                    listaCursos.forEach(c -> {
                        System.out.println(c.toString());
                    });
                break;
            
            }
            
            
        }
                
    }
    
}
