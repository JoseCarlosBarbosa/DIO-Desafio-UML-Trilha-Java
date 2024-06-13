package OrientaçãoAObjetosUml.aparelhos;

import OrientaçãoAObjetosUml.aparelhos.aparelhoTelefonico.TelefoneIntfc;
import OrientaçãoAObjetosUml.aparelhos.navegadorInternet.InternetIntf;
import OrientaçãoAObjetosUml.aparelhos.reprodutorMusical.ReprodutorIntfc;

public class AparelhoMultiUso implements TelefoneIntfc, InternetIntf, ReprodutorIntfc {
    
    public void displayPag(){
        System.out.println("Exibindo Pagina");
    };
    public void addNewPag(){
        System.out.println("Adicionando nova pagina");
    };
    public void reloadPag(){
        System.out.println("Atualizando Pagina");
    };
    @Override
    public void call(int numero){
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void aswerCall(){
        System.out.println("Atendendo Ligação");
    }

    @Override
    public void startVoiceMail(){
        System.out.println("Correio de voz");
    }
    @Override
    public void play(){
        System.out.println("tocando musica " );
    };
    
    @Override
   public void pause(){
        System.out.println(" Pausada!");
    };

    @Override
    public void selectMusic(String nome){
        System.out.println(nome + " selecionada");
    };
}
