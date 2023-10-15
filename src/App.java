public class App {
    public static void main(String[] args) throws Exception {
       Iphone iphone = new Iphone();
       //Usando Interface AparelhoTelefonico
       iphone.ligar();
       iphone.atender();
       iphone.iniciarCorreioVoz();
       //Usando Interface NavegadorInternet
       iphone.exibirPagina();
       iphone.adcionarNovaAba();
       iphone.atualizarPagina();
       //Usando Interface ReprodutorMusica
       iphone.tocar();
       iphone.pausar();
       iphone.selecionarMusica();
    }
}
