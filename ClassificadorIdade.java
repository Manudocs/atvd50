import java.util.Scanner;

public class ClassificadorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas na turma? ");
        int quantidadePessoas = scanner.nextInt();

        // Verifica se a quantidade de pessoas é válida
        if (quantidadePessoas <= 0) {
            System.out.println("Quantidade inválida de pessoas. Insira um número positivo.");
            return;
        }

        int somaIdades = 0;

        // Loop para ler as idades e calcular a soma
        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }

        // Calcula a média de idade da turma
        double mediaIdade = (double) somaIdades / quantidadePessoas;

        // Classifica a turma com base na média de idade
        String classificacao;
        if (mediaIdade >= 0 && mediaIdade <= 25) {
            classificacao = "jovem";
        } else if (mediaIdade <= 60) {
            classificacao = "adulta";
        } else {
            classificacao = "idosa";
        }

        // Exibe a classificação da turma
        System.out.println("A turma é classificada como " + classificacao + " (média de idade: " + mediaIdade + ").");

        scanner.close();
    }
}


    



