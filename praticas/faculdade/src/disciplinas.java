import java.util.ArrayList;
import java.util.Scanner;

public class disciplinas {
    Scanner input = new Scanner(System.in);
    ArrayList<String> disciplinas = new ArrayList<String>();
    int NumeroDisciplinas;

    public ArrayList AddDisciplinas() {
        System.out.println("quantidade de disciplinas ");
        NumeroDisciplinas = input.nextInt();

        for (int i = 0; i < NumeroDisciplinas; i++) {
            System.out.println("nome da disciplina " + (i + 1));
            String disciplina = input.next();
            disciplinas.add(disciplina);
        }
        return disciplinas;
    }
}