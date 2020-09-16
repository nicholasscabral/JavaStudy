import java.util.Scanner;

public class alunos {
    Scanner input = new Scanner(System.in);
    String nome, cursando;
    Object aluno;
    int matricula;

    public alunos(String nome, int matricula, String cursando) {
        this.nome = nome;
        this.matricula = matricula;
        this.cursando = cursando;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCursando() {
        return cursando;
    }

    @Override
    public String toString() {
        return  "Dados do aluno = { \n" +
                "    nome: " + nome + ",\n" +
                "    matricula: " + matricula + ",\n" +
                "    curso: " + cursando + "\n}";
    }
}
