package OrientaçãoAObjetosUml.aparelhos.navegadorInternet;

public abstract class InternetAbs implements InternetIntf{
    public void displayPag(){
        System.out.println("Exibindo Pagina");
    };
    public void addNewPag(){
        System.out.println("Adicionando nova pagina");
    };
    public void reloadPag(){
        System.out.println("Atualizando Pagina");
    };
}
