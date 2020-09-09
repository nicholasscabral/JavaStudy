import java.util.Scanner;

public class alunos {
    Scanner input = new Scanner(System.in);
    String nome, cursando;
    Object aluno;
    int matricula;

    public <aluno> aluno AddAluno(String nome, String cursando, int matricula) {
        aluno = new String[] {
            this.nome = nome,
            this.cursando = cursando,
            String.valueOf(this.matricula = matricula)
        };
        return (aluno) aluno;
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
