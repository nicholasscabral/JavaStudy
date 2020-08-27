import java.util.Scanner;

public class fatorial {
    Scanner prompt = new Scanner(System.in);
    int n;
    int prod = 1;
    int i = 0;

    public void fat() {
        System.out.println("valor de n: ");
        n = prompt.nextInt();
        while(i < n) {
            i++;
            prod *= i;
        }
        System.out.println("fatorial de " + n + " = " + prod);
    }
}
