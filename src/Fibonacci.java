public class Fibonacci {

    public static void main(String[] args) {

        int numFinal = 4000000;
        int numAnterior1 = 1;
        int numAterior2 = 2;
        int numAtual = 3;
        int soma = 2;

        while (numAtual <= numFinal) {
            if (numAtual % 2 == 0) {
                soma += numAtual;
            }
            numAnterior1 = numAterior2;
            numAterior2 = numAtual;
            numAtual = numAnterior1 + numAterior2;
        }

        System.out.println("A soma dos termos de valor par na sequência de Fibonacci até " + numFinal + " é: " + soma);
    }
}
