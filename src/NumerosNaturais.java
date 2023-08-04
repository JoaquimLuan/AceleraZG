public class NumerosNaturais {

    public static void main(String[] args) {

        int numeroFinal = 1000;
        int soma = 0;

        for (int i = 1; i < numeroFinal; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos múltiplos de 3 e 5 abaixo de " + numeroFinal + " é: " + soma);
    }
}
