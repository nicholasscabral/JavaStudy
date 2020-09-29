import java.util.ArrayList;
import java.util.Scanner;

public class desafio9 {
    Scanner input = new Scanner(System.in);
    int[] codigos = new int[] {21, 22, 23, 24, 25};
    int[] salarios = new int[] {1200, 1200, 2500, 3200, 5000};
    int[] tempos = new int[] {2, 3, 5, 7, 8};
    ArrayList<Integer> isentos = new <Integer>ArrayList();
    int n, contador = 0;
    boolean bool = false; // variavel de controle para saber se o programa ja entrou em uma condição ou nao, para evitar erro logico
    int menorSalario = salarios[salarios.length - 1]; // definindo o ultimo salario como o sendo o menor, para ser comparado dinamicamente

    public void resolucao() {
        // INICIO DO ITEM A
        System.out.println("digite o valor do salario a ser consultado");
        n = input.nextInt();

        // PRIMEIRO RELATORIO
        System.out.println("Primeiro Relatorio");
        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] <= n) {
                System.out.println("funcionario de codigo " + codigos[i] + "  recebe R$" + salarios[i]);
                bool = true;
            }
        }
        if (!bool) {
            System.out.println("nenhum funcionario com o salario inferior ou igual a R$" + n);
        }

        bool = false;
        // SEGUNDO RELATORIO
        System.out.println("\nSegundo Relatorio");
        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] > n) {
                System.out.println("funcionario com codigo " + codigos[i] + " recebe R$" + salarios[i]);
                bool = true;
            }
        }
        if (!bool) {
            System.out.println("nenhum funcionario com o salario superior a R$" + n);
        }

        // FIM DO ITEM A
        // INICIO DO ITEM B
        for (int salario : salarios) {
            if (salario < menorSalario) {
                menorSalario = salario;
            }

            if (salario == menorSalario) {
                contador++;
            }
        }
        System.out.println("\no menor salario é R$" + menorSalario);
        System.out.println(contador + " funcionarios possuem o salario igual ao menor salário \n");
        System.out.print("codigo dos funcionarios que possuem o salario igual ao menor salario: ");
        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] == menorSalario) {
                System.out.print(codigos[i] + " ");
            }
        }
        // FIM DO ITEM B
        // INICIO DO ITEM C
        bool = false;
        for (int i = 0; i < salarios.length; i++) {
            if (tempos[i] >= 2 && tempos[i] <= 4 && salarios[i] < 1500) {
                isentos.add(codigos[i]);
                bool = true;
            }
        }
        if (!bool) {
            System.out.println("nenhum funcionario atendeu aos requisitos");
        }
        else {
            System.out.print("\ncodigo dos funcionario que atenderam aos requisitos: ");
            for (int codigo : isentos) {
                System.out.print(codigo + " ");
            }
        }
    }
}
