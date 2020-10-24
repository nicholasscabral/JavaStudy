public class Empregado extends Pessoa{
    private double salario;
    private String matricula;

    public double valorInss() {
        double Inss = salario * 1.11;

        return Inss;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
