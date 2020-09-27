import java.util.Scanner;

public class desafio2 {
    Scanner input = new Scanner(System.in);
    int somaRaios; // quantidade de centimetros para 1 alvo
    int raio; //raio dos outros circulos

    public void resolucao() {

        System.out.println("digite o diametro do maior circulo em centimetros");
        int diametro = input.nextInt();

        int raioDoMaior = diametro / 2;
        int distancia = raioDoMaior / 6; // distancia entre cada cada circuito

        somaRaios = raioDoMaior; //raio maior como valor incial da soma

        for (int i = 1; i < 6; i++) { // executando 5 repetições
            raio = raioDoMaior - ( distancia * i );
            //System.out.println(raio);
            somaRaios += raio;
            //System.out.println("soma: " + somaRaios);
        }

        System.out.println("Serão necessários " + somaRaios * 5000 + " centimetros de papelão");
    }
}




