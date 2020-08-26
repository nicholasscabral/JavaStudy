import java.util.Scanner;

public class terceira {
    int n, num, soma = 0, i = 0, contpar = 0, contimpar= 0;
    Scanner prompt = new Scanner(System.in);

    public void somaNumeros() {
        System.out.println("Quantidade de numeros ");
        n = prompt.nextInt();
        while(i < n) {
            i++;
            System.out.println("Numero: ");
            num = prompt.nextInt();
            soma += num;
        }
        System.out.println("soma dos numeros: " + soma);
    }

    public void mediaNumeros() {
        System.out.println("quantidade de numeros: ");
        n = prompt.nextInt();
        while(i < n) {
            i++;
            System.out.println("digite um numero");
            num = prompt.nextInt();
            soma += num;
        }
        System.out.println("a media dos numeros é: " + soma/n);
    }

    public void paresImpares() {
        System.out.println("quantidade de numeros");
        n = prompt.nextInt();
        while(i < n) {
            i++;
            System.out.println("digite o numero");
            num = prompt.nextInt();
            if(num % 2 == 0) {
                contpar++;
            }
            else {
                contimpar++;
            }
        }
        System.out.println("quantidade de pares: " + contpar);
        System.out.println("quantidade de impares: " + contimpar);
    }
}
