import java.util.ArrayList;
import java.util.Scanner;

public class disciplinas {
    Scanner input = new Scanner(System.in);
    ArrayList<String> disciplinas = new ArrayList<>();
    int NumeroDisciplinas;

    public ArrayList AddDisciplinas() {
        System.out.println("quantidade de disciplinas ");
        NumeroDisciplinas = input.nextInt();
        disciplinas.clear(); // reiniciar o array disciplinas a cada cadastro

        for (int i = 0; i < NumeroDisciplinas; i++) {
            System.out.println("nome da disciplina " + (i + 1));
            String disciplina = input.next();
            disciplinas.add(disciplina);
        }
        return disciplinas;
    }

    @Override
    public String toString() {
        return "disciplinas = {\n" +
                "input=" + input +
                "\n, disciplinas=" + disciplinas +
                "\n, NumeroDisciplinas=" + NumeroDisciplinas +
                '}';
    }
}