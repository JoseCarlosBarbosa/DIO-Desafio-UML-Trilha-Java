package OrientaçãoAObjetosUml.aparelhos.aparelhoTelefonico;

public abstract class TelefoneAbs implements TelefoneIntfc{
    
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
}
