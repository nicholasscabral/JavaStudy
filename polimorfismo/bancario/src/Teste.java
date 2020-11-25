public class main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        ContaCorrente contaCorrente = new ContaCorrente();

        // teste conta poupança
        contaPoupanca.setNumeroConta("1234-5678-9101-1121");
        contaPoupanca.setSaldo(5000);
        contaPoupanca.setLimite(300);
        //contaPoupanca.sacar(400);


        // teste conta corrente
        contaPoupanca.setNumeroConta("1211-1098-7654-3210");
        contaCorrente.setSaldo(3000);
        contaCorrente.setTaxaDeOperacao(10);
        //contaCorrente.sacar(400);

        // teste transferencia
        contaCorrente.transferir(400, contaPoupanca);

        //contaPoupanca.mostrarDados();
        //contaCorrente.mostrarDados();
    }
}
