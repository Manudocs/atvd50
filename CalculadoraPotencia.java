import java.util.Scanner;

public class CalculadoraPotencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a base e o expoente
        System.out.print("Digite a base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();

        // Calcula a potência
        long resultado = calcularPotencia(base, expoente);

        // Exibe o resultado
        System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);

        scanner.close();
    }

    // Método para calcular a potência
    public static long calcularPotencia(int base, int expoente) {
        long resultado = 1;

        // Caso especial: se o expoente for 0, o resultado é 1
        if (expoente == 0) {
            return 1;
        }

        // Caso especial: se o expoente for negativo, inverte a base e torna o expoente positivo
        if (expoente < 0) {
            base = 1 / base;
            expoente = -expoente;
        }

        // Calcula a potência multiplicando a base pelo número de vezes do expoente
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        return resultado;
    }
}
