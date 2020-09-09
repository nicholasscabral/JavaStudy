public class cursos {
    String nome, area;
    int semestres;
    Object curso;
    private String disciplinas;

    disciplinas grade = new disciplinas();

    //construtor
    public <curso> curso AddCurso(String nome, int semestres, String area) {
        curso = new String[]{
                this.nome = nome,
                String.valueOf(this.semestres = semestres),
                this.area = area,
                disciplinas = String.valueOf(grade.AddDisciplinas())
        };
        return (curso) curso;
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

    public String getDisciplinas() {
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
