public class main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();

        // teste classe cliente
        cliente.setNome("nicholas");
        cliente.setIdade(19);
        cliente.setSexo("masculino");
        cliente.setAnoNascimento(2001);
        cliente.setValorDivida(500);
        System.out.println(cliente);

        // teste classe gerente
        gerente.setNome("Joao");
        gerente.setIdade(20);
        gerente.setSalario(3000);
        gerente.setMatricula("102030");
        gerente.setNomeGerencia("financeiro");
        System.out.println(gerente);

        // teste classe vendedor
        vendedor.setNome("Pedro");
        vendedor.setSalario(1500);
        vendedor.setValorVendas(300);
        vendedor.setQntVendas(30);
        System.out.println(vendedor);

    }
}
