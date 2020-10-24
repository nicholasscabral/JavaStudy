public class Operario extends Empregado {
    private double valorProducao, comissao;

    public double calcularSalarioOperario(double salarioEmpregado) {

        return salarioEmpregado + (valorProducao * comissao);

    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
