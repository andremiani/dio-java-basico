import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;

        try {
            realizarSaque(saldo, saque, limiteChequeEspecial);
        } catch (LimitExceededException e) {
            // Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque
            // especial
            System.out.println(e.getMessage());
        } finally {
            // Fechamos o objeto Scanner para liberar os recursos:
            scanner.close();
        }

    } // end main method

    public static void realizarSaque(double saldo, double saque, double limiteChequeEspecial)
            throws LimitExceededException {

        double saldoComLimite = saldo + limiteChequeEspecial;

        if (saldo >= saque) {
            System.out.println("Transacao realizada com sucesso.");
        } else if (saldo < saque && saque <= saldoComLimite) {
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        } else {
            throw new LimitExceededException("Transacao nao realizada. Limite do cheque especial excedido.");
        }

    }
}

class LimitExceededException extends Exception {
    public LimitExceededException(String message) {
        super(message);
    }
}