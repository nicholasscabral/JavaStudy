public class Cachorro extends Animal {
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "cachorro = {\n" +
                "  nome: " + getNome() + ",\n" +
                "  peso: " + getPeso() + "kg,\n" +
                "  raça: " + getRaca() + "\n}";
    }
}
