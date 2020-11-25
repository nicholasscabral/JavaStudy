public class Empregado extends Pessoa {
    int codigoSetor;
    double salarioBase, imposto;

    public double calcularSalario() {
        return salarioBase * (1 - imposto);
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    @Override
    public String toString() {
        return "Empregado {\n" +
                "   nome: " + nome + ",\n" +
                "   telefone: " + telefone + ",\n" +
                "   endereço: " + endereco + ",\n" +
                "   salario: " + calcularSalario() + "\n}";
    }
}
