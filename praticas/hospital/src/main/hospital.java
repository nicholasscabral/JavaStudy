package main;

import bean.medicos;
import bean.pacientes;

import java.text.ParseException;
import java.util.Scanner;

public class hospital {
    public static void main(String[] args) throws ParseException {
        int crm;
        String nome;
        Scanner input = new Scanner(System.in);

        medicos medico = new medicos();
        //medico.preenchimento();

        //System.out.println(medico);

        pacientes paciente1 = new pacientes();
        paciente1.preenchimento();

        System.out.println(paciente1);
    }
}