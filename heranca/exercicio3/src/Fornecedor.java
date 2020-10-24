public class Fornecedor extends Pessoa{
    private double valorCredito, valorDivida;

    public double obterSaldo() {
        double saldo = valorCredito - valorDivida;

        return saldo;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
}
