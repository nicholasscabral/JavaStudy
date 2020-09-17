package bean;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class pacientes {
    public String nome;
    private String cpf;
    String dataNascimento;
    private String sexo;
    Scanner input = new Scanner(System.in);

    public pacientes(String nome, String cpf, String sexo, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public pacientes() {

    }

    public void consultar () {

    }
    public void internar () {

    }
    public void fazerExame () {

    }

    public pacientes preenchimento() throws ParseException {
        System.out.println("nome do paciente");
        nome = input.nextLine();
        System.out.println("cpf do paciente");
        cpf = input.next();
        System.out.println("sexo do paciente");
        sexo = input.next();
        System.out.println("data de nascimento do paciente");
        dataNascimento = input.nextLine();

        DateFormat aux = new SimpleDateFormat("dd/MM/yyyy");
        Date data = aux.parse(dataNascimento);

        pacientes paciente = new pacientes(nome, cpf, sexo, dataNascimento);

        return paciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //public Date getDataNascimento() {
    //    return dataNascimento;
    //}

    //public void setDataNascimento(Date dataNascimento) {
        //this.dataNascimento = dataNascimento;
    //}

    @Override
    public String toString() {
        return "Dados do Paciente = {\n" +
                "   nome: " + nome + ",\n" +
                "   sexo: " + sexo + ",\n" +
                "   cpf: " + cpf + ",\n" +
                "   data de nascimento: " + dataNascimento + ",\n" +
                "}";
    }
}
