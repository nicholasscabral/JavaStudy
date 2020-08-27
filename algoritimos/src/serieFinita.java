import java.util.Scanner;

public class serieFinita {
    int n;
    float x;
    float termo;
    float soma;
    int i;
    float x2;
    Scanner prompt = new Scanner(System.in);

    public void calculoSeriefinita() {
        System.out.println("numero de termos: ");
        n = prompt.nextInt();
        System.out.println("valor de x: ");
        x = prompt.nextFloat();
        termo = x;
        soma = x;
        i = 1;
        x2 = x*x;

        for (int j = 1; j < n; j++) {
            i += 2;
            termo = - termo * x2 / (i * (i - 1));
            soma += termo;
        }
        System.out.println("Soma: " + soma);
    }
}
