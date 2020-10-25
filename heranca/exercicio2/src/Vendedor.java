public class Vendedor extends Empregado {
    private double valorVendas;
    private int qntVendas;

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    @Override
    public String toString() {
        return "Vendedor = {\n" +
                "  nome: " + getNome() + ",\n" +
                "  salario: " + getSalario() + "R$,\n" +
                "  valor das vendas: " + getValorVendas() + "R$,\n" +
                "  quantidade de vendas: " + getQntVendas() + "\n}";
    }
}
