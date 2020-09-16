import java.util.ArrayList;

public class cursos {
    String nome, area;
    int semestres;
    Object curso;
    private ArrayList disciplinas;

    disciplinas grade = new disciplinas();

    //construtor
    public cursos(String nome, String area, int semestres) {
        this.nome = nome;
        this.area = area;
        this.semestres = semestres;
        disciplinas = grade.AddDisciplinas();
    }

    public String getNome() {
        return nome;
    }

    public int getSemestres() {
        return semestres;
    }

    public String getArea() {
        return area;
    }

    public ArrayList getDisciplinas() {
        return disciplinas;
    }

    @Override
    public String toString() {
        return  "Dados do Curso = { \n" +
                "   nome = " + nome + ",\n" +
                "   semestres = " + semestres + ",\n" +
                "   area = " + area + ",\n" +
                "   disciplinas = " + disciplinas + "\n}";
    }
}
