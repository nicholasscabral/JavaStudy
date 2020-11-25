public class PessoaFisica extends Pessoa {
    private long cpf;

    public PessoaFisica(String nome, long cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public void print() {
        super.print();
        System.out.println("cpf: " + cpf);
    }
}
