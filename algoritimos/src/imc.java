import java.util.Scanner;

public class imc {
    Scanner prompt = new Scanner(System.in);

    public void IMC() {
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
