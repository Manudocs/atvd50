import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n para gerar a série de Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("Série de Fibonacci até o " + n + "º termo:");

        // Exibe os n primeiros termos da série de Fibonacci
        for (int i = 1; i <= n; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }

        scanner.close();
    }

    // Método para calcular o n-ésimo termo da série de Fibonacci
    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int termoAnterior = 0;
        int termoAtual = 1;

        for (int i = 2; i <= n; i++) {
            int proximoTermo = termoAnterior + termoAtual;
            termoAnterior = termoAtual;
            termoAtual = proximoTermo;
        }

        return termoAtual;
    }
}

