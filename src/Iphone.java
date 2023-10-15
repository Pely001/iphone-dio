public class Iphone implements ReprodutorMusica, NavegadorInternet, AparelhoTelefonico {

    @Override
    public void ligar() {
       System.out.println("Relizando chamada");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Gravando mensagem de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página de internet");
    }

    @Override
    public void adcionarNovaAba() {
        System.out.println("Nova Guia adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página Atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo Música");
    }

    @Override
    public void pausar() {
        System.out.println("Música Pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Escolha a música que quer ouvir");
    }
    
}
