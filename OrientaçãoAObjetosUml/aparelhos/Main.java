package OrientaçãoAObjetosUml.aparelhos;


import OrientaçãoAObjetosUml.aparelhos.aparelhoTelefonico.Telefone;
import OrientaçãoAObjetosUml.aparelhos.navegadorInternet.Internet;
import OrientaçãoAObjetosUml.aparelhos.reprodutorMusical.Reprodutor;

public class Main {
    public static void main(String[] args) {
        Telefone aparelho = new Telefone();
        aparelho.aswerCall();
        aparelho.call(123);
        aparelho.startVoiceMail();

        Internet internet = new Internet();
        internet.displayPag();
        internet.addNewPag();
        internet.reloadPag(); 

        Reprodutor reprodutor = new Reprodutor("Musica X");

        reprodutor.play();
        reprodutor.pause();
        reprodutor.selectMusic("System");

        AparelhoMultiUso aparelhoMultiUso = new AparelhoMultiUso();
        aparelhoMultiUso.aswerCall();
        aparelhoMultiUso.call(123456);
        aparelhoMultiUso.startVoiceMail();
        aparelhoMultiUso.displayPag();
        aparelhoMultiUso.addNewPag();
        aparelhoMultiUso.reloadPag();
        aparelhoMultiUso.play();
        aparelhoMultiUso.pause();
        aparelhoMultiUso.selectMusic("MusicBest");
    }
}
