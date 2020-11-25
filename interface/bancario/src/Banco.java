import java.util.ArrayList;

public class Banco implements Imprimivel {
    ArrayList<ContaBancaria> ListaContas = new ArrayList<>();

    public void inserir(ContaBancaria conta) {
        ListaContas.add(conta);
        System.out.println("Conta adiconada com sucesso");
    }

    public void remover(ContaBancaria conta) {
        ListaContas.remove(conta);
        System.out.println("Conta removida com sucesso");
    }

    public void procurarConta(int numero) {
        boolean achou = false;
        for (int i = 0; i < ListaContas.size(); i++) {
            if (ListaContas.get(i).getNumeroConta() == numero) {
                achou = true;
                ListaContas.get(i).mostrarDados();
                break;
            }
        }
        if (!achou) {
            System.out.println("Conta não encontrada");
        }
    }

    @Override
    public void mostrarDados() {
        ListaContas.forEach(
                contaBancaria -> contaBancaria.mostrarDados()
        );
    }
}
