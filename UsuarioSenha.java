import java.util.Scanner;

public class UsuarioSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeUsuario;
        String senha;

        while (true) {
            System.out.print("Digite o nome de usuário: ");
            nomeUsuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();

            if (!senha.equals(nomeUsuario)) {
                System.out.println("Cadastro realizado com sucesso!");
                break; // Sai do loop se a senha não for igual ao nome do usuário
            } else {
                System.out.println("Erro: a senha não pode ser igual ao nome de usuário. Tente novamente.");
            }
        }
        
        scanner.close(); // Fecha o scanner após a conclusão do loop
    }
}
