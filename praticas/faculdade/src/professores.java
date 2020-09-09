public class professores {
    String nome;
    int matricula;
    Object professor;
    private String disciplinas;

    disciplinas leciona = new disciplinas();

    public <professor> professor AddProfessor(String nome, int matricula) {
        professor = new String[] {
            this.nome = nome,
            String.valueOf(this.matricula = matricula),
            disciplinas = String.valueOf(leciona.AddDisciplinas())
        };
        return (professor) professor;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getDisciplinas() {
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
