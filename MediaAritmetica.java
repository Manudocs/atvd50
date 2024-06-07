import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas você deseja calcular a média? ");
        int quantidadeNotas = scanner.nextInt();

        // Verifica se a quantidade de notas é válida
        if (quantidadeNotas <= 0) {
            System.out.println("Quantidade inválida de notas. Insira um número positivo.");
            return;
        }

        double somaNotas = 0;

        // Loop para ler as notas e calcular a soma
        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();

            // Verifica se a nota é válida
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Insira uma nota entre 0 e 10.");
                return;
            }

            somaNotas += nota;
        }

        // Calcula e exibe a média aritmética das notas
        double media = somaNotas / quantidadeNotas;
        System.out.println("A média das " + quantidadeNotas + " notas é: " + media);

        scanner.close();
    }
}


    



