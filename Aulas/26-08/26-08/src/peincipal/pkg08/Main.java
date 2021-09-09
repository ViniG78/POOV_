package peincipal.pkg08;

import curso.Curso;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        int opc =0;
        Scanner entrada = new Scanner(System.in);
        ArrayList<Curso> listaCursos = new ArrayList();
        String cod, nm;
        Curso cursos;
        while(opc != 12){
            System.out.println("----MENU-----");
            System.out.println("1-Inserir");
            System.out.println("2-Inserir posição");
            System.out.println("3-Mostrar");
            System.out.println("4-");
            System.out.println("5-");
            System.out.println("6-");
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
                case 4: 
                    System.out.println("Digite o codigo:");
                    cod = entrada.next();
                    boolean  buscaCod = false;
                    for(int i=0; i<listaCursos.size(); i++){
                        if(listaCursos.get(i).getCodCurso().equals(cod)){
                            buscaCod = true;
                            System.out.println(listaCursos.get(i));
                        }
                    }
                    if(!buscaCod){
                        System.out.println("Codigo não encontrado");
                    }
                 break;
                case 5:
                    System.out.println("Digite o nome:");
                    nm = entrada.next();
                    boolean  buscaNm = false;
                    for(int i=0; i<listaCursos.size(); i++){
                        if(listaCursos.get(i).getNome().equals(nm)){
                            buscaNm = true;
                            System.out.println(listaCursos.get(i));
                        }
                    }
                    if(!buscaNm){
                        System.out.println("Nome não encontrado");
                    }
                  break;
                case 7:
                    float media = 0;
                    for(Curso c : listaCursos){
                        media = media +c.getNotaMec();
                    }
                    media = media / listaCursos.size();
                    System.out.println("A media é "+ media);
                break;
                case 12:
                    System.out.println("Encerrando");
                 break;
                case 6:
                    if(listaCursos.size()>0){
                        cursos = listaCursos.get(0);
                        for(int i =0; i< listaCursos.size();i++){
                            if(listaCursos.get(i).getNumAlunos()> cursos.getNumAlunos()){
                                cursos = listaCursos.get(i);
                            }
                            System.out.println(cursos.toString());
                        }
                    }
                  break;
                case 8:
                    System.out.println("Digite o codigo:");
                    cod = entrada.next();
                    boolean aux = false;
                    cursos = null;
                    for (Curso c: listaCursos){
                        if(c.getCodCurso().equals(cod)){
                            cursos = c;
                            aux = true;
                        }
                        if(aux){
                          listaCursos.remove(cursos);
                        }
                    }
                    
                 break;
               
                 
                
            }
            
            
        }
                
    }
    
}
