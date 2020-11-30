public class teste {
    public static void main(String[] args) {

        try{
            int[] vetor = new int[6]; // iniciando um array com 6 posições (0 - 5)

            System.out.println("texto antes do erro");

            vetor[7] = 10; // atribuindo um valor ao indice 7, porem gerará um erro pois esse indice nao existe

            System.out.println("texto nao será impresso devido ao erro");
        } catch (ArrayIndexOutOfBoundsException erro) {
            // tratando o erro para evitar que o programa quebre a execução e mostre um erro para o usuario
            System.out.println("tentando acessar index que nao existe, tamanho imcompativel");
        }

        System.out.println("esse texto será mostrado pois o erro foi tratado");
    }
}
