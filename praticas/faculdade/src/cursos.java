public class cursos {
    String nome, area;
    int semestres;
    Object curso;
    private String disciplinas;

    disciplinas grade = new disciplinas();

    //construtor
    public Object AddCurso(String nome, int semestres, String area) {
        curso = new String[]{
                this.nome = nome,
                String.valueOf(this.semestres = semestres),
                this.area = area,
                disciplinas = String.valueOf(grade.AddDisciplinas())
        };
        return curso;
    }

    @Override
    public String toString() {
        return  "Curso: \n" +
                "nome = " + nome + "\n" +
                "semestres = " + semestres + "\n" +
                "area = " + area + "\n" +
                "disciplinas = " + disciplinas;
    }
}
