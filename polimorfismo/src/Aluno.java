public class Aluno {
    private String Nome;
    private String Matricula;

    // metodo 1
    public Aluno() {

    }
    // sobrecarga: metodos com mesmo nome mas com parametros diferentes, poder escolher qual metodo chamar
    //metodo 2
    public Aluno(String nome, String matricula) {
        Nome = nome;
        Matricula = matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }
}
