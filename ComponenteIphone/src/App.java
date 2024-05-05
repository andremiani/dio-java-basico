
public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        System.out.println("-----------------------------------");
        System.out.println("------Funçoões do Telefone --------");
        System.out.println("-----------------------------------");
        iphone.ligar("+5521970917876");
        iphone.atender("+5521970917876");
        iphone.iniciarCorreioVoz();
        System.out.println("-----------------------------------");
        System.out.println("---------Funções do Ipod-----------");
        System.out.println("-----------------------------------");
        iphone.selecionarMusica("faixa 1");
        iphone.tocar("faixa 1");
        iphone.pausar("faixa 1");
        System.out.println("-----------------------------------");
        System.out.println("-------Funções do Navegador--------");
        System.out.println("-----------------------------------");
        iphone.exibirPagina("https://lucrandonaweb.com.br/");
        iphone.adicionarNovaAba(null);
        iphone.adicionarNovaAba("https://lucrandonaweb.com.br/");
        iphone.atualizarPagina();
    }
}
