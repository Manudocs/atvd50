import java.util.Scanner;

public class GeradorTabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número para a tabuada
        System.out.print("Digite um número inteiro entre 1 e 10 para gerar a tabuada: ");
        int numero = scanner.nextInt();

        // Verifica se o número fornecido está dentro do intervalo válido
        if (numero < 1 || numero > 10) {
            System.out.println("Número inválido. Por favor, digite um número entre 1 e 10.");
        } else {
            System.out.println("Tabuada de " + numero + ":");

            // Loop para gerar e imprimir a tabuada
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " X " + i + " = " + resultado);
            }
        }

        scanner.close();
    }
}
