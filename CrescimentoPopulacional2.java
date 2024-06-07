import java.util.Scanner;

public class CrescimentoPopulacional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            int populacaoA, populacaoB;
            double taxaCrescimentoA, taxaCrescimentoB;
            int anos = 0;

            // Entrada e validação das populações
            do {
                System.out.print("Digite a população inicial do país A: ");
                populacaoA = scanner.nextInt();
                if (populacaoA <= 0) {
                    System.out.println("A população inicial deve ser um número positivo.");
                }
            } while (populacaoA <= 0);

            do {
                System.out.print("Digite a população inicial do país B: ");
                populacaoB = scanner.nextInt();
                if (populacaoB <= 0) {
                    System.out.println("A população inicial deve ser um número positivo.");
                }
            } while (populacaoB <= 0);

            // Entrada e validação das taxas de crescimento
            do {
                System.out.print("Digite a taxa de crescimento anual do país A (em decimal): ");
                taxaCrescimentoA = scanner.nextDouble();
                if (taxaCrescimentoA <= 0) {
                    System.out.println("A taxa de crescimento deve ser um número positivo.");
                }
            } while (taxaCrescimentoA <= 0);

            do {
                System.out.print("Digite a taxa de crescimento anual do país B (em decimal): ");
                taxaCrescimentoB = scanner.nextDouble();
                if (taxaCrescimentoB <= 0) {
                    System.out.println("A taxa de crescimento deve ser um número positivo.");
                }
            } while (taxaCrescimentoB <= 0);

            // Cálculo do número de anos necessários
            while (populacaoA <= populacaoB) {
                populacaoA += populacaoA * taxaCrescimentoA;
                populacaoB += populacaoB * taxaCrescimentoB;
                anos++;
            }

            // Exibição do resultado
            System.out.println("Número de anos necessários: " + anos);

            // Verificação se o usuário deseja repetir a operação
            System.out.print("Deseja realizar outra operação? (s/n): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        scanner.close();
    }
}
