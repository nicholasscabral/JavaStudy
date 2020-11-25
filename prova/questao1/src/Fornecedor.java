public class Fornecedor extends Pessoa {
    double valorCredito, valorDivida;

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(int valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(int valorDivida) {
        this.valorDivida = valorDivida;
    }

    @Override
    public String toString() {
        return "Fornecedor {\n" +
                "   nome: " + nome + ",\n" +
                "   telefone: " + telefone + ",\n" +
                "   endereço: " + endereco + ",\n" +
                "   saldo: " + obterSaldo() + "\n}";
    }
}
