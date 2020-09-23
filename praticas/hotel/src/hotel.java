import java.util.ArrayList;
import java.util.Scanner;

public class hotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int escolha, acompanhantes, diasDeEstadia;
        String responsavel, pacoteEscolhido;
        ArrayList<quartos> ListaQuartos = new ArrayList<>();
        ArrayList<pacotes> ListaPacotes = new ArrayList<>();

        //casdtrar pacotes
        {
            pacotes pacoteFamilia = new pacotes("Familia", 1500);
            ListaPacotes.add(pacoteFamilia);
            ListaQuartos.add(pacoteFamilia.getQuarto());

            pacotes pacoteCasal = new pacotes("Casal", 900);
            ListaPacotes.add(pacoteCasal);
            ListaQuartos.add(pacoteCasal.getQuarto());
            
            pacotes pacoteSolteiro = new pacotes("Solteiro", 400);
            ListaPacotes.add(pacoteSolteiro);
            ListaQuartos.add(pacoteSolteiro.getQuarto());
        }


        System.out.println("Oque deseja fazer? \n" +
                "1- Check-in \n" +
                "2- opções de quartos \n" +
                "3- opções de pacotes \n" +
                "4- restaurante");
        escolha = input.nextInt();
        if (escolha == 1) {
            System.out.println("nome do responsavel");
            responsavel = input.next();
            System.out.println("numero de acompanhantes");
            acompanhantes = input.nextInt();
            System.out.println("dias de estadia");
            diasDeEstadia = input.nextInt();
            for (pacotes i : ListaPacotes) {
                System.out.println(i);
            }
            System.out.println("nome do pacote escolhido: ");
            pacoteEscolhido = input.next();
            hospedes familia = new hospedes(responsavel, acompanhantes, diasDeEstadia, pacoteEscolhido);
            System.out.println("1 familia cadastrada \n" + familia);
        }
        else if (escolha == 2) {
            for (int i = 0; i < ListaQuartos.size(); i++) {
                System.out.println("Quarto " + (i+1) + ListaQuartos.get(i));
            }
        }
        else if (escolha == 3) {
            for (pacotes i : ListaPacotes) {
                System.out.println(i);
            }
        }
        else if (escolha == 4) {
            System.out.println("mesa para quantas pessoas?");
            int pessoas = input.nextInt();
            new restaurantes().reserva(pessoas);

            System.out.println("deseja fazer seu pedido agora?");
            String fazerPedido = input.next();
            if (fazerPedido.equals("sim")) {
                new restaurantes().atendimento();

            }
        }
    }
}
