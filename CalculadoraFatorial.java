import java.util.Scanner;

public class CalculadoraFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número inteiro positivo menor que 16 para calcular o fatorial (ou digite -1 para sair): ");
            int numero = scanner.nextInt();

            if (numero == -1) {
                System.out.println("Programa encerrado.");
                break;
            }

            // Verifica se o número está dentro do intervalo permitido
            if (numero < 0 || numero >= 16) {
                System.out.println("Número inválido. Insira um número inteiro positivo menor que 16.");
            } else {
                // Calcula o fatorial do número fornecido
                long fatorial = calcularFatorial(numero);

                // Exibe o resultado
                System.out.println(numero + "! = " + fatorial);
            }
        }

        scanner.close();
    }

    // Método para calcular o fatorial de um número
    public static long calcularFatorial(int numero) {
        long fatorial = 1;

        // Calcula o fatorial do número usando um loop
        for (int i = 1; i <= numero; i++) {
            fatorial *

    



