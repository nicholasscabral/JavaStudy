public class Biscoito extends Produto {
    int componentesCancer;

    public int getComponentesCancer() {
        return componentesCancer;
    }

    public void setComponentesCancer(int componentesCancer) {
        this.componentesCancer = componentesCancer;
    }

    @Override
    public String toString() {
        return "{\n   nome: " + nome + ",\n" +
                "   preco: " + preco + "R$,\n" +
                "   componentes cancer: " + componentesCancer + "\n}";
    }
}
