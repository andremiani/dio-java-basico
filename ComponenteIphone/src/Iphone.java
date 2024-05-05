import DispositivosApple.AparelhoTelefonico;
import DispositivosApple.NavegadorWeb;
import DispositivosApple.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorWeb {

    // implementacao da interface ReprodutorMusical

    @Override
    public void tocar(String musica) {
        System.out.println("Reproduzindo musica " + musica + " no Iphone");
    }

    @Override
    public void pausar(String musica) {
        System.out.println("Pausando musica " + musica + " no Iphone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocar música " + musica + " no Iphone");
    }

    // implementacao da interface AparelhoTelefonico

    @Override
    public void ligar(String numero) {
        System.out.println("Ligar para " + numero + " no Iphone");
    }

    @Override
    public void atender(String numero) {
        System.out.println("Atender " + numero + "no Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz - Chamada não atendida no Iphone.");
    }

    // implementacao da interface NavegadorWeb

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo URL " + url + " no Iphone.");
    }

    @Override
    public void adicionarNovaAba(String url) {
        if (url != null)
            System.out.println("Abrindo URL " + url + " em nova aba no Iphone.");
        else
            System.out.println("Abrindo nova aba no Iphone.");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no Iphone.");
    }

}
