import java.util.ArrayList;
import java.util.Scanner;

public class faculdade {
    private static Object curso;
    private static Object aluno;
    private static Object disciplinas;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, area, cursando;
        int semestres, matricula, fazer;
        boolean adicionar = true;
        boolean refazer = true;
        ArrayList<alunos> ListaAlunos = new ArrayList<>();
        ArrayList<cursos> ListaCursos = new ArrayList<>();
        ArrayList<professores> ListaProfessores = new ArrayList<>();

        while (refazer) {
            // Checando oque o usuário deseja fazer
            System.out.println("Oque você deseja fazer? \n" +
                    "1- Cadastrar curso \n" +
                    "2- Cadastrar aluno \n" +
                    "3- Cadastrar um professor ");
            fazer = input.nextInt();
            if (fazer == 1) { // Cadastrar curso
                while (adicionar) {
                    System.out.println("nome do curso: ");
                    nome = input.next();
                    System.out.println("quantidade de semestres: ");
                    semestres = input.nextInt();
                    System.out.println("qual a area do curso: ");
                    area = input.next();
                    cursos curso = new cursos(nome, area, semestres);
                    ListaCursos.add(curso);

                    // verificar se o usuário deseja cadastrar um novo aluno
                    System.out.println("Deseja adicionar outro curso? true ou false?");
                    adicionar = input.nextBoolean();
                }
                System.out.println("deseja fazer outra consulta? true ou false");
                refazer = input.nextBoolean();
                for (cursos i : ListaCursos) {
                    System.out.println(i);
                }
            }
            else if (fazer == 2) { // Cadastrar Aluno
                adicionar = true;
                while (adicionar) {
                    System.out.println("nome do aluno: ");
                    nome = input.next();
                    System.out.println("matricula do aluno: ");
                    matricula = input.nextInt();
                    System.out.println("curso do aluno: ");
                    cursando = input.next();
                    alunos aluno = new alunos(nome, matricula, cursando);
                    ListaAlunos.add(aluno);

                    // verificar se o usuário deseja cadastrar um novo aluno
                    System.out.println("desejar adicionar outro aluno? true ou false?");
                    adicionar = input.nextBoolean();
                }
                System.out.println("deseja fazer outra consulta? true ou false");
                refazer = input.nextBoolean();
                for (alunos i : ListaAlunos) {
                    System.out.println(i);
                }
            }
            else if (fazer == 3) {
                adicionar = true;
                while (adicionar) {
                    System.out.println("nome do professor: ");
                    nome = input.next();
                    System.out.println("matricula do professor: ");
                    matricula = input.nextInt();
                    professores professor = new professores(nome, matricula);
                    ListaProfessores.add(professor);

                    // verificar se o usuario deseja cadastrar um novo professor
                    System.out.println("desejar adicionar outro professor? true ou false?");
                    adicionar = input.nextBoolean();
                }
                System.out.println("deseja fazer outra consulta? true ou false");
                refazer = input.nextBoolean();
                for (professores i : ListaProfessores) {
                    System.out.println(i);
                }
            }
        }
    }
}