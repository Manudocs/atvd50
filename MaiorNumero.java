import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE; // Inicializa a variável maior com o menor valor possível para int

        System.out.println("Digite 5 números:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero; // Atualiza o maior número se necessário
            }
        }

        System.out.println("O maior número digitado é: " + maior);

        scanner.close();
    }
}
