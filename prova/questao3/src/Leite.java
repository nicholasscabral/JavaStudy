public class Leite extends Produto {
    int validade;

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        return "{\n   nome: " + nome + ",\n" +
                "   preco: " + preco + "R$,\n" +
                "   validade: " + validade + " dias\n}";
    }
}
