public abstract class ContaBancaria implements Imprimivel {

    int saldo, numeroConta;

    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract void transferir(double valor, ContaBancaria conta);

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
