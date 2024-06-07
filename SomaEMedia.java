import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        double media;
        int quantidadeNumeros = 5;

        System.out.println("Digite 5 números:");

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            soma += numero; // Adiciona o número à soma
        }

        // Calcula a média
        media = (double) soma / quantidadeNumeros;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
