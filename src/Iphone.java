package src;

public class Iphone {
    public static void main(String[] args) {
        System.out.println(" ");
        AparelhoTelefonico aparelho = new AparelhoTelefonico();
        ReprodutorMusical musical = new ReprodutorMusical();
        NavegadorInternet navegador = new NavegadorInternet();

        aparelho.ligar();
        aparelho.atender();
        aparelho.iniciarCorreioVoz();

        System.out.println(" ");

        musical.selecionarMusica();
        musical.tocarMusica();
        musical.pausarMusica();

        System.out.println(" ");

        navegador.exibirPagina();
        navegador.atualizarPagina();
        navegador.adicionarNovaAba();
    }
}
