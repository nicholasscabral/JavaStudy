import java.util.ArrayList;

public class professores {
    String nome;
    int matricula;
    Object professor;
    private ArrayList disciplinas;

    disciplinas leciona = new disciplinas();

    public professores() {

    }

    public professores(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        disciplinas = leciona.AddDisciplinas();
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public ArrayList getDisciplinas() {
        return disciplinas;
    }

    @Override
    public String toString() {
        return  "Dados do professor = { \n" +
                "    nome: " + nome + ",\n" +
                "    matricula: " + matricula + ",\n" +
                "    leciona: " + disciplinas + "\n}";
    }
}
