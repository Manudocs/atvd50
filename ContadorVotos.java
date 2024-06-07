import java.util.Scanner;

public class ContadorVotos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        // Verifica se o número total de eleitores é válido
        if (totalEleitores <= 0) {
            System.out.println("Número inválido de eleitores. Insira um número positivo.");
            return;
        }

        // Variáveis para armazenar os votos de cada candidato
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;

        // Loop para registrar os votos de cada eleitor
        for (int i = 1; i <= totalEleitores; i++) {
            System.out.println("Eleitor " + i + ":");
            System.out.println("Digite o número do candidato (1, 2 ou 3): ");
            int voto = scanner.nextInt();

            // Verifica se o voto é válido e contabiliza
            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                default:
                    System.out.println("Voto inválido. Por favor, vote novamente.");
                    i--; // Reduz o índice para permitir que o eleitor vote novamente
                    break;
            }
        }

        // Exibe o resultado dos votos de cada candidato
        System.out.println("Resultado da eleição:");
        System.out.println("Candidato 1: " + votosCandidato1 + " votos");
        System.out.println("Candidato 2: " + votosCandidato2 + " votos");
        System.out.println("Candidato 3: " + votosCandidato3 + " votos");

        scanner.close();
    }
}


    



