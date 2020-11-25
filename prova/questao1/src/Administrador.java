public class Administrador extends Empregado {
    double ajudaDeCusto;

    double calcularSalarioAdministrador() {
        return calcularSalario() + ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public String toString() {
        return "Administrador {\n" +
                "   nome: " + nome + ",\n" +
                "   telefone: " + telefone + ",\n" +
                "   endereço: " + endereco + ",\n" +
                "   salario: " + calcularSalarioAdministrador() + "\n}";
    }
}
