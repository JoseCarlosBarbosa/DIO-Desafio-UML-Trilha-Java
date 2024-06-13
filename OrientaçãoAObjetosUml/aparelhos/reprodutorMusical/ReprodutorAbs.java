package OrientaçãoAObjetosUml.aparelhos.reprodutorMusical;

public abstract class ReprodutorAbs implements ReprodutorIntfc{
    protected String nomeMusic;

    public ReprodutorAbs(String nomeMusic){
        this.nomeMusic = "EnterSadman";
    }

    @Override
    public void play(){
        System.out.println("tocando musica "+ nomeMusic );
    };
    
    @Override
   public void pause(){
        System.out.println(nomeMusic +" Pausada!");
    };

    @Override
    public void selectMusic(String nome){
        System.out.println(nome + " selecionada");
    };

    public String getNome(){
        return nomeMusic;
    }
}
