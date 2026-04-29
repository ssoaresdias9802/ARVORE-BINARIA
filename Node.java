public class Node{
    char elemento;
    Node pai;
    Node esq;
    Node dir;

    //autoreferencia -- sem limite de espaço
    Node(char elemento){
        this.elemento = elemento;
        pai = esq = dir = null;
    }
    public void mostraNo(){
        System.out.print(elemento + " ");
    }
}