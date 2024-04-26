public class App {

    public static void main(String[] args) throws Exception {

        ContaTerminal contaTerminal = new ContaTerminal();
        String[] dadosCliente = ContaTerminal.PegarDadosCliente();
        contaTerminal.CriarConta(dadosCliente);

    }
}
