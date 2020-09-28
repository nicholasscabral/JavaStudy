import java.util.Arrays;
import java.util.Scanner;

public class desafio10 {
    Scanner input = new Scanner(System.in);
    int escolha, valor, repeticoes;
    int[] vetor = new int[10];
    boolean repetir = true;
    boolean adicionar = true;

    public void resolucao() {
        Arrays.fill(vetor, 0);
        while (repetir) {
            System.out.println("Oque deseja fazer? \n" +
                    "1- adicionar um numero no vetor \n" +
                    "2- consultar todos os numeros do vetor \n" +
                    "3- consultar 1 numero no vetor \n" +
                    "4- excluir um numero no vetor \n" +
                    "5- esvaziar o vetor \n" +
                    "6- sair");

            escolha = input.nextInt();

            // ADICIONAR NO VETOR
            if (escolha == 1) {
                while (adicionar) {
                    System.out.println("digite o valor");
                    valor = input.nextInt();
                    for (int i = 0; i < vetor.length; i++) {
                        if (vetor[i] == 0) {
                            vetor[i] = valor;
                            System.out.println("Numero adicionado com sucesso na posição " + i);
                            break;
                        }
                    }
                    System.out.println("\n- deseja adicionar outro numero? true ou false");
                    adicionar = input.nextBoolean();
                }

                System.out.println("- deseja escolher outra opção? true ou false");
                repetir = input.nextBoolean();
            }

            // CONSULTAR TODOS OS NUMEROS DO VETOR
            else if (escolha == 2) {
                boolean vazio = true;
                System.out.print("[");
                for (int numero : vetor) {
                    if (numero != 0) {
                        vazio = false;
                        System.out.print(numero + " ,");
                    }
                }
                System.out.print("]");
                if (vazio) {
                    System.out.println(" - o vetor esta vazio");
                }

                System.out.println("\n- deseja escolher outra opção? true ou false");
                repetir = input.nextBoolean();
            }

            // CONSULTAR UM NUMERO NO VETOR
            else if (escolha == 3) {
                repeticoes = 0;
                System.out.println("qual numero deseja consultar?");
                valor = input.nextInt();

                for (int numero : vetor) {
                    if (numero == valor) {
                        repeticoes++;
                    }
                }

                if (repeticoes == 0) {
                    System.out.println("o numero " + valor + " nao esta presente no vetor");
                }
                else {
                    System.out.print("o numero " + valor + " aparece " + repeticoes + " vezes no vetor,\ne esta presente nas posições: ");
                    for (int i = 0; i < vetor.length; i++) {
                        if (vetor[i] == valor) {
                            System.out.print(i + ", ");
                        }
                    }
                }

                System.out.println("\n\n- deseja escolher outra opção? true ou false");
                repetir = input.nextBoolean();
            }

            // EXCLUIR UM NUMERO NO VETOR
            else if (escolha == 4) {
                System.out.println("digite o valor que deseja excluir do vetor");
                valor = input.nextInt();

                for (int i = 0; i < vetor.length; i++) {
                    if (vetor[i] == valor) {
                        vetor[i] = 0;
                        System.out.println("numero " + valor + " excluido com sucesso da posição " + i);
                    }
                }

                System.out.println("- deseja escolher outra opção? true ou false");
                repetir = input.nextBoolean();
            }

            // ESVAZIAR O VETOR
            else if (escolha == 5) {
                Arrays.fill(vetor, 0);

                System.out.println("Vetor esvaziado com sucesso \n");

                System.out.println("- deseja escolher outra opção? true ou false");
                repetir = input.nextBoolean();
            }

            // SAIR
            else if (escolha == 6) {
                return;
            }

        }
    }
}