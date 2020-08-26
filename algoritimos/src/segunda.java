import java.util.Scanner;

public class segunda {
    int n, nota, cont = 0, i = 0;
    Scanner prompt = new Scanner(System.in);


    public void contagem() {
        System.out.println("Numero de notas");
        n = prompt.nextInt();
        while (i < n) {
            i++;
            System.out.println("Nota do aluno: ");
            nota = prompt.nextInt();
            if (nota >= 50) {
                cont++;
            }
        }
        System.out.println("Numero de aprovações: " + cont);

    }

    public void imc() {
        System.out.println("Digite seu peso: ");
        double peso = prompt.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = prompt.nextDouble();
        System.out.println("O seu imc é: " + calculoIMC(peso, altura));;
    }

    private double calculoIMC(double peso, double altura) {
        double calculo = peso/(altura * altura);
        return calculo;
    }


}
