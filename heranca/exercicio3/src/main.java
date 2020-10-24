public class main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();
        Empregado empregado = new Empregado();
        Administrador administrador = new Administrador();
        Operario operario = new Operario();
        Vendedor vendedor = new Vendedor();

        // teste classe empregado
        empregado.setImposto(0.10);
        empregado.setSalarioBase(700.00);
        double salarioEmpregado = empregado.calcularSalarioEmpregado();
        System.out.println(salarioEmpregado);

        // teste classe administrador
        administrador.setAjudaDeCusto(400.00);
        System.out.println(administrador.calcularSalarioAdministrador(salarioEmpregado));

        // teste classe operario
        operario.setComissao(0.20);
        operario.setValorProducao(50.00);
        System.out.println(operario.calcularSalarioOperario(salarioEmpregado));

        // teste classe vendedor
        vendedor.setValorVendas(300.00);
        vendedor.setComissao(0.10);
        System.out.println(vendedor.calcularSalarioVendedor(salarioEmpregado));

    }
}
