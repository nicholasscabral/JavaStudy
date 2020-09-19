import java.util.ArrayList;

public class inclusos {
    // Caso queira Cadastrar os inclusos
    /* ArrayList<String> inclusos = new ArrayList<>();
    int NumeroDeInclusos;
    Scanner input = new Scanner(System.in);

    public ArrayList CadastrarInslusos() {
        System.out.println("Quantos beneficios ha nesse pacote?");
        NumeroDeInclusos = input.nextInt();
        inclusos.clear();

        for (int i = 0; i < NumeroDeInclusos; i++) {
            System.out.println((i+1) + "º incluso");
            String incluso = input.next();
            inclusos.add(incluso);
        }

        return inclusos;
    }
    */

    ArrayList<String> inclusos = new ArrayList<>();

    public inclusos(String nomeDoPacote) {
        switch (nomeDoPacote) {
            case "Familia":
                inclusos.add("cafe da manhã");
                inclusos.add("lan House");
                inclusos.add("sala de jogos");
                break;
            case "Casal":
                inclusos.add("jantar romantico");
                inclusos.add("piscina");
                inclusos.add("hidromassagem");
                break;
            case "Solteiro":
                inclusos.add("cafe da manhã");
                inclusos.add("lan House");
                inclusos.add("sala de jogos");
                break;
        }
    }

    @Override
    public String toString() {
        return "" + inclusos;
    }
}


