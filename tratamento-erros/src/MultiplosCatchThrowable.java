public class MultiplosCatchThrowable {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128}; // array com 6 posições (0 - 5)
        int[] denominador = {2, 0, 4, 8, 0}; // array com 5 posições (0 - 4)

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominador[i] + " = " + (numeros[i]/denominador[i]));
            }
            catch (ArithmeticException execption) {
                System.out.println("erro ao dividir por zero");
            }
            catch (Throwable exception) {
                // Throwable: qualquer erro/exceção que aconteça
                System.out.println("ocorreu um erro na " + (i + 1) + "º repetição");
            }
        }

        // OUTPUT
        /*
        4/2 = 2
        erro ao dividir por zero
        16/4 = 4
        32/8 = 4
        erro ao dividir por zero
        ocorreu um erro na 6º repetição
        */
    }
}
