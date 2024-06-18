import dispositivo.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("XS", 64, 100, "IOS 14");

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Eye of the Tiger");
        iphone.ligar("74999");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("www.eu.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}