import java.util.Scanner;

public class desafio13 {
    Scanner input = new Scanner(System.in);
    int numero, potencia, digitoInt;
    int soma = 0;

    public void resolucao() {
        System.out.println("Digite um numero para saber se ele é Narcisista ou não");
        numero = input.nextInt();

        char[] digitos = String.valueOf(numero).toCharArray(); // transformando cada o valor da String de numero em um array de caracteres

        for (char digito : digitos) {

            String digitoString = String.valueOf(digito); // convertendo cada digito do numero para String
            digitoInt = Integer.parseInt(digitoString); // convertendo cada digitoString do numero para Int

            potencia = (int) Math.pow(digitoInt, digitos.length); // elevando o digito a quantidade de digitos do numero

            soma += potencia;
        }

        if (soma == numero) {
            System.out.println("o numero " + numero + " é Narcisista");
        }
        else System.out.println("o numero " + numero + " NÃO é Narcisista");
    }
}
