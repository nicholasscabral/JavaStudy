import java.util.Scanner;

public class fibonacci {
    int n;
    int a = 0;
    int b = 1;
    int i = 2;
    Scanner prompt = new Scanner(System.in);

    public void gerarNumeros() {
        System.out.println("Numero de termos: ");
        n = prompt.nextInt();

        while(i < n) {
            System.out.print(a + ", " + b + ", ");
            a += b;
            b += a;
            i += 2;
        }
        if (i == n) {
            System.out.print(a + ", " + b);
        }
        else {
            System.out.print(a);
        }
    }
}
