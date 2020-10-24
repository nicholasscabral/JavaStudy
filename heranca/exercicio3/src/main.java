public class main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();
        Empregado empregado = new Empregado();
        Administrador administrador = new Administrador();
        Operario operario = new Operario();
        Vendedor vendedor = new Vendedor();

        // teste classe fornecedor
        fornecedor.setValorCredito(1200.00);
        fornecedor.setValorDivida(400.00);
        System.out.println("saldo do fornecedor: " + fornecedor.obterSaldo() + "R$");

        // teste classe empregado
        empregado.setImposto(0.10);
        empregado.setSalarioBase(700.00);
        double salarioEmpregado = empregado.calcularSalarioEmpregado();
        System.out.println("salario do empregado: " + salarioEmpregado + "R$");

        // teste classe administrador
        administrador.setAjudaDeCusto(400.00);
        double salarioAdministrador = administrador.calcularSalarioAdministrador(salarioEmpregado);
        System.out.println("salario do administrador: " + salarioAdministrador + "R$");

        // teste classe operario
        operario.setComissao(0.20);
        operario.setValorProducao(50.00);
        double salarioOperario = operario.calcularSalarioOperario(salarioEmpregado);
        System.out.println("salario do operario: " + salarioOperario + "R$");

        // teste classe vendedor
        vendedor.setValorVendas(300.00);
        vendedor.setComissao(0.10);
        double salarioVendedor = vendedor.calcularSalarioVendedor(salarioEmpregado);
        System.out.println("salario do vendedor: " + salarioVendedor + "R$");

    }
}
