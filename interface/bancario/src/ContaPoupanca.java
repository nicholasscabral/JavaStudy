public class ContaPoupanca extends ContaBancaria implements Imprimivel {

    int limite;

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limite < valor) {
            System.out.println("Operação cancelada, saldo insuficiente");
        } else {
            saldo -= valor;
            System.out.println("Operação bem sucedida, saldo atual: " + saldo);
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
        System.out.println("Dados da conta = {\n" +
                            "   Numero: " + numeroConta +"\n" +
                            "   Saldo: " + saldo + "\n" +
                            "   Limite: " + limite + "\n}"
        );
    }
}
