public class NumerosPrimos {
    public static void main(String[] args) {

        long numero = 600851475143L;
        long maiorFatorPrimo = encontreMaiorFatorPrimo(numero);

        System.out.println("O maior fator primo do número " + numero + " é: " + maiorFatorPrimo);
    }

    public static long encontreMaiorFatorPrimo(long numero) {
        long maiorPrimo = 1;

        while (numero % 2 == 0) {
            maiorPrimo = 2;
            numero /= 2;
        }

        for (long i = 3; i <= Math.sqrt(numero); i += 2) {
            while (numero % i == 0) {
                maiorPrimo = i;
                numero /= i;
            }
        }

        if (numero > 2) {
            maiorPrimo = numero;
        }

        return maiorPrimo;
    }
}