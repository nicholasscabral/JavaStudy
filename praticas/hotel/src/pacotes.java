
public class pacotes {
    private final inclusos incluso;
    quartos quarto;
    String nome;
    int valor;

    public pacotes(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
        this.incluso = new inclusos(nome);
        this.quarto = new quartos().quartoDoPacote(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
 
    public inclusos getInclusos() {
        return incluso;
    }

    public quartos getQuarto() {
        return quarto;
    }

    @Override
    public String toString() {
        return "informações do pacote = {\n" +
                "   nome: " + nome + ",\n" +
                "   valor: R$ " + valor + ",\n" +
                "   Quarto: " + quarto + ",\n" +
                "   inclusos:" + incluso + "\n}";
    }
}
