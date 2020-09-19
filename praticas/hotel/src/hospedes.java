public class hospedes {
    String responsavel, pacote;
    int acompanhantes, diasDeEstadia;

    public hospedes(String responsavel, int acompanhantes, int diasDeEstadia, String pacote) {
        this.responsavel = responsavel;
        this.acompanhantes = acompanhantes;
        this.diasDeEstadia = diasDeEstadia;
        this.pacote = pacote;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String nome) {
        this.responsavel = nome;
    }

    public int getAcompanhantes() {
        return acompanhantes;
    }

    public void setAcompanhantes(int acompanhantes) {
        this.acompanhantes = acompanhantes;
    }

    public int getDiasDeEstadia() {
        return diasDeEstadia;
    }

    public void setDiasDeEstadia(int diasDeEstadia) {
        this.diasDeEstadia = diasDeEstadia;
    }

    public String getPacote() {
        return pacote;
    }

    public void setPacote(String pacote) {
        this.pacote = pacote;
    }

    @Override
    public String toString() {
        return "informações do hospede = {\n" +
                "   responsavel: " + responsavel + ",\n" +
                "   numero de acompanhantes: " + acompanhantes + ",\n" +
                "   dias de estadia: " + diasDeEstadia + ",\n" +
                "   pacote escolhido: " + pacote + "\n}";
    }
}
