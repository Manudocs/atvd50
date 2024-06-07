import java.util.Scanner;

public class NumerosNoIntervalonovo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.println("Números no intervalo entre " + numero1 + " e " + numero2 + ":");

        // Determina o menor e o maior número para definir o intervalo
        int menor = Math.min(numero1, numero2);
        int maior = Math.max(numero1, numero2);

        // Variável para armazenar a soma dos números
        int soma = 0;

        // Loop para gerar e imprimir os números no intervalo e calcular a soma
        for (int i = menor; i <= maior; i++) {
            System.out.println(i);
            soma += i;
        }

        System.out.println("A soma dos números no intervalo é: " + soma);

        scanner.close();
    }
}
