import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaTerminal {

    int conta = 1021;
    String agencia = "067-8";
    String nomeCliente = "André Miani";
    Double saldo = 237.48;

    public static String[] PegarDadosCliente() {

        try (Scanner terminal = new Scanner(System.in)) {

            System.out.println("Informe o número da conta");
            int conta = terminal.nextInt();
            System.out.println("Informe o número da agência");
            String agencia = terminal.next();
            System.out.println("Informe o nome do cliente");
            String nomeCliente = terminal.next();
            System.out.println("Informe o saldo inicial");
            double saldo = terminal.nextDouble();
            terminal.close();

            List<String> dadosCliente = new ArrayList<String>();

            // Adding elements to ArrayList
            dadosCliente.add(conta + "");
            dadosCliente.add(agencia);
            dadosCliente.add(nomeCliente);
            dadosCliente.add(saldo + "");

            String[] stringArray = dadosCliente.toArray(new String[0]);

            return stringArray;
        }

    }

    public void CriarConta(String[] args) throws Exception {

        String conta = args[0];
        String agencia = args[1];
        String nomeCliente = args[2];
        String saldo = args[3];

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

    }

}
