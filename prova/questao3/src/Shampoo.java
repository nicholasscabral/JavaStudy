public class Shampoo extends Produto {
    int irritabilidade;

    public int getIrritabilidade() {
        return irritabilidade;
    }

    public void setIrritabilidade(int irritabilidade) {
        this.irritabilidade = irritabilidade;
    }

    @Override
    public String toString() {
        return "{\n   nome: " + nome + ",\n" +
                "   preco: " + preco + "R$,\n" +
                "   irritabilidade: " + irritabilidade + "\n}";
    }
}
