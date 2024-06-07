import java.util.Scanner;

public class VerificadorNumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        // Verifica se o número é primo
        boolean ehPrimo = verificarNumeroPrimo(numero);

        // Exibe o resultado
        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }

    // Método para verificar se um número é primo
    public static boolean verificarNumeroPrimo(int numero) {
        // Números menores ou iguais a 1 não são primos
        if (numero <= 1) {
            return false;
        }

        // Verifica se o número é divisível por algum número além de 1 e ele mesmo
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}


    



