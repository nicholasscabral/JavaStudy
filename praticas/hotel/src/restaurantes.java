import java.util.ArrayList;
import java.util.Scanner;

public class restaurantes {
    ArrayList<String> pratos = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public restaurantes() {

    }

    private ArrayList pratos() {
        pratos.add("macarronada");
        pratos.add("sushi");
        pratos.add("feijoada");
        pratos.add("salada");
        pratos.add("carne");

        return pratos;
    }
    public void reserva(int pessoas) {
        int espera = (int) Math.round(Math.random() * 5);

        System.out.println("Há " + espera + " mesas para " + pessoas + " pessoas na sua frente");
        for (int i = espera - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.println("ainda há " + i + " mesas na sua frente");
            }
            else System.out.println("sua mesa está pronta");
        }
    }

    public void atendimento() {
        System.out.println("qual prato deseja? essa sao as opções: ");
        ArrayList pratos = new restaurantes().pratos();
        for (int i = 0; i < pratos.size(); i++) {
            System.out.println("opção " + (i+1) + " - " + pratos.get(i));
        }

        ArrayList<String> pedido = new ArrayList();
        String continuar = "sim";
        while (continuar.equals("sim")) {

            System.out.println("digite o numero da opção");
            int escolha = input.nextInt();
            pedido.add((String) pratos.get(escolha - 1));

            System.out.println("deseja pedir algo mais?");
            continuar = input.next();
        }
        System.out.println("seu pedido completo " + pedido);
    }

    public void pedido() {

    }
}
