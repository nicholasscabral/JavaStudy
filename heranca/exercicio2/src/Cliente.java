public class Cliente extends Pessoa {
    private  double valorDivida;
    private int anoNascimento;

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Cliente = {\n" +
                "  nome: " + getNome() + ",\n" +
                "  idade: " + getIdade() + ",\n" +
                "  sexo: " + getSexo() + ",\n" +
                "  valor da divida: " + getValorDivida() + "R$,\n" +
                "  ano de nascimento: " + getAnoNascimento() + "\n}";
    }
}
