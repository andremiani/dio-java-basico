import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        // System.out.println("Escolha uma opção:\n1. Depositar\n2. Sacar\n3. Ver
        // saldo\n4. Encerrar");

        // Loop infinito para manter o programa em execução até que o usuário decida
        // sair
        while (true) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    saldo = depositar(scanner, saldo);
                    break;
                case 2:
                    try {
                        saldo = sacar(scanner, saldo);
                    } catch (SaldoInsuficienteException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    verSaldo(saldo);
                    break;
                case 0:
                    encerrar();
                    return; // Encerra o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    /************************************************/
    /************* FUNÇÕES AUXILIARES ****************/
    /************************************************/

    public static double depositar(Scanner scanner, double saldo) {
        // System.out.println("Digite o valor do depósito:");
        double valorDeposito = scanner.nextDouble();
        saldo += valorDeposito;
        System.out.println("Saldo atual: " + saldo);
        return saldo;
    }

    public static double sacar(Scanner scanner, double saldo) throws SaldoInsuficienteException {
        // System.out.println("Digite o valor do saque:");
        double valorSaque = scanner.nextDouble();
        if (valorSaque > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        } else {
            saldo -= valorSaque;
            System.out.println("Saldo atual: " + saldo);
        }
        return saldo;
    }

    public static void verSaldo(double saldo) {
        System.out.println("Saldo atual: " + saldo);
    }

    public static void encerrar() {
        System.out.println("Programa encerrado.");
    }
}

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
