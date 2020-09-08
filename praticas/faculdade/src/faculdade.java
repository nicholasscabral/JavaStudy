import java.util.ArrayList;
import java.util.Scanner;

public class faculdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, area;
        int semestres;
        boolean adicionar = true;
        ArrayList<Object> lista = new ArrayList<Object>();

        cursos curso = new cursos();
        while (adicionar) {
            System.out.println("nome do curso: ");
            nome = input.next();
            System.out.println("quantidade de semestres: ");
            semestres = input.nextInt();
            System.out.println("qual a area do curso: ");
            area = input.next();

            lista.add(curso.AddCurso(nome, semestres, area));
            System.out.println("Deseja adicionar outro curso? true ou false?");
            adicionar = input.nextBoolean();
            if (!adicionar) {
                adicionar = false;
            }
        }

        for(int i = 0; i < lista.size(); i++) {
            lista.set(i, String.valueOf(lista.get(i)));
        }

        for (Object i : lista) {
            System.out.println(i);
        }
    }
}