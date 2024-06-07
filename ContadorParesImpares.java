import java.util.Scanner;

public class ContadorParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadePares = 0;
        int quantidadeImpares = 0;

        System.out.println("Digite 10 números inteiros:");

        // Loop para solicitar e contar os números pares e ímpares
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        }

        // Exibe a quantidade de números pares e ímpares
        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);

        scanner.close();
    }
}

