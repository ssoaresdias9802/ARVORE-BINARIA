public class BinaryTree{
    Node raiz;

    //cria arvore vazia
    public BinaryTree(){
        raiz = null;
    }

    public boolean isEmpty(){
        if ( raiz == null){
            return true;
        }
        else{
            return false;
        }
    }

    public void addRoot(Node x) throws Exception{
        //adciona no x como raiz da arvore
        if ( raiz != null){
            throw new Exception(" A árvore já tem raíz! ");
        }
        else{
        raiz = x;
        }    
    }

    public Node root(){
        return raiz;
    }

    public boolean isInternal(Node x){
        // verifica se x é interno
        if ( x.esq != null || x.dir != null){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isLeaf(Node x){
        if( x.esq == null && x.dir == null){
            return true;
        }
        else{
            return false;
        }
    }

    public void addLeft(Node x, Node y) throws Exception{
        if ( y.esq != null){
            throw new Exception(" ERRO: O nó já tem filho esquerdo! ");
        }
        x.pai = y;
        y.esq = x;
    }

    public void addRight(Node x, Node y) throws Exception{
        if (y.dir != null){
            throw new Exception(" ERRO: O nó já tem filho direito! ");
        }
        x.pai = y;
        y.dir = x;
    }

    public Node left(Node x){
        return x.esq;
    }

    public Node right(Node x){
        return x.dir;
    }

    public boolean hasLeft(Node x){
        if (x.esq != null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean hasRight(Node x){
        if ( x.dir != null){
            return true;
        }
        else{
            return false;
        }
    }

    public void remove(Node x){
        // remove o nó x e todos descendentes
        if ( raiz == x){
            raiz = null;        
        }
        else{
            if ( x.pai.esq == x){
                x.pai.esq = null;
            }
            else{
                x.pai.dir = null;
            }
        }
    }

    //esquerda, direita, raiz
    public void visitPosOrdem(Node x){
        // o nó x é a partir da onde vai ter a leitura
        if (x == null)
            return;
        visitPosOrdem(x.esq);
        visitPosOrdem(x.dir);
        x.mostraNo();

    }

    //raiz, esquerda, direita
    public void visitPreOrdem(Node x){
        if (x == null)
            return;
        x.mostraNo();
        visitPreOrdem(x.esq);
        visitPreOrdem(x.dir);

    }

    //esquerda, raiz, direita
    public void visitInOrdem(Node x){
        if (x == null)
            return;
        visitPreOrdem(x.esq);
        x.mostraNo();
        visitPreOrdem(x.dir);
        
    }

}