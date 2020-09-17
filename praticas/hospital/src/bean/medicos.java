package bean;

import java.util.Scanner;

public class medicos {
    String nome;
    int crm;
    Scanner input = new Scanner(System.in);

    public medicos(String nome, int crm) {
        this.nome = nome;
        this.crm = crm;
    }

    public medicos() {

    }

    public void consultar() {
        System.out.println("digite seus sintomas");
        String sintomas = input.nextLine();
    }

    public void operar() {

    }

    public medicos preenchimento() {
        System.out.println("digite o nome do medico");
        nome = input.nextLine();
        System.out.println("digite o CRM do medico");
        crm = input.nextInt();

        medicos medico = new medicos(nome, crm);

        return medico;
    }

    @Override
    public String toString() {
        return "Dados do Medico = {\n" +
                "   nome: " + nome + ",\n" +
                "   CRM: " + crm + "\n}";
    }
}
