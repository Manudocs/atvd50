import java.util.Scanner;

public class EstatisticasConjuntoNumerosnovo {
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
        int menor = 1001; // Inicializado com um valor maior que 1000
        int maior = -1;   // Inicializado com um valor menor que 0
        int soma = 0;

        System.out.println("Digite os números do conjunto (entre 0 e 1000):");

        // Loop para ler os números e calcular o menor valor, o maior valor e a soma dos valores
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            // Verifica se o número está dentro do intervalo permitido
            if (numero < 0 || numero > 1000) {
                System.out.println("Número inválido. Insira um número entre 0 e 1000.");
                return;
            }

            // Atualiza o menor valor
            if (numero < menor) {
                menor = numero;
            }

    



