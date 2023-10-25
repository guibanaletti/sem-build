public class Iphone  implements ReprodutorMusical, Telefone, Navegador{

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Exibindo página");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta");


    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");


    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo " + selecionarMusica(););


    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");


    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música: '" + musica + "' selecionada");

    }

    @Override
    public void ligar() {
        System.out.println("Iniciando chamada");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");


    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");


    }

}
