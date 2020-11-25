public class Teste {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        ContaCorrente contaCorrente = new ContaCorrente();
        Banco banco = new Banco();

        // teste conta poupança
        contaPoupanca.setNumeroConta(123456789);
        contaPoupanca.setSaldo(5000);
        contaPoupanca.setLimite(300);
        contaPoupanca.sacar(400);


        // teste conta corrente
        contaCorrente.setNumeroConta(1211109876);
        contaCorrente.setSaldo(3000);
        contaCorrente.setTaxaDeOperacao(10);
        contaCorrente.sacar(400);

        // teste transferencia
        contaCorrente.transferir(400, contaPoupanca);

        //contaPoupanca.mostrarDados();
        //contaCorrente.mostrarDados();

        banco.inserir(contaCorrente);
        banco.inserir(contaPoupanca);
        //banco.procurarConta(123456789);
        banco.mostrarDados();
    }
}
