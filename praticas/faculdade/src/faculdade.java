import java.util.ArrayList;
import java.util.Scanner;

public class faculdade {
    private static Object curso;
    private static Object aluno;
    private static Object disciplinas;

    public static <aluno, curso, professor> void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, area, cursando;
        int semestres, matricula, fazer;
        boolean adicionar = true;
        boolean refazer = true;
        ArrayList<aluno> ListaAlunos = new ArrayList<>();
        ArrayList<curso> ListaCursos = new ArrayList<>();
        ArrayList<professor> ListaProfessores = new ArrayList<>();
        alunos aluno = new alunos();
        cursos curso = new cursos();
        professores professor = new professores();

        /*
        //predefinidos teste aluno
        ListaAlunos.add(0, aluno.AddAluno("nicholas", "engenharia de computação", 2010373));
        ListaAlunos.add(1, aluno.AddAluno("junior", "engenharia de produção", 1122334));
        System.out.println(ListaAlunos);
        for (aluno i : ListaAlunos) {
            System.out.println(aluno);
        }
        //predefinido teste curso
        ListaCursos.add(0, (curso) curso.AddCurso("odontologia", 10, "saude"));
        ListaCursos.add(1, (curso) curso.AddCurso("engenharia", 10, "tecnologia"));
        for (curso i : ListaCursos) {
            System.out.println(curso);
        }
        */
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
                    ListaCursos.add(curso.AddCurso(nome, semestres, area));
                    System.out.println(curso);

                    // verificar se o usuário deseja cadastrar um novo aluno
                    System.out.println("Deseja adicionar outro curso? true ou false?");
                    adicionar = input.nextBoolean();
                }
                System.out.println("deseja fazer outra consulta? true ou false");
                refazer = input.nextBoolean();
            }
            else if (fazer == 2) { // Cadastrar Aluno
                adicionar = true;
                //alunos aluno = new alunos();
                while (adicionar) {
                    System.out.println("nome do aluno: ");
                    nome = input.next();
                    System.out.println("matricula do aluno: ");
                    matricula = input.nextInt();
                    System.out.println("curso do aluno: ");
                    cursando = input.next();
                    ListaAlunos.add(aluno.AddAluno(nome, cursando, matricula));

                    // verificar se o usuário deseja cadastrar um novo aluno
                    System.out.println("desejar adicionar outro aluno? true ou false?");
                    adicionar = input.nextBoolean();
                }
                System.out.println("deseja fazer outra consulta? true ou false");
                refazer = input.nextBoolean();
                for (aluno i : ListaAlunos) {
                    System.out.println(aluno);
                }
            }
            else if (fazer == 3) {
                adicionar = true;
                while (adicionar) {
                    System.out.println("nome do professor: ");
                    nome = input.next();
                    System.out.println("matricula do professor: ");
                    matricula = input.nextInt();
                    ListaProfessores.add(professor.AddProfessor(nome, matricula));

                    // verificar se o usuario deseja cadastrar um novo professor
                    System.out.println("desejar adicionar outro professor? true ou false?");
                    adicionar = input.nextBoolean();
                }
                System.out.println("deseja fazer outra consulta? true ou false");
                refazer = input.nextBoolean();
                for (int i = 0; i < ListaProfessores.size(); i++) {
                    System.out.println("professor "+ (i+1) + "\n" + professor);
                }
            }
        }
    }
}