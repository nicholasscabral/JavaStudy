import java.util.ArrayList;
import java.util.Scanner;

public class faculdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, area;
        int semestres;
        ArrayList<Object> lista = new ArrayList<Object>();

        cursos curso = new cursos();

        System.out.println("nome do curso: ");
        nome = input.nextLine();
        System.out.println("quantidade de semestres: ");
        semestres = input.nextInt();
        System.out.println("qual a area do curso: ");
        area = input.next();

        //adicionando o curso
        curso.AddCurso(nome, semestres, area);
        System.out.println(curso);

        //adicionando curso na lista de cursos
        //lista.add(curso.AddCurso(nome, semestres, area));

    }
}