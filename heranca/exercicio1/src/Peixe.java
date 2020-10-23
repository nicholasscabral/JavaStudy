public class Peixe extends Animal {
    private String tipoHabitat;

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    @Override
    public String toString() {
        return "peixe = {\n" +
                "  nome: " + getNome() + ",\n" +
                "  peso: " + getPeso() + "kg,\n" +
                "  habitat: " + getTipoHabitat() + "\n}";
    }
}
