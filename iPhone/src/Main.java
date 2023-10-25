public class Main {
    public static void main (String[] args){
        Iphone iphone = new Iphone();

        // Navegador
        iphone.exibirPagina("https://google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        // Reprodutor musical
        iphone.selecionarMusica("Evanescence - Bring Me To Life");
        iphone.tocar();
        iphone.pausar();

        // Telefone
        iphone.ligar(9999999999);
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
}
