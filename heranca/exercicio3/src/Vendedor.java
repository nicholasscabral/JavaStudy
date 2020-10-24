public class Vendedor extends Empregado {
    private double valorVendas, comissao;

    public double calcularSalarioVendedor(double salarioEmpregado) {

        return salarioEmpregado + (valorVendas * comissao);

    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
