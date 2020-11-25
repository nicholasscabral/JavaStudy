public class ContaCorrente extends ContaBancaria implements Imprimivel {

    int taxaDeOperacao;

    public int getTaxaDeOperacao() {
        return taxaDeOperacao;
    }

    public void setTaxaDeOperacao(int taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Operação cancelada, saldo insuficiente");
        } else {
            saldo -= valor;
            System.out.println("Operação bem sucedido!, saldo atual: " + saldo);
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, ContaBancaria conta) {
        saldo -= valor;
        conta.depositar(valor);
        System.out.println("Transferencia realizada, novo saldo: " + saldo + "\nTransferencia recebida, novo saldo: " + conta.getSaldo());
    }

    @Override
    public void mostrarDados() {
        System.out.println( "Dados da conta = {\n" +
                            "   Numero: " + numeroConta +"\n" +
                            "   Saldo: " + saldo + "\n" +
                            "   Taxa de operação: " + taxaDeOperacao + "\n}");
    }


}
