public class MultiplosCatch {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominador = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominador[i] + " = " + (numeros[i]/denominador[i]));
            }
            catch (ArithmeticException execption) {
                System.out.println("erro ao dividir por zero");
            }
            catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("posição do array inválida");
            }
        }

        // OUTPUT
        /*
        4/2 = 2
        erro ao dividir por zero
        16/4 = 4
        32/8 = 4
        erro ao dividir por zero
        posição do array inválida
        */
    }
}
