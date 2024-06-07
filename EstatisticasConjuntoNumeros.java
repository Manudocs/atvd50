import java.util.Scanner;

public class EstatisticasConjuntoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números no conjunto: ");
        int quantidade = scanner.nextInt();

        // Verifica se a quantidade é válida
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida. Por favor, insira um número positivo.");
            return;
        }

        // Variáveis para armazenar o menor valor, o maior valor e a soma dos valores
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        System.out.println("Digite os números do conjunto:");

        // Loop para ler os números e calcular o menor valor, o maior valor e a soma dos valores
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            // 



