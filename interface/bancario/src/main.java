import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Banco banco = new Banco();
        
        while(true) {
            System.out.println("Oque deseja fazer?\n" +
                    "1- Criar conta\n" +
                    "2- Selecionar conta\n" +
                    "3- Remover conta\n" +
                    "4- Gerar relatorio\n" +
                    "5- Finalizar");
            int escolha = input.nextInt();
            if (escolha == 1) {
                System.out.println("1- Corrente\n" +
                        "2- Poupança");
                int tipoConta = input.nextInt();
                if (tipoConta == 1) {
                    System.out.println("informe o numero da conta");
                    String numeroConta = input.next();
                    System.out.println("informe o saldo da conta");
                    int saldo = input.nextInt();
                    System.out.println("informe a taxa de operação");
                    int taxaDeOperação = input.nextInt();
                    ContaCorrente conta = new ContaCorrente(numeroConta, saldo, taxaDeOperação);
                    banco.inserir(conta);
                    System.out.println("Conta criada com sucesso!");
                }
                else if (tipoConta == 2) {
                    System.out.println("informe o numero da conta");
                    String numeroConta = input.next();
                    System.out.println("informe o saldo da conta");
                    int saldo = input.nextInt();
                    System.out.println("informe o limite");
                    int limite = input.nextInt();
                    ContaPoupanca conta = new ContaPoupanca(numeroConta, saldo, limite);
                    banco.inserir(conta);
                    System.out.println("Conta criada com sucesso!");
                }
            }
            else if (escolha == 2) {
                System.out.println("informe o numero da conta");
                String numeroConta = input.next();

                if (achou) {
                    for (int i = 0; i < banco.ListaContas.size(); i++) {
                        if (banco.ListaContas.get(i).getNumeroConta() == numeroConta) {
                            ContaBancaria conta = banco.ListaContas.get(i);
                            System.out.println("Qual operação deseja fazer?\n" +
                                    "1- Depositar\n" +
                                    "2- Sacar\n" +
                                    "3- Transferir\n" +
                                    "4- Gerar Relatorio\n" +
                                    "5- Retornar ao menu anteriror");
                            int operacao = input.nextInt();
                            if (operacao == 1) {
                                System.out.println("valor do deposito:");
                                int valor = input.nextInt();
                                conta.depositar(valor);
                            }
                            else if (operacao == 2) {}
                            else if (operacao == 3) {}
                            else if (operacao == 4) {}
                            else if (operacao == 5) {}
                            break;
                        }
                    }

                }
                else System.out.println("Conta inexistente");
            }
        }
    }
}
