import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificadorElegibilidadeConta {

    // Constante para representar a idade mínima para criar uma conta bancária
    private static final int IDADE_MINIMA_PARA_CONTA = 18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a idade ao usuário
        System.out.println("Digite sua idade:");

        // Verificar se o usuário inseriu um número
        try {
            int idade = scanner.nextInt();

            // Verificar elegibilidade
            if (idade >= IDADE_MINIMA_PARA_CONTA) {
                System.out.println("Você está elegível para criar uma conta bancária.");
            } else {
                System.out.println("Você não está elegível para criar uma conta bancária.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, insira um número válido.");
        } finally {
            // Fechar o objeto Scanner para liberar recursos
            scanner.close();
        }
    }
}
