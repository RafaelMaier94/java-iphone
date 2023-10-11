package IPhone;

import Browser.Browser;
import MusicPlayer.MusicPlayer;
import Phone.Phone;

public class IPhone implements Browser, Phone, MusicPlayer {

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String nomeDaMusica) {
        System.out.println("Música selecionada: " + nomeDaMusica);

    }

    @Override
    public void ligar(int numeroDoTelefone) {
        System.out.println("Ligando para o número: " + numeroDoTelefone);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo telefone");
    }

    @Override
    public void iniciarCorreioDeVoz(String mensagem) {
        System.out.println("Gravando mensagem de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando página: " + url);
    }

    @Override
    public void addNovaAba() {
        System.out.println("Abrindo nova aba");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}