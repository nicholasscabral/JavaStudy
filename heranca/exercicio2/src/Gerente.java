public class Gerente extends Empregado{
    private String nomeGerencia;

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString() {
        return "Gerente = {\n" +
                "  nome: " + getNome() + ",\n" +
                "  idade: " + getIdade() + ",\n" +
                "  matricula: " + getMatricula() + ",\n" +
                "  nome da gerencia: " + getNomeGerencia() + ",\n" +
                "  valor do INSS: " + valorInss() + "R$\n}";
    }
}
