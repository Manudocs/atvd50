import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo para encontrar todos os primos até ele: ");
        int limite = scanner.nextInt();

        // Verifica se o limite fornecido é válido
        if (limite <= 1) {
            System.out.println("Número inválido. Insira um número inteiro positivo maior que 1.");
            return;
        }

        // Array para marcar os números como primos ou não primos
        boolean[] numerosPrimos = new boolean[limite + 1];
        for (int i = 2; i <= limite; i++) {
            numerosPrimos[i] = true;
        }

        // Contador de divisões
        int divisoes = 0;

        // Algoritmo da Peneira de Eratóstenes para encontrar os números primo


    



