public class quartos {
    int camas, capacidade;

    public quartos(int camas, int capacidade) {
        this.camas = camas;
        this.capacidade = capacidade;
    }

    public quartos() {

    }

    public quartos quartoDoPacote(String nomeDoPacote) {
        switch (nomeDoPacote) {
            case "Familia":
                return new quartos(2, 4);
            case "Casal":
                return new quartos(1, 2);
            case "Solteiro":
                return new quartos(1, 1);
        }

        return new quartos().quartoDoPacote(nomeDoPacote);
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "{ Camas: " + camas + ",Capacidade: " + capacidade + " }";
    }
}

