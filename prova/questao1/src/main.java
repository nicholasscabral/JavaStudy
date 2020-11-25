public class main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("nicholas");
        fornecedor.setTelefone("99998888");
        fornecedor.setEndereco("rua imaginaria");
        fornecedor.setValorCredito(500);
        fornecedor.setValorDivida(300);
        System.out.println(fornecedor);

        //////////////////////////

        Empregado empregado = new Empregado();
        empregado.setNome("nicholas");
        empregado.setTelefone("99998888");
        empregado.setEndereco("rua imaginaria");
        empregado.setSalarioBase(1000);
        empregado.setImposto(0.10);
        System.out.println(empregado);

        //////////////////////////////

        Administrador administrador = new Administrador();
        administrador.setNome("nicholas");
        administrador.setTelefone("99998888");
        administrador.setEndereco("rua imaginaria");
        administrador.setAjudaDeCusto(400);
        administrador.setSalarioBase(2000);
        administrador.setImposto(0.10);
        System.out.println(administrador);
    }
}
