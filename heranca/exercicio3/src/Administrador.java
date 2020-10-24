public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public double calcularSalarioAdministrador(double salarioEmpregado) {

        return salarioEmpregado + ajudaDeCusto;

    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
}
